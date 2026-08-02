package dev.purppecat.purps_mcu_reborn.client.model;

import dev.purppecat.purps_mcu_reborn.PurpsMCUReborn;
import dev.purppecat.purps_mcu_reborn.world.item.RamTierOneItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class RamTierOneModel extends GeoModel<RamTierOneItem> {
    @Override
    public ResourceLocation getModelResource(RamTierOneItem animatable) {
        return PurpsMCUReborn.modLoc("geo/item/ram_tier_one.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(RamTierOneItem animatable) {
        return PurpsMCUReborn.modLoc("textures/item/geo/ram_tier_one.png");
    }

    @Override
    public ResourceLocation getAnimationResource(RamTierOneItem animatable) {
        return PurpsMCUReborn.modLoc("animations/item/ram_tier_one.animation.json");
    }
}
