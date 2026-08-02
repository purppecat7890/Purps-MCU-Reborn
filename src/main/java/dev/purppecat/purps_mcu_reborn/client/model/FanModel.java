package dev.purppecat.purps_mcu_reborn.client.model;

import dev.purppecat.purps_mcu_reborn.PurpsMCUReborn;
import dev.purppecat.purps_mcu_reborn.world.item.FanItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class FanModel extends GeoModel<FanItem> {
    @Override
    public ResourceLocation getModelResource(FanItem animatable) {
        return PurpsMCUReborn.modLoc("geo/item/fan.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(FanItem animatable) {
        return PurpsMCUReborn.modLoc("textures/item/geo/fan.png");
    }

    @Override
    public ResourceLocation getAnimationResource(FanItem animatable) {
        return PurpsMCUReborn.modLoc("animations/item/fan.animation.json");
    }
}
