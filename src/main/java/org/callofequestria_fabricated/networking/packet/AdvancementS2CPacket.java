package org.callofequestria_fabricated.networking.packet;

import net.fabricmc.fabric.api.networking.v1.PacketSender;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.network.ServerPlayNetworkHandler;
import net.minecraft.server.network.ServerPlayerEntity;

public class AdvancementS2CPacket {
    /*
    public static void receive(MinecraftServer server, ServerPlayerEntity player, ServerPlayNetworkHandler handler,
                               PacketByteBuf buf, PacketSender responseSender) {

        Identifier advancementName = buf.readIdentifier();
        Advancement advancement = server.getAdvancementLoader().get(new Identifier(Callofequestria_fabricated.MOD_ID, advancementName.getPath()));
        player.getAdvancementTracker().grantCriterion(advancement, "requirement");



    }

     */
}
