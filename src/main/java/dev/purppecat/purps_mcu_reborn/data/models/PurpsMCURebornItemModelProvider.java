package dev.purppecat.purps_mcu_reborn.data.models;

import dev.purppecat.purps_mcu_reborn.PurpsMCUReborn;
import dev.purppecat.purps_mcu_reborn.world.item.PurpsMCURebornItems;
import dev.purppecat.purps_mcu_reborn.world.level.block.PurpsMCURebornBlocks;
import dev.thomasglasser.tommylib.api.data.models.ExtendedItemModelProvider;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class PurpsMCURebornItemModelProvider extends ExtendedItemModelProvider {
    public PurpsMCURebornItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, PurpsMCUReborn.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        // ITEMS
        basicItem(PurpsMCURebornItems.RAW_SILICON);
        basicItem(PurpsMCURebornItems.SILICON_INGOT);
        basicItem(PurpsMCURebornItems.SILICON_NUGGET);
        basicItem(PurpsMCURebornItems.COPPER_WIRE);

        // TOOLS
        handheldItem(PurpsMCURebornItems.HAMMER);
        handheldItem(PurpsMCURebornItems.WIRE_CUTTER);

        // BLOCKS
        basicBlockItem(PurpsMCURebornBlocks.SILICON_BLOCK);
    }
}
