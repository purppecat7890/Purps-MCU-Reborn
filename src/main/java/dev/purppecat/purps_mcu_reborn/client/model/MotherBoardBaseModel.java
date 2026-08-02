package dev.purppecat.purps_mcu_reborn.client.model;

import dev.purppecat.purps_mcu_reborn.PurpsMCUReborn;
import dev.purppecat.purps_mcu_reborn.world.item.MotherBoardBaseItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class MotherBoardBaseModel extends GeoModel<MotherBoardBaseItem> {
    @Override
    public ResourceLocation getModelResource(MotherBoardBaseItem animatable) {
        return PurpsMCUReborn.modLoc("geo/item/motherboard_base.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(MotherBoardBaseItem animatable) {
        return PurpsMCUReborn.modLoc("textures/item/geo/motherboard_base.png");
    }

    @Override
    public ResourceLocation getAnimationResource(MotherBoardBaseItem animatable) {
        return PurpsMCUReborn.modLoc("animations/item/motherboard_base.animation.json");
    }
}
