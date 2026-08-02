package dev.purppecat.purps_mcu_reborn.client.renderer;

import dev.purppecat.purps_mcu_reborn.client.model.CpuIThreeModel;
import dev.purppecat.purps_mcu_reborn.world.item.CpuIThreeItem;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class CpuIThreeRenderer extends GeoItemRenderer<CpuIThreeItem> {
    public CpuIThreeRenderer() {
        super(new CpuIThreeModel());
    }
}
