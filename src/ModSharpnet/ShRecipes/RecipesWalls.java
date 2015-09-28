package ModSharpnet.ShRecipes;

import ModSharpnet.Blocks;
import ModSharpnet.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.block.Block;
import cpw.mods.fml.common.registry.GameRegistry;

import static ModSharpnet.ModSharpnet.SharpnetWallsBlocks1;

public class RecipesWalls
{
    public static void register()
    {
        //Recipe Roll of Papper
        GameRegistry.addRecipe(new ItemStack(Items.roll_of_paper_white,1,0), new Object[]
        {
            "PP ",
            "PP ",
            "PP ",
            'P', Item.paper
        });
        GameRegistry.addRecipe(new ItemStack(Items.roll_of_paper_black,1,0), new Object[]
        {
            "PC",
            'P', Items.roll_of_paper_white, 'C', new ItemStack(Item.dyePowder,1,0)
        });
        GameRegistry.addRecipe(new ItemStack(Items.roll_of_paper_blue,1,0), new Object[]
        {
            "PC",
            'P', Items.roll_of_paper_white, 'C', new ItemStack(Item.dyePowder,1,4)
        });
        GameRegistry.addRecipe(new ItemStack(Items.roll_of_paper_brown,1,0), new Object[]
        {
            "PC",
            'P', Items.roll_of_paper_white, 'C', new ItemStack(Item.dyePowder,1,3)
        });
        GameRegistry.addRecipe(new ItemStack(Items.roll_of_paper_green,1,0), new Object[]
        {
            "PC",
            'P', Items.roll_of_paper_white, 'C', new ItemStack(Item.dyePowder,1,2)
        });
        GameRegistry.addRecipe(new ItemStack(Items.roll_of_paper_orange,1,0), new Object[]
        {
            "PC",
            'P', Items.roll_of_paper_white, 'C', new ItemStack(Item.dyePowder,1,14)
        });
        GameRegistry.addRecipe(new ItemStack(Items.roll_of_paper_red,1,0), new Object[]
        {
            "PC",
            'P', Items.roll_of_paper_white, 'C', new ItemStack(Item.dyePowder,1,1)
        });
        GameRegistry.addRecipe(new ItemStack(Items.roll_of_paper_yellow,1,0), new Object[]
        {
            "PC",
            'P', Items.roll_of_paper_white, 'C', new ItemStack(Item.dyePowder,1,11)
        });
        
        //Recipe Walls
        GameRegistry.addRecipe(new ItemStack(SharpnetWallsBlocks1,8,0), new Object[]
        {
            "ABA",
            "B B",
            "ABA",
            'A', Items.roll_of_paper_white, 'B', Items.roll_of_paper_brown
        });
        GameRegistry.addRecipe(new ItemStack(SharpnetWallsBlocks1,8,1), new Object[]
        {
            "ABA",
            "B B",
            "ABA",
            'A', Items.roll_of_paper_white, 'B', Items.roll_of_paper_black
        });
        GameRegistry.addRecipe(new ItemStack(SharpnetWallsBlocks1,3,2), new Object[]
        {
            "A  ",
            "A  ",
            "A  ",
            'A', Items.roll_of_paper_brown
        });
        GameRegistry.addRecipe(new ItemStack(SharpnetWallsBlocks1,3,3), new Object[]
        {
            "A  ",
            "B  ",
            "B  ",
            'A', Items.roll_of_paper_brown, 'B', Items.roll_of_paper_red
        });
        GameRegistry.addRecipe(new ItemStack(SharpnetWallsBlocks1,3,4), new Object[]
        {
            "AAA",
            "   ",
            "   ",
            'A', Items.roll_of_paper_orange
        });
        GameRegistry.addRecipe(new ItemStack(SharpnetWallsBlocks1,3,5), new Object[]
        {
            "ABA",
            "   ",
            "   ",
            'A', Items.roll_of_paper_blue, 'B', Items.roll_of_paper_white
        });
        GameRegistry.addRecipe(new ItemStack(SharpnetWallsBlocks1,3,6), new Object[]
        {
            "A  ",
            "B  ",
            "A  ",
            'A', Items.roll_of_paper_blue, 'B', Items.roll_of_paper_yellow
        });
        GameRegistry.addRecipe(new ItemStack(SharpnetWallsBlocks1,9,7), new Object[]
        {
            "AAA",
            "BCB",
            "AAA",
            'A', Items.roll_of_paper_white, 'B', Items.roll_of_paper_green, 'C', Items.roll_of_paper_red
        });
        GameRegistry.addRecipe(new ItemStack(SharpnetWallsBlocks1,3,8), new Object[]
        {
            "ABA",
            "   ",
            "   ",
            'A', Items.roll_of_paper_blue, 'B', Items.roll_of_paper_yellow
        });
        GameRegistry.addRecipe(new ItemStack(SharpnetWallsBlocks1,3,9), new Object[]
        {
            "ABA",
            "   ",
            "   ",
            'A', Items.roll_of_paper_red, 'B', Items.roll_of_paper_white
        });
        GameRegistry.addRecipe(new ItemStack(SharpnetWallsBlocks1,3,10), new Object[]
        {
            "ABA",
            "   ",
            "   ",
            'A', Items.roll_of_paper_black, 'B', Items.roll_of_paper_white
        });
        GameRegistry.addRecipe(new ItemStack(SharpnetWallsBlocks1,3,11), new Object[]
        {
            "ABA",
            "   ",
            "   ",
            'A', Items.roll_of_paper_green, 'B', Items.roll_of_paper_yellow
        });
        GameRegistry.addRecipe(new ItemStack(SharpnetWallsBlocks1,8,12), new Object[]
        {
            "AAA",
            "A A",
            "AAA",
            'A', Items.wood_tile_spruce
        });
        
        //Recipe throwel wall
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Block.cobblestone,1,0), Item.clay);
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wall_cobblestone_trowel_block,8,0), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Item.dyePowder, 1, 15)); //White
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wall_cobblestone_trowel_block,8,1), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Item.dyePowder, 1, 14)); //Orange
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wall_cobblestone_trowel_block,8,2), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Item.dyePowder, 1, 13)); //
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wall_cobblestone_trowel_block,8,3), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Item.dyePowder, 1, 12)); //
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wall_cobblestone_trowel_block,8,4), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Item.dyePowder, 1, 11)); //
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wall_cobblestone_trowel_block,8,5), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Item.dyePowder, 1, 10)); //
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wall_cobblestone_trowel_block,8,6), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Item.dyePowder, 1, 9)); //
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wall_cobblestone_trowel_block,8,7), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Item.dyePowder, 1, 8)); //
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wall_cobblestone_trowel_block,8,8), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Item.dyePowder, 1, 7)); //
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wall_cobblestone_trowel_block,8,9), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Item.dyePowder, 1, 6)); //
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wall_cobblestone_trowel_block,8,10), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Item.dyePowder, 1, 5)); //
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wall_cobblestone_trowel_block,8,11), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Item.dyePowder, 1, 4)); //
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wall_cobblestone_trowel_block,8,13), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Item.dyePowder, 1, 2)); //
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wall_cobblestone_trowel_block,8,14), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Item.dyePowder, 1, 1)); //
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wall_cobblestone_trowel_block,8,15), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Item.dyePowder, 1, 0)); //Black
        
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Block.brick,1,0), Item.clay);
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wall_bricks_trowel_block,8,0), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Item.dyePowder, 1, 15)); //White
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wall_bricks_trowel_block,8,1), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Item.dyePowder, 1, 14)); //Orange
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wall_bricks_trowel_block,8,2), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Item.dyePowder, 1, 13)); //
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wall_bricks_trowel_block,8,3), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Item.dyePowder, 1, 12)); //
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wall_bricks_trowel_block,8,4), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Item.dyePowder, 1, 11)); //
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wall_bricks_trowel_block,8,5), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Item.dyePowder, 1, 10)); //
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wall_bricks_trowel_block,8,6), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Item.dyePowder, 1, 9)); //
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wall_bricks_trowel_block,8,7), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Item.dyePowder, 1, 8)); //
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wall_bricks_trowel_block,8,8), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Item.dyePowder, 1, 7)); //
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wall_bricks_trowel_block,8,9), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Item.dyePowder, 1, 6)); //
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wall_bricks_trowel_block,8,10), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Item.dyePowder, 1, 5)); //
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wall_bricks_trowel_block,8,11), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Item.dyePowder, 1, 4)); //
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wall_bricks_trowel_block,8,13), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Item.dyePowder, 1, 2)); //
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wall_bricks_trowel_block,8,14), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Item.dyePowder, 1, 1)); //
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wall_bricks_trowel_block,8,15), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Item.dyePowder, 1, 0)); //Black
        
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Block.stoneDoubleSlab,1,0), Item.clay);
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wall_stone_slab_trowel_block,8,0), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Item.dyePowder, 1, 15)); //White
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wall_stone_slab_trowel_block,8,1), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Item.dyePowder, 1, 14)); //Orange
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wall_stone_slab_trowel_block,8,2), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Item.dyePowder, 1, 13)); //
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wall_stone_slab_trowel_block,8,3), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Item.dyePowder, 1, 12)); //
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wall_stone_slab_trowel_block,8,4), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Item.dyePowder, 1, 11)); //
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wall_stone_slab_trowel_block,8,5), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Item.dyePowder, 1, 10)); //
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wall_stone_slab_trowel_block,8,6), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Item.dyePowder, 1, 9)); //
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wall_stone_slab_trowel_block,8,7), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Item.dyePowder, 1, 8)); //
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wall_stone_slab_trowel_block,8,8), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Item.dyePowder, 1, 7)); //
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wall_stone_slab_trowel_block,8,9), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Item.dyePowder, 1, 6)); //
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wall_stone_slab_trowel_block,8,10), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Item.dyePowder, 1, 5)); //
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wall_stone_slab_trowel_block,8,11), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Item.dyePowder, 1, 4)); //
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wall_stone_slab_trowel_block,8,13), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Item.dyePowder, 1, 2)); //
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wall_stone_slab_trowel_block,8,14), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Item.dyePowder, 1, 1)); //
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wall_stone_slab_trowel_block,8,15), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Item.dyePowder, 1, 0)); //Black
        
    } 
}
