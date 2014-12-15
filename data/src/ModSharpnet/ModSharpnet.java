package ModSharpnet;

// @author Sharpman
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import net.minecraftforge.common.Configuration;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import java.io.File;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemFood;
import net.minecraftforge.common.MinecraftForge;
import ModSharpnet.Block.*;
import net.minecraft.creativetab.CreativeTabs;
//import ModSharpnet.Item.*;

// IC2 Dependency
//import ic2.api.item.Items;
//import ic2.api.recipe.RecipeInputItemStack;
//import ic2.api.recipe.Recipes;



@Mod(modid="ModSharpnet", name="SharpnetMod", version="1.0.1", dependencies="required-after:IC2")
@NetworkMod(clientSideRequired=true, serverSideRequired=true)

public class ModSharpnet
{
    @Instance(value = "ModSharpnet")
    public static ModSharpnet instance;
    public static String modid = "ModSharpnet";
    
    
    // Blocks register
    
    
    
    public static Block SharpnetBuildingBlocks1;
    public static int SharpnetBuildingBlocks1ID;
    
    public static Block SharpnetCarpetsBlocks1;
    public static int SharpnetCarpetsBlocks1ID;
    public static Block SharpnetCarpetsBlocks2;
    public static int SharpnetCarpetsBlocks2ID;
    
    public static Block SharpnetWallsBlocks1;
    public static int SharpnetWallsBlocks1ID;
    
    public static Block SharpnetTilesBlocks1;
    public static int SharpnetTilesBlocks1ID;
    public static Block SharpnetTilesBlocks2;
    public static int SharpnetTilesBlocks2ID;
    
    public static Block SharpnetTilesWoodBlocks1;
    public static int SharpnetTilesWoodBlocks1ID;
    public static Block SharpnetTilesWoodBlocks2;
    public static int SharpnetTilesWoodBlocks2ID;
    
    public static Block SharpnetRoofsBlocks1;
    public static int SharpnetRoofsBlocks1ID;
    
    public static Block SharpnetRoadsBlocks1;
    public static int SharpnetRoadsBlocks1ID;
    
    public static Block SharpnetRoadStairsGray;
    public static int SharpnetRoadStairsGrayID;
    
    public static Block SharpnetRoadStairsBlack;
    public static int SharpnetRoadStairsBlackID;
    
    public static Block SharpnetPlantsBlocks1;
    public static int SharpnetPlantsBlocks1ID;
    
    public static Block SharpnetStargateBlocks1;
    public static int SharpnetStargateBlocks1ID;
    
    public static Block SharpnetStargateBlocks2;
    public static int SharpnetStargateBlocks2ID;
    
    public static Block sharpnetFlowerBlocks1;
    public static int sharpnetFlowerBlocks1ID;
    
    
    // Items Register
    public static Item SharpnetTomatoSeeds;
    public static int SharpnetTomatoSeedsID;
    
    public static Item SharpnetTomato;
    public static int SharpnetTomatoID;
    
    public static Item SharpnetCucumberSeeds;
    public static int SharpnetCucumberSeedsID;
    
    public static Item SharpnetCucumber;
    public static int SharpnetCucumberID;
    
    public static Item SharpnetCornSeeds;
    public static int SharpnetCornSeedsID;
    
    public static Item SharpnetCorn;
    public static int SharpnetCornID;
    
    public static Item SharpnetFlaxSeeds;
    public static int SharpnetFlaxSeedsID;
    
    
    //public static Item 
    //public static int 
    
    //public static Block ;
    //public static int ;
    
