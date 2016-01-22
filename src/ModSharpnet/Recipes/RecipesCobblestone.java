package ModSharpnet.Recipes;

import ModSharpnet.Blocks;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

import net.minecraft.item.Item;

public class RecipesCobblestone
{
    public static void register()
    {
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

        
    } 
}
