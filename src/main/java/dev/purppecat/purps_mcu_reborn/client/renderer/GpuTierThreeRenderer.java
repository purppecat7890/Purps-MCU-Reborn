package dev.purppecat.purps_mcu_reborn.client.renderer;

import dev.purppecat.purps_mcu_reborn.client.model.GpuTierThreeModel;
import dev.purppecat.purps_mcu_reborn.world.item.GpuTierThreeItem;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class GpuTierThreeRenderer extends GeoItemRenderer<GpuTierThreeItem> {
    public GpuTierThreeRenderer() {
        super(new GpuTierThreeModel());
    }
}
