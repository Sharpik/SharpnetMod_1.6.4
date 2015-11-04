package ModSharpnet.Recipes;

import ModSharpnet.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.block.Block;
import cpw.mods.fml.common.registry.GameRegistry;

import static ModSharpnet.ModSharpnet.SharpnetTilesWoodBlocks1;
import static ModSharpnet.ModSharpnet.SharpnetTilesWoodBlocks2;
import static ModSharpnet.ModSharpnet.SharpnetTilesWoodSlabBlocks1;
import static ModSharpnet.ModSharpnet.SharpnetTilesWoodSlabBlocks2;

public class RecipesWoodTiles
{
    public static void register()
    {
        //Recipe Wood Tile Oak
        GameRegistry.addRecipe(new ItemStack(Items.wood_tile_oak,4,0), new Object[]
        {
            "W ",
            " W",
            'W', new ItemStack(Block.planks,1,0)
        });
        //Recipe Wood Tile Birch
        GameRegistry.addRecipe(new ItemStack(Items.wood_tile_birch,4,0), new Object[]
        {
            "W ",
            " W",
            'W', new ItemStack(Block.planks,1,1)
        });
        //Recipe Wood Tile Birch
        GameRegistry.addRecipe(new ItemStack(Items.wood_tile_birch,4,0), new Object[]
        {
            "W W",
            " C ",
            "W W",
            'W', new ItemStack(Items.wood_tile_oak,1,0), 'C', new ItemStack(Item.dyePowder,1,15)
        });
        //Recipe Wood Tile Birch
        GameRegistry.addRecipe(new ItemStack(Items.wood_tile_birch,4,0), new Object[]
        {
            "W W",
            " C ",
            "W W",
            'W', new ItemStack(Items.wood_tile_spruce,1,0), 'C', new ItemStack(Item.dyePowder,1,15)
        });
        //Recipe Wood Tile Birch
        GameRegistry.addRecipe(new ItemStack(Items.wood_tile_birch,4,0), new Object[]
        {
            "W W",
            " C ",
            "W W",
            'W', new ItemStack(Items.wood_tile_jungle,1,0), 'C', new ItemStack(Item.dyePowder,1,15)
        });
        //Recipe Wood Tile Spruce
        GameRegistry.addRecipe(new ItemStack(Items.wood_tile_spruce,4,0), new Object[]
        {
            "W ",
            " W",
            'W', new ItemStack(Block.planks,1,2)
        });
        //Recipe Wood Tile Jungle
        GameRegistry.addRecipe(new ItemStack(Items.wood_tile_jungle,4,0), new Object[]
        {
            "W ",
            " W",
            'W', new ItemStack(Block.planks,1,3)
        });
        
        //Recipe Tiles Wood White
        GameRegistry.addRecipe(new ItemStack(SharpnetTilesWoodBlocks1,1,7), new Object[]
        {
            "WW",
            "WW",
            'W', new ItemStack(Items.wood_tile_birch,1,0)
        });
        //Recipe Tiles Wood Black
        GameRegistry.addRecipe(new ItemStack(SharpnetTilesWoodBlocks1,2,1), new Object[]
        {
            "WWW",
            "WCW",
            "WWW",
            'W', new ItemStack(Items.wood_tile_birch,1,0), 'C', new ItemStack(Item.dyePowder,1,0)
        });
        //Recipe Tiles Wood Blue
        GameRegistry.addRecipe(new ItemStack(SharpnetTilesWoodBlocks1,2,2), new Object[]
        {
            "WWW",
            "WCW",
            "WWW",
            'W', new ItemStack(Items.wood_tile_birch,1,0), 'C', new ItemStack(Item.dyePowder,1,4)
        });
        //Recipe Tiles Wood Green
        GameRegistry.addRecipe(new ItemStack(SharpnetTilesWoodBlocks1,2,3), new Object[]
        {
            "WWW",
            "WCW",
            "WWW",
            'W', new ItemStack(Items.wood_tile_birch,1,0), 'C', new ItemStack(Item.dyePowder,1,2)
        });
        //Recipe Tiles Wood Orange
        GameRegistry.addRecipe(new ItemStack(SharpnetTilesWoodBlocks1,2,4), new Object[]
        {
            "WWW",
            "WCW",
            "WWW",
            'W', new ItemStack(Items.wood_tile_birch,1,0), 'C', new ItemStack(Item.dyePowder,1,14)
        });
        //Recipe Tiles Wood Red
        GameRegistry.addRecipe(new ItemStack(SharpnetTilesWoodBlocks1,2,5), new Object[]
        {
            "WWW",
            "WCW",
            "WWW",
            'W', new ItemStack(Items.wood_tile_birch,1,0), 'C', new ItemStack(Item.dyePowder,1,1)
        });
        //Recipe Tiles Wood Yellow
        GameRegistry.addRecipe(new ItemStack(SharpnetTilesWoodBlocks1,2,6), new Object[]
        {
            "WWW",
            "WCW",
            "WWW",
            'W', new ItemStack(Items.wood_tile_birch,1,0), 'C', new ItemStack(Item.dyePowder,1,11)
        });
        //Recipe Tiles Wood White
        GameRegistry.addRecipe(new ItemStack(SharpnetTilesWoodBlocks1,2,0), new Object[]
        {
            "WWW",
            "WCW",
            "WWW",
            'W', new ItemStack(Items.wood_tile_birch,1,0), 'C', new ItemStack(Item.dyePowder,1,15)
        });
        //Recipe Wooden Floor 1
        GameRegistry.addRecipe(new ItemStack(SharpnetTilesWoodBlocks2,1,0), new Object[]
        {
            "WW",
            "WW",
            'W', new ItemStack(Items.wood_tile_oak,1,0)
        });
        //Recipe Wooden Floor 2
        GameRegistry.addRecipe(new ItemStack(SharpnetTilesWoodBlocks2,1,1), new Object[]
        {
            "WW",
            "WW",
            'W', new ItemStack(Items.wood_tile_jungle,1,0)
        });
        //Recipe Wooden Floor 3
        GameRegistry.addRecipe(new ItemStack(SharpnetTilesWoodBlocks2,1,2), new Object[]
        {
            "WW",
            "WW",
            'W', new ItemStack(Items.wood_tile_spruce,1,0)
        });
        //Recipe Wooden Floor 4
        GameRegistry.addRecipe(new ItemStack(SharpnetTilesWoodBlocks2,1,3), new Object[]
        {
            "WW",
            "PP",
            'W', new ItemStack(Items.wood_tile_oak,1,0), 'P', new ItemStack(Items.wood_tile_birch,1,0)
        });
        //Recipe Wooden Floor 5
        GameRegistry.addRecipe(new ItemStack(SharpnetTilesWoodBlocks2,1,4), new Object[]
        {
            "WP",
            "PW",
            'W', new ItemStack(Items.wood_tile_oak,1,0), 'P', new ItemStack(Items.wood_tile_spruce,1,0)
        });
        
        
        
        //Slabs
        
        //Recipe Tiles Wood White Slab
        GameRegistry.addRecipe(new ItemStack(SharpnetTilesWoodSlabBlocks1,4,0), new Object[]
        {
            "AA",
            'A', new ItemStack(SharpnetTilesWoodBlocks1,1,0)
        });
        GameRegistry.addRecipe(new ItemStack(SharpnetTilesWoodSlabBlocks1,4,1), new Object[]
        {
            "AA",
            'A', new ItemStack(SharpnetTilesWoodBlocks1,1,1)
        });
        GameRegistry.addRecipe(new ItemStack(SharpnetTilesWoodSlabBlocks1,4,2), new Object[]
        {
            "AA",
            'A', new ItemStack(SharpnetTilesWoodBlocks1,1,2)
        });
        GameRegistry.addRecipe(new ItemStack(SharpnetTilesWoodSlabBlocks1,4,3), new Object[]
        {
            "AA",
            'A', new ItemStack(SharpnetTilesWoodBlocks1,1,3)
        });
        GameRegistry.addRecipe(new ItemStack(SharpnetTilesWoodSlabBlocks1,4,4), new Object[]
        {
            "AA",
            'A', new ItemStack(SharpnetTilesWoodBlocks1,1,4)
        });
        GameRegistry.addRecipe(new ItemStack(SharpnetTilesWoodSlabBlocks1,4,5), new Object[]
        {
            "AA",
            'A', new ItemStack(SharpnetTilesWoodBlocks1,1,5)
        });
        GameRegistry.addRecipe(new ItemStack(SharpnetTilesWoodSlabBlocks1,4,6), new Object[]
        {
            "AA",
            'A', new ItemStack(SharpnetTilesWoodBlocks1,1,6)
        });
        GameRegistry.addRecipe(new ItemStack(SharpnetTilesWoodSlabBlocks1,4,7), new Object[]
        {
            "AA",
            'A', new ItemStack(SharpnetTilesWoodBlocks1,1,7)
        });
        
        //Recipe Wooden Floor 1 Slab
        GameRegistry.addRecipe(new ItemStack(SharpnetTilesWoodSlabBlocks2,4,0), new Object[]
        {
            "AA",
            'A', new ItemStack(SharpnetTilesWoodBlocks2,1,0)
        });
        GameRegistry.addRecipe(new ItemStack(SharpnetTilesWoodSlabBlocks2,4,1), new Object[]
        {
            "AA",
            'A', new ItemStack(SharpnetTilesWoodBlocks2,1,1)
        });
        GameRegistry.addRecipe(new ItemStack(SharpnetTilesWoodSlabBlocks2,4,2), new Object[]
        {
            "AA",
            'A', new ItemStack(SharpnetTilesWoodBlocks2,1,2)
        });
        GameRegistry.addRecipe(new ItemStack(SharpnetTilesWoodSlabBlocks2,4,3), new Object[]
        {
            "AA",
            'A', new ItemStack(SharpnetTilesWoodBlocks2,1,3)
        });
        GameRegistry.addRecipe(new ItemStack(SharpnetTilesWoodSlabBlocks2,4,4), new Object[]
        {
            "AA",
            'A', new ItemStack(SharpnetTilesWoodBlocks2,1,4)
        });
        
    } 
}
