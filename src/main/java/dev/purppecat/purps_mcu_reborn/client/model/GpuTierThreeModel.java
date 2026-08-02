package dev.purppecat.purps_mcu_reborn.client.model;

import dev.purppecat.purps_mcu_reborn.PurpsMCUReborn;
import dev.purppecat.purps_mcu_reborn.world.item.GpuTierThreeItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class GpuTierThreeModel extends GeoModel<GpuTierThreeItem> {
    @Override
    public ResourceLocation getModelResource(GpuTierThreeItem animatable) {
        return PurpsMCUReborn.modLoc("geo/item/gpu_tier_three.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(GpuTierThreeItem animatable) {
        return PurpsMCUReborn.modLoc("textures/item/geo/gpu_tier_three.png");
    }

    @Override
    public ResourceLocation getAnimationResource(GpuTierThreeItem animatable) {
        return PurpsMCUReborn.modLoc("animations/item/gpu_tier_three.animation.json");
    }
}
