package ModSharpnet.Recipes;

import ModSharpnet.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

import static ModSharpnet.ModSharpnet.SharpnetCarpetsBlocks1;
import static ModSharpnet.ModSharpnet.SharpnetCarpetsBlocks2;
import net.minecraft.item.Item;

public class RecipesCarpets
{
    public static void register()
    {
        //Recipe Carpet 1
        GameRegistry.addRecipe(new ItemStack(SharpnetCarpetsBlocks1,9,0), new Object[]
        {
            "ABA",
            "BCB",
            "ABA",
            'A', Items.cloth_white, 'B',Items.cloth_brown, 'C',Items.cloth_black
        });
        
        //Recipe Carpet 2
        GameRegistry.addRecipe(new ItemStack(SharpnetCarpetsBlocks1,9,1), new Object[]
        {
            "ABA",
            "BAB",
            "ABA",
            'A', Items.cloth_red, 'B',Items.cloth_brown
        });
        
        //Recipe Carpet 3
        GameRegistry.addRecipe(new ItemStack(SharpnetCarpetsBlocks1,9,2), new Object[]
        {
            "ABA",
            "ACA",
            "ABA",
            'A', Items.cloth_black, 'B',Items.cloth_brown, 'C', Items.cloth_red
        });
        
        //Recipe Carpet 4
        GameRegistry.addRecipe(new ItemStack(SharpnetCarpetsBlocks1,9,3), new Object[]
        {
            "ABA",
            "BAB",
            "ABA",
            'A', Items.cloth_white, 'B',Items.cloth_brown
        });
        
        //Recipe Carpet 5
        GameRegistry.addRecipe(new ItemStack(SharpnetCarpetsBlocks1,9,4), new Object[]
        {
            "AAA",
            "BCB",
            "AAA",
            'A', Items.cloth_black, 'B',Items.cloth_yellow, 'C', Items.cloth_red
        });
        
        //Recipe Carpet 6
        GameRegistry.addRecipe(new ItemStack(SharpnetCarpetsBlocks1,9,5), new Object[]
        {
            "AAA",
            "BCB",
            "AAA",
            'A',Items.cloth_black, 'B',Items.cloth_red, 'C',Item.goldNugget
        });
        
        //Recipe Carpet 7
        GameRegistry.addRecipe(new ItemStack(SharpnetCarpetsBlocks1,9,6), new Object[]
        {
            "ABA",
            "BCB",
            "BAB",
            'A',Items.cloth_green, 'B',Items.cloth_yellow, 'C',Item.goldNugget
        });
        
        //Recipe Carpet 8
        GameRegistry.addRecipe(new ItemStack(SharpnetCarpetsBlocks1,9,7), new Object[]
        {
            "BAB",
            "ABA",
            "BAB",
            'A',Items.cloth_red, 'B',Items.cloth_black
        });
        
        //Recipe Carpet 9
        GameRegistry.addRecipe(new ItemStack(SharpnetCarpetsBlocks1,9,8), new Object[]
        {
            "BAB",
            "ABA",
            "BAB",
            'A',Items.cloth_red, 'B',Items.cloth_black
        });
        
        //Recipe Carpet 10
        GameRegistry.addRecipe(new ItemStack(SharpnetCarpetsBlocks1,9,9), new Object[]
        {
            "BAB",
            "ABA",
            "BAB",
            'A',Items.cloth_red, 'B',Items.cloth_white
        });
        
        //Recipe Carpet 11
        GameRegistry.addRecipe(new ItemStack(SharpnetCarpetsBlocks1,9,10), new Object[]
        {
            "AAA",
            "AAA",
            "AAA",
            'A',Items.cloth_blue
        });
        
        //Recipe Carpet 12
        GameRegistry.addRecipe(new ItemStack(SharpnetCarpetsBlocks1,9,11), new Object[]
        {
            "BAB",
            "ABA",
            "BAB",
            'A',Items.cloth_blue, 'B',Items.cloth_white
        });
        
        //Recipe Carpet 13
        GameRegistry.addRecipe(new ItemStack(SharpnetCarpetsBlocks1,9,12), new Object[]
        {
            "ABA",
            "BAB",
            "ABA",
            'A',Items.cloth_red, 'B',Items.cloth_gray
        });
        
        //Recipe Carpet 14
        GameRegistry.addRecipe(new ItemStack(SharpnetCarpetsBlocks1,9,13), new Object[]
        {
            "AAA",
            "AAA",
            "AAA",
            'A',Items.cloth_red
        });
        
        //Recipe Carpet 15
        GameRegistry.addRecipe(new ItemStack(SharpnetCarpetsBlocks1,9,14), new Object[]
        {
            "AAA",
            "ABA",
            "AAA",
            'A',Items.cloth_red, 'B',Items.cloth_white
        });
        
        //Recipe Carpet 16
        GameRegistry.addRecipe(new ItemStack(SharpnetCarpetsBlocks1,9,15), new Object[]
        {
            "ABA",
            "BAA",
            "ABA",
            'A',Items.cloth_green, 'B',Items.cloth_white
        });
        
        //Recipe Carpet 17
        GameRegistry.addRecipe(new ItemStack(SharpnetCarpetsBlocks2,9,0), new Object[]
        {
            "AAA",
            "AAA",
            "AAA",
            'A',Items.cloth_green
        });
        
        //Recipe Carpet 18
        GameRegistry.addRecipe(new ItemStack(SharpnetCarpetsBlocks2,9,1), new Object[]
        {
            "ABA",
            "CAA",
            "ABA",
            'A',Items.cloth_white, 'B',Items.cloth_brown, 'C',Items.cloth_black
        });
        
        //Recipe Carpet 19
        GameRegistry.addRecipe(new ItemStack(SharpnetCarpetsBlocks2,9,2), new Object[]
        {
            "ABA",
            "CAA",
            "ABA",
            'A',Items.cloth_red, 'B',Items.cloth_yellow, 'C',Items.cloth_brown
        });
        
    } 
}
