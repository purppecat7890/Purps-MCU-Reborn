package dev.purppecat.purps_mcu_reborn.client.model;

import dev.purppecat.purps_mcu_reborn.PurpsMCUReborn;
import dev.purppecat.purps_mcu_reborn.world.item.CpuIFiveItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class CpuIFiveModel extends GeoModel<CpuIFiveItem> {
    @Override
    public ResourceLocation getModelResource(CpuIFiveItem animatable) {
        return PurpsMCUReborn.modLoc("geo/item/cpu.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(CpuIFiveItem animatable) {
        return PurpsMCUReborn.modLoc("textures/item/geo/cpu_i_five.png");
    }

    @Override
    public ResourceLocation getAnimationResource(CpuIFiveItem animatable) {
        return PurpsMCUReborn.modLoc("animations/item/cpu.animation.json");
    }
}
