package dev.purppecat.purps_mcu_reborn.world.level.block.entity;

import dev.purppecat.purps_mcu_reborn.PurpsMCUReborn;
import dev.purppecat.purps_mcu_reborn.world.level.block.PurpsMCURebornBlocks;
import dev.thomasglasser.tommylib.api.registration.DeferredHolder;
import dev.thomasglasser.tommylib.api.registration.DeferredRegister;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.entity.BlockEntityType;

public class PurpsMCURebornModBlockEntityTypes {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITY_TYPES = DeferredRegister.create(Registries.BLOCK_ENTITY_TYPE, PurpsMCUReborn.MOD_ID);

    // Technology
    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<LaptopBlockEntity>> LAPTOP = BLOCK_ENTITY_TYPES.register("laptop", () -> BlockEntityType.Builder.of(LaptopBlockEntity::new, PurpsMCURebornBlocks.LAPTOP.get()).build(null));

    // Misc
    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<IronAnvilBlockEntity>> IRON_ANVIL = BLOCK_ENTITY_TYPES.register("iron_anvil", () -> BlockEntityType.Builder.of(IronAnvilBlockEntity::new, PurpsMCURebornBlocks.IRON_ANVIL.get()).build(null));

    public static void init() {}
}
