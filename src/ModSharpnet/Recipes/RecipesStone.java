package ModSharpnet.Recipes;

import ModSharpnet.Blocks;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

import net.minecraft.item.Item;

public class RecipesStone
{
    public static void register()
    {
        //Recipe Stone 1
        GameRegistry.addRecipe(new ItemStack(Blocks.SharpnetStoneBlocks1,2,0), new Object[]
        {
            "C ",
            " C",
            'C', Block.stone,
        });
        
        //Recipe Stone 2
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.SharpnetStoneBlocks1,1,1), new ItemStack(Blocks.SharpnetStoneBlocks1,1,0));
        //Recipe Stone 3
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.SharpnetStoneBlocks1,1,2), new ItemStack(Blocks.SharpnetStoneBlocks1,1,1));
        //Recipe Stone 4
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.SharpnetStoneBlocks1,1,3), new ItemStack(Blocks.SharpnetStoneBlocks1,1,2));
        //Recipe Stone 4 to 1
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.SharpnetStoneBlocks1,1,0), new ItemStack(Blocks.SharpnetStoneBlocks1,1,3));

        
    } 
}
