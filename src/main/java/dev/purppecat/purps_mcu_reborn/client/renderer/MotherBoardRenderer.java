package dev.purppecat.purps_mcu_reborn.client.renderer;

import dev.purppecat.purps_mcu_reborn.client.model.MotherBoardModel;
import dev.purppecat.purps_mcu_reborn.world.item.MotherBoardItem;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class MotherBoardRenderer extends GeoItemRenderer<MotherBoardItem> {
    public MotherBoardRenderer() {
        super(new MotherBoardModel());
    }
}
