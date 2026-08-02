package dev.purppecat.purps_mcu_reborn.data.loot;

import com.google.common.collect.ImmutableSet;
import dev.purppecat.purps_mcu_reborn.world.level.block.PurpsMCURebornBlocks;
import dev.thomasglasser.tommylib.api.data.loot.ExtendedBlockLootSubProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.world.flag.FeatureFlags;

public class PurpsMCURebornBlockLoot extends ExtendedBlockLootSubProvider {
    protected PurpsMCURebornBlockLoot(HolderLookup.Provider provider) {
        super(ImmutableSet.of(), FeatureFlags.REGISTRY.allFlags(), provider, PurpsMCURebornBlocks.BLOCKS);
    }

    @Override
    protected void generate() {
        addKnownBlocks();

        // Materials
        dropSelf(PurpsMCURebornBlocks.SILICON_BLOCK.get());

        // Technology
        dropSelf(PurpsMCURebornBlocks.LAPTOP.get());

        // Misc
        dropSelf(PurpsMCURebornBlocks.IRON_ANVIL.get());
    }

    protected void addKnownBlocks() {
    }
}