    // Config register
    public void initConfiguration(FMLInitializationEvent event)
    {
        Configuration config = new Configuration(new File("config/SharpnetMod_1.6.4.cfg"));
        config.load();
        
        //Blocks ID
        Blocks.SharpnetOreBlocks1ID = config.get("Blocks", "SharpnetOreBlocks1", 2505).getInt();
        SharpnetBuildingBlocks1ID = config.get("Blocks", "SharpnetBuildingBlocks1", 3143).getInt();
        SharpnetCarpetsBlocks1ID = config.get("Blocks", "SharpnetCarpetsBlocks1", 3139).getInt();
        SharpnetCarpetsBlocks2ID = config.get("Blocks", "SharpnetCarpetsBlocks2", 3140).getInt();
        SharpnetWallsBlocks1ID = config.get("Blocks", "SharpnetWallsBlocks1", 3141).getInt();
        SharpnetTilesBlocks1ID = config.get("Blocks", "SharpnetTilesBlocks1", 3129).getInt();
        SharpnetTilesBlocks2ID = config.get("Blocks", "SharpnetTilesBlocks2", 3132).getInt();
        SharpnetTilesWoodBlocks1ID = config.get("Blocks", "SharpnetTilesWoodBlocks1", 3123).getInt();
        SharpnetTilesWoodBlocks2ID = config.get("Blocks", "SharpnetTilesWoodBlocks2", 3126).getInt();
        SharpnetRoofsBlocks1ID = config.get("Blocks", "SharpnetRoofsBlocks1", 2514).getInt();
        SharpnetRoadsBlocks1ID = config.get("Blocks", "SharpnetRoadsBlocks1", 2506).getInt();
        SharpnetRoadStairsGrayID = config.get("Blocks", "SharpnetRoadStairsGray", 3180).getInt();
        SharpnetRoadStairsBlackID = config.get("Blocks", "SharpnetRoadStairsBlack", 3181).getInt();
        SharpnetPlantsBlocks1ID = config.get("Blocks", "SharpnetPlantsBlocks1", 2507).getInt();
        SharpnetStargateBlocks1ID = config.get("Blocks", "SharpnetStargateBlocks1", 3182).getInt();
        SharpnetStargateBlocks2ID = config.get("Blocks", "SharpnetStargateBlocks2", 3183).getInt();
        sharpnetFlowerBlocks1ID = config.get("Blocks", "SharpnetFlowerBlocks1", 2504).getInt();
        
        //Items ID (u itemů je třeba k ID načtenýmu z CFG odečítat 256 jinak dochází k desynchronizaci čísel s hrou)
        SharpnetTomatoSeedsID = (config.get("Items", "SharpnetTomatoSeeds", 6501).getInt())-256;
        SharpnetTomatoID = (config.get("Items", "SharpnetTomato", 6502).getInt())-256;
        SharpnetCucumberSeedsID = (config.get("Items", "SharpnetCucumberSeeds", 6503).getInt())-256;
        SharpnetCucumberID = (config.get("Items", "SharpnetCucumber", 6504).getInt())-256;
        SharpnetCornSeedsID = (config.get("Items", "SharpnetCornSeeds", 6505).getInt())-256;
        SharpnetCornID = (config.get("Items", "SharpnetCorn", 6506).getInt())-256;
        SharpnetFlaxSeedsID = (config.get("Items", "SharpnetFlaxSeeds", 6507).getInt())-256;
       
        config.save();
    }
    
    @EventHandler
    public void registerRenderers()
    {
        
    }
    
