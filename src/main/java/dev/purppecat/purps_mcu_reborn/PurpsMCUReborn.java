package dev.purppecat.purps_mcu_reborn;

import dev.purppecat.purps_mcu_reborn.client.PurpsMCURebornClientEvents;
import dev.purppecat.purps_mcu_reborn.data.PurpsMCURebornDataGenerators;
import dev.purppecat.purps_mcu_reborn.world.item.PurpsMCURebornItems;
import dev.purppecat.purps_mcu_reborn.world.level.block.PurpsMCURebornBlocks;
import dev.purppecat.purps_mcu_reborn.world.level.block.entity.PurpsMCURebornModBlockEntityTypes;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Mod(PurpsMCUReborn.MOD_ID)
public class PurpsMCUReborn {
    public static final String MOD_ID = "purps_mcu_reborn";
    public static final String MOD_NAME = "Purp's MCU Reborn";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_NAME);

    public PurpsMCUReborn(IEventBus modEventBus) {
        initRegistries();

        addEventListeners(modEventBus);
    }

    private void initRegistries() {
        PurpsMCURebornItems.init();
        PurpsMCURebornBlocks.init();
        PurpsMCURebornModBlockEntityTypes.init();
    }

    private void addEventListeners(IEventBus modBus) {
        // Mod Bus
        modBus.addListener(PurpsMCURebornDataGenerators::onGatherData);
        modBus.addListener(PurpsMCURebornClientEvents::registerRenderers);
    }

    public static ResourceLocation modLoc(String path) {
        return ResourceLocation.fromNamespaceAndPath(MOD_ID, path);
    }
}
