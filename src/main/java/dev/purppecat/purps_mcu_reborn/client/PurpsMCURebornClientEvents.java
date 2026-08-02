package dev.purppecat.purps_mcu_reborn.client;

import dev.purppecat.purps_mcu_reborn.client.renderer.IronAnvilBlockEntityRenderer;
import dev.purppecat.purps_mcu_reborn.client.renderer.LaptopBlockEntityRenderer;
import dev.purppecat.purps_mcu_reborn.world.level.block.entity.PurpsMCURebornModBlockEntityTypes;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;

public class PurpsMCURebornClientEvents {
    @SubscribeEvent
    public static void registerRenderers(final EntityRenderersEvent.RegisterRenderers event) {
        event.registerBlockEntityRenderer(PurpsMCURebornModBlockEntityTypes.LAPTOP.get(), LaptopBlockEntityRenderer::new);
        event.registerBlockEntityRenderer(PurpsMCURebornModBlockEntityTypes.IRON_ANVIL.get(), IronAnvilBlockEntityRenderer::new);
    }
}
