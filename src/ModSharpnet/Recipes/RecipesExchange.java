package ModSharpnet.Recipes;

import ModSharpnet.Items;
import static ModSharpnet.ModSharpnet.ModBuildCraft;
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
            
            //Fuel can
            GameRegistry.addRecipe(new ItemStack(ic2.api.item.Items.getItem("filledFuelCan").getItem(),1,0), new Object[]
            {
                "CF",
                'C', new ItemStack(ic2.api.item.Items.getItem("fuelCan").getItem(),1,0),
                'F', new ItemStack(ic2.api.item.Items.getItem("coalfuelCell").getItem(),1,8)
            });
            
            //Fuel can
            GameRegistry.addRecipe(new ItemStack(ic2.api.item.Items.getItem("filledFuelCan").getItem(),1,0), new Object[]
            {
                "CF",
                "FF",
                'C', new ItemStack(ic2.api.item.Items.getItem("fuelCan").getItem(),1,0),
                'F', new ItemStack(ic2.api.item.Items.getItem("biofuelCell").getItem(),1,9)
            });
            
            //Fuel can
            GameRegistry.addRecipe(new ItemStack(ic2.api.item.Items.getItem("filledFuelCan").getItem(),3,0), new Object[]
            {
                "FC",
                "CC",
                'C', new ItemStack(ic2.api.item.Items.getItem("fuelCan").getItem(),1,0),
                'F', new ItemStack(Items.fuel_cell,1,0)
            });
            
            //Jetpack Fill
            GameRegistry.addRecipe(new ItemStack(ic2.api.item.Items.getItem("jetpack").getItem(),1,1), new Object[]
            {
                "JF",
                'J', new ItemStack(ic2.api.item.Items.getItem("jetpack").getItem(),1,Short.MAX_VALUE),
                'F', new ItemStack(ic2.api.item.Items.getItem("filledFuelCan").getItem(),1,0)
            });
        }
        
        if(ModFlansMod)
        {
            //Exchange Flan's Mod
            GameRegistry.addShapelessRecipe(new ItemStack(Items.FLANS_Steel_ID, 2, 0), new ItemStack(Items.IngotSteel, 1, 0), new ItemStack(Items.IngotSteel, 1, 0));
            GameRegistry.addShapelessRecipe(new ItemStack(Items.FLANS_Fuel_Barrel_ID, 1, 0), new ItemStack(Items.fuel_cell, 1, 0));
            GameRegistry.addShapelessRecipe(new ItemStack(Items.FLANS_Fuel_Canister_ID, 2, 0), new ItemStack(ic2.api.item.Items.getItem("coalfuelCell").getItem(), 1, 8));
            GameRegistry.addShapelessRecipe(new ItemStack(Items.FLANS_Fuel_Canister_ID, 1, 0), new ItemStack(ic2.api.item.Items.getItem("biofuelCell").getItem(), 1, 9), new ItemStack(ic2.api.item.Items.getItem("biofuelCell").getItem(), 1, 9));
        }
        
        if(ModBuildCraft)
        {
            GameRegistry.addShapelessRecipe(new ItemStack(Items.BC_pipeGateAutarchic_ID, 1, 0), new ItemStack(ic2.api.item.Items.getItem("elemotor").getItem(), 1, 1), new ItemStack(Items.BC_redstoneChipset_ID, 1, 0));
            
        }
        
    }
}
