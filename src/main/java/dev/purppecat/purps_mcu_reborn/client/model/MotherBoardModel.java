package dev.purppecat.purps_mcu_reborn.client.model;

import dev.purppecat.purps_mcu_reborn.PurpsMCUReborn;
import dev.purppecat.purps_mcu_reborn.world.item.MotherBoardItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class MotherBoardModel extends GeoModel<MotherBoardItem> {
    @Override
    public ResourceLocation getModelResource(MotherBoardItem animatable) {
        return PurpsMCUReborn.modLoc("geo/item/motherboard.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(MotherBoardItem animatable) {
        return PurpsMCUReborn.modLoc("textures/item/geo/motherboard.png");
    }

    @Override
    public ResourceLocation getAnimationResource(MotherBoardItem animatable) {
        return PurpsMCUReborn.modLoc("animations/item/motherboard.animation.json");
    }
}
