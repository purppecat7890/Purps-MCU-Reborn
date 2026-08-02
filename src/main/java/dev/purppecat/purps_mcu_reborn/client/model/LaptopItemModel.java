package dev.purppecat.purps_mcu_reborn.client.model;

import dev.purppecat.purps_mcu_reborn.PurpsMCUReborn;
import dev.purppecat.purps_mcu_reborn.world.item.LaptopItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class LaptopItemModel extends GeoModel<LaptopItem> {
    @Override
    public ResourceLocation getModelResource(LaptopItem animatable) {
        return PurpsMCUReborn.modLoc("geo/block/laptop.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(LaptopItem animatable) {
        return PurpsMCUReborn.modLoc("textures/block/laptop.png");
    }

    @Override
    public ResourceLocation getAnimationResource(LaptopItem animatable) {
        return PurpsMCUReborn.modLoc("animations/block/laptop.animation.json");
    }
}
