package ModSharpnet.Recipes;

import ModSharpnet.Blocks;
import ModSharpnet.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.block.Block;
import cpw.mods.fml.common.registry.GameRegistry;

public class RecipesElectronics
{
    public static void register()
    {
        
        //Recipe Mixer
        GameRegistry.addRecipe(new ItemStack(Blocks.electro1_block,1,0), new Object[]
        {
            "WWW",
            "BCO",
            "WWW",
            'W', new ItemStack(Block.cloth,1,15), 'O', new ItemStack(Block.cloth,1,0), 'B', new ItemStack(ic2.api.item.Items.getItem("reBattery").getItem(),1,0), 'C', new ItemStack(ic2.api.item.Items.getItem("electronicCircuit").getItem(),1,0)
        });
        
        //Recipe Cofee Machine
        GameRegistry.addRecipe(new ItemStack(Blocks.electro1_block,1,1), new Object[]
        {
            "WCW",
            "WBW",
            "WWW",
            'W', new ItemStack(Block.cloth,1,15), 'B', new ItemStack(ic2.api.item.Items.getItem("reBattery").getItem(),1,0), 'C', new ItemStack(ic2.api.item.Items.getItem("electronicCircuit").getItem(),1,0)
        });
        
        //Recipe Kettle
        GameRegistry.addRecipe(new ItemStack(Blocks.electro1_block,1,2), new Object[]
        {
            "W W",
            "WBW",
            "WCW",
            'W', new ItemStack(Block.cloth,1,15), 'B', new ItemStack(ic2.api.item.Items.getItem("reBattery").getItem(),1,0), 'C', new ItemStack(ic2.api.item.Items.getItem("ironCableItem").getItem(),1,5)
        });
        
        //Reload for Throwel
        //GameRegistry.addShapelessRecipe(new ItemStack(Items.trowel,1,16), new ItemStack(Items.trowel,1,Short.MAX_VALUE), Item.clay);
    } 
}
