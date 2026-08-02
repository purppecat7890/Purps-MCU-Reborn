package dev.purppecat.purps_mcu_reborn.world.level.block.entity;

import dev.purppecat.purps_mcu_reborn.world.level.block.LaptopBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import software.bernie.geckolib.animatable.GeoBlockEntity;
import software.bernie.geckolib.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.animation.AnimatableManager;
import software.bernie.geckolib.animation.Animation;
import software.bernie.geckolib.animation.AnimationController;
import software.bernie.geckolib.animation.AnimationState;
import software.bernie.geckolib.animation.PlayState;
import software.bernie.geckolib.animation.RawAnimation;
import software.bernie.geckolib.util.GeckoLibUtil;
import software.bernie.geckolib.util.RenderUtil;

public class LaptopBlockEntity extends BlockEntity implements GeoBlockEntity {
    protected static final RawAnimation CLOSE_ANIM = RawAnimation.begin().then("close", Animation.LoopType.HOLD_ON_LAST_FRAME).thenLoop("0");
    protected static final RawAnimation OPEN_ANIM = RawAnimation.begin().then("open", Animation.LoopType.HOLD_ON_LAST_FRAME).thenLoop("1");

    private final AnimatableInstanceCache cache = GeckoLibUtil.createInstanceCache(this);

    public LaptopBlockEntity(BlockPos pos, BlockState state) {
        super(PurpsMCURebornModBlockEntityTypes.LAPTOP.get(), pos, state);
    }

    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllers) {
        controllers.add(new AnimationController<>(this, this::deployAnimController));
    }

    protected <E extends LaptopBlockEntity> PlayState deployAnimController(final AnimationState<E> state) {
        if (!(this.level.getBlockState(this.getBlockPos()) == Blocks.AIR.defaultBlockState())) {
            if (this.level.getBlockState(this.getBlockPos()).getValue(LaptopBlock.OPENED).booleanValue()) {
                return state.setAndContinue(OPEN_ANIM);

            } else {
                return state.setAndContinue(CLOSE_ANIM);
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
