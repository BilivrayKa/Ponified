package org.callofequestria_fabricated;

import net.fabricmc.fabric.api.networking.v1.PacketSender;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.advancement.Advancement;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.network.ServerPlayNetworkHandler;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.Identifier;
import org.callofequestria_fabricated.block.PlushReg;
import org.callofequestria_fabricated.event.ServerEvents;
import org.callofequestria_fabricated.item.ModCreativeModTabs;
import org.callofequestria_fabricated.item.ModItems;
import org.callofequestria_fabricated.networking.ModMessagesServer;
import net.fabricmc.api.ModInitializer;
import org.callofequestria_fabricated.networking.packet.AdvancementC2SPacket;
import org.callofequestria_fabricated.sound.ModSounds;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Callofequestria_fabricated implements ModInitializer {
    public static final String MOD_ID = "callofequestria_fabricated";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ModItems.registerItems();
        ModSounds.registerSounds();
        //ModBlocks.register();
        PlushReg.registerPlushBlocks();
        //ModFluids.register();
        //ModFluidTypes.register();
        ModCreativeModTabs.registerItemGroups();

        ModMessagesServer.registerS2CPackets();
        ServerEvents.registerEvents();

        ServerPlayNetworking.registerGlobalReceiver(ModMessagesServer.AWARDING_C2S_ID, AdvancementC2SPacket::receive);
    }
}
