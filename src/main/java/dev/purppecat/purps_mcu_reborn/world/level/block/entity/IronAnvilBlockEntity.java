package dev.purppecat.purps_mcu_reborn.world.level.block.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import software.bernie.geckolib.animatable.GeoBlockEntity;
import software.bernie.geckolib.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.animation.AnimatableManager;
import software.bernie.geckolib.animation.AnimationController;
import software.bernie.geckolib.animation.AnimationState;
import software.bernie.geckolib.animation.PlayState;
import software.bernie.geckolib.animation.RawAnimation;
import software.bernie.geckolib.util.GeckoLibUtil;
import software.bernie.geckolib.util.RenderUtil;

public class IronAnvilBlockEntity extends BlockEntity implements GeoBlockEntity {
    protected static final RawAnimation IDLE_ANIM = RawAnimation.begin().thenLoop("0");
    protected static final RawAnimation SPARKS_ANIM = RawAnimation.begin().thenLoop("1");

    private final AnimatableInstanceCache cache = GeckoLibUtil.createInstanceCache(this);

    public IronAnvilBlockEntity(BlockPos pos, BlockState state) {
        super(PurpsMCURebornModBlockEntityTypes.IRON_ANVIL.get(), pos, state);
    }

    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllers) {
        controllers.add(new AnimationController<>(this, this::deployAnimController));
    }

    protected <E extends IronAnvilBlockEntity> PlayState deployAnimController(final AnimationState<E> state) {
        Level level = this.getLevel();
        BlockPos blockPos = this.getBlockPos();
        if (level != null) {
            BlockState blockState = level.getBlockState(blockPos);
            if (!(blockState == Blocks.AIR.defaultBlockState())) {
                return state.setAndContinue(IDLE_ANIM);
            }
        }
        return PlayState.CONTINUE;
    }

    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return this.cache;
    }

    @Override
    public double getTick(Object blockEntity) {
        return RenderUtil.getCurrentTick();
    }
}
