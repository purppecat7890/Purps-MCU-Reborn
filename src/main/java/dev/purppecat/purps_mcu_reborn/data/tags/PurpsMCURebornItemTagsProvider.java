package dev.purppecat.purps_mcu_reborn.data.tags;

import dev.purppecat.purps_mcu_reborn.PurpsMCUReborn;
import dev.thomasglasser.tommylib.api.data.tags.ExtendedItemTagsProvider;
import java.util.concurrent.CompletableFuture;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

public class PurpsMCURebornItemTagsProvider extends ExtendedItemTagsProvider {
    public PurpsMCURebornItemTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, CompletableFuture<TagLookup<Block>> blockLookup, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockLookup, PurpsMCUReborn.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {}
}
