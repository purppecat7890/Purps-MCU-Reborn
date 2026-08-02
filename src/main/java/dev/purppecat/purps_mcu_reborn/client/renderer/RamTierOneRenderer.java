package dev.purppecat.purps_mcu_reborn.client.renderer;

import dev.purppecat.purps_mcu_reborn.client.model.RamTierOneModel;
import dev.purppecat.purps_mcu_reborn.world.item.RamTierOneItem;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class RamTierOneRenderer extends GeoItemRenderer<RamTierOneItem> {
    public RamTierOneRenderer() {
        super(new RamTierOneModel());
    }
}
