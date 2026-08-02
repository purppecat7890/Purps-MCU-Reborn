package dev.purppecat.purps_mcu_reborn.client.renderer;

import dev.purppecat.purps_mcu_reborn.client.model.FanModel;
import dev.purppecat.purps_mcu_reborn.world.item.FanItem;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class FanRenderer extends GeoItemRenderer<FanItem> {
    public FanRenderer() {
        super(new FanModel());
    }
}
