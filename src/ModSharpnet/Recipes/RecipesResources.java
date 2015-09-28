package ModSharpnet.Recipes;

import ModSharpnet.Blocks;
import ModSharpnet.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.block.Block;
import cpw.mods.fml.common.registry.GameRegistry;

public class RecipesResources
{
    public static void register()
    {
        //steel ingot
        GameRegistry.addSmelting(Item.ingotIron.itemID, new ItemStack(Items.IngotSteel, 1), 0.35F);
        //iron bars
        GameRegistry.addShapelessRecipe(new ItemStack(Items.iron_bar, 7), new ItemStack(Block.fenceIron));
        
        //Recipe Iron Lader
        GameRegistry.addRecipe(new ItemStack(Blocks.ladder_iron1_block,1,0), new Object[]
        {
            "I I",
            "III",
            "I I",
            'I', Items.iron_bar
        });
        
        //Recipe Bottle Empty
        GameRegistry.addRecipe(new ItemStack(Items.bottle,6,0), new Object[]
        {
            " W ",
            "GGG",
            "GGG",
            'W', new ItemStack(5,1,0), 'G', new ItemStack(20,1,0)
        });
        //Recipe Barrel
        GameRegistry.addRecipe(new ItemStack(Items.barrel,1,0), new Object[]
        {
            "W W",
            "W W",
            "W W",
            'W', new ItemStack(5,1,0)
        });
        
    } 
}
