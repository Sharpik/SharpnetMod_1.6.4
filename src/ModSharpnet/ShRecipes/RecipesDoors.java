package ModSharpnet.ShRecipes;

import ModSharpnet.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.block.Block;
import cpw.mods.fml.common.registry.GameRegistry;

import static ModSharpnet.ModSharpnet.SharpnetTilesWoodBlocks1;

public class RecipesDoors
{
    public static void register()
    {
        //Recipe Door 1
        GameRegistry.addRecipe(new ItemStack(Items.door1_block_item,1,0), new Object[]
        {
            "WW ",
            "WW ",
            "WW ",
            'W', new ItemStack(SharpnetTilesWoodBlocks1,1,0)
        });
        //Recipe Door 5
        GameRegistry.addRecipe(new ItemStack(Items.door5_block_item,1,0), new Object[]
        {
            "WW ",
            "WW ",
            "WW ",
            'W', new ItemStack(SharpnetTilesWoodBlocks1,1,4)
        });
        //Recipe Door 6
        GameRegistry.addRecipe(new ItemStack(Items.door6_block_item,1,0), new Object[]
        {
            "WW ",
            "WW ",
            "WW ",
            'W', new ItemStack(5,1,3)
        });
        //Recipe Door 7
        GameRegistry.addRecipe(new ItemStack(Items.door7_block_item,1,0), new Object[]
        {
            "WW ",
            "VV ",
            "WW ",
            'W', new ItemStack(SharpnetTilesWoodBlocks1,1,4), 'V', new ItemStack(5,1,3)
        });
        //Recipe Door 8
        GameRegistry.addRecipe(new ItemStack(Items.door8_block_item,1,0), new Object[]
        {
            "WW ",
            "WW ",
            "WW ",
            'W', new ItemStack(SharpnetTilesWoodBlocks1,1,2)
        });
        //Recipe Door 9
        GameRegistry.addRecipe(new ItemStack(Items.door9_block_item,1,0), new Object[]
        {
            "VV ",
            "WW ",
            "VV ",
            'W', new ItemStack(SharpnetTilesWoodBlocks1,1,2), 'V', new ItemStack(5,1,3)
        });
        //Recipe Door 10
        GameRegistry.addRecipe(new ItemStack(Items.door10_block_item,1,0), new Object[]
        {
            "GG ",
            "WW ",
            "WW ",
            'G', new ItemStack(20,1,0), 'W', new ItemStack(5,1,2)
        });
        //Recipe Door 11
        GameRegistry.addRecipe(new ItemStack(Items.door11_block_item,1,0), new Object[]
        {
            "WW ",
            "GG ",
            "WW ",
            'G', new ItemStack(20,1,0), 'W', new ItemStack(5,1,3)
        });
        //Recipe Door 12
        GameRegistry.addRecipe(new ItemStack(Items.door12_block_item,1,0), new Object[]
        {
            "WW ",
            "WW ",
            "WW ",
            'W', new ItemStack(SharpnetTilesWoodBlocks1,1,5)
        });
        //Recipe Door Secret Book
        GameRegistry.addRecipe(new ItemStack(Items.door_secret1_block_item,1,0), new Object[]
        {
            "WW ",
            "BBL",
            "WW ",
            'B', new ItemStack(340,1,0), 'W', new ItemStack(5,1,3), 'L', new ItemStack(69,1,0)
        });
        //Recipe Door Secret Moss
        GameRegistry.addRecipe(new ItemStack(Items.door_secret2_block_item,1,0), new Object[]
        {
            "SS ",
            "SSL",
            "SS ",
            'S', new ItemStack(48,1,0), 'L', new ItemStack(69,1,0)
        });
        //Recipe Door Secret Cobble
        GameRegistry.addRecipe(new ItemStack(Items.door_secret3_block_item,1,0), new Object[]
        {
            "SS ",
            "SSL",
            "SS ",
            'S', new ItemStack(Block.cobblestone,1,0), 'L', new ItemStack(69,1,0)
        });
        
    } 
}
