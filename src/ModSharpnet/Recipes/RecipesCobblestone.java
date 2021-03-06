package ModSharpnet.Recipes;

import ModSharpnet.Blocks;
import ModSharpnet.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

import net.minecraft.item.Item;
import net.minecraft.item.crafting.FurnaceRecipes;

public class RecipesCobblestone
{
    public static void register()
    {
        //Smelting
        FurnaceRecipes.smelting().addSmelting(Blocks.SharpnetCobblestoneBlocks1.blockID, 0, new ItemStack(Blocks.SharpnetStoneBlocks1, 1, 0), 0.35f);
        FurnaceRecipes.smelting().addSmelting(Blocks.SharpnetCobblestoneBlocks1.blockID, 1, new ItemStack(Blocks.SharpnetStoneBlocks1, 1, 1), 0.35f);
        FurnaceRecipes.smelting().addSmelting(Blocks.SharpnetCobblestoneBlocks1.blockID, 2, new ItemStack(Blocks.SharpnetStoneBlocks1, 1, 2), 0.35f);
        FurnaceRecipes.smelting().addSmelting(Blocks.SharpnetCobblestoneBlocks1.blockID, 3, new ItemStack(Blocks.SharpnetStoneBlocks1, 1, 3), 0.35f);
        
        /*
        //Recipe Cobblestone 1
        GameRegistry.addRecipe(new ItemStack(Blocks.SharpnetCobblestoneBlocks1,2,0), new Object[]
        {
            "C ",
            " C",
            'C', Block.cobblestone,
        });
        
        //Recipe Cobblestone 2
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.SharpnetCobblestoneBlocks1,1,1), new ItemStack(Blocks.SharpnetCobblestoneBlocks1,1,0));
        //Recipe Cobblestone 3
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.SharpnetCobblestoneBlocks1,1,2), new ItemStack(Blocks.SharpnetCobblestoneBlocks1,1,1));
        //Recipe Cobblestone 4
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.SharpnetCobblestoneBlocks1,1,3), new ItemStack(Blocks.SharpnetCobblestoneBlocks1,1,2));
        //Recipe Cobblestone 4 to 1
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.SharpnetCobblestoneBlocks1,1,0), new ItemStack(Blocks.SharpnetCobblestoneBlocks1,1,3));
        */
        
        //Recipe Cobblestone Wall 1
        GameRegistry.addRecipe(new ItemStack(Blocks.SharpnetCobblestoneWalls1,6,0), new Object[]
        {
            "CCC",
            "CCC",
            'C', new ItemStack(Blocks.SharpnetCobblestoneBlocks1,1,0),
        });
        //Recipe Cobblestone Wall 2
        GameRegistry.addRecipe(new ItemStack(Blocks.SharpnetCobblestoneWalls1,6,1), new Object[]
        {
            "CCC",
            "CCC",
            'C', new ItemStack(Blocks.SharpnetCobblestoneBlocks1,1,1),
        });
        //Recipe Cobblestone Wall 3
        GameRegistry.addRecipe(new ItemStack(Blocks.SharpnetCobblestoneWalls1,6,2), new Object[]
        {
            "CCC",
            "CCC",
            'C', new ItemStack(Blocks.SharpnetCobblestoneBlocks1,1,2),
        });
        //Recipe Cobblestone Wall 4
        GameRegistry.addRecipe(new ItemStack(Blocks.SharpnetCobblestoneWalls1,6,3), new Object[]
        {
            "CCC",
            "CCC",
            'C', new ItemStack(Blocks.SharpnetCobblestoneBlocks1,1,3),
        });
        
    } 
}
