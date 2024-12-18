package org.callofequestria_fabricated.client.event;

import io.netty.buffer.Unpooled;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.fabricmc.fabric.api.client.screen.v1.ScreenEvents;
import net.fabricmc.fabric.api.event.player.UseBlockCallback;
import net.fabricmc.fabric.api.event.player.UseEntityCallback;
import net.fabricmc.fabric.api.event.player.UseItemCallback;
import net.fabricmc.fabric.api.message.v1.ServerMessageEvents;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.ingame.BookScreen;
import net.minecraft.entity.Entity;
import net.minecraft.entity.mob.CreeperEntity;
import net.minecraft.entity.passive.BeeEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.message.MessageType;
import net.minecraft.network.message.SignedMessage;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;
import org.callofequestria_fabricated.data.AdvancementData;
import org.callofequestria_fabricated.event.ServerEvents;
import org.callofequestria_fabricated.misc.AdvancementGranter;
import org.callofequestria_fabricated.networking.ModMessagesServer;

public class ClientEvents {

    public static void registerEvents() {
        ScreenEvents.AFTER_INIT.register(ClientEvents::onBookScreenOpen);
        UseBlockCallback.EVENT.register(ClientEvents::OnCandlePlaceBlock);
        UseEntityCallback.EVENT.register(ClientEvents::onCreeperForceExplode);
        UseEntityCallback.EVENT.register(ClientEvents::onBeeBreed);
    }




    private static void onBookScreenOpen(MinecraftClient client, Screen screen, int i, int i1) {
        if (screen instanceof BookScreen) {
            PacketByteBuf buf = new PacketByteBuf(Unpooled.buffer());
            buf.writeIdentifier(AdvancementData.SPARKLE_AD);
            ClientPlayNetworking.send(ModMessagesServer.AWARDING_C2S_ID, buf);
        }
    }
    private static ActionResult OnCandlePlaceBlock(PlayerEntity playerEntity, World world, Hand hand, BlockHitResult blockHitResult) {
        ItemStack itemStack = playerEntity.getStackInHand(hand);
        if (itemStack.getItem() == Items.CANDLE) {
            if (blockHitResult.getType() == HitResult.Type.BLOCK) {
                if (blockHitResult.getSide() == Direction.UP) {
                    PacketByteBuf buf = new PacketByteBuf(Unpooled.buffer());
                    buf.writeIdentifier(AdvancementData.ALOE_VERA);
                    ClientPlayNetworking.send(ModMessagesServer.AWARDING_C2S_ID, buf);
                }
            }
        }
        return ActionResult.PASS;
    }

    private static ActionResult onCreeperForceExplode(PlayerEntity playerEntity, World world, Hand hand, Entity entity, EntityHitResult entityHitResult) {
        if (playerEntity.getStackInHand(hand).getItem() == Items.FLINT_AND_STEEL && entity instanceof CreeperEntity) {
            PacketByteBuf buf = new PacketByteBuf(Unpooled.buffer());
            buf.writeIdentifier(AdvancementData.ROSE_AD);
            ClientPlayNetworking.send(ModMessagesServer.AWARDING_C2S_ID, buf);
        }
        return ActionResult.PASS;
    }

    private static ActionResult onBeeBreed(PlayerEntity playerEntity, World world, Hand hand, Entity entity, EntityHitResult entityHitResult) {
        if (playerEntity.getStackInHand(hand).isIn(ItemTags.FLOWERS) && entity instanceof BeeEntity) {
            PacketByteBuf buf = new PacketByteBuf(Unpooled.buffer());
            buf.writeIdentifier(AdvancementData.CHERRY_BERRY_AD);
            ClientPlayNetworking.send(ModMessagesServer.AWARDING_C2S_ID, buf);
        }
        return ActionResult.PASS;
    }

}
