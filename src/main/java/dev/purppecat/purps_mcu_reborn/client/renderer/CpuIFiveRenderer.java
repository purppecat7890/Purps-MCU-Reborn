package dev.purppecat.purps_mcu_reborn.client.renderer;

import dev.purppecat.purps_mcu_reborn.client.model.CpuIFiveModel;
import dev.purppecat.purps_mcu_reborn.world.item.CpuIFiveItem;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class CpuIFiveRenderer extends GeoItemRenderer<CpuIFiveItem> {
    public CpuIFiveRenderer() {
        super(new CpuIFiveModel());
    }
}
