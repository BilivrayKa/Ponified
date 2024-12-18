package org.callofequestria_fabricated.client.mixin;

import io.netty.buffer.Unpooled;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageTypes;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import org.callofequestria_fabricated.Callofequestria_fabricated;
import org.callofequestria_fabricated.data.AdvancementData;
import org.callofequestria_fabricated.misc.AdvancementGranter;
import org.callofequestria_fabricated.networking.ModMessagesServer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(LivingEntity.class)
public abstract class LivingEntityMixin {
    @Inject(method = "onDamaged", at = @At("HEAD"))
    public void onDamaged(DamageSource source, CallbackInfo ci) {
        if ((Object) this instanceof PlayerEntity player) {
            if ((source.isOf(DamageTypes.FLY_INTO_WALL) || source.isOf(DamageTypes.FALL)) && player.isFallFlying()) {
                PacketByteBuf buf = new PacketByteBuf(Unpooled.buffer());
                buf.writeIdentifier(AdvancementData.DERPY_AD);
                ClientPlayNetworking.send(ModMessagesServer.AWARDING_C2S_ID, buf);
            }
            if(player.isFallFlying() && source.isOf(DamageTypes.IN_FIRE)){
                PacketByteBuf buf = new PacketByteBuf(Unpooled.buffer());
                buf.writeIdentifier(AdvancementData.SPITFIRE_AD);
                ClientPlayNetworking.send(ModMessagesServer.AWARDING_C2S_ID, buf);

            }
        }
    }
}
