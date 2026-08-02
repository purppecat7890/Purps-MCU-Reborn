package dev.purppecat.purps_mcu_reborn.client.model;

import dev.purppecat.purps_mcu_reborn.PurpsMCUReborn;
import dev.purppecat.purps_mcu_reborn.world.item.CpuIThreeItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class CpuIThreeModel extends GeoModel<CpuIThreeItem> {
    @Override
    public ResourceLocation getModelResource(CpuIThreeItem animatable) {
        return PurpsMCUReborn.modLoc("geo/item/cpu.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(CpuIThreeItem animatable) {
        return PurpsMCUReborn.modLoc("textures/item/geo/cpu_i_three.png");
    }

    @Override
    public ResourceLocation getAnimationResource(CpuIThreeItem animatable) {
        return PurpsMCUReborn.modLoc("animations/item/cpu.animation.json");
    }
}
