package org.callofequestria_fabricated.networking.packet;


import net.fabricmc.fabric.api.networking.v1.PacketSender;
import net.minecraft.advancement.Advancement;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.network.ServerPlayNetworkHandler;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.Identifier;
import org.callofequestria_fabricated.Callofequestria_fabricated;

public class AdvancementC2SPacket {

    public static void receive(MinecraftServer server, ServerPlayerEntity player, ServerPlayNetworkHandler handler,
                               PacketByteBuf buf, PacketSender responseSender) {
        Identifier advancementName = buf.readIdentifier();
        ServerPlayerEntity serverPlayer = player;
        Advancement advancement = server.getAdvancementLoader().get(new Identifier(Callofequestria_fabricated.MOD_ID, advancementName.getPath()));
        serverPlayer.getAdvancementTracker().grantCriterion(advancement, "requirement");
    }

}
