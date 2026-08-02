package dev.purppecat.purps_mcu_reborn.data.advancements;

import com.google.common.collect.ImmutableSet;
import dev.purppecat.purps_mcu_reborn.data.advancements.packs.TechnologyAdvancements;
import dev.thomasglasser.tommylib.api.data.advancements.ExtendedAdvancementProvider;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiConsumer;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

public class PurpsMCURebornAdvancementProvider extends ExtendedAdvancementProvider {
    public PurpsMCURebornAdvancementProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries, BiConsumer<String, String> lang, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, registries, existingFileHelper, ImmutableSet.of(
                new TechnologyAdvancements(lang)));
    }
}
