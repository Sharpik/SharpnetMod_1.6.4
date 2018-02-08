package ModSharpnet.Recipes;

import ModSharpnet.Blocks;
import ModSharpnet.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.block.Block;
import cpw.mods.fml.common.registry.GameRegistry;


public class RecipesDecoBlocks
{
    public static void register()
    {
        //Recipe lamp_garden
        /*
        GameRegistry.addRecipe(new ItemStack(Blocks.lamps1_block,1,0), new Object[]
        {
            " P ",
            " B ",
            " S ",
            'P', new ItemStack(ic2.api.item.Items.getItem("plateiron").getItem(), 1, 4),
            'B', new ItemStack(Blocks.lamps1_block,1,7),
            'S', new ItemStack(Items.iron_bar,1,0),
        });
        */
        
        //Dwarf
        GameRegistry.addRecipe(new ItemStack(Blocks.garden_deco_block, 1, 0), new Object[]
        {
            " R ",
            "RWR",
            " B ",
            'R', new ItemStack(Block.stainedClay,1,14),
            'W', new ItemStack(Block.stainedClay,1,0),
            'B', new ItemStack(Block.stainedClay,1,15)
        });
        
        //Smurf
        GameRegistry.addRecipe(new ItemStack(Blocks.garden_deco_block, 1, 1), new Object[]
        {
            " W ",
            " BR",
            " W ",
            'R', new ItemStack(Block.stainedClay,1,14),
            'W', new ItemStack(Block.stainedClay,1,0),
            'B', new ItemStack(Block.stainedClay,1,11)
        });
        
        //Garden Deco Boulders
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.garden_deco_block, 1, 3), new ItemStack(Item.flint, 1, 0));
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.garden_deco_block, 1, 4), new ItemStack(Blocks.garden_deco_block, 1, 3));
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.garden_deco_block, 1, 5), new ItemStack(Blocks.garden_deco_block, 1, 4));
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.garden_deco_block, 1, 6), new ItemStack(Blocks.garden_deco_block, 1, 5));
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.garden_deco_block, 1, 3), new ItemStack(Blocks.garden_deco_block, 1, 6));
        
        //Graves
        GameRegistry.addRecipe(new ItemStack(Blocks.garden_deco_block, 1, 7), new Object[]
        {
            " S ",
            " S ",
            " B ",
            'B', new ItemStack(Block.stoneBrick,1,0),
            'S', new ItemStack(Block.stone,1,0)
        });
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.garden_deco_block, 1, 8), new ItemStack(Blocks.garden_deco_block, 1, 7));
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.garden_deco_block, 1, 7), new ItemStack(Blocks.garden_deco_block, 1, 8));
        
        //Bell
        GameRegistry.addRecipe(new ItemStack(Blocks.garden_deco_block, 1, 9), new Object[]
        {
            " B ",
            "B B",
            'B', new ItemStack(Item.bucketEmpty,1,0)
        });
        
    } 
}
