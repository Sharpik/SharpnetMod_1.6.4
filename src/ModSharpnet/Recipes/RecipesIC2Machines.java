package ModSharpnet.Recipes;

import ModSharpnet.Blocks;
import ModSharpnet.Items;
import static ModSharpnet.ModSharpnet.SharpnetFlaxSeeds;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.block.Block;
import cpw.mods.fml.common.registry.GameRegistry;
import ic2.api.recipe.RecipeInputItemStack;
import ic2.api.recipe.Recipes;

public class RecipesIC2Machines
{
    public static void register()
    {
        //IC2 Recipes
        /*
        ItemStack input = new ItemStack(Item.paper, 1);
        ItemStack output = new ItemStack(Block.coalBlock, 1);
        //ItemStack output = Items.getItem("coalBlock");
        output.stackSize = 2;

        Recipes.macerator.addRecipe(new RecipeInputItemStack(input), null, output);
        */
        Recipes.compressor.addRecipe(new RecipeInputItemStack(ic2.api.item.Items.getItem("lavaCell")) , null, new ItemStack(Blocks.PR_block_stonesID,1,3) );
        
        Recipes.extractor.addRecipe(new RecipeInputItemStack(new ItemStack(SharpnetFlaxSeeds,16,0)) , null, new ItemStack(Items.oil_cell,1,0) );
        
    } 
}
