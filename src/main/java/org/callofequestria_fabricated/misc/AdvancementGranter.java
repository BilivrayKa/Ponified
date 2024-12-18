package org.callofequestria_fabricated.misc;

import net.minecraft.advancement.Advancement;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.Identifier;
import org.callofequestria_fabricated.Callofequestria_fabricated;

public class AdvancementGranter {
    public static void grantAdvancement(ServerPlayerEntity serverPlayer, Identifier advancamentId){
        Advancement advancement = serverPlayer.getServer().getAdvancementLoader().get(new Identifier(Callofequestria_fabricated.MOD_ID, advancamentId.getPath()));
        serverPlayer.getAdvancementTracker().grantCriterion(advancement, "requirement");
    }
}
