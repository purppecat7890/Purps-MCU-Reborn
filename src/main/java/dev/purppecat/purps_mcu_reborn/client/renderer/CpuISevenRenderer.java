package dev.purppecat.purps_mcu_reborn.client.renderer;

import dev.purppecat.purps_mcu_reborn.client.model.CpuISevenModel;
import dev.purppecat.purps_mcu_reborn.world.item.CpuISevenItem;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class CpuISevenRenderer extends GeoItemRenderer<CpuISevenItem> {
    public CpuISevenRenderer() {
        super(new CpuISevenModel());
    }
}
