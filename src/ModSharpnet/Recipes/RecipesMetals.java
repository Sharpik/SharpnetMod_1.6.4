package ModSharpnet.Recipes;

import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;
import ModSharpnet.Blocks;
import ModSharpnet.Items;
import static ModSharpnet.ModSharpnet.SharpnetBuildingBlocks1;
import net.minecraft.item.Item;

public class RecipesMetals
{
    public static void register()
    {
        GameRegistry.addRecipe(new ItemStack(SharpnetBuildingBlocks1,2,5), new Object[]
        {
            "ISI",
            "ISI",
            "ISI",
            'I', new ItemStack(Item.ingotIron,1,0), 'S', new ItemStack(Items.IngotSteel,1,0)
        });
        
        GameRegistry.addRecipe(new ItemStack(SharpnetBuildingBlocks1,2,4), new Object[]
        {
            "SIS",
            "SIS",
            "SIS",
            'I', new ItemStack(Item.ingotIron,1,0), 'S', new ItemStack(Items.IngotSteel,1,0)
        });
        
        GameRegistry.addRecipe(new ItemStack(SharpnetBuildingBlocks1,2,2), new Object[]
        {
            "III",
            "SSS",
            "III",
            'I', new ItemStack(Item.ingotIron,1,0), 'S', new ItemStack(Items.IngotSteel,1,0)
        });
        
        GameRegistry.addRecipe(new ItemStack(SharpnetBuildingBlocks1,2,1), new Object[]
        {
            "SSS",
            "III",
            "SSS",
            'I', new ItemStack(Item.ingotIron,1,0), 'S', new ItemStack(Items.IngotSteel,1,0)
        });
        
        GameRegistry.addRecipe(new ItemStack(SharpnetBuildingBlocks1,2,3), new Object[]
        {
            "ISI",
            "SIS",
            "ISI",
            'I', new ItemStack(Item.ingotIron,1,0), 'S', new ItemStack(Items.IngotSteel,1,0)
        });
        
    }
}
