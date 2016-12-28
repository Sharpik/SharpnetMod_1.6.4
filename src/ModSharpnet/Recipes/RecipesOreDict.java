package ModSharpnet.Recipes;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.block.Block;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class RecipesOreDict
{
    public static void register()
    {
        //Ore Dictionary
        
        /*
        GameRegistry.addRecipe(new ShapedOreRecipe(Item.bucketEmpty, new Object[]{
        "FF",
        'F', "ingotCopper"
        }));
        */
        
        //GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.salt,9),new ItemStack(ModBlocks.saltBlock)));
        /*
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.saltSword),
        " s ",
        " s ",
        " w ",
        's',new ItemStack(ModItems.salt,9),'w',"stickWood"));
        */
        
    } 
}
