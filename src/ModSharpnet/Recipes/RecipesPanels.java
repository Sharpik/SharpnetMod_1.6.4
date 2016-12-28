package ModSharpnet.Recipes;

import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

import ModSharpnet.Blocks;
import static ModSharpnet.ModSharpnet.SharpnetBuildingBlocks1;
import static ModSharpnet.ModSharpnet.SharpnetTilesWoodBlocks1;

public class RecipesPanels
{
    public static void register()
    {
        //Metal Panels
        GameRegistry.addRecipe(new ItemStack(Blocks.panel_metal1_block,16,0), new Object[]
        {
            "MMM",
            "MMM",
            'M', new ItemStack(SharpnetBuildingBlocks1,1,1)
        });
        
        GameRegistry.addRecipe(new ItemStack(Blocks.panel_metal1_block,16,1), new Object[]
        {
            "MMM",
            "MMM",
            'M', new ItemStack(SharpnetBuildingBlocks1,1,2)
        });
        
        GameRegistry.addRecipe(new ItemStack(Blocks.panel_metal1_block,16,2), new Object[]
        {
            "MMM",
            "MMM",
            'M', new ItemStack(SharpnetBuildingBlocks1,1,3)
        });
        
        GameRegistry.addRecipe(new ItemStack(Blocks.panel_metal1_block,16,3), new Object[]
        {
            "MMM",
            "MMM",
            'M', new ItemStack(SharpnetBuildingBlocks1,1,4)
        });
        
        GameRegistry.addRecipe(new ItemStack(Blocks.panel_metal1_block,16,4), new Object[]
        {
            "MMM",
            "MMM",
            'M', new ItemStack(SharpnetBuildingBlocks1,1,5)
        });
        
        //Wooden Panels
        GameRegistry.addRecipe(new ItemStack(Blocks.panel_wood1_block,16,6), new Object[]
        {
            "WWW",
            "WWW",
            'W', new ItemStack(SharpnetTilesWoodBlocks1,1,0)
        });
        
        GameRegistry.addRecipe(new ItemStack(Blocks.panel_wood1_block,16,0), new Object[]
        {
            "WWW",
            "WWW",
            'W', new ItemStack(SharpnetTilesWoodBlocks1,1,1)
        });
        
        GameRegistry.addRecipe(new ItemStack(Blocks.panel_wood1_block,16,1), new Object[]
        {
            "WWW",
            "WWW",
            'W', new ItemStack(SharpnetTilesWoodBlocks1,1,2)
        });
        
        GameRegistry.addRecipe(new ItemStack(Blocks.panel_wood1_block,16,2), new Object[]
        {
            "WWW",
            "WWW",
            'W', new ItemStack(SharpnetTilesWoodBlocks1,1,3)
        });
        
        GameRegistry.addRecipe(new ItemStack(Blocks.panel_wood1_block,16,4), new Object[]
        {
            "WWW",
            "WWW",
            'W', new ItemStack(SharpnetTilesWoodBlocks1,1,4)
        });
        
        GameRegistry.addRecipe(new ItemStack(Blocks.panel_wood1_block,16,5), new Object[]
        {
            "WWW",
            "WWW",
            'W', new ItemStack(SharpnetTilesWoodBlocks1,1,5)
        });
        
        GameRegistry.addRecipe(new ItemStack(Blocks.panel_wood1_block,16,7), new Object[]
        {
            "WWW",
            "WWW",
            'W', new ItemStack(SharpnetTilesWoodBlocks1,1,6)
        });
        
        GameRegistry.addRecipe(new ItemStack(Blocks.panel_wood1_block,16,3), new Object[]
        {
            "WWW",
            "WWW",
            'W', new ItemStack(SharpnetTilesWoodBlocks1,1,7)
        });
        
    }
}
