package dev.purppecat.purps_mcu_reborn.client.model;

import dev.purppecat.purps_mcu_reborn.PurpsMCUReborn;
import dev.purppecat.purps_mcu_reborn.world.item.CpuISevenItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class CpuISevenModel extends GeoModel<CpuISevenItem> {
    @Override
    public ResourceLocation getModelResource(CpuISevenItem animatable) {
        return PurpsMCUReborn.modLoc("geo/item/cpu.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(CpuISevenItem animatable) {
        return PurpsMCUReborn.modLoc("textures/item/geo/cpu_i_seven.png");
    }

    @Override
    public ResourceLocation getAnimationResource(CpuISevenItem animatable) {
        return PurpsMCUReborn.modLoc("animations/item/cpu.animation.json");
    }
}
