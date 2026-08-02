package dev.purppecat.purps_mcu_reborn.client.model;

import dev.purppecat.purps_mcu_reborn.PurpsMCUReborn;
import dev.purppecat.purps_mcu_reborn.world.level.block.entity.IronAnvilBlockEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class IronAnvilBlockEntityModel extends GeoModel<IronAnvilBlockEntity> {
    @Override
    public ResourceLocation getModelResource(IronAnvilBlockEntity animatable) {
        return PurpsMCUReborn.modLoc("geo/block/iron_anvil.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(IronAnvilBlockEntity animatable) {
        return PurpsMCUReborn.modLoc("textures/block/iron_anvil.png");
    }

    @Override
    public ResourceLocation getAnimationResource(IronAnvilBlockEntity animatable) {
        return PurpsMCUReborn.modLoc("animations/block/iron_anvil.animation.json");
    }
}
