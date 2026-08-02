package dev.purppecat.purps_mcu_reborn.data;

import dev.purppecat.purps_mcu_reborn.PurpsMCUReborn;
import dev.purppecat.purps_mcu_reborn.data.advancements.PurpsMCURebornAdvancementProvider;
import dev.purppecat.purps_mcu_reborn.data.blockstates.PurpsMCURebornBlockStateProvider;
import dev.purppecat.purps_mcu_reborn.data.curios.PurpsMCURebornCuriosProvider;
import dev.purppecat.purps_mcu_reborn.data.lang.PurpsMCURebornEnUsLanguageProvider;
import dev.purppecat.purps_mcu_reborn.data.loot.PurpsMCURebornLootTables;
import dev.purppecat.purps_mcu_reborn.data.models.PurpsMCURebornItemModelProvider;
import dev.purppecat.purps_mcu_reborn.data.recipes.PurpsMCURebornRecipeProvider;
import dev.purppecat.purps_mcu_reborn.data.tags.PurpsMCURebornBlockTagsProvider;
import dev.purppecat.purps_mcu_reborn.data.tags.PurpsMCURebornItemTagsProvider;
import dev.thomasglasser.tommylib.api.data.DataGenerationUtils;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.data.event.GatherDataEvent;

public class PurpsMCURebornDataGenerators {
    public static final RegistrySetBuilder BUILDER = new RegistrySetBuilder();

    public static void onGatherData(GatherDataEvent event) {
        // Server
        event.createDatapackRegistryObjects(BUILDER);
        DataGenerationUtils.createRegistryDumpReport(event, PurpsMCUReborn.MOD_ID);
        DataGenerationUtils.createProvider(event, PurpsMCURebornCuriosProvider::new);
        event.createProvider(PurpsMCURebornLootTables::new);
        DataGenerationUtils.createBlockAndItemTags(event, PurpsMCURebornBlockTagsProvider::new, PurpsMCURebornItemTagsProvider::new);
        event.createProvider(PurpsMCURebornRecipeProvider::new);

        // Common
        DataGenerationUtils.createLangDependent(event, PurpsMCURebornEnUsLanguageProvider::new, PurpsMCURebornAdvancementProvider::new);

        // Client
        DataGenerationUtils.createProvider(event, PurpsMCURebornBlockStateProvider::new);
        DataGenerationUtils.createProvider(event, PurpsMCURebornItemModelProvider::new);

        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
    }
}
