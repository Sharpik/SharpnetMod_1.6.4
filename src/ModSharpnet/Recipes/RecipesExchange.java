package ModSharpnet.Recipes;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.block.Block;
import cpw.mods.fml.common.registry.GameRegistry;

public class RecipesExchange
{
    public static void register()
    {
        //Exchange IC2
        GameRegistry.addShapelessRecipe(new ItemStack(Item.bucketWater, 1, 0), new ItemStack(Item.bucketEmpty, 1, 0), new ItemStack(ic2.api.item.Items.getItem("waterCell").getItem(), 1, 1));
        GameRegistry.addShapelessRecipe(new ItemStack(ic2.api.item.Items.getItem("waterCell").getItem(), 1, 0), new ItemStack(Item.bucketWater.setContainerItem(Item.bucketEmpty), 1, 0), new ItemStack(ic2.api.item.Items.getItem("cell").getItem(), 1, 0));
        
        GameRegistry.addShapelessRecipe(new ItemStack(Item.bucketLava, 1, 0), new ItemStack(Item.bucketEmpty, 1, 0), new ItemStack(ic2.api.item.Items.getItem("lavaCell").getItem(), 1, 2));
        GameRegistry.addShapelessRecipe(new ItemStack(ic2.api.item.Items.getItem("lavaCell").getItem(), 1, 2), new ItemStack(Item.bucketLava.setContainerItem(Item.bucketEmpty), 1, 0), new ItemStack(ic2.api.item.Items.getItem("cell").getItem(), 1, 0));
        
    } 
}
