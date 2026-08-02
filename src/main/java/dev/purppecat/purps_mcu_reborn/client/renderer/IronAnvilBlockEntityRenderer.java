package dev.purppecat.purps_mcu_reborn.client.renderer;

import dev.purppecat.purps_mcu_reborn.client.model.IronAnvilBlockEntityModel;
import dev.purppecat.purps_mcu_reborn.world.level.block.entity.IronAnvilBlockEntity;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import software.bernie.geckolib.renderer.GeoBlockRenderer;

public class IronAnvilBlockEntityRenderer extends GeoBlockRenderer<IronAnvilBlockEntity> {
    public IronAnvilBlockEntityRenderer(BlockEntityRendererProvider.Context context) {
        super(new IronAnvilBlockEntityModel());
    }
}
