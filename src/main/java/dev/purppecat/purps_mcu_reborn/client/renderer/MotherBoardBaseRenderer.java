package dev.purppecat.purps_mcu_reborn.client.renderer;

import dev.purppecat.purps_mcu_reborn.client.model.MotherBoardBaseModel;
import dev.purppecat.purps_mcu_reborn.world.item.MotherBoardBaseItem;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class MotherBoardBaseRenderer extends GeoItemRenderer<MotherBoardBaseItem> {
    public MotherBoardBaseRenderer() {
        super(new MotherBoardBaseModel());
    }
}
