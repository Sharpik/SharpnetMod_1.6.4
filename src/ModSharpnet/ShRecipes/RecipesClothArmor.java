package ModSharpnet.ShRecipes;

import ModSharpnet.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.block.Block;
import cpw.mods.fml.common.registry.GameRegistry;

public class RecipesClothArmor
{
    public static void register()
    {
        //Recipes Cloth
        GameRegistry.addRecipe(new ItemStack(Items.cloth_white,1,0), new Object[]
        {
            "SS",
            'S', Item.silk
        });
        GameRegistry.addShapelessRecipe(new ItemStack(Items.cloth_black,1,0), new ItemStack(Items.cloth_white,1,0), new ItemStack(Item.dyePowder,1,0));
        GameRegistry.addShapelessRecipe(new ItemStack(Items.cloth_blue,1,0), new ItemStack(Items.cloth_white,1,0), new ItemStack(Item.dyePowder,1,4));
        GameRegistry.addShapelessRecipe(new ItemStack(Items.cloth_brown,1,0), new ItemStack(Items.cloth_white,1,0), new ItemStack(Item.dyePowder,1,3));
        GameRegistry.addShapelessRecipe(new ItemStack(Items.cloth_gray,1,0), new ItemStack(Items.cloth_white,1,0), new ItemStack(Item.dyePowder,1,8));
        GameRegistry.addShapelessRecipe(new ItemStack(Items.cloth_green,1,0), new ItemStack(Items.cloth_white,1,0), new ItemStack(Item.dyePowder,1,2));
        GameRegistry.addShapelessRecipe(new ItemStack(Items.cloth_orange,1,0), new ItemStack(Items.cloth_white,1,0), new ItemStack(Item.dyePowder,1,14));
        GameRegistry.addShapelessRecipe(new ItemStack(Items.cloth_red,1,0), new ItemStack(Items.cloth_white,1,0), new ItemStack(Item.dyePowder,1,1));
        GameRegistry.addShapelessRecipe(new ItemStack(Items.cloth_yellow,1,0), new ItemStack(Items.cloth_white,1,0), new ItemStack(Item.dyePowder,1,11));

        //Recipe Armors
        GameRegistry.addRecipe(new ItemStack(Items.armor_formal_boots,1,0), new Object[]
        {
            "   ",
            "C C",
            "CDC",
            'C', Items.cloth_black, 'D', Item.diamond
        });
        GameRegistry.addRecipe(new ItemStack(Items.armor_formal_trousers,1,0), new Object[]
        {
            " D ",
            "C C",
            "C C",
            'C', Items.cloth_black, 'D', Item.diamond
        });
        GameRegistry.addRecipe(new ItemStack(Items.armor_formal_suit,1,0), new Object[]
        {
            " D ",
            "CCC",
            " C ",
            'C', Items.cloth_black, 'D', Item.diamond
        });
        
        GameRegistry.addRecipe(new ItemStack(Items.armor_jeans_black,1,0), new Object[]
        {
            "   ",
            "CCC",
            "C C",
            'C', Items.cloth_black
        });
        GameRegistry.addRecipe(new ItemStack(Items.armor_jeans_blue,1,0), new Object[]
        {
            " C ",
            "C C",
            "C C",
            'C', Items.cloth_blue
        });
        GameRegistry.addRecipe(new ItemStack(Items.armor_trousers_black,1,0), new Object[]
        {
            " C ",
            "C C",
            "C C",
            'C', Items.cloth_black
        });
        GameRegistry.addRecipe(new ItemStack(Items.armor_tshirt_black,1,0), new Object[]
        {
            " C ",
            "CDC",
            " C ",
            'C', Items.cloth_black, 'D', Items.cloth_white
        });
        GameRegistry.addRecipe(new ItemStack(Items.armor_tshirt_blue,1,0), new Object[]
        {
            " C ",
            "CCC",
            " C ",
            'C', Items.cloth_blue
        });
        GameRegistry.addRecipe(new ItemStack(Items.armor_tshirt_green,1,0), new Object[]
        {
            " C ",
            "CCC",
            " C ",
            'C', Items.cloth_green
        });
        GameRegistry.addRecipe(new ItemStack(Items.armor_tshirt_orange,1,0), new Object[]
        {
            " C ",
            "CCC",
            " C ",
            'C', Items.cloth_orange
        });
        GameRegistry.addRecipe(new ItemStack(Items.armor_tshirt_white,1,0), new Object[]
        {
            " C ",
            "CCC",
            " C ",
            'C', Items.cloth_white
        });
        GameRegistry.addRecipe(new ItemStack(Items.armor_sunglasses,1,0), new Object[]
        {
            "GWG",
            'G', Block.thinGlass, 'W', new ItemStack(Block.cloth,1,0)
        });
        
    } 
}
