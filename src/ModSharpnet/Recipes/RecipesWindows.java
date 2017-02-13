package ModSharpnet.Recipes;

import ModSharpnet.Blocks;
import ModSharpnet.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.block.Block;
import cpw.mods.fml.common.registry.GameRegistry;

import static ModSharpnet.ModSharpnet.SharpnetWallsBlocks1;

public class RecipesWindows
{
    public static void register()
    {
        //Recipe Window type 1 - white
        GameRegistry.addRecipe(new ItemStack(Blocks.SharpnetWindowsBlocks1,4,0), new Object[]
        {
            " G ",
            "GWG",
            " G ",
            'G', Block.glass, 'W', new ItemStack(Block.cloth,1,0)
        });
        //Recipe Window type 1 - black
        GameRegistry.addRecipe(new ItemStack(Blocks.SharpnetWindowsBlocks1,4,1), new Object[]
        {
            " G ",
            "GWG",
            " G ",
            'G', Block.glass, 'W', new ItemStack(Block.cloth,1,15)
        });
        //Recipe Window type 1 - blue
        GameRegistry.addRecipe(new ItemStack(Blocks.SharpnetWindowsBlocks1,4,2), new Object[]
        {
            " G ",
            "GWG",
            " G ",
            'G', Block.glass, 'W', new ItemStack(Block.cloth,1,11)
        });
        //Recipe Window type 1 - light blue
        GameRegistry.addRecipe(new ItemStack(Blocks.SharpnetWindowsBlocks1,4,3), new Object[]
        {
            " G ",
            "GWG",
            " G ",
            'G', Block.glass, 'W', new ItemStack(Block.cloth,1,3)
        });
        //Recipe Window type 1 - brown
        GameRegistry.addRecipe(new ItemStack(Blocks.SharpnetWindowsBlocks1,4,4), new Object[]
        {
            " G ",
            "GWG",
            " G ",
            'G', Block.glass, 'W', new ItemStack(Block.cloth,1,12)
        });
        //Recipe Window type 1 - light brown
        GameRegistry.addRecipe(new ItemStack(Blocks.SharpnetWindowsBlocks1,4,5), new Object[]
        {
            " G ",
            "WGG",
            " G ",
            'G', Block.glass, 'W', new ItemStack(Block.cloth,1,12)
        });
        //Recipe Window type 1 - green
        GameRegistry.addRecipe(new ItemStack(Blocks.SharpnetWindowsBlocks1,4,6), new Object[]
        {
            " G ",
            "GWG",
            " G ",
            'G', Block.glass, 'W', new ItemStack(Block.cloth,1,13)
        });
        //Recipe Window type 1 - orange
        GameRegistry.addRecipe(new ItemStack(Blocks.SharpnetWindowsBlocks1,4,7), new Object[]
        {
            " G ",
            "GWG",
            " G ",
            'G', Block.glass, 'W', new ItemStack(Block.cloth,1,1)
        });
        //Recipe Window type 1 - red
        GameRegistry.addRecipe(new ItemStack(Blocks.SharpnetWindowsBlocks1,4,8), new Object[]
        {
            " G ",
            "GWG",
            " G ",
            'G', Block.glass, 'W', new ItemStack(Block.cloth,1,14)
        });
        //Recipe Window type 1 - yellow
        GameRegistry.addRecipe(new ItemStack(Blocks.SharpnetWindowsBlocks1,4,9), new Object[]
        {
            " G ",
            "GWG",
            " G ",
            'G', Block.glass, 'W', new ItemStack(Block.cloth,1,4)
        });
        
        //Recipe Shapeless
        //GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Block.cobblestone,1,0), Item.clay);
        
    } 
}
