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
        
        //Recipe Roulette
        GameRegistry.addRecipe(new ItemStack(Blocks.deco1_block,1,6), new Object[]
        {
            " W ",
            "WCW",
            " W ",
            'W', new ItemStack(Block.cloth,1,13), 'C', new ItemStack(Item.compass,1,0)
        });
        
        //Recipe Roulette - Red
        GameRegistry.addRecipe(new ItemStack(Blocks.deco1_block,1,7), new Object[]
        {
            " W ",
            "WCW",
            " W ",
            'W', new ItemStack(Block.cloth,1,13), 'C', new ItemStack(Block.cloth,1,14)
        });
        
        //Recipe Roulette - Black
        GameRegistry.addRecipe(new ItemStack(Blocks.deco1_block,1,8), new Object[]
        {
            " W ",
            "WCW",
            " W ",
            'W', new ItemStack(Block.cloth,1,13), 'C', new ItemStack(Block.cloth,1,15)
        });
        
        //Recipe Roulette - Top
        GameRegistry.addRecipe(new ItemStack(Blocks.deco1_block,1,9), new Object[]
        {
            " W ",
            "WWW",
            " W ",
            'W', new ItemStack(Block.cloth,1,13)
        });
        
    } 
}
