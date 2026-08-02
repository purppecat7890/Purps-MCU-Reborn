package dev.purppecat.purps_mcu_reborn.data.blockstates;

import dev.purppecat.purps_mcu_reborn.PurpsMCUReborn;
import dev.purppecat.purps_mcu_reborn.world.level.block.PurpsMCURebornBlocks;
import dev.thomasglasser.tommylib.api.data.blockstates.ExtendedBlockStateProvider;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class PurpsMCURebornBlockStateProvider extends ExtendedBlockStateProvider {
    public PurpsMCURebornBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, PurpsMCUReborn.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        // Materials
        simpleBlock(PurpsMCURebornBlocks.SILICON_BLOCK.get());

        // Technology
        simpleBlock(PurpsMCURebornBlocks.LAPTOP.get());

        // Misc
        simpleBlock(PurpsMCURebornBlocks.IRON_ANVIL.get());
    }
}
