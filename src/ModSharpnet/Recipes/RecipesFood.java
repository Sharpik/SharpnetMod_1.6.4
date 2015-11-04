package ModSharpnet.Recipes;

import ModSharpnet.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.block.Block;
import cpw.mods.fml.common.registry.GameRegistry;

import static ModSharpnet.ModSharpnet.SharpnetCorn;
import static ModSharpnet.ModSharpnet.SharpnetCornSeeds;
import static ModSharpnet.ModSharpnet.SharpnetCucumber;
import static ModSharpnet.ModSharpnet.SharpnetCucumberSeeds;
import static ModSharpnet.ModSharpnet.SharpnetTomato;
import static ModSharpnet.ModSharpnet.SharpnetTomatoSeeds;

public class RecipesFood
{
    public static void register()
    {
        
        GameRegistry.addShapelessRecipe(new ItemStack(SharpnetTomatoSeeds, 1), new ItemStack(SharpnetTomato));
        GameRegistry.addShapelessRecipe(new ItemStack(SharpnetCucumberSeeds, 1), new ItemStack(SharpnetCucumber));
        GameRegistry.addShapelessRecipe(new ItemStack(SharpnetCornSeeds, 1), new ItemStack(SharpnetCorn));
        GameRegistry.addShapelessRecipe(new ItemStack(Items.grape_red_seeds, 1), new ItemStack(Items.grape_red));
        
        GameRegistry.addShapelessRecipe(new ItemStack(Items.sliced_potatoe, 1,0), new ItemStack(Item.potato, 1, 0));
        GameRegistry.addShapelessRecipe(new ItemStack(Items.flour, 4,0), new ItemStack(Item.wheat, 1, 0), new ItemStack(Item.wheat, 1, 0));
        GameRegistry.addShapelessRecipe(new ItemStack(Items.flour, 2,0), new ItemStack(Item.seeds, 1, 0), new ItemStack(Item.seeds, 1, 0));
        GameRegistry.addShapelessRecipe(new ItemStack(Items.dough, 1,0), new ItemStack(Items.flour, 1, 0));
        GameRegistry.addShapelessRecipe(new ItemStack(Items.tomato_puree, 2,0), new ItemStack(SharpnetTomato, 1, 0), new ItemStack(Item.sugar, 1, 0));
        GameRegistry.addShapelessRecipe(new ItemStack(Items.slice_of_bread, 4,0), new ItemStack(Item.bread, 1, 0));
        GameRegistry.addShapelessRecipe(new ItemStack(Items.butter, 1,0), new ItemStack(Item.bucketMilk.setContainerItem(Item.bucketEmpty), 1, 0));
        GameRegistry.addShapelessRecipe(new ItemStack(Items.butter, 1,0), new ItemStack(Items.bottle_of_milk, 1, 0));
        GameRegistry.addShapelessRecipe(new ItemStack(Items.cheese, 2,0), new ItemStack(Item.bucketMilk.setContainerItem(Item.bucketEmpty), 1, 0), new ItemStack(Items.butter, 1,0));
        GameRegistry.addShapelessRecipe(new ItemStack(Items.cheese, 2,0), new ItemStack(Items.bottle_of_milk, 1, 0), new ItemStack(Items.butter, 1,0));
        GameRegistry.addShapelessRecipe(new ItemStack(Items.salad, 1,0), new ItemStack(Item.potato, 1, 0), new ItemStack(SharpnetCucumber, 1,0), new ItemStack(Item.carrot, 1, 0), new ItemStack(Item.sugar, 1, 0));
        GameRegistry.addShapelessRecipe(new ItemStack(Items.breadcrumbs, 1,0), new ItemStack(Items.slice_of_bread, 1, 0));
        GameRegistry.addShapelessRecipe(new ItemStack(Items.honey, 1,0), new ItemStack(Block.plantYellow, 1, 0), new ItemStack(Item.sugar, 1, 0));
        
        //Recipes Filet
        GameRegistry.addShapelessRecipe(new ItemStack(Items.fillet, 2,0), new ItemStack(Items.mutton_cooked, 1, 0), new ItemStack(Items.breadcrumbs, 1, 0), new ItemStack(Items.breadcrumbs, 1, 0));
        GameRegistry.addShapelessRecipe(new ItemStack(Items.fillet, 2,0), new ItemStack(Item.porkCooked, 1, 0), new ItemStack(Items.breadcrumbs, 1, 0), new ItemStack(Items.breadcrumbs, 1, 0));
        GameRegistry.addShapelessRecipe(new ItemStack(Items.fillet, 3,0), new ItemStack(Item.beefCooked, 1, 0), new ItemStack(Items.breadcrumbs, 1, 0), new ItemStack(Items.breadcrumbs, 1, 0), new ItemStack(Items.breadcrumbs, 1, 0));
        GameRegistry.addShapelessRecipe(new ItemStack(Items.fillet, 1,0), new ItemStack(Item.chickenCooked, 1, 0), new ItemStack(Items.breadcrumbs, 1, 0));
        GameRegistry.addShapelessRecipe(new ItemStack(Items.fillet, 1,0), new ItemStack(Item.fishCooked, 1, 0), new ItemStack(Items.breadcrumbs, 1, 0));
        
        GameRegistry.addShapelessRecipe(new ItemStack(Items.salad_fillet, 1,0), new ItemStack(Items.salad, 1, 0), new ItemStack(Items.fillet, 1, 0));
        
        GameRegistry.addRecipe(new ItemStack(Items.catchup,1,0), new Object[]
        {
            "TTT",
            "TBT",
            "TTT",
            'T', Items.tomato_puree, 'B', Items.bottle
        });
        
        GameRegistry.addRecipe(new ItemStack(Items.raw_pizza,1,0), new Object[]
        {
            " C ",
            "TDT",
            "   ",
            'T', Items.tomato_puree, 'C', Items.cheese, 'D', Items.dough
        });
        
        //Smelting
        GameRegistry.addSmelting(Items.mutton_raw.itemID, new ItemStack(Items.mutton_cooked, 1), 0.35F);
        GameRegistry.addSmelting(Items.tea_leaves.itemID, new ItemStack(Items.cup_of_tea, 1), 0.35F);
        GameRegistry.addSmelting(Items.cofee_beans_raw.itemID, new ItemStack(Items.cofee_beans, 1), 0.35F);
        GameRegistry.addSmelting(Items.cofee_beans.itemID, new ItemStack(Items.cofee, 1), 0.35F);
        GameRegistry.addSmelting(Items.sliced_potatoe.itemID, new ItemStack(Items.potatoes_chips, 1), 0.35F);
        GameRegistry.addSmelting(Items.dough.itemID, new ItemStack(Item.bread, 1), 0.35F);
        GameRegistry.addSmelting(Items.raw_pizza.itemID, new ItemStack(Items.pizza, 1), 0.35F);
        GameRegistry.addSmelting(SharpnetCorn.itemID, new ItemStack(Items.popcorn, 3), 0.35F);
        
        GameRegistry.addSmelting(Items.mixed_ethanol.itemID, new ItemStack(Items.destiledEthanol_1, 1), 0.35F);
        GameRegistry.addSmelting(Items.destiledEthanol_1.itemID, new ItemStack(Items.destiledEthanol_2, 1), 0.35F);
        GameRegistry.addSmelting(Items.destiledEthanol_2.itemID, new ItemStack(Items.destiledEthanol_3, 1), 0.35F);
        
        //Recipe Drinks
        GameRegistry.addRecipe(new ItemStack(Items.test_tube,6,0), new Object[]
        {
            "G",
            "G",
            'G', Block.glass
        });
        
        GameRegistry.addRecipe(new ItemStack(Items.mixed_ethanol,1,0), new Object[]
        {
            "TC",
            'C', Item.potato, 'T', Items.test_tube
        });
        
        GameRegistry.addRecipe(new ItemStack(Items.mixed_ethanol,1,0), new Object[]
        {
            "TCC",
            'C', Item.reed, 'T', Items.test_tube
        });
        
        GameRegistry.addRecipe(new ItemStack(Items.liquid_sugar,1,0), new Object[]
        {
            "TCO",
            'C', Item.sugar, 'T', Items.test_tube, 'O', new ItemStack(Item.dyePowder,1,14)
        });
        
        GameRegistry.addRecipe(new ItemStack(Items.beer,1,0), new Object[]
        {
            "BTS",
            'B', Items.bottle, 'T', Items.destiledEthanol_1, 'S', Item.wheat
        });
        
        GameRegistry.addRecipe(new ItemStack(Items.bottle_of_milk,1,0), new Object[]
        {
            "UB",
            'B', Items.bottle, 'U', Item.bucketMilk.setContainerItem(Item.bucketEmpty)
        });
        
        GameRegistry.addRecipe(new ItemStack(Items.guttalax,1,0), new Object[]
        {
            "TM",
            'T', Items.test_tube, 'M', Item.rottenFlesh
        });
        
        GameRegistry.addRecipe(new ItemStack(Items.whiskey,1,0), new Object[]
        {
            "BTS",
            'B', Items.bottle, 'T', Items.destiledEthanol_3, 'S', Item.wheat
        });
        
        GameRegistry.addRecipe(new ItemStack(Items.vodka,1,0), new Object[]
        {
            "BT",
            'B', Items.bottle, 'T', Items.destiledEthanol_3
        });
        
        GameRegistry.addRecipe(new ItemStack(Items.tequilla_silver,1,0), new Object[]
        {
            "BTS",
            'B', Items.bottle, 'T', Items.destiledEthanol_3, 'S', new ItemStack(Item.dyePowder,1,2)
        });
        
        GameRegistry.addRecipe(new ItemStack(Items.tequilla_gold,1,0), new Object[]
        {
            "BTS",
            'B', Items.bottle, 'T', Items.tequilla_silver, 'S', Item.ingotGold
        });
        
        GameRegistry.addRecipe(new ItemStack(Items.rum,1,0), new Object[]
        {
            "BTS",
            'B', Items.bottle, 'T', Items.destiledEthanol_3, 'S', Item.reed
        });
        
        //Recipe Barrel of Vine
        GameRegistry.addRecipe(new ItemStack(Items.barrel_of_wine,1,0), new Object[]
        {
            "GGG",
            "GBG",
            "GGG",
            'G', Items.grape_red, 'B', new ItemStack(Items.barrel,1,0)
        });
        //Recipe Bottle of Vine
        GameRegistry.addRecipe(new ItemStack(Items.wine,6,0), new Object[]
        {
            "G G",
            "GBG",
            "G G",
            'B', new ItemStack(Items.barrel_of_wine,1,0), 'G', Items.bottle
        });
        //Recipe Glass of Vine
         GameRegistry.addShapelessRecipe(new ItemStack(Items.glass_of_vine, 3,0), new ItemStack(Items.wine, 1, 0));
        
        
    } 
}
