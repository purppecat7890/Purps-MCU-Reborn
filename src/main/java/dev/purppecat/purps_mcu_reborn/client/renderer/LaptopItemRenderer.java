package dev.purppecat.purps_mcu_reborn.client.renderer;

import dev.purppecat.purps_mcu_reborn.client.model.LaptopItemModel;
import dev.purppecat.purps_mcu_reborn.world.item.LaptopItem;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class LaptopItemRenderer extends GeoItemRenderer<LaptopItem> {
    public LaptopItemRenderer() {
        super(new LaptopItemModel());
    }
}
