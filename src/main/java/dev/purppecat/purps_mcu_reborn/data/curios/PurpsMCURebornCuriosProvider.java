package dev.purppecat.purps_mcu_reborn.data.curios;

import dev.purppecat.purps_mcu_reborn.PurpsMCUReborn;
import java.util.concurrent.CompletableFuture;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;
import top.theillusivec4.curios.api.CuriosDataProvider;

public class PurpsMCURebornCuriosProvider extends CuriosDataProvider {
    public static final String SLOT_CHEST = "chest";

    public PurpsMCURebornCuriosProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries, @Nullable ExistingFileHelper fileHelper) {
        super(PurpsMCUReborn.MOD_ID, output, fileHelper, registries);
    }

    @Override
    public void generate(HolderLookup.Provider registries, ExistingFileHelper fileHelper) {
        createSlot(SLOT_CHEST);
    }

    private ResourceLocation slotIcon(String name) {
        return PurpsMCUReborn.modLoc("slot/empty_" + name + "_slot");
    }
}
