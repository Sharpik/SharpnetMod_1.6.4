package ModSharpnet.Recipes;

import ModSharpnet.Blocks;
import ModSharpnet.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.block.Block;
import cpw.mods.fml.common.registry.GameRegistry;

import static ModSharpnet.ModSharpnet.SharpnetTilesBlocks1;
import static ModSharpnet.ModSharpnet.SharpnetTilesBlocks2;
import static ModSharpnet.ModSharpnet.SharpnetTilesSlabBlocks1;
import static ModSharpnet.ModSharpnet.SharpnetTilesSlabBlocks2;
import static ModSharpnet.ModSharpnet.SharpnetTilesSlabBlocks3;

public class RecipesTiles
{
    public static void register()
    {
        //Recipe Tile
        GameRegistry.addShapelessRecipe(new ItemStack(Items.tile_brown,2,0), new ItemStack(Item.brick,1,0));
        //Recipe Tile Black
        GameRegistry.addRecipe(new ItemStack(Items.tile_black,8,0), new Object[]
        {
            "TTT",
            "TCT",
            "TTT",
            'T', new ItemStack(Items.tile_brown,1,0), 'C', new ItemStack(Item.dyePowder,1,0)
        });
        GameRegistry.addRecipe(new ItemStack(Items.tile_black,8,0), new Object[]
        {
            "TTT",
            "TCT",
            "TTT",
            'T', new ItemStack(Items.tile_brown,1,0), 'C', new ItemStack(Item.dyePowder,1,0)
        });
        GameRegistry.addRecipe(new ItemStack(Items.tile_red,8,0), new Object[]
        {
            "TTT",
            "TCT",
            "TTT",
            'T', new ItemStack(Items.tile_brown,1,0), 'C', new ItemStack(Item.dyePowder,1,1)
        });
        GameRegistry.addRecipe(new ItemStack(Items.tile_green,8,0), new Object[]
        {
            "TTT",
            "TCT",
            "TTT",
            'T', new ItemStack(Items.tile_brown,1,0), 'C', new ItemStack(Item.dyePowder,1,2)
        });
        GameRegistry.addRecipe(new ItemStack(Items.tile_blue,8,0), new Object[]
        {
            "TTT",
            "TCT",
            "TTT",
            'T', new ItemStack(Items.tile_brown,1,0), 'C', new ItemStack(Item.dyePowder,1,4)
        });
        GameRegistry.addRecipe(new ItemStack(Items.tile_grey,8,0), new Object[]
        {
            "TTT",
            "TCT",
            "TTT",
            'T', new ItemStack(Items.tile_brown,1,0), 'C', new ItemStack(Item.dyePowder,1,8)
        });
        GameRegistry.addRecipe(new ItemStack(Items.tile_orange,8,0), new Object[]
        {
            "TTT",
            "TCT",
            "TTT",
            'T', new ItemStack(Items.tile_brown,1,0), 'C', new ItemStack(Item.dyePowder,1,14)
        });
        GameRegistry.addRecipe(new ItemStack(Items.tile_white,8,0), new Object[]
        {
            "TTT",
            "TCT",
            "TTT",
            'T', new ItemStack(Items.tile_brown,1,0), 'C', new ItemStack(Item.dyePowder,1,15)
        });
        GameRegistry.addRecipe(new ItemStack(Items.tile_yellow,8,0), new Object[]
        {
            "TTT",
            "TCT",
            "TTT",
            'T', new ItemStack(Items.tile_brown,1,0), 'C', new ItemStack(Item.dyePowder,1,11)
        });
        
        //Recipe Tiles Blocks
        GameRegistry.addRecipe(new ItemStack(SharpnetTilesBlocks1,1,0), new Object[]
        {
            "TT",
            "TT",
            'T', new ItemStack(Items.tile_brown,1,0)
        });
        GameRegistry.addRecipe(new ItemStack(SharpnetTilesBlocks1,1,1), new Object[]
        {
            "AB",
            "BA",
            'A', new ItemStack(Items.tile_grey,1,0), 'B', new ItemStack(Items.tile_blue,1,0)
        });
        GameRegistry.addRecipe(new ItemStack(SharpnetTilesBlocks1,1,2), new Object[]
        {
            "AB",
            "BA",
            'A', new ItemStack(Items.tile_red,1,0), 'B', new ItemStack(Items.tile_grey,1,0)
        });
        GameRegistry.addRecipe(new ItemStack(SharpnetTilesBlocks1,1,3), new Object[]
        {
            "AB",
            "BA",
            'A', new ItemStack(Items.tile_black,1,0), 'B', new ItemStack(Items.tile_white,1,0)
        });
        GameRegistry.addRecipe(new ItemStack(SharpnetTilesBlocks1,2,4), new Object[]
        {
            "ABA",
            "BAB",
            "ABA",
            'A', new ItemStack(Items.tile_yellow,1,0), 'B', new ItemStack(Items.tile_white,1,0)
        });
        GameRegistry.addRecipe(new ItemStack(SharpnetTilesBlocks1,2,5), new Object[]
        {
            "AAA",
            "BBB",
            "AAA",
            'A', new ItemStack(Items.tile_brown,1,0), 'B', new ItemStack(Items.tile_yellow,1,0)
        });
        GameRegistry.addRecipe(new ItemStack(SharpnetTilesBlocks1,1,6), new Object[]
        {
            "AB",
            "BB",
            'A', new ItemStack(Items.tile_brown,1,0), 'B', new ItemStack(Items.tile_white,1,0)
        });
        GameRegistry.addRecipe(new ItemStack(SharpnetTilesBlocks1,2,7), new Object[]
        {
            "AAA",
            "ABA",
            "AAA",
            'A', new ItemStack(Items.tile_white,1,0), 'B', new ItemStack(Items.tile_yellow,1,0)
        });
        GameRegistry.addRecipe(new ItemStack(SharpnetTilesBlocks1,2,8), new Object[]
        {
            "ABB",
            "BBB",
            "BBA",
            'A', new ItemStack(Items.tile_brown,1,0), 'B', new ItemStack(Items.tile_orange,1,0)
        });
        GameRegistry.addRecipe(new ItemStack(SharpnetTilesBlocks1,2,9), new Object[]
        {
            "AAB",
            "BCB",
            "DAC",
            'A', new ItemStack(Items.tile_blue,1,0), 'B', new ItemStack(Items.tile_brown,1,0), 'C', new ItemStack(Items.tile_grey,1,0), 'D', new ItemStack(Items.tile_black,1,0)
        });
        GameRegistry.addRecipe(new ItemStack(SharpnetTilesBlocks1,1,10), new Object[]
        {
            "AA",
            "AA",
            'A', new ItemStack(Items.tile_white,1,0)
        });
        GameRegistry.addRecipe(new ItemStack(SharpnetTilesBlocks1,1,11), new Object[]
        {
            "AB",
            "AA",
            'A', new ItemStack(Items.tile_green,1,0), 'B', new ItemStack(Items.tile_blue,1,0)
        });
        GameRegistry.addRecipe(new ItemStack(SharpnetTilesBlocks1,1,12), new Object[]
        {
            "AB",
            "AA",
            'A', new ItemStack(Items.tile_grey,1,0), 'B', new ItemStack(Items.tile_red,1,0)
        });
        GameRegistry.addRecipe(new ItemStack(SharpnetTilesBlocks1,1,13), new Object[]
        {
            "AB",
            "CC",
            'A', new ItemStack(Items.tile_red,1,0), 'B', new ItemStack(Items.tile_orange,1,0), 'C', new ItemStack(Items.tile_white,1,0)
        });
        GameRegistry.addRecipe(new ItemStack(SharpnetTilesBlocks1,2,14), new Object[]
        {
            "ABA",
            "BCB",
            "ABA",
            'A', new ItemStack(Items.tile_orange,1,0), 'B', new ItemStack(Items.tile_brown,1,0), 'C', new ItemStack(Items.tile_black,1,0)
        });
        GameRegistry.addRecipe(new ItemStack(SharpnetTilesBlocks1,2,15), new Object[]
        {
            "BAB",
            "CBC",
            "BAB",
            'A', new ItemStack(Items.tile_green,1,0), 'B', new ItemStack(Items.tile_red,1,0), 'C', new ItemStack(Items.tile_yellow,1,0)
        });
        
        //Recipes Tiles Blocks Slabs
        GameRegistry.addRecipe(new ItemStack(SharpnetTilesSlabBlocks1,4,0), new Object[]
        {
            "AA",
            'A', new ItemStack(SharpnetTilesBlocks1,1,0)
        });
        GameRegistry.addRecipe(new ItemStack(SharpnetTilesSlabBlocks1,4,1), new Object[]
        {
            "AA",
            'A', new ItemStack(SharpnetTilesBlocks1,1,1)
        });
        GameRegistry.addRecipe(new ItemStack(SharpnetTilesSlabBlocks1,4,2), new Object[]
        {
            "AA",
            'A', new ItemStack(SharpnetTilesBlocks1,1,2)
        });
        GameRegistry.addRecipe(new ItemStack(SharpnetTilesSlabBlocks1,4,3), new Object[]
        {
            "AA",
            'A', new ItemStack(SharpnetTilesBlocks1,1,3)
        });
        GameRegistry.addRecipe(new ItemStack(SharpnetTilesSlabBlocks1,4,4), new Object[]
        {
            "AA",
            'A', new ItemStack(SharpnetTilesBlocks1,1,4)
        });
        GameRegistry.addRecipe(new ItemStack(SharpnetTilesSlabBlocks1,4,5), new Object[]
        {
            "AA",
            'A', new ItemStack(SharpnetTilesBlocks1,1,5)
        });
        GameRegistry.addRecipe(new ItemStack(SharpnetTilesSlabBlocks1,4,6), new Object[]
        {
            "AA",
            'A', new ItemStack(SharpnetTilesBlocks1,1,6)
        });
        GameRegistry.addRecipe(new ItemStack(SharpnetTilesSlabBlocks1,4,7), new Object[]
        {
            "AA",
            'A', new ItemStack(SharpnetTilesBlocks1,1,7)
        });
        GameRegistry.addRecipe(new ItemStack(SharpnetTilesSlabBlocks2,4,0), new Object[]
        {
            "AA",
            'A', new ItemStack(SharpnetTilesBlocks1,1,8)
        });
        GameRegistry.addRecipe(new ItemStack(SharpnetTilesSlabBlocks2,4,1), new Object[]
        {
            "AA",
            'A', new ItemStack(SharpnetTilesBlocks1,1,9)
        });
        GameRegistry.addRecipe(new ItemStack(SharpnetTilesSlabBlocks2,4,2), new Object[]
        {
            "AA",
            'A', new ItemStack(SharpnetTilesBlocks1,1,10)
        });
        GameRegistry.addRecipe(new ItemStack(SharpnetTilesSlabBlocks2,4,3), new Object[]
        {
            "AA",
            'A', new ItemStack(SharpnetTilesBlocks1,1,11)
        });
        GameRegistry.addRecipe(new ItemStack(SharpnetTilesSlabBlocks2,4,4), new Object[]
        {
            "AA",
            'A', new ItemStack(SharpnetTilesBlocks1,1,12)
        });
        GameRegistry.addRecipe(new ItemStack(SharpnetTilesSlabBlocks2,4,5), new Object[]
        {
            "AA",
            'A', new ItemStack(SharpnetTilesBlocks1,1,13)
        });
        GameRegistry.addRecipe(new ItemStack(SharpnetTilesSlabBlocks2,4,6), new Object[]
        {
            "AA",
            'A', new ItemStack(SharpnetTilesBlocks1,1,14)
        });
        GameRegistry.addRecipe(new ItemStack(SharpnetTilesSlabBlocks2,4,7), new Object[]
        {
            "AA",
            'A', new ItemStack(SharpnetTilesBlocks1,1,15)
        });
        GameRegistry.addRecipe(new ItemStack(SharpnetTilesSlabBlocks3,4,0), new Object[]
        {
            "AA",
            'A', new ItemStack(SharpnetTilesBlocks2,1,0)
        });
        GameRegistry.addRecipe(new ItemStack(SharpnetTilesSlabBlocks3,4,1), new Object[]
        {
            "AA",
            'A', new ItemStack(SharpnetTilesBlocks2,1,1)
        });
        GameRegistry.addRecipe(new ItemStack(SharpnetTilesSlabBlocks3,4,2), new Object[]
        {
            "AA",
            'A', new ItemStack(SharpnetTilesBlocks2,1,2)
        });
        GameRegistry.addRecipe(new ItemStack(SharpnetTilesSlabBlocks3,4,3), new Object[]
        {
            "AA",
            'A', new ItemStack(SharpnetTilesBlocks2,1,3)
        });
        
        //Stairs
        
        GameRegistry.addRecipe(new ItemStack(Blocks.SharpnetStairsTile1,6,0), new Object[]
        {
            "A  ",
            "AA ",
            "AAA",
            'A', new ItemStack(SharpnetTilesBlocks1,1,0)
        });
        
        GameRegistry.addRecipe(new ItemStack(Blocks.SharpnetStairsTile5,6,0), new Object[]
        {
            "A  ",
            "AA ",
            "AAA",
            'A', new ItemStack(SharpnetTilesBlocks1,1,4)
        });
        
        GameRegistry.addRecipe(new ItemStack(Blocks.SharpnetStairsTile11,6,0), new Object[]
        {
            "A  ",
            "AA ",
            "AAA",
            'A', new ItemStack(SharpnetTilesBlocks1,1,10)
        });
        
    }
}
