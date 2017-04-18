package ModSharpnet.Recipes;

import ModSharpnet.Items;
import java.util.Iterator;
import java.util.List;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.Item;

import static ModSharpnet.ModSharpnet.ModProjectRed;
import static ModSharpnet.ModSharpnet.ModForgeMicroPartsMod;

public class RecipesRemove
{
    public static void unRegisterRecipes()
    {
        List<IRecipe> recipes = CraftingManager.getInstance().getRecipeList();

        Iterator<IRecipe> Leash = recipes.iterator();

        while (Leash.hasNext())
        {
                ItemStack is = Leash.next().getRecipeOutput();
                
                if(ModProjectRed)
                {
                    if (is != null && is.itemID == Items.PR_item_sawID) { Leash.remove(); }
                    if (is != null && is.itemID == Items.PR_item_saw_gold_ID) { Leash.remove(); }
                    if (is != null && is.itemID == Items.PR_peridotsaw_ID) { Leash.remove(); }
                    if (is != null && is.itemID == Items.PR_rubysaw_ID) { Leash.remove(); }
                    if (is != null && is.itemID == Items.PR_sapphiresaw_ID) { Leash.remove(); }
                }
                
                if(ModForgeMicroPartsMod)
                {
                    if (is != null && is.itemID == Items.Forge_stoneRod_id) { Leash.remove(); }
                }
                
                // Vanilla items
                if (is != null && is.itemID == Item.brick.itemID) { Leash.remove(); }
                
        };
    }
}
