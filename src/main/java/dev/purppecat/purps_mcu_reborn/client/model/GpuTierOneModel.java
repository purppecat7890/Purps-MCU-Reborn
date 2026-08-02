package dev.purppecat.purps_mcu_reborn.client.model;

import dev.purppecat.purps_mcu_reborn.PurpsMCUReborn;
import dev.purppecat.purps_mcu_reborn.world.item.GpuTierOneItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class GpuTierOneModel extends GeoModel<GpuTierOneItem> {
    @Override
    public ResourceLocation getModelResource(GpuTierOneItem animatable) {
        return PurpsMCUReborn.modLoc("geo/item/gpu_tier_one.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(GpuTierOneItem animatable) {
        return PurpsMCUReborn.modLoc("textures/item/geo/gpu_tier_one.png");
    }

    @Override
    public ResourceLocation getAnimationResource(GpuTierOneItem animatable) {
        return PurpsMCUReborn.modLoc("animations/item/gpu_tier_one.animation.json");
    }
}
