package dev.purppecat.purps_mcu_reborn.client.renderer;

import dev.purppecat.purps_mcu_reborn.client.model.GpuTierOneModel;
import dev.purppecat.purps_mcu_reborn.world.item.GpuTierOneItem;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class GpuTierOneRenderer extends GeoItemRenderer<GpuTierOneItem> {
    public GpuTierOneRenderer() {
        super(new GpuTierOneModel());
    }
}
