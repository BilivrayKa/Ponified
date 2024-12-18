package org.callofequestria_fabricated.networking;


import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.util.Identifier;
import org.callofequestria_fabricated.Callofequestria_fabricated;
import org.callofequestria_fabricated.networking.packet.AdvancementS2CPacket;

public class ModMessagesServer {
    public static final Identifier AWARDING_S2C_ID = new Identifier(Callofequestria_fabricated.MOD_ID, "awarding_s2c");
    public static final Identifier AWARDING_C2S_ID = new Identifier(Callofequestria_fabricated.MOD_ID, "awarding_c2s");

    public static void registerS2CPackets() {
        //ServerPlayNetworking.registerGlobalReceiver(AWARDING_S2C_ID, AdvancementS2CPacket::receive);
    }
}