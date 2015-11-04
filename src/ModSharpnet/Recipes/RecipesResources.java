package ModSharpnet.Recipes;

import ModSharpnet.Blocks;
import ModSharpnet.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.block.Block;
import cpw.mods.fml.common.registry.GameRegistry;

import static ModSharpnet.Blocks.SharpnetMoneyBlock;
import ModSharpnet.Block.SharpnetDecoBlocks1;

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
            'A', Items.IC2_CoinID
        });
        GameRegistry.addShapelessRecipe(new ItemStack(Items.IC2_CoinID,9,0), new ItemStack(SharpnetMoneyBlock,1,1));
        
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
        
    } 
}
