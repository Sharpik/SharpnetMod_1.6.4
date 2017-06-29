package ModSharpnet.Recipes;

import ModSharpnet.Blocks;
import ModSharpnet.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.block.Block;
import cpw.mods.fml.common.registry.GameRegistry;


public class RecipesLamps
{
    public static void register()
    {
        //Recipe lamp_garden
        GameRegistry.addRecipe(new ItemStack(Blocks.lamps1_block,1,0), new Object[]
        {
            " P ",
            " B ",
            " S ",
            'P', new ItemStack(ic2.api.item.Items.getItem("plateiron").getItem(), 1, 4),
            'B', new ItemStack(Blocks.lamps1_block,1,7),
            'S', new ItemStack(Items.iron_bar,1,0),
        });
        
        //Recipe Lamp Meta: 6
        GameRegistry.addRecipe(new ItemStack(Blocks.lamps1_block,1,6), new Object[]
        {
            " W ",
            "WBW",
            " G ",
            'W', new ItemStack(Block.cloth, 1, 15),
            'B', new ItemStack(Blocks.lamps1_block,1,7),
            'G', new ItemStack(Block.glass,1,0),
        });
        
        //Recipe Lamp Meta: 1
        GameRegistry.addRecipe(new ItemStack(Blocks.lamps1_block,1,1), new Object[]
        {
            " W ",
            "GBG",
            " W ",
            'W', new ItemStack(Block.cloth, 1, 15),
            'B', new ItemStack(Blocks.lamps1_block,1,7),
            'G', new ItemStack(Block.glass,1,0),
        });
        
        //Recipe Lamp Meta: 2
        GameRegistry.addRecipe(new ItemStack(Blocks.lamps1_block,1,2), new Object[]
        {
            "   ",
            "PBP",
            " G ",
            'P', new ItemStack(ic2.api.item.Items.getItem("plateiron").getItem(), 1, 4),
            'B', new ItemStack(Blocks.lamps1_block,1,7),
            'G', new ItemStack(Block.glass,1,0),
        });
        
        //Recipe Lamp Meta: 3
        GameRegistry.addRecipe(new ItemStack(Blocks.lamps1_block,1,3), new Object[]
        {
            " W ",
            "PBP",
            " G ",
            'W', new ItemStack(Block.cloth,1,4),
            'B', new ItemStack(Blocks.lamps1_block,1,7),
            'P', new ItemStack(ic2.api.item.Items.getItem("plateiron").getItem(), 1, 4),
            'G', new ItemStack(Block.glass,1,0),
        });
        
        //Recipe Lamp Meta: 4
        GameRegistry.addRecipe(new ItemStack(Blocks.lamps1_block,1,4), new Object[]
        {
            " W ",
            "WBW",
            " L ",
            'W', new ItemStack(Block.cloth,1,14),
            'B', new ItemStack(Blocks.lamps1_block,1,7),
            'L', new ItemStack(Block.wood,1,3),
        });
        
        //Recipe Lamp Meta: 5
        GameRegistry.addRecipe(new ItemStack(Blocks.lamps1_block,1,5), new Object[]
        {
            " W ",
            "WBW",
            " L ",
            'W', new ItemStack(Block.cloth,1,4),
            'B', new ItemStack(Blocks.lamps1_block,1,7),
            'L', new ItemStack(Block.wood,1,3),
        });
        
    } 
}
