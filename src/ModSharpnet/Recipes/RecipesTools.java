package ModSharpnet.Recipes;

import ModSharpnet.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.block.Block;
import cpw.mods.fml.common.registry.GameRegistry;

public class RecipesTools
{
    public static void register()
    {
        //Recipe Throwel
        GameRegistry.addRecipe(new ItemStack(Items.trowel,1,0), new Object[]
        {
            " SC",
            "II ",
            'S', Item.stick, 'C', Item.clay, 'I', Item.ingotIron
        });
        //Reload for Throwel
        GameRegistry.addShapelessRecipe(new ItemStack(Items.trowel,1,16), new ItemStack(Items.trowel,1,Short.MAX_VALUE), Item.clay);
        GameRegistry.addShapelessRecipe(new ItemStack(Items.trowel,1,8), new ItemStack(Items.trowel,1,Short.MAX_VALUE), Item.clay, Item.clay);
        GameRegistry.addShapelessRecipe(new ItemStack(Items.trowel,1,0), new ItemStack(Items.trowel,1,Short.MAX_VALUE), Item.clay, Item.clay, Item.clay);
        
        //Recipe Rake
        GameRegistry.addRecipe(new ItemStack(Items.rake,1,0), new Object[]
        {
            "III",
            "IWI",
            " S ",
            'W', Block.planks, 'S', Item.stick, 'I', Item.ingotIron
        });
        
        //easter
        GameRegistry.addShapelessRecipe(new ItemStack(Items.rejuvenation_rod, 1, 0), new ItemStack(Item.swordWood, 1, 0), new ItemStack(Item.dyePowder, 1, 1), new ItemStack(Item.dyePowder, 1, 4), new ItemStack(Item.dyePowder, 1, 11));
    } 
}
