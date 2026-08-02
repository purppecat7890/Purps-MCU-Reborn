package dev.purppecat.purps_mcu_reborn.client.renderer;

import dev.purppecat.purps_mcu_reborn.client.model.LaptopBlockEntityModel;
import dev.purppecat.purps_mcu_reborn.world.level.block.entity.LaptopBlockEntity;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import software.bernie.geckolib.renderer.GeoBlockRenderer;

public class LaptopBlockEntityRenderer extends GeoBlockRenderer<LaptopBlockEntity> {
    public LaptopBlockEntityRenderer(BlockEntityRendererProvider.Context context) {
        super(new LaptopBlockEntityModel());
    }
}
