package dev.purppecat.purps_mcu_reborn.data.recipes;

import dev.purppecat.purps_mcu_reborn.PurpsMCUReborn;
import dev.purppecat.purps_mcu_reborn.world.item.PurpsMCURebornItems;
import dev.purppecat.purps_mcu_reborn.world.level.block.PurpsMCURebornBlocks;
import dev.thomasglasser.tommylib.api.data.recipes.ExtendedRecipeProvider;
import java.util.concurrent.CompletableFuture;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Blocks;

public class PurpsMCURebornRecipeProvider extends ExtendedRecipeProvider {
    public PurpsMCURebornRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> provider) {
        super(output, provider);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput, HolderLookup.Provider holderLookup) {
        buildCrafting(recipeOutput);
        buildCooking(recipeOutput);
    }

    private void buildCrafting(RecipeOutput recipeOutput) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, PurpsMCURebornBlocks.SILICON_BLOCK, 1)
                .requires(PurpsMCURebornItems.SILICON_INGOT, 9)
                .unlockedBy(getHasName(PurpsMCURebornItems.SILICON_INGOT), has(PurpsMCURebornItems.SILICON_INGOT))
                .save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, PurpsMCURebornItems.SILICON_INGOT, 9)
                .requires(PurpsMCURebornBlocks.SILICON_BLOCK, 1)
                .unlockedBy(getHasName(PurpsMCURebornBlocks.SILICON_BLOCK), has(PurpsMCURebornBlocks.SILICON_BLOCK))
                .save(recipeOutput, PurpsMCUReborn.modLoc("silicon_block_to_ingots"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, PurpsMCURebornItems.SILICON_NUGGET, 9)
                .requires(PurpsMCURebornItems.SILICON_INGOT, 1)
                .unlockedBy(getHasName(PurpsMCURebornItems.SILICON_INGOT), has(PurpsMCURebornItems.SILICON_INGOT))
                .save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, PurpsMCURebornItems.SILICON_INGOT, 1)
                .requires(PurpsMCURebornItems.SILICON_NUGGET, 9)
                .unlockedBy(getHasName(PurpsMCURebornItems.SILICON_NUGGET), has(PurpsMCURebornItems.SILICON_NUGGET))
                .save(recipeOutput, PurpsMCUReborn.modLoc("silicon_nuggets_to_ingots"));

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, PurpsMCURebornItems.HAMMER, 1)
                .pattern("###")
                .pattern(" B#")
                .pattern(" C ")
                .define('#', Items.IRON_INGOT)
                .define('B', Items.LEATHER)
                .define('C', Items.STICK)
                .unlockedBy(getHasName(Items.IRON_INGOT), has(Items.IRON_INGOT))
                .unlockedBy(getHasName(Items.LEATHER), has(Items.LEATHER))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, PurpsMCURebornItems.WIRE_CUTTER, 1)
                .pattern(" # ")
                .pattern("BC#")
                .pattern(" B ")
                .define('#', Items.IRON_INGOT)
                .define('B', Items.STICK)
                .define('C', Items.LEATHER)
                .unlockedBy(getHasName(Items.IRON_INGOT), has(Items.IRON_INGOT))
                .unlockedBy(getHasName(Items.LEATHER), has(Items.LEATHER))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, PurpsMCURebornBlocks.LAPTOP, 1)
                .pattern("ABC")
                .pattern("DEF")
                .pattern("GHI")
                .define('A', Items.GRAY_CONCRETE)
                .define('B', Items.GRAY_STAINED_GLASS)
                .define('C', PurpsMCURebornItems.COPPER_WIRE)
                .define('D', PurpsMCURebornItems.CPU_I_THREE)
                .define('E', Items.STONE_BUTTON)
                .define('F', PurpsMCURebornItems.RAM_TIER_ONE)
                .define('G', PurpsMCURebornItems.FAN)
                .define('H', PurpsMCURebornItems.MOTHERBOARD)
                .define('I', PurpsMCURebornItems.GPU_TIER_ONE)
                .unlockedBy(getHasName(Items.GRAY_CONCRETE), has(Items.GRAY_CONCRETE))
                .unlockedBy(getHasName(Items.GRAY_STAINED_GLASS), has(Items.GRAY_STAINED_GLASS))
                .unlockedBy(getHasName(Items.STONE_BUTTON), has(Items.STONE_BUTTON))
                .unlockedBy(getHasName(PurpsMCURebornItems.FAN), has(PurpsMCURebornItems.FAN))
                .unlockedBy(getHasName(PurpsMCURebornItems.COPPER_WIRE), has(PurpsMCURebornItems.COPPER_WIRE))
                .unlockedBy(getHasName(PurpsMCURebornItems.MOTHERBOARD), has(PurpsMCURebornItems.MOTHERBOARD))
                .unlockedBy(getHasName(PurpsMCURebornItems.GPU_TIER_ONE), has(PurpsMCURebornItems.GPU_TIER_ONE))
                .unlockedBy(getHasName(PurpsMCURebornItems.RAM_TIER_ONE), has(PurpsMCURebornItems.RAM_TIER_ONE))
                .unlockedBy(getHasName(PurpsMCURebornItems.CPU_I_THREE), has(PurpsMCURebornItems.CPU_I_THREE))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, PurpsMCURebornBlocks.IRON_ANVIL, 1)
                .pattern("III")
                .pattern(" I ")
                .pattern("BBB")
                .define('I', Items.IRON_INGOT)
                .define('B', Items.IRON_BLOCK)
                .unlockedBy(getHasName(Blocks.IRON_BLOCK), has(Blocks.IRON_BLOCK))
                .unlockedBy(getHasName(Items.IRON_INGOT), has(Items.IRON_INGOT))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PurpsMCURebornItems.FAN, 4)
                .pattern("A#A")
                .pattern("#B#")
                .pattern("A#A")
                .define('#', Items.IRON_NUGGET)
                .define('B', Items.IRON_INGOT)
                .define('A', Items.GRAY_CONCRETE)
                .unlockedBy(getHasName(Items.GRAY_CONCRETE), has(Items.GRAY_CONCRETE))
                .unlockedBy(getHasName(Items.IRON_INGOT), has(Items.IRON_INGOT))
                .unlockedBy(getHasName(Items.IRON_NUGGET), has(Items.IRON_NUGGET))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PurpsMCURebornItems.MOTHERBOARD, 1)
                .pattern("ABC")
                .pattern("DCD")
                .pattern("EFE")
                .define('A', PurpsMCURebornItems.FAN)
                .define('B', PurpsMCURebornItems.COPPER_WIRE)
                .define('C', Items.COMPARATOR)
                .define('D', PurpsMCURebornItems.SILICON_INGOT)
                .define('E', Items.GRAY_CONCRETE)
                .define('F', Items.IRON_INGOT)
                .unlockedBy(getHasName(PurpsMCURebornItems.MOTHERBOARD_BASE), has(PurpsMCURebornItems.MOTHERBOARD_BASE))
                .unlockedBy(getHasName(PurpsMCURebornItems.FAN), has(PurpsMCURebornItems.FAN))
                .unlockedBy(getHasName(PurpsMCURebornItems.COPPER_WIRE), has(PurpsMCURebornItems.COPPER_WIRE))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PurpsMCURebornItems.MOTHERBOARD_BASE, 1)
                .pattern("ABC")
                .pattern("DED")
                .pattern(" F ")
                .define('A', PurpsMCURebornItems.HAMMER)
                .define('B', PurpsMCURebornItems.COPPER_WIRE)
                .define('C', PurpsMCURebornItems.WIRE_CUTTER)
                .define('D', Items.GRAY_CONCRETE)
                .define('E', PurpsMCURebornItems.SILICON_INGOT)
                .define('F', Items.IRON_INGOT)
                .unlockedBy(getHasName(Items.GRAY_CONCRETE), has(Items.GRAY_CONCRETE))
                .unlockedBy(getHasName(Items.IRON_INGOT), has(Items.IRON_INGOT))
                .unlockedBy(getHasName(PurpsMCURebornItems.SILICON_INGOT), has(PurpsMCURebornItems.SILICON_INGOT))
                .unlockedBy(getHasName(PurpsMCURebornItems.HAMMER), has(PurpsMCURebornItems.HAMMER))
                .unlockedBy(getHasName(PurpsMCURebornItems.WIRE_CUTTER), has(PurpsMCURebornItems.WIRE_CUTTER))
                .unlockedBy(getHasName(PurpsMCURebornItems.COPPER_WIRE), has(PurpsMCURebornItems.COPPER_WIRE))
                .save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.REDSTONE, PurpsMCURebornItems.COPPER_WIRE, 4)
                .requires(Ingredient.of(PurpsMCURebornItems.WIRE_CUTTER), 1)
                .requires(Items.COPPER_INGOT, 2)
                .requires(Items.REDSTONE, 1)
                .requires(Items.STRING, 1)
                .unlockedBy(getHasName(Items.STRING), has(Items.STRING))
                .unlockedBy(getHasName(Items.REDSTONE), has(Items.REDSTONE))
                .unlockedBy(getHasName(Items.COPPER_INGOT), has(Items.COPPER_INGOT))
                .unlockedBy(getHasName(PurpsMCURebornItems.WIRE_CUTTER), has(PurpsMCURebornItems.WIRE_CUTTER))
                .save(recipeOutput);
    }

    private void buildCooking(RecipeOutput recipeOutput) {
        simpleSmeltingRecipe(recipeOutput, PurpsMCURebornItems.RAW_SILICON, PurpsMCURebornItems.SILICON_INGOT, 200f);
        simpleSmeltingRecipe(recipeOutput, Items.QUARTZ, PurpsMCURebornItems.RAW_SILICON, 260f);
    }
}
