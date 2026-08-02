package dev.purppecat.purps_mcu_reborn.data.loot;

import dev.thomasglasser.tommylib.api.data.loot.ExtendedLootTableProvider;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;

public class PurpsMCURebornLootTables extends ExtendedLootTableProvider {
    public PurpsMCURebornLootTables(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(pOutput, Set.of(), List.of(
                new SubProviderEntry(PurpsMCURebornBlockLoot::new, LootContextParamSets.BLOCK)), lookupProvider);
    }
}
