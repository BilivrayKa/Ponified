package org.callofequestria_fabricated.client;

import org.callofequestria_fabricated.block.PlushReg;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import org.callofequestria_fabricated.client.event.ClientEvents;

public class Callofequestria_fabricatedClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(PlushReg.PLUSH_MAUD_PIE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(PlushReg.PLUSH_DARING_DO, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(PlushReg.PLUSH_GRANNY_SMITH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(PlushReg.PLUSH_LOTUS_BLOSSOM, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(PlushReg.PLUSH_ALOE_VERA, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(PlushReg.PLUSH_OCTAVIA_MELODY, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(PlushReg.PLUSH_DJ_PON3, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(PlushReg.PLUSH_SPITFIRE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(PlushReg.PLUSH_LILY_VALLEY, RenderLayer.getCutout());

        ClientEvents.registerEvents();
    }
}
