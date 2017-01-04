package ModSharpnet.Recipes;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

public class RecipesOld
{
    public static void register()
    {
        //Recipes Old
        GameRegistry.addShapelessRecipe(new ItemStack(Item.flint,1,0), new ItemStack(Block.gravel,1,0), new ItemStack(Block.gravel,1,0));
        GameRegistry.addShapelessRecipe(new ItemStack(Item.seeds,2,0), new ItemStack(Item.wheat,1,0));
        GameRegistry.addRecipe(new ItemStack(Block.stoneDoubleSlab,1,0), new Object[]
        {
            "S",
            "S",
            'S', Block.stoneSingleSlab
        });
        GameRegistry.addRecipe(new ItemStack(Block.cobblestoneMossy,1,0), new Object[]
        {
            "W",
            "S",
            'S', Block.stone, 'W', Item.seeds
        });
        GameRegistry.addRecipe(new ItemStack(Block.grass,1,0), new Object[]
        {
            "W",
            "S",
            'S', Block.dirt, 'W', Item.seeds
        });
        GameRegistry.addRecipe(new ItemStack(Block.blockClay,1,0), new Object[]
        {
            "W",
            "S",
            'S', Block.gravel, 'W', Block.dirt
        });
        GameRegistry.addRecipe(new ItemStack(Block.web,1,0), new Object[]
        {
            "S S",
            " S ",
            "S S",
            'S', Item.silk
        });
        for (int x = 0; x < 16; x++ )
        {
            GameRegistry.addRecipe(new ItemStack(Item.silk,3,0), new Object[]
            {
                "W",
                "W",
                'W', new ItemStack(Block.cloth,1,x)
            });
        }
        GameRegistry.addRecipe(new ItemStack(Item.slimeBall,4,0), new Object[]
        {
            " C ",
            "SSS",
            'C', Block.cactus, 'S', Item.sugar
        });
        
        //Recipe Gunpowder
        GameRegistry.addShapelessRecipe(new ItemStack(Item.gunpowder, 1,0), new ItemStack(Item.coal, 1, 0), new ItemStack(Item.redstone, 1, 0));
        
        //Recipe Exchange Charocoal to Coal
        GameRegistry.addShapelessRecipe(new ItemStack(Item.coal, 1,0), new ItemStack(Item.coal, 1, 1));
        
        //Recipe TNT
        GameRegistry.addRecipe(new ItemStack(Block.tnt,1,0), new Object[]
        {
            " W ",
            "GRG",
            "SSS",
            'G', Item.gunpowder, 'R', Item.redstone, 'S', Block.sand, 'W', new ItemStack(Block.planks, 1, 0)
        });
        
        //Recipe Mushroom Stew
        GameRegistry.addShapelessRecipe(new ItemStack(Item.bowlSoup, 1,0), new ItemStack(Item.bowlEmpty, 1, 0), new ItemStack(Block.mushroomBrown, 1, 0), new ItemStack(Block.mushroomBrown, 1, 0));
        
        //Recipe Mushroom Stew
        GameRegistry.addShapelessRecipe(new ItemStack(Item.bowlSoup, 1,0), new ItemStack(Item.bowlEmpty, 1, 0), new ItemStack(Block.mushroomRed, 1, 0), new ItemStack(Block.mushroomRed, 1, 0));
        
    } 
}
