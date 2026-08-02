package dev.purppecat.purps_mcu_reborn.client.model;

import dev.purppecat.purps_mcu_reborn.PurpsMCUReborn;
import dev.purppecat.purps_mcu_reborn.world.level.block.entity.LaptopBlockEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class LaptopBlockEntityModel extends GeoModel<LaptopBlockEntity> {
    @Override
    public ResourceLocation getModelResource(LaptopBlockEntity animatable) {
        return PurpsMCUReborn.modLoc("geo/block/laptop.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(LaptopBlockEntity animatable) {
        return PurpsMCUReborn.modLoc("textures/block/laptop.png");
    }

    @Override
    public ResourceLocation getAnimationResource(LaptopBlockEntity animatable) {
        return PurpsMCUReborn.modLoc("animations/block/laptop.animation.json");
    }
}
