package dev.purppecat.purps_mcu_reborn.data.lang;

import dev.purppecat.purps_mcu_reborn.PurpsMCUReborn;
import dev.purppecat.purps_mcu_reborn.world.item.PurpsMCURebornItems;
import dev.purppecat.purps_mcu_reborn.world.level.block.PurpsMCURebornBlocks;
import dev.thomasglasser.tommylib.api.data.lang.ExtendedEnUsLanguageProvider;
import net.minecraft.data.PackOutput;

public class PurpsMCURebornEnUsLanguageProvider extends ExtendedEnUsLanguageProvider {
    public PurpsMCURebornEnUsLanguageProvider(PackOutput output) {
        super(output, PurpsMCUReborn.MOD_ID);
    }

    protected PurpsMCURebornEnUsLanguageProvider(PackOutput output, String modId) {
        super(output, modId);
    }

    @Override
    protected void addTranslations() {
        addItems();
        addBlocks();
    }

    private void addItems() {
        // MOTHERBOARDS
        add(PurpsMCURebornItems.MOTHERBOARD_BASE.get(), "Motherboard Base");
        add(PurpsMCURebornItems.MOTHERBOARD.get(), "Motherboard");

        // TECHNOLOGY MISC
        add(PurpsMCURebornItems.COPPER_WIRE.get(), "Copper Wire");

        // CPU
        add(PurpsMCURebornItems.CPU_I_THREE.get(), "CPU: Core i3");
        add(PurpsMCURebornItems.CPU_I_FIVE.get(), "CPU: Core i5");
        add(PurpsMCURebornItems.CPU_I_SEVEN.get(), "CPU: Core i7");

        // GPU
        add(PurpsMCURebornItems.GPU_TIER_ONE.get(), "GPU: Tier I");
        add(PurpsMCURebornItems.GPU_TIER_THREE.get(), "GPU: Tier III");

        // RAM
        add(PurpsMCURebornItems.RAM_TIER_ONE.get(), "RAM: Tier I");

        // FAN
        add(PurpsMCURebornItems.FAN.get(), "Basic Fan");

        // ORES
        add(PurpsMCURebornItems.RAW_SILICON.get(), "Raw Silicon");
        add(PurpsMCURebornItems.SILICON_INGOT.get(), "Silicon Ingot");
        add(PurpsMCURebornItems.SILICON_NUGGET.get(), "Silicon Nugget");

        // TOOLS
        add(PurpsMCURebornItems.HAMMER.get(), "Hammer");
        add(PurpsMCURebornItems.WIRE_CUTTER.get(), "Wire Cutter");
    }

    private void addBlocks() {
        // Materials
        add(PurpsMCURebornBlocks.SILICON_BLOCK.get(), "Block Of Silicon");

        // Technology
        add(PurpsMCURebornBlocks.LAPTOP.get(), "Laptop");

        // Misc
        add(PurpsMCURebornBlocks.IRON_ANVIL.get(), "Iron Anvil");
    }
}
