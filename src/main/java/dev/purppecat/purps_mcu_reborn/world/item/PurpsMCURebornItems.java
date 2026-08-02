package dev.purppecat.purps_mcu_reborn.world.item;

import dev.purppecat.purps_mcu_reborn.PurpsMCUReborn;
import dev.purppecat.purps_mcu_reborn.world.level.block.PurpsMCURebornBlocks;
import dev.thomasglasser.tommylib.api.registration.DeferredItem;
import dev.thomasglasser.tommylib.api.registration.DeferredRegister;
import dev.thomasglasser.tommylib.api.world.item.ItemUtils;
import java.util.function.Supplier;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tiers;
import org.jetbrains.annotations.ApiStatus;

public class PurpsMCURebornItems {
    @ApiStatus.Internal
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(PurpsMCUReborn.MOD_ID);

    /// MOTHERBOARDS
    public static final DeferredItem<MotherBoardBaseItem> MOTHERBOARD_BASE = register("motherboard_base", () -> new MotherBoardBaseItem(new Item.Properties()));
    public static final DeferredItem<MotherBoardItem> MOTHERBOARD = register("motherboard", () -> new MotherBoardItem(new Item.Properties()));
    /// CPU
    public static final DeferredItem<CpuIThreeItem> CPU_I_THREE = register("cpu_i_three", () -> new CpuIThreeItem(new Item.Properties()));
    public static final DeferredItem<CpuIFiveItem> CPU_I_FIVE = register("cpu_i_five", () -> new CpuIFiveItem(new Item.Properties()));
    public static final DeferredItem<CpuISevenItem> CPU_I_SEVEN = register("cpu_i_seven", () -> new CpuISevenItem(new Item.Properties()));
    /// GPU
    public static final DeferredItem<GpuTierOneItem> GPU_TIER_ONE = register("gpu_tier_one", () -> new GpuTierOneItem(new Item.Properties()));
    public static final DeferredItem<GpuTierThreeItem> GPU_TIER_THREE = register("gpu_tier_three", () -> new GpuTierThreeItem(new Item.Properties()));
    /// RAM
    public static final DeferredItem<RamTierOneItem> RAM_TIER_ONE = register("ram_tier_one", () -> new RamTierOneItem(new Item.Properties()));
    ///  FAN
    public static final DeferredItem<FanItem> FAN = register("fan", () -> new FanItem(new Item.Properties().stacksTo(4)));

    /// Minerals/Materials
    // Silicon
    public static final DeferredItem<Item> RAW_SILICON = register("raw_silicon", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SILICON_INGOT = register("silicon_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SILICON_NUGGET = register("silicon_nugget", () -> new Item(new Item.Properties()));

    /// TECH TOOLS
    public static final DeferredItem<HammerItem> HAMMER = register("hammer", () -> new HammerItem(Tiers.IRON, new Item.Properties().durability(265)));
    public static final DeferredItem<WireCutterItem> WIRE_CUTTER = register("wire_cutter", () -> new WireCutterItem(Tiers.IRON, new Item.Properties().durability(254)));

    /// TECHNOLOGY MISC
    public static final DeferredItem<Item> COPPER_WIRE = register("copper_wire", () -> new Item(new Item.Properties()));

    /// BLOCKS
    // Technology
    public static final DeferredItem<LaptopItem> LAPTOP = register("laptop", () -> new LaptopItem(PurpsMCURebornBlocks.LAPTOP.get(), new Item.Properties()));
    // Misc
    public static final DeferredItem<IronAnvilItem> IRON_ANVIL = register("iron_anvil", () -> new IronAnvilItem(PurpsMCURebornBlocks.IRON_ANVIL.get(), new Item.Properties()));

    @ApiStatus.Internal
    public static <T extends Item> DeferredItem<T> register(String name, Supplier<T> item) {
        return ItemUtils.register(ITEMS, name, item);
    }

    @ApiStatus.Internal
    public static void init() {}
}
