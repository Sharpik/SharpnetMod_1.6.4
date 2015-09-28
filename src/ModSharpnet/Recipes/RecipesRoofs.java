package ModSharpnet.Recipes;

import ModSharpnet.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.block.Block;
import cpw.mods.fml.common.registry.GameRegistry;

import static ModSharpnet.ModSharpnet.SharpnetRoofsBlocks1;

public class RecipesRoofs
{
    public static void register()
    {
        //Recipe roofs
        GameRegistry.addShapelessRecipe(new ItemStack(Items.roofing_tile,2,0), new ItemStack(Item.brick,1,0));
        
        GameRegistry.addRecipe(new ItemStack(SharpnetRoofsBlocks1,1,0), new Object[]
        {
            "RRR",
            "RRR",
            "RRR",
            'R', Items.roofing_tile,
        });
        
            //Black
        GameRegistry.addRecipe(new ItemStack(SharpnetRoofsBlocks1,1,1), new Object[]
        {
            "RRR",
            "RDR",
            "RRR",
            'R', Items.roofing_tile, 'D', new ItemStack(Item.dyePowder,1,0),
        });
            //Red
        GameRegistry.addRecipe(new ItemStack(SharpnetRoofsBlocks1,1,4), new Object[]
        {
            "RRR",
            "RDR",
            "RRR",
            'R', Items.roofing_tile, 'D', new ItemStack(Item.dyePowder,1,1),
        });
            //Green
        GameRegistry.addRecipe(new ItemStack(SharpnetRoofsBlocks1,1,3), new Object[]
        {
            "RRR",
            "RDR",
            "RRR",
            'R', Items.roofing_tile, 'D', new ItemStack(Item.dyePowder,1,2),
        });
            //Blue
        GameRegistry.addRecipe(new ItemStack(SharpnetRoofsBlocks1,1,2), new Object[]
        {
            "RRR",
            "RDR",
            "RRR",
            'R', Items.roofing_tile, 'D', new ItemStack(Item.dyePowder,1,4),
        });
            //Yellow
        GameRegistry.addRecipe(new ItemStack(SharpnetRoofsBlocks1,1,5), new Object[]
        {
            "RRR",
            "RDR",
            "RRR",
            'R', Items.roofing_tile, 'D', new ItemStack(Item.dyePowder,1,11),
        });
        
    } 
}