    @EventHandler
    public void load(FMLInitializationEvent event)
    {
        this.initConfiguration(event);
        
        //Debug
        
        //Sharpnet Blocks
        Blocks.SharpnetOreBlocks1 = new SharpnetOreBlocks1(Blocks.SharpnetOreBlocks1ID);
        GameRegistry.registerBlock(Blocks.SharpnetOreBlocks1, SharpnetOreItemBlocks1.class, Blocks.SharpnetOreBlocks1.getUnlocalizedName());
        LanguageRegistry.addName(new ItemStack(Blocks.SharpnetOreBlocks1, 1, 0), "SharpNet Ore Block 1");
        LanguageRegistry.addName(new ItemStack(Blocks.SharpnetOreBlocks1, 1, 1), "SharpNet Ore Block 2");

        
        SharpnetBuildingBlocks1 = new SharpnetBuildingBlocks1(SharpnetBuildingBlocks1ID, "sharpnetbuildingblock1");
        GameRegistry.registerBlock(SharpnetBuildingBlocks1, SharpnetBuildingItemBlocks1.class, "SharpnetBuildingBlocks1");
        LanguageRegistry.addName(new ItemStack(SharpnetBuildingBlocks1, 1, 0), "Construction Block");
        LanguageRegistry.addName(new ItemStack(SharpnetBuildingBlocks1, 1, 1), "Metal 1 Block");
        LanguageRegistry.addName(new ItemStack(SharpnetBuildingBlocks1, 1, 2), "Metal 2 Block");
        LanguageRegistry.addName(new ItemStack(SharpnetBuildingBlocks1, 1, 3), "Metal 3 Block");
        LanguageRegistry.addName(new ItemStack(SharpnetBuildingBlocks1, 1, 4), "Metal 4 Block");
        
        SharpnetCarpetsBlocks1 = new SharpnetCarpetsBlocks1(SharpnetCarpetsBlocks1ID, "SharpnetCarpetsBlocks1");
        GameRegistry.registerBlock(SharpnetCarpetsBlocks1, SharpnetCarpetItemBlocks1.class, "SharpnetCarpetsBlocks1");
        LanguageRegistry.addName(new ItemStack(SharpnetCarpetsBlocks1, 1, 0), "Carpet 1 Block");
        LanguageRegistry.addName(new ItemStack(SharpnetCarpetsBlocks1, 1, 1), "Carpet 2 Block");
        LanguageRegistry.addName(new ItemStack(SharpnetCarpetsBlocks1, 1, 2), "Carpet 3 Block");
        LanguageRegistry.addName(new ItemStack(SharpnetCarpetsBlocks1, 1, 3), "Carpet 4 Block");
        LanguageRegistry.addName(new ItemStack(SharpnetCarpetsBlocks1, 1, 4), "Carpet 5 Block");
        LanguageRegistry.addName(new ItemStack(SharpnetCarpetsBlocks1, 1, 5), "Carpet 6 Block");
        LanguageRegistry.addName(new ItemStack(SharpnetCarpetsBlocks1, 1, 6), "Carpet 7 Block");
        LanguageRegistry.addName(new ItemStack(SharpnetCarpetsBlocks1, 1, 7), "Carpet 8 Block");
        LanguageRegistry.addName(new ItemStack(SharpnetCarpetsBlocks1, 1, 8), "Carpet 9 Block");
        LanguageRegistry.addName(new ItemStack(SharpnetCarpetsBlocks1, 1, 9), "Carpet 10 Block");
        LanguageRegistry.addName(new ItemStack(SharpnetCarpetsBlocks1, 1, 10), "Carpet 11 Block");
        LanguageRegistry.addName(new ItemStack(SharpnetCarpetsBlocks1, 1, 11), "Carpet 12 Block");
        LanguageRegistry.addName(new ItemStack(SharpnetCarpetsBlocks1, 1, 12), "Carpet 13 Block");
        LanguageRegistry.addName(new ItemStack(SharpnetCarpetsBlocks1, 1, 13), "Carpet 14 Block");
        LanguageRegistry.addName(new ItemStack(SharpnetCarpetsBlocks1, 1, 14), "Carpet 15 Block");
        LanguageRegistry.addName(new ItemStack(SharpnetCarpetsBlocks1, 1, 15), "Carpet 16 Block");
        
        SharpnetCarpetsBlocks2 = new SharpnetCarpetsBlocks2(SharpnetCarpetsBlocks2ID, "SharpnetCarpetsBlocks2");
        GameRegistry.registerBlock(SharpnetCarpetsBlocks2, SharpnetCarpetItemBlocks2.class, "SharpnetCarpetsBlocks2");
        LanguageRegistry.addName(new ItemStack(SharpnetCarpetsBlocks2, 1, 0), "Carpet 17 Block");
        LanguageRegistry.addName(new ItemStack(SharpnetCarpetsBlocks2, 1, 1), "Carpet 18 Block");
        LanguageRegistry.addName(new ItemStack(SharpnetCarpetsBlocks2, 1, 2), "Carpet 19 Block");
        
        SharpnetWallsBlocks1 = new SharpnetWallsBlocks1(SharpnetWallsBlocks1ID, "SharpnetWallsBlocks1");
        GameRegistry.registerBlock(SharpnetWallsBlocks1, SharpnetWallsItemBlocks1.class, "SharpnetWallsBlocks1");
        LanguageRegistry.addName(new ItemStack(SharpnetWallsBlocks1, 1, 0), "Wall 1 Block");
        LanguageRegistry.addName(new ItemStack(SharpnetWallsBlocks1, 1, 1), "Wall 2 Block");
        LanguageRegistry.addName(new ItemStack(SharpnetWallsBlocks1, 1, 2), "Wall 3 Block");
        LanguageRegistry.addName(new ItemStack(SharpnetWallsBlocks1, 1, 3), "Wall 4 Block");
        LanguageRegistry.addName(new ItemStack(SharpnetWallsBlocks1, 1, 4), "Wall 5 Block");
        LanguageRegistry.addName(new ItemStack(SharpnetWallsBlocks1, 1, 5), "Wall 6 Block");
        LanguageRegistry.addName(new ItemStack(SharpnetWallsBlocks1, 1, 6), "Wall 7 Block");
        LanguageRegistry.addName(new ItemStack(SharpnetWallsBlocks1, 1, 7), "Wall 8 Block");
        LanguageRegistry.addName(new ItemStack(SharpnetWallsBlocks1, 1, 8), "Wall 9 Block");
        LanguageRegistry.addName(new ItemStack(SharpnetWallsBlocks1, 1, 9), "Wall 10 Block");
        LanguageRegistry.addName(new ItemStack(SharpnetWallsBlocks1, 1, 10), "Wall 11 Block");
        LanguageRegistry.addName(new ItemStack(SharpnetWallsBlocks1, 1, 11), "Wall 12 Block");
        LanguageRegistry.addName(new ItemStack(SharpnetWallsBlocks1, 1, 12), "Wall 13 Block");
        //LanguageRegistry.addName(new ItemStack(SharpnetWallsBlocks1, 1, 13), "Wall 14 Block");
        //LanguageRegistry.addName(new ItemStack(SharpnetWallsBlocks1, 1, 14), "Wall 15 Block");
        //LanguageRegistry.addName(new ItemStack(SharpnetWallsBlocks1, 1, 15), "Wall 16 Block");
        
        SharpnetTilesBlocks1 = new SharpnetTilesBlocks1(SharpnetTilesBlocks1ID, "SharpnetTilesBlocks1");
        GameRegistry.registerBlock(SharpnetTilesBlocks1, SharpnetTilesItemBlocks1.class, "SharpnetTilesBlocks1");
        LanguageRegistry.addName(new ItemStack(SharpnetTilesBlocks1, 1, 0), "Tile 1 Block");
        LanguageRegistry.addName(new ItemStack(SharpnetTilesBlocks1, 1, 1), "Tile 2 Block");
        LanguageRegistry.addName(new ItemStack(SharpnetTilesBlocks1, 1, 2), "Tile 3 Block");
        LanguageRegistry.addName(new ItemStack(SharpnetTilesBlocks1, 1, 3), "Tile 4 Block");
        LanguageRegistry.addName(new ItemStack(SharpnetTilesBlocks1, 1, 4), "Tile 5 Block");
        LanguageRegistry.addName(new ItemStack(SharpnetTilesBlocks1, 1, 5), "Tile 6 Block");
        LanguageRegistry.addName(new ItemStack(SharpnetTilesBlocks1, 1, 6), "Tile 7 Block");
        LanguageRegistry.addName(new ItemStack(SharpnetTilesBlocks1, 1, 7), "Tile 8 Block");
        LanguageRegistry.addName(new ItemStack(SharpnetTilesBlocks1, 1, 8), "Tile 9 Block");
        LanguageRegistry.addName(new ItemStack(SharpnetTilesBlocks1, 1, 9), "Tile 10 Block");
        LanguageRegistry.addName(new ItemStack(SharpnetTilesBlocks1, 1, 10), "Tile 11 Block");
        LanguageRegistry.addName(new ItemStack(SharpnetTilesBlocks1, 1, 11), "Tile 12 Block");
        LanguageRegistry.addName(new ItemStack(SharpnetTilesBlocks1, 1, 12), "Tile 13 Block");
        LanguageRegistry.addName(new ItemStack(SharpnetTilesBlocks1, 1, 13), "Tile 14 Block");
        LanguageRegistry.addName(new ItemStack(SharpnetTilesBlocks1, 1, 14), "Tile 15 Block");
        LanguageRegistry.addName(new ItemStack(SharpnetTilesBlocks1, 1, 15), "Tile 16 Block");
        
        SharpnetTilesBlocks2 = new SharpnetTilesBlocks2(SharpnetTilesBlocks2ID, "SharpnetTilesBlocks2");
        GameRegistry.registerBlock(SharpnetTilesBlocks2, SharpnetTilesItemBlocks2.class, "SharpnetTilesBlocks2");
        LanguageRegistry.addName(new ItemStack(SharpnetTilesBlocks2, 1, 0), "Tile 17 Block");
        LanguageRegistry.addName(new ItemStack(SharpnetTilesBlocks2, 1, 1), "Tile 18 Block");
        LanguageRegistry.addName(new ItemStack(SharpnetTilesBlocks2, 1, 2), "Tile 19 Block");
        LanguageRegistry.addName(new ItemStack(SharpnetTilesBlocks2, 1, 3), "Tile 20 Block");
        //LanguageRegistry.addName(new ItemStack(SharpnetTilesBlocks2, 1, 4), "Tile 5 Block");
        //LanguageRegistry.addName(new ItemStack(SharpnetTilesBlocks2, 1, 5), "Tile 6 Block");
        //LanguageRegistry.addName(new ItemStack(SharpnetTilesBlocks2, 1, 6), "Tile 7 Block");
        //LanguageRegistry.addName(new ItemStack(SharpnetTilesBlocks2, 1, 7), "Tile 8 Block");
        //LanguageRegistry.addName(new ItemStack(SharpnetTilesBlocks2, 1, 8), "Tile 9 Block");
        //LanguageRegistry.addName(new ItemStack(SharpnetTilesBlocks2, 1, 9), "Tile 10 Block");
        //LanguageRegistry.addName(new ItemStack(SharpnetTilesBlocks2, 1, 10), "Tile 11 Block");
        //LanguageRegistry.addName(new ItemStack(SharpnetTilesBlocks2, 1, 11), "Tile 12 Block");
        //LanguageRegistry.addName(new ItemStack(SharpnetTilesBlocks2, 1, 12), "Tile 13 Block");
        //LanguageRegistry.addName(new ItemStack(SharpnetTilesBlocks2, 1, 13), "Tile 14 Block");
        //LanguageRegistry.addName(new ItemStack(SharpnetTilesBlocks2, 1, 14), "Tile 15 Block");
        //LanguageRegistry.addName(new ItemStack(SharpnetTilesBlocks2, 1, 15), "Tile 16 Block");
        
        SharpnetTilesWoodBlocks1 = new SharpnetTilesWoodBlocks1(SharpnetTilesWoodBlocks1ID, "SharpnetTilesWoodBlocks1");
        GameRegistry.registerBlock(SharpnetTilesWoodBlocks1, SharpnetTilesWoodItemBlocks1.class, "SharpnetTilesWoodBlocks1");
        LanguageRegistry.addName(new ItemStack(SharpnetTilesWoodBlocks1, 1, 0), "Wodeen Floor White Block");
        LanguageRegistry.addName(new ItemStack(SharpnetTilesWoodBlocks1, 1, 1), "Wodeen Floor Black Block");
        LanguageRegistry.addName(new ItemStack(SharpnetTilesWoodBlocks1, 1, 2), "Wodeen Floor Blue Block");
        LanguageRegistry.addName(new ItemStack(SharpnetTilesWoodBlocks1, 1, 3), "Wodeen Floor Green Block");
        LanguageRegistry.addName(new ItemStack(SharpnetTilesWoodBlocks1, 1, 4), "Wodeen Floor Orange Block");
        LanguageRegistry.addName(new ItemStack(SharpnetTilesWoodBlocks1, 1, 5), "Wodeen Floor Red Block");
        LanguageRegistry.addName(new ItemStack(SharpnetTilesWoodBlocks1, 1, 6), "Wodeen Floor Yellow Block");
        LanguageRegistry.addName(new ItemStack(SharpnetTilesWoodBlocks1, 1, 7), "Wodeen Floor Normal Block");
        //LanguageRegistry.addName(new ItemStack(SharpnetTilesWoodBlocks1, 1, 8), "Wodeen Floor 1 Block");
        //LanguageRegistry.addName(new ItemStack(SharpnetTilesWoodBlocks1, 1, 9), "Wodeen Floor 2 Block");
        //LanguageRegistry.addName(new ItemStack(SharpnetTilesWoodBlocks1, 1, 10), "Wodeen Floor 3 Block");
        //LanguageRegistry.addName(new ItemStack(SharpnetTilesWoodBlocks1, 1, 11), "Wodeen Floor 4 Block");
        //LanguageRegistry.addName(new ItemStack(SharpnetTilesWoodBlocks1, 1, 12), "Wodeen Floor 5 Block");
        //LanguageRegistry.addName(new ItemStack(SharpnetTilesWoodBlocks1, 1, 13), "Tile Wood 14 Block");
        //LanguageRegistry.addName(new ItemStack(SharpnetTilesWoodBlocks1, 1, 14), "Tile Wood 15 Block");
        //LanguageRegistry.addName(new ItemStack(SharpnetTilesWoodBlocks1, 1, 15), "Tile Wood 16 Block");
        
        SharpnetTilesWoodBlocks2 = new SharpnetTilesWoodBlocks2(SharpnetTilesWoodBlocks2ID, "SharpnetTilesWoodBlocks2");
        GameRegistry.registerBlock(SharpnetTilesWoodBlocks2, SharpnetTilesWoodItemBlocks2.class, "SharpnetTilesWoodBlocks2");
        LanguageRegistry.addName(new ItemStack(SharpnetTilesWoodBlocks2, 1, 0), "Wodeen Floor 1 Block");
        LanguageRegistry.addName(new ItemStack(SharpnetTilesWoodBlocks2, 1, 1), "Wodeen Floor 2 Block");
        LanguageRegistry.addName(new ItemStack(SharpnetTilesWoodBlocks2, 1, 2), "Wodeen Floor 3 Block");
        LanguageRegistry.addName(new ItemStack(SharpnetTilesWoodBlocks2, 1, 3), "Wodeen Floor 4 Block");
        LanguageRegistry.addName(new ItemStack(SharpnetTilesWoodBlocks2, 1, 4), "Wodeen Floor 5 Block");
        //LanguageRegistry.addName(new ItemStack(SharpnetTilesWoodBlocks2, 1, 5), "Wodeen Floor Red Block");
        //LanguageRegistry.addName(new ItemStack(SharpnetTilesWoodBlocks2, 1, 6), "Wodeen Floor Yellow Block");
        //LanguageRegistry.addName(new ItemStack(SharpnetTilesWoodBlocks2, 1, 7), "Wodeen Floor Normal Block");
        //LanguageRegistry.addName(new ItemStack(SharpnetTilesWoodBlocks2, 1, 8), "Wodeen Floor 1 Block");
        //LanguageRegistry.addName(new ItemStack(SharpnetTilesWoodBlocks2, 1, 9), "Wodeen Floor 2 Block");
        //LanguageRegistry.addName(new ItemStack(SharpnetTilesWoodBlocks2, 1, 10), "Wodeen Floor 3 Block");
        //LanguageRegistry.addName(new ItemStack(SharpnetTilesWoodBlocks2, 1, 11), "Wodeen Floor 4 Block");
        //LanguageRegistry.addName(new ItemStack(SharpnetTilesWoodBlocks2, 1, 12), "Wodeen Floor 5 Block");
        //LanguageRegistry.addName(new ItemStack(SharpnetTilesWoodBlocks2, 1, 13), "Tile Wood 14 Block");
        //LanguageRegistry.addName(new ItemStack(SharpnetTilesWoodBlocks2, 1, 14), "Tile Wood 15 Block");
        //LanguageRegistry.addName(new ItemStack(SharpnetTilesWoodBlocks2, 1, 15), "Tile Wood 16 Block");
        
        SharpnetRoofsBlocks1 = new SharpnetRoofsBlocks1(SharpnetRoofsBlocks1ID, "SharpnetRoofsBlocks1");
        GameRegistry.registerBlock(SharpnetRoofsBlocks1, SharpnetRoofsItemBlocks1.class, "SharpnetRoofsBlocks1");
        LanguageRegistry.addName(new ItemStack(SharpnetRoofsBlocks1, 1, 0), "Roof 1 Block");
        LanguageRegistry.addName(new ItemStack(SharpnetRoofsBlocks1, 1, 1), "Roof 1 Black Block");
        LanguageRegistry.addName(new ItemStack(SharpnetRoofsBlocks1, 1, 2), "Roof 1 Blue Block");
        LanguageRegistry.addName(new ItemStack(SharpnetRoofsBlocks1, 1, 3), "Roof 1 Green Block");
        LanguageRegistry.addName(new ItemStack(SharpnetRoofsBlocks1, 1, 4), "Roof 1 Red Block");
        LanguageRegistry.addName(new ItemStack(SharpnetRoofsBlocks1, 1, 5), "Roof 1 Yellow Block");
        LanguageRegistry.addName(new ItemStack(SharpnetRoofsBlocks1, 1, 6), "Roof 2 Block");
        //LanguageRegistry.addName(new ItemStack(SharpnetRoofsBlocks1, 1, 7), "Wodeen Floor Normal Block");
        //LanguageRegistry.addName(new ItemStack(SharpnetRoofsBlocks1, 1, 8), "Wodeen Floor 1 Block");
        //LanguageRegistry.addName(new ItemStack(SharpnetRoofsBlocks1, 1, 9), "Wodeen Floor 2 Block");
        //LanguageRegistry.addName(new ItemStack(SharpnetRoofsBlocks1, 1, 10), "Wodeen Floor 3 Block");
        //LanguageRegistry.addName(new ItemStack(SharpnetRoofsBlocks1, 1, 11), "Wodeen Floor 4 Block");
        //LanguageRegistry.addName(new ItemStack(SharpnetRoofsBlocks1, 1, 12), "Wodeen Floor 5 Block");
        //LanguageRegistry.addName(new ItemStack(SharpnetRoofsBlocks1, 1, 13), "Tile Wood 14 Block");
        //LanguageRegistry.addName(new ItemStack(SharpnetRoofsBlocks1, 1, 14), "Tile Wood 15 Block");
        //LanguageRegistry.addName(new ItemStack(SharpnetRoofsBlocks1, 1, 15), "Tile Wood 16 Block");
        
        SharpnetRoadsBlocks1 = new SharpnetRoadsBlocks1(SharpnetRoadsBlocks1ID, "SharpnetRoadsBlocks1");
        GameRegistry.registerBlock(SharpnetRoadsBlocks1, SharpnetRoadsItemBlocks1.class, "SharpnetRoadsBlocks1");
        LanguageRegistry.addName(new ItemStack(SharpnetRoadsBlocks1, 1, 0), "Road Gray");
        LanguageRegistry.addName(new ItemStack(SharpnetRoadsBlocks1, 1, 1), "Swear 1");
        LanguageRegistry.addName(new ItemStack(SharpnetRoadsBlocks1, 1, 2), "Road Black");
        LanguageRegistry.addName(new ItemStack(SharpnetRoadsBlocks1, 1, 3), "Road White");
        LanguageRegistry.addName(new ItemStack(SharpnetRoadsBlocks1, 1, 4), "Road Yellow");
        
        SharpnetRoadStairsGray = new SharpnetRoadStairsGray(SharpnetRoadStairsGrayID, SharpnetRoadsBlocks1, 0);
        GameRegistry.registerBlock(SharpnetRoadStairsGray, "SharpnetRoadStairsGray");
        LanguageRegistry.addName(new ItemStack(SharpnetRoadStairsGray, 1, 0), "Road Stairs Gray");
        
        SharpnetRoadStairsBlack = new SharpnetRoadStairsBlack(SharpnetRoadStairsBlackID, SharpnetRoadsBlocks1, 2);
        GameRegistry.registerBlock(SharpnetRoadStairsBlack, "SharpnetRoadStairsBlack");
        LanguageRegistry.addName(new ItemStack(SharpnetRoadStairsBlack, 1, 0), "Road Stairs Black");
        
        SharpnetPlantsBlocks1 = new SharpnetPlantsBlocks1(SharpnetPlantsBlocks1ID, Material.plants);
        GameRegistry.registerBlock(SharpnetPlantsBlocks1, SharpnetPlantsItemBlocks1.class, "SharpnetPlantsBlocks1");
        LanguageRegistry.addName(new ItemStack(SharpnetPlantsBlocks1, 1, 0), "Tomato Plant");
        LanguageRegistry.addName(new ItemStack(SharpnetPlantsBlocks1, 1, 1), "Tomato Plant");
        LanguageRegistry.addName(new ItemStack(SharpnetPlantsBlocks1, 1, 2), "Tomato Plant");
        LanguageRegistry.addName(new ItemStack(SharpnetPlantsBlocks1, 1, 3), "Cucumber Plant");
        LanguageRegistry.addName(new ItemStack(SharpnetPlantsBlocks1, 1, 4), "Cucumber Plant");
        LanguageRegistry.addName(new ItemStack(SharpnetPlantsBlocks1, 1, 5), "Cucumber Plant");
        LanguageRegistry.addName(new ItemStack(SharpnetPlantsBlocks1, 1, 6), "Corn Plant");
        LanguageRegistry.addName(new ItemStack(SharpnetPlantsBlocks1, 1, 7), "Corn Plant");
        LanguageRegistry.addName(new ItemStack(SharpnetPlantsBlocks1, 1, 8), "Corn Plant");
        
        SharpnetStargateBlocks1 = new SharpnetStargateBlocks1(SharpnetStargateBlocks1ID, "SharpnetStargateBlocks1");
        GameRegistry.registerBlock(SharpnetStargateBlocks1, SharpnetStargateItemBlocks1.class, "SharpnetStargateBlocks1");
        LanguageRegistry.addName(new ItemStack(SharpnetStargateBlocks1, 1, 0), "SG Wall 1");
        LanguageRegistry.addName(new ItemStack(SharpnetStargateBlocks1, 1, 1), "SG Wall 2");
        LanguageRegistry.addName(new ItemStack(SharpnetStargateBlocks1, 1, 2), "SG Wall 3");
        LanguageRegistry.addName(new ItemStack(SharpnetStargateBlocks1, 1, 3), "SG Wall 4");
        LanguageRegistry.addName(new ItemStack(SharpnetStargateBlocks1, 1, 4), "SG Wall 5");
        
        SharpnetStargateBlocks2 = new SharpnetStargateBlocks2(SharpnetStargateBlocks2ID, "SharpnetStargateBlocks2");
        GameRegistry.registerBlock(SharpnetStargateBlocks2, SharpnetStargateItemBlocks2.class, "SharpnetStargateBlocks2");
        LanguageRegistry.addName(new ItemStack(SharpnetStargateBlocks2, 1, 0), "SG Whell UP");
        LanguageRegistry.addName(new ItemStack(SharpnetStargateBlocks2, 1, 1), "SG Whell DOWN");
        LanguageRegistry.addName(new ItemStack(SharpnetStargateBlocks2, 1, 2), "SG Whell LEFT");
        LanguageRegistry.addName(new ItemStack(SharpnetStargateBlocks2, 1, 3), "SG Whell RIGHT");
        LanguageRegistry.addName(new ItemStack(SharpnetStargateBlocks2, 1, 4), "SG Whell CENTER");
        LanguageRegistry.addName(new ItemStack(SharpnetStargateBlocks2, 1, 5), "SG Cevron OFF UP");
        LanguageRegistry.addName(new ItemStack(SharpnetStargateBlocks2, 1, 6), "SG Cevron OFF RIGHT");
        LanguageRegistry.addName(new ItemStack(SharpnetStargateBlocks2, 1, 7), "SG Cevron OFF DOWN");
        LanguageRegistry.addName(new ItemStack(SharpnetStargateBlocks2, 1, 8), "SG Cevron OFF LEFT");
        LanguageRegistry.addName(new ItemStack(SharpnetStargateBlocks2, 1, 9), "SG Cevron ON UP");
        LanguageRegistry.addName(new ItemStack(SharpnetStargateBlocks2, 1, 10), "SG Cevron ON RIGHT");
        LanguageRegistry.addName(new ItemStack(SharpnetStargateBlocks2, 1, 11), "SG Cevron ON DOWN");
        LanguageRegistry.addName(new ItemStack(SharpnetStargateBlocks2, 1, 12), "SG Cevron ON LEFT");
        LanguageRegistry.addName(new ItemStack(SharpnetStargateBlocks2, 1, 13), "SG Vortex");
        LanguageRegistry.addName(new ItemStack(SharpnetStargateBlocks2, 1, 14), "SG Iris");
        LanguageRegistry.addName(new ItemStack(SharpnetStargateBlocks2, 1, 15), "SG Iris TOP");
        
        //End Debug
               
        sharpnetFlowerBlocks1 = new SharpnetFlowerBlocks1(sharpnetFlowerBlocks1ID).setUnlocalizedName("SharpnetFlowerBlocks1").setHardness(0.0F).setResistance(0.0F).setCreativeTab(CreativeTabs.tabDecorations).setStepSound(Block.soundGlassFootstep);
        GameRegistry.registerBlock(sharpnetFlowerBlocks1, SharpnetFlowerItemBlocks1.class, sharpnetFlowerBlocks1.getUnlocalizedName());
        LanguageRegistry.addName(new ItemStack(sharpnetFlowerBlocks1, 1, 0), "Daffodil Flower");
        LanguageRegistry.addName(new ItemStack(sharpnetFlowerBlocks1, 1, 1), "Flora Cactus");
        LanguageRegistry.addName(new ItemStack(sharpnetFlowerBlocks1, 1, 2), "Fuchsia");
        LanguageRegistry.addName(new ItemStack(sharpnetFlowerBlocks1, 1, 3), "Sunflower");
        LanguageRegistry.addName(new ItemStack(sharpnetFlowerBlocks1, 1, 4), "Bonsai");
        LanguageRegistry.addName(new ItemStack(sharpnetFlowerBlocks1, 1, 5), "Snap Dragon");
        LanguageRegistry.addName(new ItemStack(sharpnetFlowerBlocks1, 1, 6), "Reddicot Flower");
        LanguageRegistry.addName(new ItemStack(sharpnetFlowerBlocks1, 1, 7), "Tulips");
        LanguageRegistry.addName(new ItemStack(sharpnetFlowerBlocks1, 1, 8), "African Daisy");
        LanguageRegistry.addName(new ItemStack(sharpnetFlowerBlocks1, 1, 9), "Dahilia Flower");
        LanguageRegistry.addName(new ItemStack(sharpnetFlowerBlocks1, 1, 10), "Lacustrine");
        LanguageRegistry.addName(new ItemStack(sharpnetFlowerBlocks1, 1, 11), "Yellow Dicot");
        LanguageRegistry.addName(new ItemStack(sharpnetFlowerBlocks1, 1, 12), "Bird of Paradise");
        LanguageRegistry.addName(new ItemStack(sharpnetFlowerBlocks1, 1, 13), "Okee Giant");
        LanguageRegistry.addName(new ItemStack(sharpnetFlowerBlocks1, 1, 14), "Mantis Shrimp");
        LanguageRegistry.addName(new ItemStack(sharpnetFlowerBlocks1, 1, 15), "Hedgehog Cactus");
        
        
        //Sharpnet Items
        SharpnetTomatoSeeds = new ShItemSeeds(SharpnetTomatoSeedsID, SharpnetPlantsBlocks1.blockID, Block.tilledField.blockID, 0).setUnlocalizedName("SharpnetTomatoSeedsItem").setTextureName(modid+":seeds/seeds_tomato");
        GameRegistry.registerItem(SharpnetTomatoSeeds, "Tomato Seeds");
        LanguageRegistry.addName(new ItemStack(SharpnetTomatoSeeds, 1, 0), "Tomato Seeds");
        
        SharpnetCucumberSeeds = new ShItemSeeds(SharpnetCucumberSeedsID, SharpnetPlantsBlocks1.blockID, Block.tilledField.blockID, 3).setUnlocalizedName("SharpnetCucumberSeedsItem").setTextureName(modid+":seeds/seeds_cucumber");
        GameRegistry.registerItem(SharpnetCucumberSeeds, "Cucumber Seeds");
        LanguageRegistry.addName(new ItemStack(SharpnetCucumberSeeds, 1, 0), "Cucumber Seeds");
        
        SharpnetCornSeeds = new ShItemSeeds(SharpnetCornSeedsID, SharpnetPlantsBlocks1.blockID, Block.tilledField.blockID, 6).setUnlocalizedName("SharpnetCornSeedsItem").setTextureName(modid+":seeds/seeds_corn");
        GameRegistry.registerItem(SharpnetCornSeeds, "Corn Seeds");
        LanguageRegistry.addName(new ItemStack(SharpnetCornSeeds, 1, 0), "Corn Seeds");
        
        SharpnetTomato = new ItemFood(SharpnetTomatoID, 4 , 0.5F, false ).setUnlocalizedName("SharpnetTomatoItem").setTextureName(modid+":food/tomato");
        GameRegistry.registerItem(SharpnetTomato, "Tomato");
        LanguageRegistry.addName(new ItemStack(SharpnetTomato, 1, 0), "Tomato");
        
        SharpnetCucumber = new ItemFood(SharpnetCucumberID, 4 , 0.5F, false ).setUnlocalizedName("SharpnetCucumberItem").setTextureName(modid+":food/cucumber");
        GameRegistry.registerItem(SharpnetCucumber, "Cucumber");
        LanguageRegistry.addName(new ItemStack(SharpnetCucumber, 1, 0), "Cucumber");
        
        SharpnetCorn = new ItemFood(SharpnetCornID, 4 , 0.5F, false ).setUnlocalizedName("SharpnetCornItem").setTextureName(modid+":food/corn");
        GameRegistry.registerItem(SharpnetCorn, "Corn");
        LanguageRegistry.addName(new ItemStack(SharpnetCorn, 1, 0), "Corn");
        
        SharpnetFlaxSeeds = new ShItemSeeds(SharpnetFlaxSeedsID, SharpnetPlantsBlocks1.blockID, Block.tilledField.blockID, 9).setUnlocalizedName("SharpnetFlaxSeedsItem").setTextureName(modid+":seeds/seeds_flax");
        GameRegistry.registerItem(SharpnetFlaxSeeds, "Flax Seeds");
        LanguageRegistry.addName(new ItemStack(SharpnetFlaxSeeds, 1, 0), "Flax Seeds");
        
        //Recipes register stack alliases
        ItemStack TomatoSeeds = new ItemStack(SharpnetTomatoSeeds);
        ItemStack Tomato = new ItemStack(SharpnetTomato);
        
        //Recipes
        //GameRegistry.addShapelessRecipe(new ItemStack(SharpnetTomatoSeeds, 1), new ItemStack(SharpnetTomato));
        GameRegistry.addShapelessRecipe(TomatoSeeds, Tomato);
        GameRegistry.addShapelessRecipe(new ItemStack(SharpnetCucumberSeeds, 1), new ItemStack(SharpnetCucumber));
        GameRegistry.addShapelessRecipe(new ItemStack(SharpnetCornSeeds, 1), new ItemStack(SharpnetCorn));
        
        //Events
        MinecraftForge.EVENT_BUS.register(new SharpnetBonemealEvent());
        MinecraftForge.EVENT_BUS.register(new SharpnetEvent_LivingDrops());
        
        //IC2 Recipes
        /*
        ItemStack input = new ItemStack(Item.paper, 1);
        ItemStack output = new ItemStack(Block.coalBlock, 1);
        //ItemStack output = Items.getItem("coalBlock");
        output.stackSize = 2;

        Recipes.macerator.addRecipe(new RecipeInputItemStack(input), null, output);
        */
    }
    
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        
    }
}
