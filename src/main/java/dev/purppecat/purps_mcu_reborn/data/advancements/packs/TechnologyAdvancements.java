package dev.purppecat.purps_mcu_reborn.data.advancements.packs;

import dev.purppecat.purps_mcu_reborn.PurpsMCUReborn;
import dev.thomasglasser.tommylib.api.data.advancements.ExtendedAdvancementGenerator;
import java.util.function.BiConsumer;
import net.minecraft.core.HolderLookup;

public class TechnologyAdvancements extends ExtendedAdvancementGenerator {
    public TechnologyAdvancements(BiConsumer<String, String> lang) {
        super(PurpsMCUReborn.MOD_ID, "technology", lang);
    }

    @Override
    public void generate(HolderLookup.Provider provider) {}
}
