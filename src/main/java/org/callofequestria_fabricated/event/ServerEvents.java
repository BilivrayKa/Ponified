package org.callofequestria_fabricated.event;

import net.fabricmc.fabric.api.event.player.PlayerBlockBreakEvents;
import net.fabricmc.fabric.api.message.v1.ServerMessageEvents;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.passive.VillagerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.network.message.MessageType;
import net.minecraft.network.message.SignedMessage;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.world.World;
import org.callofequestria_fabricated.data.AdvancementData;
import org.callofequestria_fabricated.data.VillagerProfessionData;
import org.callofequestria_fabricated.misc.AdvancementGranter;


import java.util.function.Predicate;


public class ServerEvents {

    public static void registerEvents() {
        ServerMessageEvents.CHAT_MESSAGE.register(ServerEvents::onChatMessage);
        PlayerBlockBreakEvents.AFTER.register(ServerEvents::onBreakingSomeVillagerLive);
        PlayerBlockBreakEvents.AFTER.register(ServerEvents::onGeodeBreak);
    }



    private static void onChatMessage(SignedMessage message, ServerPlayerEntity sender, MessageType.Parameters params) {
        if (message.toString().toLowerCase().contains("party")) {
            AdvancementGranter.grantAdvancement(sender, AdvancementData.PINKIE_PIE_AD);
        }
    }

    private static void onBreakingSomeVillagerLive(World world, PlayerEntity playerEntity, BlockPos blockPos, BlockState blockState, BlockEntity blockEntity) {
        Box box = new Box(blockPos).expand(5.0D, 5.0D, 5.0D);
        if (VillagerProfessionData.isProfessionBlock(blockState.getBlock())) {
            Predicate<VillagerEntity> predicate = entity -> true;
            world.getEntitiesByClass(VillagerEntity.class, box, predicate).forEach(villager -> {
                Block workStation = VillagerProfessionData.getBlockByProfession(villager.getVillagerData().getProfession());
                boolean hasProfession = workStation == blockState.getBlock();
                if (hasProfession) {
                    ServerPlayerEntity serverPlayer = world.getServer().getPlayerManager().getPlayer(playerEntity.getUuid());
                    AdvancementGranter.grantAdvancement(serverPlayer, AdvancementData.STARLIGHT_AD);
                }
            });
        }
    }

    private static void onGeodeBreak(World world, PlayerEntity playerEntity, BlockPos blockPos, BlockState blockState, BlockEntity blockEntity) {
        if (blockState.isOf(Blocks.SMOOTH_BASALT) || blockState.isOf(Blocks.CALCITE) || blockState.isOf(Blocks.AMETHYST_BLOCK)) {
            if (isGeodeStructure(world, blockPos)) {
                ServerPlayerEntity serverPlayer = world.getServer().getPlayerManager().getPlayer(playerEntity.getUuid());
                AdvancementGranter.grantAdvancement(serverPlayer, AdvancementData.RARITY_AD);
            }
        }
    }
    private static boolean isGeodeStructure(World world, BlockPos pos) {
        int basaltCount = 0;
        int calciteCount = 0;
        int amethystCount = 0;

        for (int x = -3; x <= 3; x++) {
            for (int y = -3; y <= 3; y++) {
                for (int z = -3; z <= 3; z++) {
                    BlockPos nearby = pos.add(x, y, z);
                    BlockState state = world.getBlockState(nearby);
                    if (state.isOf(Blocks.SMOOTH_BASALT)) basaltCount++;
                    if (state.isOf(Blocks.CALCITE)) calciteCount++;
                    if (state.isOf(Blocks.AMETHYST_BLOCK)) amethystCount++;
                }
            }
        }
        return basaltCount >= 10 && calciteCount >= 5 && amethystCount >= 5;
    }
}