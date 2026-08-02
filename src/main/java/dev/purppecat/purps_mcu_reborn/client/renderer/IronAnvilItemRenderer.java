package dev.purppecat.purps_mcu_reborn.client.renderer;

import dev.purppecat.purps_mcu_reborn.client.model.IronAnvilItemModel;
import dev.purppecat.purps_mcu_reborn.world.item.IronAnvilItem;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class IronAnvilItemRenderer extends GeoItemRenderer<IronAnvilItem> {
    public IronAnvilItemRenderer() {
        super(new IronAnvilItemModel());
    }
}
