package ModSharpnet.Recipes;

import ModSharpnet.Items;
import static ModSharpnet.ModSharpnet.ModIndustrialCraft2;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.block.Block;
import cpw.mods.fml.common.registry.GameRegistry;

public class RecipesMelting
{
    public static void register()
    {
        GameRegistry.addSmelting(Item.bucketEmpty.itemID, new ItemStack(Item.ingotIron, 3), 0.35F);
        
        GameRegistry.addSmelting(Item.minecartEmpty.itemID, new ItemStack(Item.ingotIron, 5), 0.35F);
        GameRegistry.addSmelting(Item.minecartCrate.itemID, new ItemStack(Item.ingotIron, 5), 0.35F);
        GameRegistry.addSmelting(Item.minecartHopper.itemID, new ItemStack(Item.ingotIron, 5), 0.35F);
        GameRegistry.addSmelting(Item.minecartPowered.itemID, new ItemStack(Item.ingotIron, 5), 0.35F);
        GameRegistry.addSmelting(Item.minecartTnt.itemID, new ItemStack(Item.ingotIron, 5), 0.35F);
        
        GameRegistry.addSmelting(Block.doorIron.blockID, new ItemStack(Item.ingotIron, 6), 0.35F);
        
        GameRegistry.addSmelting(Block.cauldron.blockID, new ItemStack(Item.ingotIron, 7), 0.35F);
        
        GameRegistry.addSmelting(Block.railActivator.blockID, new ItemStack(Item.ingotIron, 6), 0.35F);
        
        if(ModIndustrialCraft2)
        {
            GameRegistry.addSmelting(Item.swordIron.itemID, new ItemStack(ic2.api.item.Items.getItem("smallIronDust").getItem(), 7), 0.35F);
            GameRegistry.addSmelting(Item.pickaxeIron.itemID, new ItemStack(ic2.api.item.Items.getItem("smallIronDust").getItem(), 15), 0.35F);
            GameRegistry.addSmelting(Item.axeIron.itemID, new ItemStack(ic2.api.item.Items.getItem("smallIronDust").getItem(), 15), 0.35F);
        }
        else
        {
            GameRegistry.addSmelting(Item.swordIron.itemID, new ItemStack(Item.ingotIron, 1), 0.35F);
            GameRegistry.addSmelting(Item.pickaxeIron.itemID, new ItemStack(Item.ingotIron, 2), 0.35F);
            GameRegistry.addSmelting(Item.axeIron.itemID, new ItemStack(Item.ingotIron, 2), 0.35F);
        }
    } 
}
