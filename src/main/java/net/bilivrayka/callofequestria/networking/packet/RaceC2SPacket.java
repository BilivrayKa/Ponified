package net.bilivrayka.callofequestria.networking.packet;

import net.bilivrayka.callofequestria.magic.PlayerRaceDataProvider;
import net.bilivrayka.callofequestria.networking.ModMessages;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.ai.attributes.AttributeInstance;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.network.NetworkEvent;
import org.apache.commons.lang3.ObjectUtils;

import java.util.function.Supplier;

public class RaceC2SPacket {

    private final int cardIndex;

    public RaceC2SPacket(int cardIndex) {
        this.cardIndex = cardIndex;
    }

    public static void encode(RaceC2SPacket packet, FriendlyByteBuf buf) {
        buf.writeInt(packet.cardIndex);
    }

    public static RaceC2SPacket decode(FriendlyByteBuf buf) {
        return new RaceC2SPacket(buf.readInt());
    }

    public static boolean handle(RaceC2SPacket packet, Supplier<NetworkEvent.Context> context) {
        NetworkEvent.Context ctx = context.get();
        ctx.enqueueWork(() -> {
            Player player = ctx.getSender();
            if (player != null) {
                player.getCapability(PlayerRaceDataProvider.PLAYER_RACE_DATA).ifPresent(data -> {
                    data.setSelectedRace(packet.cardIndex);

                    AttributeInstance maxHealthAttribute = player.getAttribute(Attributes.MAX_HEALTH);
                    AttributeInstance armorAttribute = player.getAttribute(Attributes.ARMOR);
                    AttributeInstance attackDamageAttribute = player.getAttribute(Attributes.ATTACK_DAMAGE);
                    AttributeInstance speedAttribute = player.getAttribute(Attributes.MOVEMENT_SPEED);
                    switch (data.getSelectedRace()){
                        case 1:
                            maxHealthAttribute.setBaseValue((float) 20);
                            armorAttribute.setBaseValue((float) 2);
                            attackDamageAttribute.setBaseValue((float) 2);
                            speedAttribute.setBaseValue((float) 0.15);
                            break;
                        case 2:
                            maxHealthAttribute.setBaseValue((float) 16);
                            armorAttribute.setBaseValue((float) 0);
                            attackDamageAttribute.setBaseValue((float) 1);
                            speedAttribute.setBaseValue((float) 0.1);
                            break;
                        case 3:
                            maxHealthAttribute.setBaseValue((float) 18);
                            armorAttribute.setBaseValue((float) 0);
                            attackDamageAttribute.setBaseValue((float) 0);
                            speedAttribute.setBaseValue((float) 0.1);
                            break;
                        default:
                            break;
                    }
                    if (player.getHealth() > player.getMaxHealth()) {
                        player.setHealth((float) player.getMaxHealth());
                    }
                    int selectedRace = data.getSelectedRace();
                    ModMessages.sendToPlayer(new RaceSyncS2CPacket(selectedRace), (ServerPlayer) player);
                    Minecraft.getInstance().setScreen(null);
                    /*
                    Minecraft.getInstance().screen.onClose();
                    Minecraft.getInstance().setScreen(null);

                     */
                    Minecraft.getInstance().mouseHandler.grabMouse();
                    if (!Minecraft.getInstance().mouseHandler.isMouseGrabbed()) {
                        Minecraft.getInstance().mouseHandler.grabMouse();  // Попробуйте захватить мышь ещё раз
                    }
                    //Minecraft.getInstance().mouseHandler.grabMouse();
                });
            }
        });
        ctx.setPacketHandled(true);
        return true;
    }
}
