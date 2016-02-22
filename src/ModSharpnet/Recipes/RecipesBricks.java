package ModSharpnet.Recipes;

import ModSharpnet.Blocks;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

import net.minecraft.item.Item;

public class RecipesBricks
{
    public static void register()
    {
        //Recipe Bricks 4
        GameRegistry.addRecipe(new ItemStack(Blocks.SharpnetBricksBlocks1,2,3), new Object[]
        {
            "C ",
            " C",
            'C', Block.stoneBrick,
        });
        
        //Recipe Bricks 1
        GameRegistry.addRecipe(new ItemStack(Blocks.SharpnetBricksBlocks1,8,0), new Object[]
        {
            "CCC",
            "CBC",
            "CCC",
            'C', new ItemStack(Blocks.SharpnetBricksBlocks1,1,2), 'B', new ItemStack(Item.dyePowder,1,15),
        });
        
        //Recipe Bricks 2
        GameRegistry.addRecipe(new ItemStack(Blocks.SharpnetBricksBlocks1,8,1), new Object[]
        {
            "CCC",
            "CBC",
            "CCC",
            'C', new ItemStack(Blocks.SharpnetBricksBlocks1,1,2), 'B', new ItemStack(Item.dyePowder,1,11),
        });
        
        //Recipe Bricks 3
        GameRegistry.addRecipe(new ItemStack(Blocks.SharpnetBricksBlocks1,8,2), new Object[]
        {
            "CCC",
            "CBC",
            "CCC",
            'C', new ItemStack(Blocks.SharpnetBricksBlocks1,1,3), 'B', new ItemStack(Item.dyePowder,1,3),
        });
        
        //Recipe Bricks 5
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.SharpnetBricksBlocks1,1,4), new ItemStack(Blocks.SharpnetBricksBlocks1,1,3));
        //Recipe Bricks 6
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.SharpnetBricksBlocks1,1,5), new ItemStack(Blocks.SharpnetBricksBlocks1,1,4));
        //Recipe Bricks 7
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.SharpnetBricksBlocks1,1,6), new ItemStack(Blocks.SharpnetBricksBlocks1,1,5));
        //Recipe Bricks 7
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.SharpnetBricksBlocks1,1,7), new ItemStack(Blocks.SharpnetBricksBlocks1,1,6));
        //Recipe Bricks 8 to 4
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.SharpnetBricksBlocks1,1,3), new ItemStack(Blocks.SharpnetBricksBlocks1,1,7));
        
        
        //Recipe Cubes 1
        GameRegistry.addRecipe(new ItemStack(Blocks.SharpnetBricksBlocks1,2,8), new Object[]
        {
            "C ",
            " C",
            'C', Block.cobblestone,
        });
        
        //Recipe Cubes 2
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.SharpnetBricksBlocks1,1,9), new ItemStack(Blocks.SharpnetBricksBlocks1,1,8));
        //Recipe Cubes 3
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.SharpnetBricksBlocks1,1,10), new ItemStack(Blocks.SharpnetBricksBlocks1,1,9));
        //Recipe Cubes 4
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.SharpnetBricksBlocks1,1,11), new ItemStack(Blocks.SharpnetBricksBlocks1,1,10));
        //Recipe Cubes 5
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.SharpnetBricksBlocks1,1,12), new ItemStack(Blocks.SharpnetBricksBlocks1,1,11));
        //Recipe Cubes 6
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.SharpnetBricksBlocks1,1,13), new ItemStack(Blocks.SharpnetBricksBlocks1,1,12));
        //Recipe Cubes 7
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.SharpnetBricksBlocks1,1,14), new ItemStack(Blocks.SharpnetBricksBlocks1,1,13));
        //Recipe Cubes 8
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.SharpnetBricksBlocks1,1,15), new ItemStack(Blocks.SharpnetBricksBlocks1,1,14));
        //Recipe Cubes 8 to 1
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.SharpnetBricksBlocks1,1,8), new ItemStack(Blocks.SharpnetBricksBlocks1,1,15));
        
    } 
}
