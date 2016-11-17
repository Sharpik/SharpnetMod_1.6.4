package ModSharpnet.Recipes;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.block.Block;
import cpw.mods.fml.common.registry.GameRegistry;

import static ModSharpnet.ModSharpnet.SharpnetFlowerBlocks1;

public class RecipesFlowers
{
    public static void register()
    {
        //Recipe Flower duplication
        GameRegistry.addShapelessRecipe(new ItemStack(Block.plantRed, 4,0), new ItemStack(Block.plantRed, 1, 0), new ItemStack(Item.dyePowder, 1, 15));
        GameRegistry.addShapelessRecipe(new ItemStack(Block.plantYellow, 4,0), new ItemStack(Block.plantYellow, 1, 0), new ItemStack(Item.dyePowder, 1, 15));
        
        GameRegistry.addShapelessRecipe(new ItemStack(SharpnetFlowerBlocks1, 2,0), new ItemStack(SharpnetFlowerBlocks1, 1, 0), new ItemStack(Item.dyePowder, 1, 15));
        GameRegistry.addShapelessRecipe(new ItemStack(SharpnetFlowerBlocks1, 2,1), new ItemStack(SharpnetFlowerBlocks1, 1, 1), new ItemStack(Item.dyePowder, 1, 15));
        GameRegistry.addShapelessRecipe(new ItemStack(SharpnetFlowerBlocks1, 4,2), new ItemStack(SharpnetFlowerBlocks1, 1, 2), new ItemStack(Item.dyePowder, 1, 15));
        GameRegistry.addShapelessRecipe(new ItemStack(SharpnetFlowerBlocks1, 4,3), new ItemStack(SharpnetFlowerBlocks1, 1, 3), new ItemStack(Item.dyePowder, 1, 15));
        GameRegistry.addShapelessRecipe(new ItemStack(SharpnetFlowerBlocks1, 2,4), new ItemStack(SharpnetFlowerBlocks1, 1, 4), new ItemStack(Item.dyePowder, 1, 15));
        GameRegistry.addShapelessRecipe(new ItemStack(SharpnetFlowerBlocks1, 4,5), new ItemStack(SharpnetFlowerBlocks1, 1, 5), new ItemStack(Item.dyePowder, 1, 15));
        GameRegistry.addShapelessRecipe(new ItemStack(SharpnetFlowerBlocks1, 4,6), new ItemStack(SharpnetFlowerBlocks1, 1, 6), new ItemStack(Item.dyePowder, 1, 15));
        GameRegistry.addShapelessRecipe(new ItemStack(SharpnetFlowerBlocks1, 4,7), new ItemStack(SharpnetFlowerBlocks1, 1, 7), new ItemStack(Item.dyePowder, 1, 15));
        GameRegistry.addShapelessRecipe(new ItemStack(SharpnetFlowerBlocks1, 3,8), new ItemStack(SharpnetFlowerBlocks1, 1, 8), new ItemStack(Item.dyePowder, 1, 15));
        GameRegistry.addShapelessRecipe(new ItemStack(SharpnetFlowerBlocks1, 2,9), new ItemStack(SharpnetFlowerBlocks1, 1, 9), new ItemStack(Item.dyePowder, 1, 15));
        GameRegistry.addShapelessRecipe(new ItemStack(SharpnetFlowerBlocks1, 5,10), new ItemStack(SharpnetFlowerBlocks1, 1, 10), new ItemStack(Item.dyePowder, 1, 15));
        GameRegistry.addShapelessRecipe(new ItemStack(SharpnetFlowerBlocks1, 4,11), new ItemStack(SharpnetFlowerBlocks1, 1, 11), new ItemStack(Item.dyePowder, 1, 15));
        GameRegistry.addShapelessRecipe(new ItemStack(SharpnetFlowerBlocks1, 2,12), new ItemStack(SharpnetFlowerBlocks1, 1, 12), new ItemStack(Item.dyePowder, 1, 15));
        GameRegistry.addShapelessRecipe(new ItemStack(SharpnetFlowerBlocks1, 3,13), new ItemStack(SharpnetFlowerBlocks1, 1, 13), new ItemStack(Item.dyePowder, 1, 15));
        GameRegistry.addShapelessRecipe(new ItemStack(SharpnetFlowerBlocks1, 2,14), new ItemStack(SharpnetFlowerBlocks1, 1, 14), new ItemStack(Item.dyePowder, 1, 15));
        GameRegistry.addShapelessRecipe(new ItemStack(SharpnetFlowerBlocks1, 2,15), new ItemStack(SharpnetFlowerBlocks1, 1, 15), new ItemStack(Item.dyePowder, 1, 15));
        
    } 
}
