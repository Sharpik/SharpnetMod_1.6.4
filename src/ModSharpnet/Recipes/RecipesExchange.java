package ModSharpnet.Recipes;

import ModSharpnet.Items;
import static ModSharpnet.ModSharpnet.ModFlansMod;
import static ModSharpnet.ModSharpnet.ModIndustrialCraft2;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class RecipesExchange
{
    public static void register()
    {
        if(ModIndustrialCraft2)
        {
            //Exchange IC2
            GameRegistry.addShapelessRecipe(new ItemStack(Item.bucketWater, 1, 0), new ItemStack(Item.bucketEmpty, 1, 0), new ItemStack(ic2.api.item.Items.getItem("waterCell").getItem(), 1, 1));
            GameRegistry.addShapelessRecipe(new ItemStack(ic2.api.item.Items.getItem("waterCell").getItem(), 1, 0), new ItemStack(Item.bucketWater.setContainerItem(Item.bucketEmpty), 1, 0), new ItemStack(ic2.api.item.Items.getItem("cell").getItem(), 1, 0));

            GameRegistry.addShapelessRecipe(new ItemStack(Item.bucketLava, 1, 0), new ItemStack(Item.bucketEmpty, 1, 0), new ItemStack(ic2.api.item.Items.getItem("lavaCell").getItem(), 1, 2));
            GameRegistry.addShapelessRecipe(new ItemStack(ic2.api.item.Items.getItem("lavaCell").getItem(), 1, 2), new ItemStack(Item.bucketLava.setContainerItem(Item.bucketEmpty), 1, 0), new ItemStack(ic2.api.item.Items.getItem("cell").getItem(), 1, 0));

            GameRegistry.addRecipe(new ItemStack(Items.fuel_cell,1,0), new Object[]
            {
                "CCC",
                "CCC",
                "CCC",
                'C', new ItemStack(ic2.api.item.Items.getItem("biofuelCell").getItem(),1,9)
            });

            GameRegistry.addRecipe(new ItemStack(Items.fuel_cell,1,0), new Object[]
            {
                "CCC",
                'C', new ItemStack(ic2.api.item.Items.getItem("coalfuelCell").getItem(),1,8)
            });

            //Wrench
            GameRegistry.addRecipe(new ItemStack(ic2.api.item.Items.getItem("wrench").getItem(),1,0), new Object[]
            {
                "S S",
                "SSS",
                " S ",
                'S', new ItemStack(Items.IngotSteel,1,0)
            });
        }
        
        if(ModFlansMod)
        {
            //Exchange Flan's Mod
            GameRegistry.addShapelessRecipe(new ItemStack(Items.FLANS_Fuel_Barrel_ID, 1, 0), new ItemStack(Items.fuel_cell_ID, 1, 0));
            GameRegistry.addShapelessRecipe(new ItemStack(Items.FLANS_Fuel_Canister_ID, 2, 0), new ItemStack(ic2.api.item.Items.getItem("coalfuelCell").getItem(), 1, 8));
            GameRegistry.addShapelessRecipe(new ItemStack(Items.FLANS_Fuel_Canister_ID, 1, 0), new ItemStack(ic2.api.item.Items.getItem("biofuelCell").getItem(), 1, 9), new ItemStack(ic2.api.item.Items.getItem("biofuelCell").getItem(), 1, 9));
        }
        
    }
}
