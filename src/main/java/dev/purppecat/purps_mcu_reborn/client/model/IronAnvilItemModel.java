package dev.purppecat.purps_mcu_reborn.client.model;

import dev.purppecat.purps_mcu_reborn.PurpsMCUReborn;
import dev.purppecat.purps_mcu_reborn.world.item.IronAnvilItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class IronAnvilItemModel extends GeoModel<IronAnvilItem> {
    @Override
    public ResourceLocation getModelResource(IronAnvilItem animatable) {
        return PurpsMCUReborn.modLoc("geo/block/iron_anvil.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(IronAnvilItem animatable) {
        return PurpsMCUReborn.modLoc("textures/block/iron_anvil.png");
    }

    @Override
    public ResourceLocation getAnimationResource(IronAnvilItem animatable) {
        return PurpsMCUReborn.modLoc("animations/block/iron_anvil.animation.json");
    }
}
