package ModSharpnet.Recipes;

import ModSharpnet.Blocks;
import ModSharpnet.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.block.Block;
import cpw.mods.fml.common.registry.GameRegistry;

import static ModSharpnet.Blocks.SharpnetMoneyBlock;
import static ModSharpnet.ModSharpnet.ModBuildCraft;

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
        
        
        //Momey
        //Recipe 9x10Eu Stack
        GameRegistry.addRecipe(new ItemStack(Items.stack_9x10euMoneys,1,0), new Object[]
        {
            "AAA",
            "AAA",
            "AAA",
            'A', Items.money10eu
        });
        GameRegistry.addShapelessRecipe(new ItemStack(Items.money10eu, 9), new ItemStack(Items.stack_9x10euMoneys,1));
        
        //Recipe 9x100,Eu Stack
        GameRegistry.addRecipe(new ItemStack(Items.stack_9x100euMoneys,1,0), new Object[]
        {
            "AAA",
            "AAA",
            "AAA",
            'A', Items.money100eu
        });
        GameRegistry.addShapelessRecipe(new ItemStack(Items.money100eu, 9), new ItemStack(Items.stack_9x100euMoneys,1));
        
        //Recipe 9x1000Eu Stack
        GameRegistry.addRecipe(new ItemStack(Items.stack_9x1000euMoneys,1,0), new Object[]
        {
            "AAA",
            "AAA",
            "AAA",
            'A', Items.money1000eu
        });
        GameRegistry.addShapelessRecipe(new ItemStack(Items.money1000eu, 9), new ItemStack(Items.stack_9x1000euMoneys,1));
        
        //Recipe Coin stack
        GameRegistry.addRecipe(new ItemStack(SharpnetMoneyBlock,1,0), new Object[]
        {
            "AAA",
            "AAA",
            "AAA",
            'A', Items.cent
        });
        GameRegistry.addShapelessRecipe(new ItemStack(Items.cent, 9), new ItemStack(SharpnetMoneyBlock,1,0));
        
        //Recipe Euro stack
        GameRegistry.addRecipe(new ItemStack(SharpnetMoneyBlock,1,1), new Object[]
        {
            "AAA",
            "AAA",
            "AAA",
            'A', new ItemStack(Items.IC2_CoinID,1,0)
        });
        GameRegistry.addShapelessRecipe(new ItemStack(Items.IC2_CoinID,9,0), new ItemStack(SharpnetMoneyBlock,1,1));
        
        //Recipe Coin Bag
        GameRegistry.addRecipe(new ItemStack(SharpnetMoneyBlock,1,2), new Object[]
        {
            "AAA",
            "AAA",
            "AAA",
            'A', new ItemStack(SharpnetMoneyBlock,1,0)
        });
        GameRegistry.addShapelessRecipe(new ItemStack(SharpnetMoneyBlock,9,0), new ItemStack(SharpnetMoneyBlock,1,2));
        
        //Recipe Euro Bag
        GameRegistry.addRecipe(new ItemStack(SharpnetMoneyBlock,1,3), new Object[]
        {
            "AAA",
            "A A",
            "AAA",
            'A', new ItemStack(SharpnetMoneyBlock,1,1)
        });
        GameRegistry.addShapelessRecipe(new ItemStack(SharpnetMoneyBlock,8,1), new ItemStack(SharpnetMoneyBlock,1,3));
        
        //Recipe 10Eu Block
        GameRegistry.addRecipe(new ItemStack(Blocks.deco1_block,1,3), new Object[]
        {
            "AAA",
            "AAA",
            "AAA",
            'A', Items.stack_9x10euMoneys
        });
        GameRegistry.addShapelessRecipe(new ItemStack(Items.stack_9x10euMoneys, 9), new ItemStack(Blocks.deco1_block,1,3));
        
        //Recipe 100Eu Block
        GameRegistry.addRecipe(new ItemStack(Blocks.deco1_block,1,4), new Object[]
        {
            "AAA",
            "AAA",
            "AAA",
            'A', Items.stack_9x100euMoneys
        });
        GameRegistry.addShapelessRecipe(new ItemStack(Items.stack_9x100euMoneys, 9), new ItemStack(Blocks.deco1_block,1,4));
        
        //Recipe 10Eu Block
        GameRegistry.addRecipe(new ItemStack(Blocks.deco1_block,1,5), new Object[]
        {
            "AAA",
            "AAA",
            "AAA",
            'A', Items.stack_9x1000euMoneys
        });
        GameRegistry.addShapelessRecipe(new ItemStack(Items.stack_9x1000euMoneys, 9), new ItemStack(Blocks.deco1_block,1,5));
        
        //Recipe Cement
        GameRegistry.addRecipe(new ItemStack(Items.cement,4,0), new Object[]
        {
            "RS",
            "CG",
            'R', Item.redstone, 'S', Block.sand, 'C', Block.cobblestone, 'G', Block.gravel
        });
        
        
        if(ModBuildCraft)
        {
            /*
            Items.BC_Bucket_Oil = new ItemStack(Items.BC_Bucket_Oil_ID,1,0).getItem();
            Items.BC_Bucket_Oil.setContainerItem(Item.bucketEmpty);
            System.out.println("SH Debug: BC_Bucket_Oil - " + Items.BC_Bucket_Oil.itemID);
            */
            GameRegistry.addShapelessRecipe(new ItemStack(Items.oil_cell, 1, 0), new ItemStack(Items.BC_Bucket_Oil_ID, 1, 0), new ItemStack(ic2.api.item.Items.getItem("cell").getItem(), 1, 0));
            GameRegistry.addShapelessRecipe(new ItemStack(Items.BC_Bucket_Oil_ID, 1, 0), new ItemStack(Item.bucketEmpty, 1, 0), new ItemStack(Items.oil_cell, 1, 0) );
            
            GameRegistry.addShapelessRecipe(new ItemStack(Items.fuel_cell, 1, 0), new ItemStack(Items.BC_Bucket_Fuel_ID, 1, 0), new ItemStack(ic2.api.item.Items.getItem("cell").getItem(), 1, 0));
            GameRegistry.addShapelessRecipe(new ItemStack(Items.BC_Bucket_Fuel_ID, 1, 0), new ItemStack(Item.bucketEmpty, 1, 0), new ItemStack(Items.fuel_cell, 1, 0) );
            
        }
        
    } 
}
