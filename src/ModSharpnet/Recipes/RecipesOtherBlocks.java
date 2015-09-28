package ModSharpnet.Recipes;

import ModSharpnet.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.block.Block;
import cpw.mods.fml.common.registry.GameRegistry;

public class RecipesOtherBlocks
{
    public static void register()
    {
        //Recipe Lighting Stick
        GameRegistry.addRecipe(new ItemStack(Blocks.lighting_stick_block,4,0), new Object[]
        {
            " G",
            "S ",
            'S', new ItemStack(Item.stick,1,0), 'G', new ItemStack(Item.glowstone,1,0)
        });
        
    } 
}
