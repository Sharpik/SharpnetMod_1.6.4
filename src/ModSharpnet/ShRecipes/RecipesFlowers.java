package ModSharpnet.ShRecipes;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.block.Block;
import cpw.mods.fml.common.registry.GameRegistry;

import static ModSharpnet.ModSharpnet.sharpnetFlowerBlocks1;

public class RecipesFlowers
{
    public static void register()
    {
        //Recipe Flower duplication
        GameRegistry.addShapelessRecipe(new ItemStack(Block.plantRed, 4,0), new ItemStack(Block.plantRed, 1, 0), new ItemStack(Item.dyePowder, 1, 15));
        GameRegistry.addShapelessRecipe(new ItemStack(Block.plantYellow, 4,0), new ItemStack(Block.plantYellow, 1, 0), new ItemStack(Item.dyePowder, 1, 15));
        
        GameRegistry.addShapelessRecipe(new ItemStack(sharpnetFlowerBlocks1, 2,0), new ItemStack(sharpnetFlowerBlocks1, 1, 0), new ItemStack(Item.dyePowder, 1, 15));
        GameRegistry.addShapelessRecipe(new ItemStack(sharpnetFlowerBlocks1, 2,1), new ItemStack(sharpnetFlowerBlocks1, 1, 1), new ItemStack(Item.dyePowder, 1, 15));
        GameRegistry.addShapelessRecipe(new ItemStack(sharpnetFlowerBlocks1, 4,2), new ItemStack(sharpnetFlowerBlocks1, 1, 2), new ItemStack(Item.dyePowder, 1, 15));
        GameRegistry.addShapelessRecipe(new ItemStack(sharpnetFlowerBlocks1, 4,3), new ItemStack(sharpnetFlowerBlocks1, 1, 3), new ItemStack(Item.dyePowder, 1, 15));
        GameRegistry.addShapelessRecipe(new ItemStack(sharpnetFlowerBlocks1, 2,4), new ItemStack(sharpnetFlowerBlocks1, 1, 4), new ItemStack(Item.dyePowder, 1, 15));
        GameRegistry.addShapelessRecipe(new ItemStack(sharpnetFlowerBlocks1, 4,5), new ItemStack(sharpnetFlowerBlocks1, 1, 5), new ItemStack(Item.dyePowder, 1, 15));
        GameRegistry.addShapelessRecipe(new ItemStack(sharpnetFlowerBlocks1, 4,6), new ItemStack(sharpnetFlowerBlocks1, 1, 6), new ItemStack(Item.dyePowder, 1, 15));
        GameRegistry.addShapelessRecipe(new ItemStack(sharpnetFlowerBlocks1, 4,7), new ItemStack(sharpnetFlowerBlocks1, 1, 7), new ItemStack(Item.dyePowder, 1, 15));
        GameRegistry.addShapelessRecipe(new ItemStack(sharpnetFlowerBlocks1, 3,8), new ItemStack(sharpnetFlowerBlocks1, 1, 8), new ItemStack(Item.dyePowder, 1, 15));
        GameRegistry.addShapelessRecipe(new ItemStack(sharpnetFlowerBlocks1, 2,9), new ItemStack(sharpnetFlowerBlocks1, 1, 9), new ItemStack(Item.dyePowder, 1, 15));
        GameRegistry.addShapelessRecipe(new ItemStack(sharpnetFlowerBlocks1, 5,10), new ItemStack(sharpnetFlowerBlocks1, 1, 10), new ItemStack(Item.dyePowder, 1, 15));
        GameRegistry.addShapelessRecipe(new ItemStack(sharpnetFlowerBlocks1, 4,11), new ItemStack(sharpnetFlowerBlocks1, 1, 11), new ItemStack(Item.dyePowder, 1, 15));
        GameRegistry.addShapelessRecipe(new ItemStack(sharpnetFlowerBlocks1, 2,12), new ItemStack(sharpnetFlowerBlocks1, 1, 12), new ItemStack(Item.dyePowder, 1, 15));
        GameRegistry.addShapelessRecipe(new ItemStack(sharpnetFlowerBlocks1, 3,13), new ItemStack(sharpnetFlowerBlocks1, 1, 13), new ItemStack(Item.dyePowder, 1, 15));
        GameRegistry.addShapelessRecipe(new ItemStack(sharpnetFlowerBlocks1, 2,14), new ItemStack(sharpnetFlowerBlocks1, 1, 14), new ItemStack(Item.dyePowder, 1, 15));
        GameRegistry.addShapelessRecipe(new ItemStack(sharpnetFlowerBlocks1, 2,15), new ItemStack(sharpnetFlowerBlocks1, 1, 15), new ItemStack(Item.dyePowder, 1, 15));
        
    } 
}
