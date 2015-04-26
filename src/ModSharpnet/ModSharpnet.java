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
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.block.material.MapColor;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraftforge.common.EnumHelper;

import ModSharpnet.Item.*;
import ModSharpnet.Block.*;

import ic2.api.recipe.RecipeInputItemStack;
import ic2.api.recipe.Recipes;

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
    
    public static boolean SHdebug;
    
    //public static Item 
    //public static int 
    
    //public static Block ;
    //public static int ;
    
    //Material Register
    public static EnumArmorMaterial SharpnetArmorCloth = EnumHelper.addArmorMaterial("SharpnetArmorCloth", 5, new int[] {1, 3, 2, 1}, 30);
    public static Material SharpnetRoadsBlocksMaterial = new ShMaterial(MapColor.stoneColor);
     
    // Config register
    public void initConfiguration(FMLInitializationEvent event)
    {
        Configuration config = new Configuration(new File("config/SharpnetMod_1.6.4.cfg"));
        config.load();
        Configuration config_mod_PR = new Configuration(new File("config/ProjectRed.cfg"));
        config_mod_PR.load();
        
        //Others
        SHdebug = config.get("boolean", "SHdebug", false).getBoolean(false);
        
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
        Blocks.drinks1_block_ID = config.get("Blocks", "drinks1_block", 2515).getInt();
        Blocks.food1_block_ID = config.get("Blocks", "food1_block", 2516).getInt();
        Blocks.wall_cobblestone_trowel_ID = config.get("Blocks", "wall_cobblestone_trowel", 2517).getInt();
        Blocks.wall_bricks_trowel_ID = config.get("Blocks", "wall_bricks_trowel", 2518).getInt();
        Blocks.wall_stone_slab_trowel_ID = config.get("Blocks", "wall_stone_slab_trowel", 2519).getInt();
        Blocks.SharpnetPlantsBlocks2ID =  config.get("Blocks", "SharpnetPlantsBlocks2", 2545).getInt();
        Blocks.lighting_stick_block_ID =  config.get("Blocks", "lighting_stick_block", 2546).getInt();
        Blocks.door1_block_ID = config.get("Blocks", "door1_block_", 2547).getInt();
        Blocks.door_secret1_block_ID = config.get("Blocks", "door_secret1_block", 2548).getInt();
        Blocks.door_secret2_block_ID = config.get("Blocks", "door_secret2_block", 2549).getInt();
        Blocks.door_secret3_block_ID = config.get("Blocks", "door_secret3_block", 2550).getInt();
        Blocks.door5_block_ID = config.get("Blocks", "door5_block_", 2551).getInt();
        Blocks.door6_block_ID = config.get("Blocks", "door6_block_", 2552).getInt();
        Blocks.door7_block_ID = config.get("Blocks", "door7_block_", 2553).getInt();
        Blocks.door8_block_ID = config.get("Blocks", "door8_block_", 2554).getInt();
        Blocks.door9_block_ID = config.get("Blocks", "door9_block_", 2555).getInt();
        Blocks.door10_block_ID = config.get("Blocks", "door10_block_", 2556).getInt();
        Blocks.door11_block_ID = config.get("Blocks", "door11_block_", 2557).getInt();
        Blocks.door12_block_ID = config.get("Blocks", "door12_block_", 2558).getInt();
        
        // Other Mods
        Blocks.PR_block_stonesID = config_mod_PR.get("block", "block_stonesID", 0).getInt();
        
        //Items ID (u itemů je třeba k ID načtenýmu z CFG odečítat 256 jinak dochází k desynchronizaci čísel s hrou)
        SharpnetTomatoSeedsID = (config.get("Items", "SharpnetTomatoSeeds", 6501).getInt())-256;
        SharpnetTomatoID = (config.get("Items", "SharpnetTomato", 6502).getInt())-256;
        SharpnetCucumberSeedsID = (config.get("Items", "SharpnetCucumberSeeds", 6503).getInt())-256;
        SharpnetCucumberID = (config.get("Items", "SharpnetCucumber", 6504).getInt())-256;
        SharpnetCornSeedsID = (config.get("Items", "SharpnetCornSeeds", 6505).getInt())-256;
        SharpnetCornID = (config.get("Items", "SharpnetCorn", 6506).getInt())-256;
        SharpnetFlaxSeedsID = (config.get("Items", "SharpnetFlaxSeeds", 6507).getInt())-256;
        //Items Armor
        Items.armor_formal_boots_ID = (config.get("Items", "armor_formal_boots", 6508).getInt())-256;
        Items.armor_formal_suit_ID = (config.get("Items", "armor_formal_suit", 6509).getInt())-256;
        Items.armor_formal_trousers_ID = (config.get("Items", "armor_formal_trousers", 6510).getInt())-256;
        Items.armor_jeans_black_ID = (config.get("Items", "armor_jeans_black", 6511).getInt())-256;
        Items.armor_jeans_blue_ID = (config.get("Items", "armor_jeans_blue", 6512).getInt())-256;
        Items.armor_sunglasses_ID = (config.get("Items", "armor_sunglasses", 6513).getInt())-256;
        Items.armor_trekie_suit_ID = (config.get("Items", "armor_trekie_suit", 6514).getInt())-256;
        Items.armor_trekie_trousers_ID = (config.get("Items", "armor_trekie_trousers", 6515).getInt())-256;
        Items.armor_trousers_black_ID = (config.get("Items", "armor_trousers_black", 6516).getInt())-256;
        Items.armor_tshirt_black_ID = (config.get("Items", "armor_tshirt_black", 6517).getInt())-256;
        Items.armor_tshirt_blue_ID = (config.get("Items", "armor_tshirt_blue", 6518).getInt())-256;
        Items.armor_tshirt_green_ID = (config.get("Items", "armor_tshirt_green", 6519).getInt())-256;
        Items.armor_tshirt_orange_ID = (config.get("Items", "armor_tshirt_orange", 6520).getInt())-256;
        Items.armor_tshirt_white_ID = (config.get("Items", "armor_tshirt_white", 6521).getInt())-256;
        //Items Alcohol
        Items.bottle_ID = (config.get("Items", "bottle", 6522).getInt())-256;
        Items.beer_ID = (config.get("Items", "beer", 6523).getInt())-256;
        Items.wine_ID = (config.get("Items", "wine", 6524).getInt())-256;
        Items.cofee_ID = (config.get("Items", "cofee", 6525).getInt())-256;
        Items.whiskey_ID = (config.get("Items", "whiskey", 6526).getInt())-256;
        Items.tequilla_silver_ID = (config.get("Items", "tequilla_silver", 6527).getInt())-256;
        Items.tequilla_gold_ID = (config.get("Items", "tequilla_gold", 6528).getInt())-256;
        Items.rum_ID = (config.get("Items", "rum", 6529).getInt())-256;
        Items.semtex_ID = (config.get("Items", "semtex", 6530).getInt())-256;
        Items.cup_of_tea_ID = (config.get("Items", "cup_of_tea", 6531).getInt())-256;
        Items.hot_chocolate_ID = (config.get("Items", "hot_chocolate", 6532).getInt())-256;
        Items.honey_ID = (config.get("Items", "honey", 6533).getInt())-256;
        Items.catchup_ID = (config.get("Items", "catchup", 6534).getInt())-256;
        Items.glass_of_vine_ID = (config.get("Items", "glass_of_vine", 6535).getInt())-256;
        Items.vodka_ID = (config.get("Items", "vodka", 6536).getInt())-256;
        Items.cocacola_ID = (config.get("Items", "cocacola", 6537).getInt())-256;
        Items.guttalax_ID = (config.get("Items", "guttalax", 6538).getInt())-256;
        Items.pizza_ID = (config.get("Items", "pizza", 6539).getInt())-256;
        Items.salad_ID = (config.get("Items", "salad", 6540).getInt())-256;
        Items.salad_fillet_ID = (config.get("Items", "salad_fillet", 6541).getInt())-256;
        //Items Food
        Items.mutton_raw_ID = (config.get("Items", "mutton_raw", 423).getInt())-256;
        Items.mutton_cooked_ID = (config.get("Items", "mutton_cooked", 424).getInt())-256;
        Items.tea_seeds_ID = (config.get("Items", "tea_seeds", 6544).getInt())-256;
        Items.tea_leaves_ID = (config.get("Items", "tea_leaves", 6545).getInt())-256;
        Items.cofee_beans_raw_ID = (config.get("Items", "cofee_beans_raw", 6567).getInt())-256;
        Items.cofee_beans_ID = (config.get("Items", "cofee_beans", 6568).getInt())-256;
        Items.grape_red_seeds_ID = (config.get("Items", "grape_red_seeds", 6569).getInt())-256;
        Items.grape_red_ID = (config.get("Items", "grape_red", 6570).getInt())-256;
        
        //Items Tools
        Items.trowel_ID = (config.get("Items", "trowel", 6542).getInt())-256;
        Items.stuff_of_day_ID = (config.get("Items", "stuff_of_day", 6546).getInt())-256;
        Items.stuff_of_night_ID = (config.get("Items", "stuff_of_night", 6547).getInt())-256;
        Items.stuff_of_weather_ID = (config.get("Items", "stuff_of_weather", 6548).getInt())-256;
        Items.stuff_of_death_ID = (config.get("Items", "stuff_of_death", 6549).getInt())-256;
        Items.stuff_of_warp_ID = (config.get("Items", "stuff_of_warp", 6550).getInt())-256;
        
        //Items Blocks
        Items.door1_block_item_ID = (config.get("Items", "door1_block_item", 6551).getInt())-256;
        Items.door_secret1_block_item_ID = (config.get("Items", "door_secret1_block_item", 6552).getInt())-256;
        Items.door_secret2_block_item_ID = (config.get("Items", "door_secret2_block_item", 6553).getInt())-256;
        Items.door_secret3_block_item_ID = (config.get("Items", "door_secret3_block_item", 6554).getInt())-256;
        Items.door5_block_item_ID = (config.get("Items", "door5_block_item", 6555).getInt())-256;
        Items.door6_block_item_ID = (config.get("Items", "door6_block_item", 6556).getInt())-256;
        Items.door7_block_item_ID = (config.get("Items", "door7_block_item", 6557).getInt())-256;
        Items.door8_block_item_ID = (config.get("Items", "door8_block_item", 6558).getInt())-256;
        Items.door9_block_item_ID = (config.get("Items", "door9_block_item", 6559).getInt())-256;
        Items.door10_block_item_ID = (config.get("Items", "door10_block_item", 6560).getInt())-256;
        Items.door11_block_item_ID = (config.get("Items", "door11_block_item", 6561).getInt())-256;
        Items.door12_block_item_ID = (config.get("Items", "door12_block_item", 6562).getInt())-256;
        Items.barrel_ID = (config.get("Items", "barrel", 6013).getInt())-256;
        Items.barrel_of_wine_ID = (config.get("Items", "barrel_of_wine", 6014).getInt())-256;
                
        //Items Resources
        Items.roofing_tile_ID = (config.get("Items", "roofing_tile", 6543).getInt())-256;
        
        // Other Mods
       
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
        
        SharpnetRoadsBlocks1 = new SharpnetRoadsBlocks1(SharpnetRoadsBlocks1ID, Material.rock);
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
        LanguageRegistry.addName(new ItemStack(SharpnetPlantsBlocks1, 1, 9), "Flax Plant");
        LanguageRegistry.addName(new ItemStack(SharpnetPlantsBlocks1, 1, 10), "Flax Plant");
        LanguageRegistry.addName(new ItemStack(SharpnetPlantsBlocks1, 1, 11), "Flax Plant");
        /*
        LanguageRegistry.addName(new ItemStack(SharpnetPlantsBlocks1, 1, 12), "Vine Plant");
        LanguageRegistry.addName(new ItemStack(SharpnetPlantsBlocks1, 1, 13), "Vine Plant");
        LanguageRegistry.addName(new ItemStack(SharpnetPlantsBlocks1, 1, 14), "Vine Plant");*/
        
        Blocks.SharpnetPlantsBlocks2 = new SharpnetPlantsBlocks2(Blocks.SharpnetPlantsBlocks2ID, Material.plants);
        GameRegistry.registerBlock(Blocks.SharpnetPlantsBlocks2, SharpnetPlantsItemBlocks2.class, "SharpnetPlantsBlocks2");
        LanguageRegistry.addName(new ItemStack(Blocks.SharpnetPlantsBlocks2, 1, 0), "Tea Plant");
        LanguageRegistry.addName(new ItemStack(Blocks.SharpnetPlantsBlocks2, 1, 1), "Tea Plant");
        LanguageRegistry.addName(new ItemStack(Blocks.SharpnetPlantsBlocks2, 1, 2), "Tea Plant");
        /*
        LanguageRegistry.addName(new ItemStack(Blocks.SharpnetPlantsBlocks2, 1, 3), "Cucumber Plant");
        LanguageRegistry.addName(new ItemStack(Blocks.SharpnetPlantsBlocks2, 1, 4), "Cucumber Plant");
        LanguageRegistry.addName(new ItemStack(Blocks.SharpnetPlantsBlocks2, 1, 5), "Cucumber Plant");
        LanguageRegistry.addName(new ItemStack(Blocks.SharpnetPlantsBlocks2, 1, 6), "Corn Plant");
        LanguageRegistry.addName(new ItemStack(Blocks.SharpnetPlantsBlocks2, 1, 7), "Corn Plant");
        LanguageRegistry.addName(new ItemStack(Blocks.SharpnetPlantsBlocks2, 1, 8), "Corn Plant");
        LanguageRegistry.addName(new ItemStack(Blocks.SharpnetPlantsBlocks2, 1, 9), "Flax Plant");
        LanguageRegistry.addName(new ItemStack(Blocks.SharpnetPlantsBlocks2, 1, 10), "Flax Plant");
        LanguageRegistry.addName(new ItemStack(Blocks.SharpnetPlantsBlocks2, 1, 11), "Flax Plant");
        */
        
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
               
        sharpnetFlowerBlocks1 = new SharpnetFlowerBlocks1(sharpnetFlowerBlocks1ID).setUnlocalizedName("SharpnetFlowerBlocks1").setHardness(0.0F).setResistance(0.0F).setCreativeTab(CreativeTabs.tabDecorations).setStepSound(Block.soundGrassFootstep);
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
        
        //Blocks Alcohol
        Blocks.drinks1_block = new SharpnetDrinksBlocks1(Blocks.drinks1_block_ID).setUnlocalizedName("SharpnetDrinksBlocks1");
        GameRegistry.registerBlock(Blocks.drinks1_block, SharpnetDrinksItemBlocks1.class, Blocks.drinks1_block.getUnlocalizedName());
        LanguageRegistry.addName(new ItemStack(Blocks.drinks1_block, 1, 0), "Beer");
        LanguageRegistry.addName(new ItemStack(Blocks.drinks1_block, 1, 1), "Wine");
        LanguageRegistry.addName(new ItemStack(Blocks.drinks1_block, 1, 2), "Cofee");
        LanguageRegistry.addName(new ItemStack(Blocks.drinks1_block, 1, 3), "Whiskey");
        LanguageRegistry.addName(new ItemStack(Blocks.drinks1_block, 1, 4), "Tequilla Silver");
        LanguageRegistry.addName(new ItemStack(Blocks.drinks1_block, 1, 5), "Tequilla Gold");
        LanguageRegistry.addName(new ItemStack(Blocks.drinks1_block, 1, 6), "Rum");
        LanguageRegistry.addName(new ItemStack(Blocks.drinks1_block, 1, 7), "Semtex");
        LanguageRegistry.addName(new ItemStack(Blocks.drinks1_block, 1, 8), "Cup of Tea");
        LanguageRegistry.addName(new ItemStack(Blocks.drinks1_block, 1, 9), "Hot Chocolate");
        LanguageRegistry.addName(new ItemStack(Blocks.drinks1_block, 1, 10), "Honey");
        LanguageRegistry.addName(new ItemStack(Blocks.drinks1_block, 1, 11), "Catchup");
        LanguageRegistry.addName(new ItemStack(Blocks.drinks1_block, 1, 12), "Glass of Vine");
        LanguageRegistry.addName(new ItemStack(Blocks.drinks1_block, 1, 13), "Vodka");
        LanguageRegistry.addName(new ItemStack(Blocks.drinks1_block, 1, 14), "CocaCola");
        LanguageRegistry.addName(new ItemStack(Blocks.drinks1_block, 1, 15), "Bottle");
        
        //Blocks Food
        Blocks.food1_block = new SharpnetFoodBlocks1(Blocks.food1_block_ID).setUnlocalizedName("SharpnetFoodBlocks1");
        GameRegistry.registerBlock(Blocks.food1_block, SharpnetFoodItemBlocks1.class, Blocks.food1_block.getUnlocalizedName());
        LanguageRegistry.addName(new ItemStack(Blocks.food1_block, 1, 0), "Plate - Pizza");
        LanguageRegistry.addName(new ItemStack(Blocks.food1_block, 1, 1), "Plate - Salad");
        LanguageRegistry.addName(new ItemStack(Blocks.food1_block, 1, 2), "Plate - Salad filet");
        /*
        LanguageRegistry.addName(new ItemStack(Blocks.food1_block, 1, 3), "Whiskey");
        LanguageRegistry.addName(new ItemStack(Blocks.food1_block, 1, 4), "Tequilla Silver");
        LanguageRegistry.addName(new ItemStack(Blocks.food1_block, 1, 5), "Tequilla Gold");
        LanguageRegistry.addName(new ItemStack(Blocks.food1_block, 1, 6), "Rum");
        LanguageRegistry.addName(new ItemStack(Blocks.food1_block, 1, 7), "Semtex");
        LanguageRegistry.addName(new ItemStack(Blocks.food1_block, 1, 8), "Cup of Tea");
        LanguageRegistry.addName(new ItemStack(Blocks.food1_block, 1, 9), "Hot Chocolate");
        LanguageRegistry.addName(new ItemStack(Blocks.food1_block, 1, 10), "Honey");
        LanguageRegistry.addName(new ItemStack(Blocks.food1_block, 1, 11), "Catchup");
        LanguageRegistry.addName(new ItemStack(Blocks.food1_block, 1, 12), "Glass of Vine");
        LanguageRegistry.addName(new ItemStack(Blocks.food1_block, 1, 13), "Vodka");
        LanguageRegistry.addName(new ItemStack(Blocks.food1_block, 1, 14), "CocaCola");
        LanguageRegistry.addName(new ItemStack(Blocks.food1_block, 1, 15), "Bottle");
        */
        
        Blocks.wall_cobblestone_trowel = new SharpnetWallTrowelCobblestoneBlock(Blocks.wall_cobblestone_trowel_ID, "SharpnetWallTrowelCobblestoneBlock");
        GameRegistry.registerBlock(Blocks.wall_cobblestone_trowel, SharpnetWallTrowelCobblestoneItemBlocks.class, "SharpnetWallTrowelCobblestoneBlock");
        LanguageRegistry.addName(new ItemStack(Blocks.wall_cobblestone_trowel, 1, 0), "Cobblestone Trowel Wall - White");
        LanguageRegistry.addName(new ItemStack(Blocks.wall_cobblestone_trowel, 1, 1), "Cobblestone Trowel Wall - Orange");
        LanguageRegistry.addName(new ItemStack(Blocks.wall_cobblestone_trowel, 1, 2), "Cobblestone Trowel Wall - Magenta");
        LanguageRegistry.addName(new ItemStack(Blocks.wall_cobblestone_trowel, 1, 3), "Cobblestone Trowel Wall - Light Blue");
        LanguageRegistry.addName(new ItemStack(Blocks.wall_cobblestone_trowel, 1, 4), "Cobblestone Trowel Wall - Yellow");
        LanguageRegistry.addName(new ItemStack(Blocks.wall_cobblestone_trowel, 1, 5), "Cobblestone Trowel Wall - Lime");
        LanguageRegistry.addName(new ItemStack(Blocks.wall_cobblestone_trowel, 1, 6), "Cobblestone Trowel Wall - Pink");
        LanguageRegistry.addName(new ItemStack(Blocks.wall_cobblestone_trowel, 1, 7), "Cobblestone Trowel Wall - Gray");
        LanguageRegistry.addName(new ItemStack(Blocks.wall_cobblestone_trowel, 1, 8), "Cobblestone Trowel Wall - Light Gray");
        LanguageRegistry.addName(new ItemStack(Blocks.wall_cobblestone_trowel, 1, 9), "Cobblestone Trowel Wall - Cyan");
        LanguageRegistry.addName(new ItemStack(Blocks.wall_cobblestone_trowel, 1, 10), "Cobblestone Trowel Wall - Purple");
        LanguageRegistry.addName(new ItemStack(Blocks.wall_cobblestone_trowel, 1, 11), "Cobblestone Trowel Wall - Blue");
        LanguageRegistry.addName(new ItemStack(Blocks.wall_cobblestone_trowel, 1, 12), "Cobblestone Trowel Wall - Brown");
        LanguageRegistry.addName(new ItemStack(Blocks.wall_cobblestone_trowel, 1, 13), "Cobblestone Trowel Wall - Green");
        LanguageRegistry.addName(new ItemStack(Blocks.wall_cobblestone_trowel, 1, 14), "Cobblestone Trowel Wall - Red");
        LanguageRegistry.addName(new ItemStack(Blocks.wall_cobblestone_trowel, 1, 15), "Cobblestone Trowel Wall - Black");
        
        Blocks.wall_bricks_trowel = new SharpnetWallTrowelBricksBlock(Blocks.wall_bricks_trowel_ID, "SharpnetWallTrowelBricksBlock");
        GameRegistry.registerBlock(Blocks.wall_bricks_trowel, SharpnetWallTrowelBricksItemBlocks.class, "SharpnetWallTrowelBricksBlock");
        LanguageRegistry.addName(new ItemStack(Blocks.wall_bricks_trowel, 1, 0), "Bricks Trowel Wall - White");
        LanguageRegistry.addName(new ItemStack(Blocks.wall_bricks_trowel, 1, 1), "Bricks Trowel Wall - Orange");
        LanguageRegistry.addName(new ItemStack(Blocks.wall_bricks_trowel, 1, 2), "Bricks Trowel Wall - Magenta");
        LanguageRegistry.addName(new ItemStack(Blocks.wall_bricks_trowel, 1, 3), "Bricks Trowel Wall - Light Blue");
        LanguageRegistry.addName(new ItemStack(Blocks.wall_bricks_trowel, 1, 4), "Bricks Trowel Wall - Yellow");
        LanguageRegistry.addName(new ItemStack(Blocks.wall_bricks_trowel, 1, 5), "Bricks Trowel Wall - Lime");
        LanguageRegistry.addName(new ItemStack(Blocks.wall_bricks_trowel, 1, 6), "Bricks Trowel Wall - Pink");
        LanguageRegistry.addName(new ItemStack(Blocks.wall_bricks_trowel, 1, 7), "Bricks Trowel Wall - Gray");
        LanguageRegistry.addName(new ItemStack(Blocks.wall_bricks_trowel, 1, 8), "Bricks Trowel Wall - Light Gray");
        LanguageRegistry.addName(new ItemStack(Blocks.wall_bricks_trowel, 1, 9), "Bricks Trowel Wall - Cyan");
        LanguageRegistry.addName(new ItemStack(Blocks.wall_bricks_trowel, 1, 10), "Bricks Trowel Wall - Purple");
        LanguageRegistry.addName(new ItemStack(Blocks.wall_bricks_trowel, 1, 11), "Bricks Trowel Wall - Blue");
        LanguageRegistry.addName(new ItemStack(Blocks.wall_bricks_trowel, 1, 12), "Bricks Trowel Wall - Brown");
        LanguageRegistry.addName(new ItemStack(Blocks.wall_bricks_trowel, 1, 13), "Bricks Trowel Wall - Green");
        LanguageRegistry.addName(new ItemStack(Blocks.wall_bricks_trowel, 1, 14), "Bricks Trowel Wall - Red");
        LanguageRegistry.addName(new ItemStack(Blocks.wall_bricks_trowel, 1, 15), "Bricks Trowel Wall - Black");
        
        Blocks.wall_stone_slab_trowel = new SharpnetWallTrowelStoneSlabBlock(Blocks.wall_stone_slab_trowel_ID, "SharpnetWallTrowelStoneSlabBlock");
        GameRegistry.registerBlock(Blocks.wall_stone_slab_trowel, SharpnetWallTrowelStoneSlabItemBlocks.class, "SharpnetWallTrowelStoneSlabBlock");
        LanguageRegistry.addName(new ItemStack(Blocks.wall_stone_slab_trowel, 1, 0), "Stone Slab Trowel Wall - White");
        LanguageRegistry.addName(new ItemStack(Blocks.wall_stone_slab_trowel, 1, 1), "Stone Slab Trowel Wall - Orange");
        LanguageRegistry.addName(new ItemStack(Blocks.wall_stone_slab_trowel, 1, 2), "Stone Slab Trowel Wall - Magenta");
        LanguageRegistry.addName(new ItemStack(Blocks.wall_stone_slab_trowel, 1, 3), "Stone Slab Trowel Wall - Light Blue");
        LanguageRegistry.addName(new ItemStack(Blocks.wall_stone_slab_trowel, 1, 4), "Stone Slab Trowel Wall - Yellow");
        LanguageRegistry.addName(new ItemStack(Blocks.wall_stone_slab_trowel, 1, 5), "Stone Slab Trowel Wall - Lime");
        LanguageRegistry.addName(new ItemStack(Blocks.wall_stone_slab_trowel, 1, 6), "Stone Slab Trowel Wall - Pink");
        LanguageRegistry.addName(new ItemStack(Blocks.wall_stone_slab_trowel, 1, 7), "Stone Slab Trowel Wall - Gray");
        LanguageRegistry.addName(new ItemStack(Blocks.wall_stone_slab_trowel, 1, 8), "Stone Slab Trowel Wall - Light Gray");
        LanguageRegistry.addName(new ItemStack(Blocks.wall_stone_slab_trowel, 1, 9), "Stone Slab Trowel Wall - Cyan");
        LanguageRegistry.addName(new ItemStack(Blocks.wall_stone_slab_trowel, 1, 10), "Stone Slab Trowel Wall - Purple");
        LanguageRegistry.addName(new ItemStack(Blocks.wall_stone_slab_trowel, 1, 11), "Stone Slab Trowel Wall - Blue");
        LanguageRegistry.addName(new ItemStack(Blocks.wall_stone_slab_trowel, 1, 12), "Stone Slab Trowel Wall - Brown");
        LanguageRegistry.addName(new ItemStack(Blocks.wall_stone_slab_trowel, 1, 13), "Stone Slab Trowel Wall - Green");
        LanguageRegistry.addName(new ItemStack(Blocks.wall_stone_slab_trowel, 1, 14), "Stone Slab Trowel Wall - Red");
        LanguageRegistry.addName(new ItemStack(Blocks.wall_stone_slab_trowel, 1, 15), "Stone Slab Trowel Wall - Black");
        
        Blocks.lighting_stick_block = new SharpnetLightingStickBlock1(Blocks.lighting_stick_block_ID);
        GameRegistry.registerBlock(Blocks.lighting_stick_block, "SharpnetLightingStickBlock1");
        LanguageRegistry.addName(new ItemStack(Blocks.lighting_stick_block, 1, 0), "Lighting Stick");
        
        //Blocks Door
        Blocks.door1_block = new SharpnetDoors1Block(Blocks.door1_block_ID, Material.wood,Items.door1_block_item_ID+256,1).setUnlocalizedName("SharpnetDoors1Block1");
        Items.door1_block_item = new SharpnetDoors1ItemBlock(Items.door1_block_item_ID, Blocks.door1_block,1).setUnlocalizedName("SharpnetDoors1ItemBlock1");
        GameRegistry.registerBlock(Blocks.door1_block, "SharpnetDoors1Block1");
        LanguageRegistry.addName(new ItemStack(Blocks.door1_block, 1, 0), "Door 1 Block");
        GameRegistry.registerItem(Items.door1_block_item, "SharpnetDoors1Item1");
        LanguageRegistry.addName(new ItemStack(Items.door1_block_item, 1, 0), "Door 1");
        
        Blocks.door_secret1_block = new SharpnetDoors1Block(Blocks.door_secret1_block_ID, Material.wood,Items.door_secret1_block_item_ID+256,2).setUnlocalizedName("SharpnetDoors1Block2");
        Items.door_secret1_block_item = new SharpnetDoors1ItemBlock(Items.door_secret1_block_item_ID, Blocks.door_secret1_block,2).setUnlocalizedName("SharpnetDoors1ItemBlock2");
        GameRegistry.registerBlock(Blocks.door_secret1_block, "SharpnetDoors1Block2");
        LanguageRegistry.addName(new ItemStack(Blocks.door_secret1_block, 1, 0), "Secret Door 1 Block");
        GameRegistry.registerItem(Items.door_secret1_block_item, "SharpnetDoors1Item2");
        LanguageRegistry.addName(new ItemStack(Items.door_secret1_block_item, 1, 0), "Secret Door Bookshelf");
        
        Blocks.door_secret2_block = new SharpnetDoors1Block(Blocks.door_secret2_block_ID, Material.wood,Items.door_secret2_block_item_ID+256,3).setUnlocalizedName("SharpnetDoors1Block3");
        Items.door_secret2_block_item = new SharpnetDoors1ItemBlock(Items.door_secret2_block_item_ID, Blocks.door_secret2_block,3).setUnlocalizedName("SharpnetDoors1ItemBlock3");
        GameRegistry.registerBlock(Blocks.door_secret2_block, "SharpnetDoors1Block3");
        LanguageRegistry.addName(new ItemStack(Blocks.door_secret2_block, 1, 0), "Secret Door 2 Block");
        GameRegistry.registerItem(Items.door_secret2_block_item, "SharpnetDoors1Item3");
        LanguageRegistry.addName(new ItemStack(Items.door_secret2_block_item, 1, 0), "Secret Door Mossy");
        
        Blocks.door_secret3_block = new SharpnetDoors1Block(Blocks.door_secret3_block_ID, Material.wood,Items.door_secret3_block_item_ID+256,4).setUnlocalizedName("SharpnetDoors1Block4");
        Items.door_secret3_block_item = new SharpnetDoors1ItemBlock(Items.door_secret3_block_item_ID, Blocks.door_secret3_block,4).setUnlocalizedName("SharpnetDoors1ItemBlock4");
        GameRegistry.registerBlock(Blocks.door_secret3_block, "SharpnetDoors1Block4");
        LanguageRegistry.addName(new ItemStack(Blocks.door_secret3_block, 1, 0), "Secret Door 3 Block");
        GameRegistry.registerItem(Items.door_secret3_block_item, "SharpnetDoors1Item4");
        LanguageRegistry.addName(new ItemStack(Items.door_secret3_block_item, 1, 0), "Secret Door Cobblestone");
        
        Blocks.door5_block = new SharpnetDoors1Block(Blocks.door5_block_ID, Material.wood,Items.door5_block_item_ID+256,5).setUnlocalizedName("SharpnetDoors1Block5");
        Items.door5_block_item = new SharpnetDoors1ItemBlock(Items.door5_block_item_ID, Blocks.door5_block,5).setUnlocalizedName("SharpnetDoors1ItemBlock5");
        GameRegistry.registerBlock(Blocks.door5_block, "SharpnetDoors1Block5");
        LanguageRegistry.addName(new ItemStack(Blocks.door5_block, 1, 0), "Door 5 Block");
        GameRegistry.registerItem(Items.door5_block_item, "SharpnetDoors1Item5");
        LanguageRegistry.addName(new ItemStack(Items.door5_block_item, 1, 0), "Door 5");
        
        Blocks.door6_block = new SharpnetDoors1Block(Blocks.door6_block_ID, Material.wood,Items.door6_block_item_ID+256,6).setUnlocalizedName("SharpnetDoors1Block6");
        Items.door6_block_item = new SharpnetDoors1ItemBlock(Items.door6_block_item_ID, Blocks.door6_block,6).setUnlocalizedName("SharpnetDoors1ItemBlock6");
        GameRegistry.registerBlock(Blocks.door6_block, "SharpnetDoors1Block6");
        LanguageRegistry.addName(new ItemStack(Blocks.door6_block, 1, 0), "Door 6 Block");
        GameRegistry.registerItem(Items.door6_block_item, "SharpnetDoors1Item6");
        LanguageRegistry.addName(new ItemStack(Items.door6_block_item, 1, 0), "Door 6");
        
        Blocks.door7_block = new SharpnetDoors1Block(Blocks.door7_block_ID, Material.wood,Items.door7_block_item_ID+256,7).setUnlocalizedName("SharpnetDoors1Block7");
        Items.door7_block_item = new SharpnetDoors1ItemBlock(Items.door7_block_item_ID, Blocks.door7_block,7).setUnlocalizedName("SharpnetDoors1ItemBlock7");
        GameRegistry.registerBlock(Blocks.door7_block, "SharpnetDoors1Block7");
        LanguageRegistry.addName(new ItemStack(Blocks.door7_block, 1, 0), "Door 7 Block");
        GameRegistry.registerItem(Items.door7_block_item, "SharpnetDoors1Item7");
        LanguageRegistry.addName(new ItemStack(Items.door7_block_item, 1, 0), "Door 7");
        
        Blocks.door8_block = new SharpnetDoors1Block(Blocks.door8_block_ID, Material.wood,Items.door8_block_item_ID+256,8).setUnlocalizedName("SharpnetDoors1Block8");
        Items.door8_block_item = new SharpnetDoors1ItemBlock(Items.door8_block_item_ID, Blocks.door8_block,8).setUnlocalizedName("SharpnetDoors1ItemBlock8");
        GameRegistry.registerBlock(Blocks.door8_block, "SharpnetDoors1Block8");
        LanguageRegistry.addName(new ItemStack(Blocks.door8_block, 1, 0), "Door 8 Block");
        GameRegistry.registerItem(Items.door8_block_item, "SharpnetDoors1Item8");
        LanguageRegistry.addName(new ItemStack(Items.door8_block_item, 1, 0), "Door 8");
        
        Blocks.door9_block = new SharpnetDoors1Block(Blocks.door9_block_ID, Material.wood,Items.door9_block_item_ID+256,9).setUnlocalizedName("SharpnetDoors1Block9");
        Items.door9_block_item = new SharpnetDoors1ItemBlock(Items.door9_block_item_ID, Blocks.door9_block,9).setUnlocalizedName("SharpnetDoors1ItemBlock9");
        GameRegistry.registerBlock(Blocks.door9_block, "SharpnetDoors1Block9");
        LanguageRegistry.addName(new ItemStack(Blocks.door9_block, 1, 0), "Door 9 Block");
        GameRegistry.registerItem(Items.door9_block_item, "SharpnetDoors1Item9");
        LanguageRegistry.addName(new ItemStack(Items.door9_block_item, 1, 0), "Door 9");
        
        Blocks.door10_block = new SharpnetDoors1Block(Blocks.door10_block_ID, Material.wood,Items.door10_block_item_ID+256,10).setUnlocalizedName("SharpnetDoors1Block10");
        Items.door10_block_item = new SharpnetDoors1ItemBlock(Items.door10_block_item_ID, Blocks.door10_block,10).setUnlocalizedName("SharpnetDoors1ItemBlock10");
        GameRegistry.registerBlock(Blocks.door10_block, "SharpnetDoors1Block10");
        LanguageRegistry.addName(new ItemStack(Blocks.door10_block, 1, 0), "Door 10 Block");
        GameRegistry.registerItem(Items.door10_block_item, "SharpnetDoors1Item10");
        LanguageRegistry.addName(new ItemStack(Items.door10_block_item, 1, 0), "Door 10");
        
        Blocks.door11_block = new SharpnetDoors1Block(Blocks.door11_block_ID, Material.wood,Items.door11_block_item_ID+256,11).setUnlocalizedName("SharpnetDoors1Block11");
        Items.door11_block_item = new SharpnetDoors1ItemBlock(Items.door11_block_item_ID, Blocks.door11_block,11).setUnlocalizedName("SharpnetDoors1ItemBlock11");
        GameRegistry.registerBlock(Blocks.door11_block, "SharpnetDoors1Block11");
        LanguageRegistry.addName(new ItemStack(Blocks.door11_block, 1, 0), "Door 11 Block");
        GameRegistry.registerItem(Items.door11_block_item, "SharpnetDoors1Item11");
        LanguageRegistry.addName(new ItemStack(Items.door11_block_item, 1, 0), "Door 11");
        
        Blocks.door12_block = new SharpnetDoors1Block(Blocks.door12_block_ID, Material.wood,Items.door12_block_item_ID+256,12).setUnlocalizedName("SharpnetDoors1Block12");
        Items.door12_block_item = new SharpnetDoors1ItemBlock(Items.door12_block_item_ID, Blocks.door12_block,12).setUnlocalizedName("SharpnetDoors1ItemBlock12");
        GameRegistry.registerBlock(Blocks.door12_block, "SharpnetDoors1Block12");
        LanguageRegistry.addName(new ItemStack(Blocks.door12_block, 1, 0), "Door 12 Block");
        GameRegistry.registerItem(Items.door12_block_item, "SharpnetDoors1Item12");
        LanguageRegistry.addName(new ItemStack(Items.door12_block_item, 1, 0), "Door 12");
        
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
        
        Items.guttalax = new ShItemFood(Items.guttalax_ID, -18 , 0.0F, false ).setUnlocalizedName("Guttalax").setTextureName(modid+":food/guttalax");
        GameRegistry.registerItem(Items.guttalax, "Guttalax");
        LanguageRegistry.addName(new ItemStack(Items.guttalax, 1, 0), "Guttalax");
        
        Items.mutton_raw = (new ItemFood(Items.mutton_raw_ID, 2 , 0.3F, true).setUnlocalizedName("Mutton_Raw").setTextureName(modid+":food/mutton_raw"));
        GameRegistry.registerItem(Items.mutton_raw, "Mutton Raw");
        LanguageRegistry.addName(new ItemStack(Items.mutton_raw, 1, 0), "Mutton Raw");
        
        //Place holder Mutton
        Items.mutton_cooked = new ItemFood(Items.mutton_cooked_ID, 6 , 0.6F, true ).setUnlocalizedName("mutton_cooked").setTextureName(modid+":food/mutton_cooked");
        GameRegistry.registerItem(Items.mutton_cooked, "Mutton Cooked");
        LanguageRegistry.addName(new ItemStack(Items.mutton_cooked, 1, 0), "Mutton Cooked");
        
        Items.tea_seeds = new ShItemSeeds(Items.tea_seeds_ID, Blocks.SharpnetPlantsBlocks2.blockID, Block.tilledField.blockID, 0).setUnlocalizedName("SharpnetTeaSeedsItem").setTextureName(modid+":seeds/seeds_tea");
        GameRegistry.registerItem(Items.tea_seeds, "Tea Seeds");
        LanguageRegistry.addName(new ItemStack(Items.tea_seeds, 1, 0), "Tea Seeds");
        
        Items.tea_leaves = (new Item(Items.tea_leaves_ID).setUnlocalizedName("Tea_Leaves").setTextureName(modid+":food/tea_leaves").setCreativeTab(CreativeTabs.tabFood));
        GameRegistry.registerItem(Items.tea_leaves, "Tea Leaves");
        LanguageRegistry.addName(new ItemStack(Items.tea_leaves, 1, 0), "Tea Leaves");
        
        Items.cofee_beans_raw = new ShItemSeeds(Items.cofee_beans_raw_ID, Blocks.SharpnetPlantsBlocks2.blockID, Block.tilledField.blockID, 3).setUnlocalizedName("SharpnetCofeeSeedsItem").setTextureName(modid+":seeds/seeds_cofee");
        GameRegistry.registerItem(Items.cofee_beans_raw, "Cofee Beans Raw");
        LanguageRegistry.addName(new ItemStack(Items.cofee_beans_raw, 1, 0), "Cofee Beans Raw");
        
        Items.cofee_beans = (new Item(Items.cofee_beans_ID).setUnlocalizedName("Cofee_Beans").setTextureName(modid+":food/cofee_beans").setCreativeTab(CreativeTabs.tabFood));
        GameRegistry.registerItem(Items.cofee_beans, "Cofee Beans");
        LanguageRegistry.addName(new ItemStack(Items.cofee_beans, 1, 0), "Cofee Beans");
        
        Items.grape_red_seeds = new ShItemSeeds(Items.grape_red_seeds_ID, SharpnetPlantsBlocks1.blockID, Block.tilledField.blockID, 12).setUnlocalizedName("SharpnetGrapeRedSeedsItem").setTextureName(modid+":seeds/seeds_grape_red");
        GameRegistry.registerItem(Items.grape_red_seeds, "Grape Red Seeds");
        LanguageRegistry.addName(new ItemStack(Items.grape_red_seeds, 1, 0), "Grape Red Seeds");
        
        Items.grape_red = new ItemFood(Items.grape_red_ID, 2 , 0.2F, false ).setUnlocalizedName("grape_red").setTextureName(modid+":food/grape_red");
        GameRegistry.registerItem(Items.grape_red, "Grape Red");
        LanguageRegistry.addName(new ItemStack(Items.grape_red, 1, 0), "Grape Red");
        
        //Item Alcohol
        Items.beer = new ShItemFoodPlacer1(Items.beer_ID, 4, 2.0F, false, Blocks.drinks1_block.blockID, 0, 2, 20).setUnlocalizedName("Beer").setTextureName(modid+":drinks&food/beer");
        GameRegistry.registerItem(Items.beer, "Beer");
        LanguageRegistry.addName(new ItemStack(Items.beer, 1, 0), "Beer");
        
        Items.wine = new ShItemFoodPlacer1(Items.wine_ID, 10, 3.0F, false, Blocks.drinks1_block.blockID, 1, 2, 60).setUnlocalizedName("Wine").setTextureName(modid+":drinks&food/wine");
        GameRegistry.registerItem(Items.wine, "Wine");
        LanguageRegistry.addName(new ItemStack(Items.wine, 1, 0), "Wine");
        
        Items.cofee = new ShItemFoodPlacer1(Items.cofee_ID, 3, 0.5F, false, Blocks.drinks1_block.blockID, 2, 1, 40).setUnlocalizedName("Cofee").setTextureName(modid+":drinks&food/cofee");
        GameRegistry.registerItem(Items.cofee, "Cofee");
        LanguageRegistry.addName(new ItemStack(Items.cofee, 1, 0), "Cofee");
        
        Items.whiskey = new ShItemFoodPlacer1(Items.whiskey_ID, 10, 3.0F, false, Blocks.drinks1_block.blockID, 3, 2, 60).setUnlocalizedName("Whiskey").setTextureName(modid+":drinks&food/whiskey");
        GameRegistry.registerItem(Items.whiskey, "Whiskey");
        LanguageRegistry.addName(new ItemStack(Items.whiskey, 1, 0), "Whiskey");
        
        Items.tequilla_silver = new ShItemFoodPlacer1(Items.tequilla_silver_ID, 6, 1.0F, false, Blocks.drinks1_block.blockID, 4, 2, 60).setUnlocalizedName("Tequilla_silver").setTextureName(modid+":drinks&food/tequilla_s");
        GameRegistry.registerItem(Items.tequilla_silver, "Tequilla Silver");
        LanguageRegistry.addName(new ItemStack(Items.tequilla_silver, 1, 0), "Tequilla Silver");
        
        Items.tequilla_gold = new ShItemFoodPlacer1(Items.tequilla_gold_ID, 8, 1.2F, false, Blocks.drinks1_block.blockID, 5, 2, 60).setUnlocalizedName("Tequilla_gold").setTextureName(modid+":drinks&food/tequilla_g");
        GameRegistry.registerItem(Items.tequilla_silver, "Tequilla Gold");
        LanguageRegistry.addName(new ItemStack(Items.tequilla_silver, 1, 0), "Tequilla Gold");
        
        Items.rum = new ShItemFoodPlacer1(Items.rum_ID, 5, 1.0F, false, Blocks.drinks1_block.blockID, 6, 2, 50).setUnlocalizedName("Rum").setTextureName(modid+":drinks&food/rum");
        GameRegistry.registerItem(Items.rum, "Rum");
        LanguageRegistry.addName(new ItemStack(Items.rum, 1, 0), "Rum");
        
        Items.semtex = new ShItemFoodPlacer1(Items.semtex_ID, 2, 0.5F, false, Blocks.drinks1_block.blockID, 7, 1, 60).setUnlocalizedName("Semtex").setTextureName(modid+":drinks&food/semtex");
        GameRegistry.registerItem(Items.semtex, "Semtex");
        LanguageRegistry.addName(new ItemStack(Items.semtex, 1, 0), "Semtex");
        
        Items.cup_of_tea = new ShItemFoodPlacer1(Items.cup_of_tea_ID, 3, 0.5F, false, Blocks.drinks1_block.blockID, 8, 0, 0).setUnlocalizedName("Cup_of_tea").setTextureName(modid+":drinks&food/tea_cup");
        GameRegistry.registerItem(Items.cup_of_tea, "Cup of Tea");
        LanguageRegistry.addName(new ItemStack(Items.cup_of_tea, 1, 0), "Cup of Tea");
        
        Items.hot_chocolate = new ShItemFoodPlacer1(Items.hot_chocolate_ID, 4, 0.8F, false, Blocks.drinks1_block.blockID, 9, 0, 0).setUnlocalizedName("Hot_chocolate").setTextureName(modid+":drinks&food/chocolate_hot");
        GameRegistry.registerItem(Items.hot_chocolate, "Hot Chocolate");
        LanguageRegistry.addName(new ItemStack(Items.hot_chocolate, 1, 0), "Hot Chocolate");
        
        Items.honey = new ShItemFoodPlacer1(Items.honey_ID, 3, 0.8F, false, Blocks.drinks1_block.blockID, 10, 0, 0).setUnlocalizedName("Honey").setTextureName(modid+":drinks&food/honey");
        GameRegistry.registerItem(Items.honey, "Honey");
        LanguageRegistry.addName(new ItemStack(Items.honey, 1, 0), "Honey");
        
        Items.catchup = new ShItemFoodPlacer1(Items.catchup_ID, 6, 1.0F, false, Blocks.drinks1_block.blockID, 11, 0, 0).setUnlocalizedName("Catchup").setTextureName(modid+":drinks&food/catchup");
        GameRegistry.registerItem(Items.catchup, "Catchup");
        LanguageRegistry.addName(new ItemStack(Items.catchup, 1, 0), "Catchup");
        
        Items.glass_of_vine = new ShItemFoodPlacer1(Items.glass_of_vine_ID, 2, 0.8F, false, Blocks.drinks1_block.blockID, 12, 2, 15).setUnlocalizedName("Glass_of_vine").setTextureName(modid+":drinks&food/glass_of_vine");
        GameRegistry.registerItem(Items.glass_of_vine, "Glass of vine");
        LanguageRegistry.addName(new ItemStack(Items.glass_of_vine, 1, 0), "Glass of vine");
        
        Items.vodka = new ShItemFoodPlacer1(Items.vodka_ID, 6, 1.0F, false, Blocks.drinks1_block.blockID, 13, 2, 5).setUnlocalizedName("Vodka").setTextureName(modid+":drinks&food/vodka");
        GameRegistry.registerItem(Items.vodka, "Vodka");
        LanguageRegistry.addName(new ItemStack(Items.vodka, 1, 0), "Vodka");
        
        Items.cocacola = new ShItemFoodPlacer1(Items.cocacola_ID, 6, 0.8F, false, Blocks.drinks1_block.blockID, 14, 1, 20).setUnlocalizedName("Cocacola").setTextureName(modid+":drinks&food/cocacola");
        GameRegistry.registerItem(Items.cocacola, "Cocacola");
        LanguageRegistry.addName(new ItemStack(Items.cocacola, 1, 0), "Cocacola");
        
        Items.bottle = new ShItemPlacer(Items.bottle_ID, Blocks.drinks1_block.blockID, 15).setUnlocalizedName("Bottle_Empty").setTextureName(modid+":drinks&food/bottle");
        GameRegistry.registerItem(Items.bottle, "Bottle Empty");
        LanguageRegistry.addName(new ItemStack(Items.bottle, 1, 0), "Bottle Empty");
        
        Items.pizza = new ShItemFoodPlacer1(Items.pizza_ID, 20, 3.0F, false, Blocks.food1_block.blockID, 0, 0, 0).setUnlocalizedName("Pizza").setTextureName(modid+":drinks&food/pizza2");
        GameRegistry.registerItem(Items.pizza, "Pizza");
        LanguageRegistry.addName(new ItemStack(Items.pizza, 1, 0), "Pizza");
        
        Items.salad = new ShItemFoodPlacer1(Items.salad_ID, 6, 0.8F, false, Blocks.food1_block.blockID, 1, 0, 0).setUnlocalizedName("Salad").setTextureName(modid+":drinks&food/potato_salad");
        GameRegistry.registerItem(Items.salad, "Salad");
        LanguageRegistry.addName(new ItemStack(Items.salad, 1, 0), "Salad");
        
        Items.salad_fillet = new ShItemFoodPlacer1(Items.salad_fillet_ID, 14, 0.8F, false, Blocks.food1_block.blockID, 2, 0, 0).setUnlocalizedName("salad_fillet").setTextureName(modid+":drinks&food/salad_fillet");
        GameRegistry.registerItem(Items.salad_fillet, "Salad + Fillet");
        LanguageRegistry.addName(new ItemStack(Items.salad_fillet, 1, 0), "Salad + Fillet");
             
        //Armors
        
        Items.armor_formal_boots = (new SharpnetArmor(Items.armor_formal_boots_ID, SharpnetArmorCloth, 0, 3, 10, "formal", "armor/boots").setUnlocalizedName("boots_formal"));
        GameRegistry.registerItem(Items.armor_formal_boots, "Formal Boots");
        LanguageRegistry.addName(new ItemStack(Items.armor_formal_boots, 1, 0), "Formal Boots");
        
        Items.armor_formal_suit = (new SharpnetArmor(Items.armor_formal_suit_ID, SharpnetArmorCloth, 0, 1, 10, "formal", "armor/t-shirt_formal").setUnlocalizedName("t-shirt_formal"));
        GameRegistry.registerItem(Items.armor_formal_suit, "Formal Suit");
        LanguageRegistry.addName(new ItemStack(Items.armor_formal_suit, 1, 0), "Formal Suit");
        
        Items.armor_formal_trousers = (new SharpnetArmor(Items.armor_formal_trousers_ID, SharpnetArmorCloth, 0, 2, 10, "formal", "armor/trousers_formal").setUnlocalizedName("trousers_formal"));
        GameRegistry.registerItem(Items.armor_formal_trousers, "Formal Trousers");
        LanguageRegistry.addName(new ItemStack(Items.armor_formal_trousers, 1, 0), "Formal Trousers");
        
        Items.armor_jeans_black = (new SharpnetArmor(Items.armor_jeans_black_ID, SharpnetArmorCloth, 0, 2, 10, "jeans_black", "armor/jeans_black").setUnlocalizedName("jeans_black"));
        GameRegistry.registerItem(Items.armor_jeans_black, "Jeans Black");
        LanguageRegistry.addName(new ItemStack(Items.armor_jeans_black, 1, 0), "Jeans Black");
        
        Items.armor_jeans_blue = (new SharpnetArmor(Items.armor_jeans_blue_ID, SharpnetArmorCloth, 0, 2, 10, "jeans_blue", "armor/jeans_blue").setUnlocalizedName("jeans_blue"));
        GameRegistry.registerItem(Items.armor_jeans_blue, "Jeans Blue");
        LanguageRegistry.addName(new ItemStack(Items.armor_jeans_blue, 1, 0), "Jeans Blue");
        
        Items.armor_trousers_black = (new SharpnetArmor(Items.armor_trousers_black_ID, SharpnetArmorCloth, 0, 2, 10, "trousers_black", "armor/trousers_black").setUnlocalizedName("trousers_black"));
        GameRegistry.registerItem(Items.armor_trousers_black, "Trousers Black");
        LanguageRegistry.addName(new ItemStack(Items.armor_trousers_black, 1, 0), "Trousers Black");
        
        Items.armor_trekie_trousers = (new SharpnetArmor(Items.armor_trekie_trousers_ID, SharpnetArmorCloth, 0, 2, 10, "trekie", "armor/trousers_trekie").setUnlocalizedName("trousers_trekie"));
        GameRegistry.registerItem(Items.armor_trekie_trousers, "Trekie Trousers");
        LanguageRegistry.addName(new ItemStack(Items.armor_trekie_trousers, 1, 0), "Trekie Trousers");
        
        Items.armor_trekie_suit = (new SharpnetArmor(Items.armor_trekie_suit_ID, SharpnetArmorCloth, 0, 1, 10, "trekie", "armor/t-shirt_trekie").setUnlocalizedName("t-shirt_trekie"));
        GameRegistry.registerItem(Items.armor_trekie_suit, "Trekie Suit");
        LanguageRegistry.addName(new ItemStack(Items.armor_trekie_suit, 1, 0), "Trekie Suit");
        
        Items.armor_tshirt_black = (new SharpnetArmor(Items.armor_tshirt_black_ID, SharpnetArmorCloth, 0, 1, 10, "tshirt_black", "armor/t-shirt_black").setUnlocalizedName("t-shirt_black"));
        GameRegistry.registerItem(Items.armor_tshirt_black, "T-Shirt Black");
        LanguageRegistry.addName(new ItemStack(Items.armor_tshirt_black, 1, 0), "T-Shirt Black");
        
        Items.armor_tshirt_blue = (new SharpnetArmor(Items.armor_tshirt_blue_ID, SharpnetArmorCloth, 0, 1, 10, "tshirt_blue", "armor/t-shirt_blue").setUnlocalizedName("t-shirt_blue"));
        GameRegistry.registerItem(Items.armor_tshirt_blue, "T-Shirt Blue");
        LanguageRegistry.addName(new ItemStack(Items.armor_tshirt_blue, 1, 0), "T-Shirt Blue");
        
        Items.armor_tshirt_green = (new SharpnetArmor(Items.armor_tshirt_green_ID, SharpnetArmorCloth, 0, 1, 10, "tshirt_green", "armor/t-shirt_green").setUnlocalizedName("t-shirt_green"));
        GameRegistry.registerItem(Items.armor_tshirt_green, "T-Shirt Green");
        LanguageRegistry.addName(new ItemStack(Items.armor_tshirt_green, 1, 0), "T-Shirt Green");
        
        Items.armor_tshirt_orange = (new SharpnetArmor(Items.armor_tshirt_orange_ID, SharpnetArmorCloth, 0, 1, 10, "tshirt_orange", "armor/t-shirt_orange").setUnlocalizedName("t-shirt_orange"));
        GameRegistry.registerItem(Items.armor_tshirt_orange, "T-Shirt Orange");
        LanguageRegistry.addName(new ItemStack(Items.armor_tshirt_orange, 1, 0), "T-Shirt Orange");
        
        Items.armor_tshirt_white = (new SharpnetArmor(Items.armor_tshirt_white_ID, SharpnetArmorCloth, 0, 1, 10, "tshirt_white", "armor/t-shirt_white").setUnlocalizedName("t-shirt_white"));
        GameRegistry.registerItem(Items.armor_tshirt_white, "T-Shirt White");
        LanguageRegistry.addName(new ItemStack(Items.armor_tshirt_white, 1, 0), "T-Shirt White");
        
        Items.armor_sunglasses = (new SharpnetArmor(Items.armor_sunglasses_ID, SharpnetArmorCloth, 0, 0, 10, "formal", "armor/sun_glass").setUnlocalizedName("sun_glass"));
        GameRegistry.registerItem(Items.armor_sunglasses, "Sunglasses");
        LanguageRegistry.addName(new ItemStack(Items.armor_sunglasses, 1, 0), "Sunglasses");
        
        //Tools
        Items.trowel = (new SharpnetThrowel(Items.trowel_ID).setUnlocalizedName("Throwel"));
        GameRegistry.registerItem(Items.trowel, "Throwel");
        LanguageRegistry.addName(new ItemStack(Items.trowel, 1, 0), "Throwel");
        
        Items.stuff_of_day = (new SharpnetStuffs1(Items.stuff_of_day_ID, 3, 16).setUnlocalizedName("stuff_of_day").setTextureName(modid+":tools/stuff"));
        GameRegistry.registerItem(Items.stuff_of_day, "Stuff of Day");
        LanguageRegistry.addName(new ItemStack(Items.stuff_of_day, 1, 0), "Stuff of Day");
        
        Items.stuff_of_night = (new SharpnetStuffs1(Items.stuff_of_night_ID, 4, 16).setUnlocalizedName("stuff_of_night").setTextureName(modid+":tools/stuff"));
        GameRegistry.registerItem(Items.stuff_of_night, "Stuff of Night");
        LanguageRegistry.addName(new ItemStack(Items.stuff_of_night, 1, 0), "Stuff of Night");
        
        Items.stuff_of_weather = (new SharpnetStuffs1(Items.stuff_of_weather_ID, 1, 16).setUnlocalizedName("stuff_of_weather").setTextureName(modid+":tools/stuff"));
        GameRegistry.registerItem(Items.stuff_of_weather, "Stuff of Weather");
        LanguageRegistry.addName(new ItemStack(Items.stuff_of_weather, 1, 0), "Stuff of Weather");
        
        Items.stuff_of_death = (new SharpnetStuffs1(Items.stuff_of_death_ID, 5, 16).setUnlocalizedName("stuff_of_death").setTextureName(modid+":tools/stuff"));
        GameRegistry.registerItem(Items.stuff_of_death, "Stuff of Death");
        LanguageRegistry.addName(new ItemStack(Items.stuff_of_death, 1, 0), "Stuff of Death");
        
        Items.stuff_of_warp = (new SharpnetStuffs1(Items.stuff_of_warp_ID, 6, 16).setUnlocalizedName("stuff_of_warp").setTextureName(modid+":tools/stuff"));
        GameRegistry.registerItem(Items.stuff_of_warp, "Stuff of Warp");
        LanguageRegistry.addName(new ItemStack(Items.stuff_of_warp, 1, 0), "Stuff of Warp");
        
        //Resources
        Items.roofing_tile = (new Item(Items.roofing_tile_ID).setUnlocalizedName("Roofing_tile").setTextureName(modid+":resources/roofing_tile").setCreativeTab(CreativeTabs.tabMaterials));
        GameRegistry.registerItem(Items.roofing_tile, "Roofing Tile");
        LanguageRegistry.addName(new ItemStack(Items.roofing_tile, 1, 0), "Roofing Tile");
         
        //Recipes register stack alliases
        ItemStack TomatoSeeds = new ItemStack(SharpnetTomatoSeeds);
        ItemStack Tomato = new ItemStack(SharpnetTomato);
        
        //Recipes
        //GameRegistry.addShapelessRecipe(new ItemStack(SharpnetTomatoSeeds, 1), new ItemStack(SharpnetTomato));
        GameRegistry.addShapelessRecipe(TomatoSeeds, Tomato);
        GameRegistry.addShapelessRecipe(new ItemStack(SharpnetCucumberSeeds, 1), new ItemStack(SharpnetCucumber));
        GameRegistry.addShapelessRecipe(new ItemStack(SharpnetCornSeeds, 1), new ItemStack(SharpnetCorn));
        GameRegistry.addShapelessRecipe(new ItemStack(Items.grape_red_seeds, 1), new ItemStack(Items.grape_red));
        
        GameRegistry.addSmelting(Items.mutton_raw.itemID, new ItemStack(Items.mutton_cooked, 1), 0.35F);
        GameRegistry.addSmelting(Items.tea_leaves.itemID, new ItemStack(Items.cup_of_tea, 1), 0.35F);
        GameRegistry.addSmelting(Items.cofee_beans_raw.itemID, new ItemStack(Items.cofee_beans, 1), 0.35F);
        GameRegistry.addSmelting(Items.cofee_beans.itemID, new ItemStack(Items.cofee, 1), 0.35F);
        
        //Recipe Throwel
        GameRegistry.addRecipe(new ItemStack(Items.trowel,1,0), new Object[]
        {
            " SC",
            "II ",
            'S', Item.stick, 'C', Item.clay, 'I', Item.ingotIron
        });
        GameRegistry.addShapelessRecipe(new ItemStack(Items.trowel,1,0), new ItemStack(Items.trowel,1,8), Item.clay);
        
        //Recipe Barrel
        GameRegistry.addRecipe(new ItemStack(Items.barrel_of_wine_ID+256,1,0), new Object[]
        {
            "GGG",
            "GBG",
            "GGG",
            'G', Items.grape_red, 'B', new ItemStack(Items.barrel_ID+256,1,0)
        });
        //Recipe Bottle of Vine
        GameRegistry.addRecipe(new ItemStack(Items.wine,6,0), new Object[]
        {
            "G G",
            "GBG",
            "G G",
            'B', new ItemStack(Items.barrel_of_wine_ID+256,1,0), 'G', Items.bottle
        });
        
        //Recipe throwel wall
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wall_cobblestone_trowel,1,12), new ItemStack(Block.cobblestone,1,0), Item.clay);
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wall_cobblestone_trowel,8,0), new ItemStack(Blocks.wall_cobblestone_trowel,1,12), new ItemStack(Blocks.wall_cobblestone_trowel,1,12), new ItemStack(Blocks.wall_cobblestone_trowel,1,12), new ItemStack(Blocks.wall_cobblestone_trowel,1,12), new ItemStack(Blocks.wall_cobblestone_trowel,1,12), new ItemStack(Blocks.wall_cobblestone_trowel,1,12), new ItemStack(Blocks.wall_cobblestone_trowel,1,12), new ItemStack(Blocks.wall_cobblestone_trowel,1,12), new ItemStack(Item.dyePowder, 1, 15)); //White
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wall_cobblestone_trowel,8,1), new ItemStack(Blocks.wall_cobblestone_trowel,1,12), new ItemStack(Blocks.wall_cobblestone_trowel,1,12), new ItemStack(Blocks.wall_cobblestone_trowel,1,12), new ItemStack(Blocks.wall_cobblestone_trowel,1,12), new ItemStack(Blocks.wall_cobblestone_trowel,1,12), new ItemStack(Blocks.wall_cobblestone_trowel,1,12), new ItemStack(Blocks.wall_cobblestone_trowel,1,12), new ItemStack(Blocks.wall_cobblestone_trowel,1,12), new ItemStack(Item.dyePowder, 1, 14)); //Orange
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wall_cobblestone_trowel,8,2), new ItemStack(Blocks.wall_cobblestone_trowel,1,12), new ItemStack(Blocks.wall_cobblestone_trowel,1,12), new ItemStack(Blocks.wall_cobblestone_trowel,1,12), new ItemStack(Blocks.wall_cobblestone_trowel,1,12), new ItemStack(Blocks.wall_cobblestone_trowel,1,12), new ItemStack(Blocks.wall_cobblestone_trowel,1,12), new ItemStack(Blocks.wall_cobblestone_trowel,1,12), new ItemStack(Blocks.wall_cobblestone_trowel,1,12), new ItemStack(Item.dyePowder, 1, 13)); //
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wall_cobblestone_trowel,8,3), new ItemStack(Blocks.wall_cobblestone_trowel,1,12), new ItemStack(Blocks.wall_cobblestone_trowel,1,12), new ItemStack(Blocks.wall_cobblestone_trowel,1,12), new ItemStack(Blocks.wall_cobblestone_trowel,1,12), new ItemStack(Blocks.wall_cobblestone_trowel,1,12), new ItemStack(Blocks.wall_cobblestone_trowel,1,12), new ItemStack(Blocks.wall_cobblestone_trowel,1,12), new ItemStack(Blocks.wall_cobblestone_trowel,1,12), new ItemStack(Item.dyePowder, 1, 12)); //
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wall_cobblestone_trowel,8,4), new ItemStack(Blocks.wall_cobblestone_trowel,1,12), new ItemStack(Blocks.wall_cobblestone_trowel,1,12), new ItemStack(Blocks.wall_cobblestone_trowel,1,12), new ItemStack(Blocks.wall_cobblestone_trowel,1,12), new ItemStack(Blocks.wall_cobblestone_trowel,1,12), new ItemStack(Blocks.wall_cobblestone_trowel,1,12), new ItemStack(Blocks.wall_cobblestone_trowel,1,12), new ItemStack(Blocks.wall_cobblestone_trowel,1,12), new ItemStack(Item.dyePowder, 1, 11)); //
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wall_cobblestone_trowel,8,5), new ItemStack(Blocks.wall_cobblestone_trowel,1,12), new ItemStack(Blocks.wall_cobblestone_trowel,1,12), new ItemStack(Blocks.wall_cobblestone_trowel,1,12), new ItemStack(Blocks.wall_cobblestone_trowel,1,12), new ItemStack(Blocks.wall_cobblestone_trowel,1,12), new ItemStack(Blocks.wall_cobblestone_trowel,1,12), new ItemStack(Blocks.wall_cobblestone_trowel,1,12), new ItemStack(Blocks.wall_cobblestone_trowel,1,12), new ItemStack(Item.dyePowder, 1, 10)); //
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wall_cobblestone_trowel,8,6), new ItemStack(Blocks.wall_cobblestone_trowel,1,12), new ItemStack(Blocks.wall_cobblestone_trowel,1,12), new ItemStack(Blocks.wall_cobblestone_trowel,1,12), new ItemStack(Blocks.wall_cobblestone_trowel,1,12), new ItemStack(Blocks.wall_cobblestone_trowel,1,12), new ItemStack(Blocks.wall_cobblestone_trowel,1,12), new ItemStack(Blocks.wall_cobblestone_trowel,1,12), new ItemStack(Blocks.wall_cobblestone_trowel,1,12), new ItemStack(Item.dyePowder, 1, 9)); //
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wall_cobblestone_trowel,8,7), new ItemStack(Blocks.wall_cobblestone_trowel,1,12), new ItemStack(Blocks.wall_cobblestone_trowel,1,12), new ItemStack(Blocks.wall_cobblestone_trowel,1,12), new ItemStack(Blocks.wall_cobblestone_trowel,1,12), new ItemStack(Blocks.wall_cobblestone_trowel,1,12), new ItemStack(Blocks.wall_cobblestone_trowel,1,12), new ItemStack(Blocks.wall_cobblestone_trowel,1,12), new ItemStack(Blocks.wall_cobblestone_trowel,1,12), new ItemStack(Item.dyePowder, 1, 8)); //
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wall_cobblestone_trowel,8,8), new ItemStack(Blocks.wall_cobblestone_trowel,1,12), new ItemStack(Blocks.wall_cobblestone_trowel,1,12), new ItemStack(Blocks.wall_cobblestone_trowel,1,12), new ItemStack(Blocks.wall_cobblestone_trowel,1,12), new ItemStack(Blocks.wall_cobblestone_trowel,1,12), new ItemStack(Blocks.wall_cobblestone_trowel,1,12), new ItemStack(Blocks.wall_cobblestone_trowel,1,12), new ItemStack(Blocks.wall_cobblestone_trowel,1,12), new ItemStack(Item.dyePowder, 1, 7)); //
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wall_cobblestone_trowel,8,9), new ItemStack(Blocks.wall_cobblestone_trowel,1,12), new ItemStack(Blocks.wall_cobblestone_trowel,1,12), new ItemStack(Blocks.wall_cobblestone_trowel,1,12), new ItemStack(Blocks.wall_cobblestone_trowel,1,12), new ItemStack(Blocks.wall_cobblestone_trowel,1,12), new ItemStack(Blocks.wall_cobblestone_trowel,1,12), new ItemStack(Blocks.wall_cobblestone_trowel,1,12), new ItemStack(Blocks.wall_cobblestone_trowel,1,12), new ItemStack(Item.dyePowder, 1, 6)); //
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wall_cobblestone_trowel,8,10), new ItemStack(Blocks.wall_cobblestone_trowel,1,12), new ItemStack(Blocks.wall_cobblestone_trowel,1,12), new ItemStack(Blocks.wall_cobblestone_trowel,1,12), new ItemStack(Blocks.wall_cobblestone_trowel,1,12), new ItemStack(Blocks.wall_cobblestone_trowel,1,12), new ItemStack(Blocks.wall_cobblestone_trowel,1,12), new ItemStack(Blocks.wall_cobblestone_trowel,1,12), new ItemStack(Blocks.wall_cobblestone_trowel,1,12), new ItemStack(Item.dyePowder, 1, 5)); //
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wall_cobblestone_trowel,8,11), new ItemStack(Blocks.wall_cobblestone_trowel,1,12), new ItemStack(Blocks.wall_cobblestone_trowel,1,12), new ItemStack(Blocks.wall_cobblestone_trowel,1,12), new ItemStack(Blocks.wall_cobblestone_trowel,1,12), new ItemStack(Blocks.wall_cobblestone_trowel,1,12), new ItemStack(Blocks.wall_cobblestone_trowel,1,12), new ItemStack(Blocks.wall_cobblestone_trowel,1,12), new ItemStack(Blocks.wall_cobblestone_trowel,1,12), new ItemStack(Item.dyePowder, 1, 4)); //
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wall_cobblestone_trowel,8,13), new ItemStack(Blocks.wall_cobblestone_trowel,1,12), new ItemStack(Blocks.wall_cobblestone_trowel,1,12), new ItemStack(Blocks.wall_cobblestone_trowel,1,12), new ItemStack(Blocks.wall_cobblestone_trowel,1,12), new ItemStack(Blocks.wall_cobblestone_trowel,1,12), new ItemStack(Blocks.wall_cobblestone_trowel,1,12), new ItemStack(Blocks.wall_cobblestone_trowel,1,12), new ItemStack(Blocks.wall_cobblestone_trowel,1,12), new ItemStack(Item.dyePowder, 1, 2)); //
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wall_cobblestone_trowel,8,14), new ItemStack(Blocks.wall_cobblestone_trowel,1,12), new ItemStack(Blocks.wall_cobblestone_trowel,1,12), new ItemStack(Blocks.wall_cobblestone_trowel,1,12), new ItemStack(Blocks.wall_cobblestone_trowel,1,12), new ItemStack(Blocks.wall_cobblestone_trowel,1,12), new ItemStack(Blocks.wall_cobblestone_trowel,1,12), new ItemStack(Blocks.wall_cobblestone_trowel,1,12), new ItemStack(Blocks.wall_cobblestone_trowel,1,12), new ItemStack(Item.dyePowder, 1, 1)); //
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wall_cobblestone_trowel,8,15), new ItemStack(Blocks.wall_cobblestone_trowel,1,12), new ItemStack(Blocks.wall_cobblestone_trowel,1,12), new ItemStack(Blocks.wall_cobblestone_trowel,1,12), new ItemStack(Blocks.wall_cobblestone_trowel,1,12), new ItemStack(Blocks.wall_cobblestone_trowel,1,12), new ItemStack(Blocks.wall_cobblestone_trowel,1,12), new ItemStack(Blocks.wall_cobblestone_trowel,1,12), new ItemStack(Blocks.wall_cobblestone_trowel,1,12), new ItemStack(Item.dyePowder, 1, 0)); //Black
        
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wall_bricks_trowel,1,12), new ItemStack(Block.brick,1,0), Item.clay);
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wall_bricks_trowel,8,0), new ItemStack(Blocks.wall_bricks_trowel,1,12), new ItemStack(Blocks.wall_bricks_trowel,1,12), new ItemStack(Blocks.wall_bricks_trowel,1,12), new ItemStack(Blocks.wall_bricks_trowel,1,12), new ItemStack(Blocks.wall_bricks_trowel,1,12), new ItemStack(Blocks.wall_bricks_trowel,1,12), new ItemStack(Blocks.wall_bricks_trowel,1,12), new ItemStack(Blocks.wall_bricks_trowel,1,12), new ItemStack(Item.dyePowder, 1, 15)); //White
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wall_bricks_trowel,8,1), new ItemStack(Blocks.wall_bricks_trowel,1,12), new ItemStack(Blocks.wall_bricks_trowel,1,12), new ItemStack(Blocks.wall_bricks_trowel,1,12), new ItemStack(Blocks.wall_bricks_trowel,1,12), new ItemStack(Blocks.wall_bricks_trowel,1,12), new ItemStack(Blocks.wall_bricks_trowel,1,12), new ItemStack(Blocks.wall_bricks_trowel,1,12), new ItemStack(Blocks.wall_bricks_trowel,1,12), new ItemStack(Item.dyePowder, 1, 14)); //Orange
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wall_bricks_trowel,8,2), new ItemStack(Blocks.wall_bricks_trowel,1,12), new ItemStack(Blocks.wall_bricks_trowel,1,12), new ItemStack(Blocks.wall_bricks_trowel,1,12), new ItemStack(Blocks.wall_bricks_trowel,1,12), new ItemStack(Blocks.wall_bricks_trowel,1,12), new ItemStack(Blocks.wall_bricks_trowel,1,12), new ItemStack(Blocks.wall_bricks_trowel,1,12), new ItemStack(Blocks.wall_bricks_trowel,1,12), new ItemStack(Item.dyePowder, 1, 13)); //
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wall_bricks_trowel,8,3), new ItemStack(Blocks.wall_bricks_trowel,1,12), new ItemStack(Blocks.wall_bricks_trowel,1,12), new ItemStack(Blocks.wall_bricks_trowel,1,12), new ItemStack(Blocks.wall_bricks_trowel,1,12), new ItemStack(Blocks.wall_bricks_trowel,1,12), new ItemStack(Blocks.wall_bricks_trowel,1,12), new ItemStack(Blocks.wall_bricks_trowel,1,12), new ItemStack(Blocks.wall_bricks_trowel,1,12), new ItemStack(Item.dyePowder, 1, 12)); //
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wall_bricks_trowel,8,4), new ItemStack(Blocks.wall_bricks_trowel,1,12), new ItemStack(Blocks.wall_bricks_trowel,1,12), new ItemStack(Blocks.wall_bricks_trowel,1,12), new ItemStack(Blocks.wall_bricks_trowel,1,12), new ItemStack(Blocks.wall_bricks_trowel,1,12), new ItemStack(Blocks.wall_bricks_trowel,1,12), new ItemStack(Blocks.wall_bricks_trowel,1,12), new ItemStack(Blocks.wall_bricks_trowel,1,12), new ItemStack(Item.dyePowder, 1, 11)); //
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wall_bricks_trowel,8,5), new ItemStack(Blocks.wall_bricks_trowel,1,12), new ItemStack(Blocks.wall_bricks_trowel,1,12), new ItemStack(Blocks.wall_bricks_trowel,1,12), new ItemStack(Blocks.wall_bricks_trowel,1,12), new ItemStack(Blocks.wall_bricks_trowel,1,12), new ItemStack(Blocks.wall_bricks_trowel,1,12), new ItemStack(Blocks.wall_bricks_trowel,1,12), new ItemStack(Blocks.wall_bricks_trowel,1,12), new ItemStack(Item.dyePowder, 1, 10)); //
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wall_bricks_trowel,8,6), new ItemStack(Blocks.wall_bricks_trowel,1,12), new ItemStack(Blocks.wall_bricks_trowel,1,12), new ItemStack(Blocks.wall_bricks_trowel,1,12), new ItemStack(Blocks.wall_bricks_trowel,1,12), new ItemStack(Blocks.wall_bricks_trowel,1,12), new ItemStack(Blocks.wall_bricks_trowel,1,12), new ItemStack(Blocks.wall_bricks_trowel,1,12), new ItemStack(Blocks.wall_bricks_trowel,1,12), new ItemStack(Item.dyePowder, 1, 9)); //
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wall_bricks_trowel,8,7), new ItemStack(Blocks.wall_bricks_trowel,1,12), new ItemStack(Blocks.wall_bricks_trowel,1,12), new ItemStack(Blocks.wall_bricks_trowel,1,12), new ItemStack(Blocks.wall_bricks_trowel,1,12), new ItemStack(Blocks.wall_bricks_trowel,1,12), new ItemStack(Blocks.wall_bricks_trowel,1,12), new ItemStack(Blocks.wall_bricks_trowel,1,12), new ItemStack(Blocks.wall_bricks_trowel,1,12), new ItemStack(Item.dyePowder, 1, 8)); //
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wall_bricks_trowel,8,8), new ItemStack(Blocks.wall_bricks_trowel,1,12), new ItemStack(Blocks.wall_bricks_trowel,1,12), new ItemStack(Blocks.wall_bricks_trowel,1,12), new ItemStack(Blocks.wall_bricks_trowel,1,12), new ItemStack(Blocks.wall_bricks_trowel,1,12), new ItemStack(Blocks.wall_bricks_trowel,1,12), new ItemStack(Blocks.wall_bricks_trowel,1,12), new ItemStack(Blocks.wall_bricks_trowel,1,12), new ItemStack(Item.dyePowder, 1, 7)); //
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wall_bricks_trowel,8,9), new ItemStack(Blocks.wall_bricks_trowel,1,12), new ItemStack(Blocks.wall_bricks_trowel,1,12), new ItemStack(Blocks.wall_bricks_trowel,1,12), new ItemStack(Blocks.wall_bricks_trowel,1,12), new ItemStack(Blocks.wall_bricks_trowel,1,12), new ItemStack(Blocks.wall_bricks_trowel,1,12), new ItemStack(Blocks.wall_bricks_trowel,1,12), new ItemStack(Blocks.wall_bricks_trowel,1,12), new ItemStack(Item.dyePowder, 1, 6)); //
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wall_bricks_trowel,8,10), new ItemStack(Blocks.wall_bricks_trowel,1,12), new ItemStack(Blocks.wall_bricks_trowel,1,12), new ItemStack(Blocks.wall_bricks_trowel,1,12), new ItemStack(Blocks.wall_bricks_trowel,1,12), new ItemStack(Blocks.wall_bricks_trowel,1,12), new ItemStack(Blocks.wall_bricks_trowel,1,12), new ItemStack(Blocks.wall_bricks_trowel,1,12), new ItemStack(Blocks.wall_bricks_trowel,1,12), new ItemStack(Item.dyePowder, 1, 5)); //
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wall_bricks_trowel,8,11), new ItemStack(Blocks.wall_bricks_trowel,1,12), new ItemStack(Blocks.wall_bricks_trowel,1,12), new ItemStack(Blocks.wall_bricks_trowel,1,12), new ItemStack(Blocks.wall_bricks_trowel,1,12), new ItemStack(Blocks.wall_bricks_trowel,1,12), new ItemStack(Blocks.wall_bricks_trowel,1,12), new ItemStack(Blocks.wall_bricks_trowel,1,12), new ItemStack(Blocks.wall_bricks_trowel,1,12), new ItemStack(Item.dyePowder, 1, 4)); //
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wall_bricks_trowel,8,13), new ItemStack(Blocks.wall_bricks_trowel,1,12), new ItemStack(Blocks.wall_bricks_trowel,1,12), new ItemStack(Blocks.wall_bricks_trowel,1,12), new ItemStack(Blocks.wall_bricks_trowel,1,12), new ItemStack(Blocks.wall_bricks_trowel,1,12), new ItemStack(Blocks.wall_bricks_trowel,1,12), new ItemStack(Blocks.wall_bricks_trowel,1,12), new ItemStack(Blocks.wall_bricks_trowel,1,12), new ItemStack(Item.dyePowder, 1, 2)); //
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wall_bricks_trowel,8,14), new ItemStack(Blocks.wall_bricks_trowel,1,12), new ItemStack(Blocks.wall_bricks_trowel,1,12), new ItemStack(Blocks.wall_bricks_trowel,1,12), new ItemStack(Blocks.wall_bricks_trowel,1,12), new ItemStack(Blocks.wall_bricks_trowel,1,12), new ItemStack(Blocks.wall_bricks_trowel,1,12), new ItemStack(Blocks.wall_bricks_trowel,1,12), new ItemStack(Blocks.wall_bricks_trowel,1,12), new ItemStack(Item.dyePowder, 1, 1)); //
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wall_bricks_trowel,8,15), new ItemStack(Blocks.wall_bricks_trowel,1,12), new ItemStack(Blocks.wall_bricks_trowel,1,12), new ItemStack(Blocks.wall_bricks_trowel,1,12), new ItemStack(Blocks.wall_bricks_trowel,1,12), new ItemStack(Blocks.wall_bricks_trowel,1,12), new ItemStack(Blocks.wall_bricks_trowel,1,12), new ItemStack(Blocks.wall_bricks_trowel,1,12), new ItemStack(Blocks.wall_bricks_trowel,1,12), new ItemStack(Item.dyePowder, 1, 0)); //Black
        
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wall_stone_slab_trowel,1,12), new ItemStack(Block.stoneDoubleSlab,1,0), Item.clay);
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wall_stone_slab_trowel,8,0), new ItemStack(Blocks.wall_stone_slab_trowel,1,12), new ItemStack(Blocks.wall_stone_slab_trowel,1,12), new ItemStack(Blocks.wall_stone_slab_trowel,1,12), new ItemStack(Blocks.wall_stone_slab_trowel,1,12), new ItemStack(Blocks.wall_stone_slab_trowel,1,12), new ItemStack(Blocks.wall_stone_slab_trowel,1,12), new ItemStack(Blocks.wall_stone_slab_trowel,1,12), new ItemStack(Blocks.wall_stone_slab_trowel,1,12), new ItemStack(Item.dyePowder, 1, 15)); //White
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wall_stone_slab_trowel,8,1), new ItemStack(Blocks.wall_stone_slab_trowel,1,12), new ItemStack(Blocks.wall_stone_slab_trowel,1,12), new ItemStack(Blocks.wall_stone_slab_trowel,1,12), new ItemStack(Blocks.wall_stone_slab_trowel,1,12), new ItemStack(Blocks.wall_stone_slab_trowel,1,12), new ItemStack(Blocks.wall_stone_slab_trowel,1,12), new ItemStack(Blocks.wall_stone_slab_trowel,1,12), new ItemStack(Blocks.wall_stone_slab_trowel,1,12), new ItemStack(Item.dyePowder, 1, 14)); //Orange
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wall_stone_slab_trowel,8,2), new ItemStack(Blocks.wall_stone_slab_trowel,1,12), new ItemStack(Blocks.wall_stone_slab_trowel,1,12), new ItemStack(Blocks.wall_stone_slab_trowel,1,12), new ItemStack(Blocks.wall_stone_slab_trowel,1,12), new ItemStack(Blocks.wall_stone_slab_trowel,1,12), new ItemStack(Blocks.wall_stone_slab_trowel,1,12), new ItemStack(Blocks.wall_stone_slab_trowel,1,12), new ItemStack(Blocks.wall_stone_slab_trowel,1,12), new ItemStack(Item.dyePowder, 1, 13)); //
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wall_stone_slab_trowel,8,3), new ItemStack(Blocks.wall_stone_slab_trowel,1,12), new ItemStack(Blocks.wall_stone_slab_trowel,1,12), new ItemStack(Blocks.wall_stone_slab_trowel,1,12), new ItemStack(Blocks.wall_stone_slab_trowel,1,12), new ItemStack(Blocks.wall_stone_slab_trowel,1,12), new ItemStack(Blocks.wall_stone_slab_trowel,1,12), new ItemStack(Blocks.wall_stone_slab_trowel,1,12), new ItemStack(Blocks.wall_stone_slab_trowel,1,12), new ItemStack(Item.dyePowder, 1, 12)); //
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wall_stone_slab_trowel,8,4), new ItemStack(Blocks.wall_stone_slab_trowel,1,12), new ItemStack(Blocks.wall_stone_slab_trowel,1,12), new ItemStack(Blocks.wall_stone_slab_trowel,1,12), new ItemStack(Blocks.wall_stone_slab_trowel,1,12), new ItemStack(Blocks.wall_stone_slab_trowel,1,12), new ItemStack(Blocks.wall_stone_slab_trowel,1,12), new ItemStack(Blocks.wall_stone_slab_trowel,1,12), new ItemStack(Blocks.wall_stone_slab_trowel,1,12), new ItemStack(Item.dyePowder, 1, 11)); //
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wall_stone_slab_trowel,8,5), new ItemStack(Blocks.wall_stone_slab_trowel,1,12), new ItemStack(Blocks.wall_stone_slab_trowel,1,12), new ItemStack(Blocks.wall_stone_slab_trowel,1,12), new ItemStack(Blocks.wall_stone_slab_trowel,1,12), new ItemStack(Blocks.wall_stone_slab_trowel,1,12), new ItemStack(Blocks.wall_stone_slab_trowel,1,12), new ItemStack(Blocks.wall_stone_slab_trowel,1,12), new ItemStack(Blocks.wall_stone_slab_trowel,1,12), new ItemStack(Item.dyePowder, 1, 10)); //
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wall_stone_slab_trowel,8,6), new ItemStack(Blocks.wall_stone_slab_trowel,1,12), new ItemStack(Blocks.wall_stone_slab_trowel,1,12), new ItemStack(Blocks.wall_stone_slab_trowel,1,12), new ItemStack(Blocks.wall_stone_slab_trowel,1,12), new ItemStack(Blocks.wall_stone_slab_trowel,1,12), new ItemStack(Blocks.wall_stone_slab_trowel,1,12), new ItemStack(Blocks.wall_stone_slab_trowel,1,12), new ItemStack(Blocks.wall_stone_slab_trowel,1,12), new ItemStack(Item.dyePowder, 1, 9)); //
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wall_stone_slab_trowel,8,7), new ItemStack(Blocks.wall_stone_slab_trowel,1,12), new ItemStack(Blocks.wall_stone_slab_trowel,1,12), new ItemStack(Blocks.wall_stone_slab_trowel,1,12), new ItemStack(Blocks.wall_stone_slab_trowel,1,12), new ItemStack(Blocks.wall_stone_slab_trowel,1,12), new ItemStack(Blocks.wall_stone_slab_trowel,1,12), new ItemStack(Blocks.wall_stone_slab_trowel,1,12), new ItemStack(Blocks.wall_stone_slab_trowel,1,12), new ItemStack(Item.dyePowder, 1, 8)); //
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wall_stone_slab_trowel,8,8), new ItemStack(Blocks.wall_stone_slab_trowel,1,12), new ItemStack(Blocks.wall_stone_slab_trowel,1,12), new ItemStack(Blocks.wall_stone_slab_trowel,1,12), new ItemStack(Blocks.wall_stone_slab_trowel,1,12), new ItemStack(Blocks.wall_stone_slab_trowel,1,12), new ItemStack(Blocks.wall_stone_slab_trowel,1,12), new ItemStack(Blocks.wall_stone_slab_trowel,1,12), new ItemStack(Blocks.wall_stone_slab_trowel,1,12), new ItemStack(Item.dyePowder, 1, 7)); //
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wall_stone_slab_trowel,8,9), new ItemStack(Blocks.wall_stone_slab_trowel,1,12), new ItemStack(Blocks.wall_stone_slab_trowel,1,12), new ItemStack(Blocks.wall_stone_slab_trowel,1,12), new ItemStack(Blocks.wall_stone_slab_trowel,1,12), new ItemStack(Blocks.wall_stone_slab_trowel,1,12), new ItemStack(Blocks.wall_stone_slab_trowel,1,12), new ItemStack(Blocks.wall_stone_slab_trowel,1,12), new ItemStack(Blocks.wall_stone_slab_trowel,1,12), new ItemStack(Item.dyePowder, 1, 6)); //
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wall_stone_slab_trowel,8,10), new ItemStack(Blocks.wall_stone_slab_trowel,1,12), new ItemStack(Blocks.wall_stone_slab_trowel,1,12), new ItemStack(Blocks.wall_stone_slab_trowel,1,12), new ItemStack(Blocks.wall_stone_slab_trowel,1,12), new ItemStack(Blocks.wall_stone_slab_trowel,1,12), new ItemStack(Blocks.wall_stone_slab_trowel,1,12), new ItemStack(Blocks.wall_stone_slab_trowel,1,12), new ItemStack(Blocks.wall_stone_slab_trowel,1,12), new ItemStack(Item.dyePowder, 1, 5)); //
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wall_stone_slab_trowel,8,11), new ItemStack(Blocks.wall_stone_slab_trowel,1,12), new ItemStack(Blocks.wall_stone_slab_trowel,1,12), new ItemStack(Blocks.wall_stone_slab_trowel,1,12), new ItemStack(Blocks.wall_stone_slab_trowel,1,12), new ItemStack(Blocks.wall_stone_slab_trowel,1,12), new ItemStack(Blocks.wall_stone_slab_trowel,1,12), new ItemStack(Blocks.wall_stone_slab_trowel,1,12), new ItemStack(Blocks.wall_stone_slab_trowel,1,12), new ItemStack(Item.dyePowder, 1, 4)); //
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wall_stone_slab_trowel,8,13), new ItemStack(Blocks.wall_stone_slab_trowel,1,12), new ItemStack(Blocks.wall_stone_slab_trowel,1,12), new ItemStack(Blocks.wall_stone_slab_trowel,1,12), new ItemStack(Blocks.wall_stone_slab_trowel,1,12), new ItemStack(Blocks.wall_stone_slab_trowel,1,12), new ItemStack(Blocks.wall_stone_slab_trowel,1,12), new ItemStack(Blocks.wall_stone_slab_trowel,1,12), new ItemStack(Blocks.wall_stone_slab_trowel,1,12), new ItemStack(Item.dyePowder, 1, 2)); //
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wall_stone_slab_trowel,8,14), new ItemStack(Blocks.wall_stone_slab_trowel,1,12), new ItemStack(Blocks.wall_stone_slab_trowel,1,12), new ItemStack(Blocks.wall_stone_slab_trowel,1,12), new ItemStack(Blocks.wall_stone_slab_trowel,1,12), new ItemStack(Blocks.wall_stone_slab_trowel,1,12), new ItemStack(Blocks.wall_stone_slab_trowel,1,12), new ItemStack(Blocks.wall_stone_slab_trowel,1,12), new ItemStack(Blocks.wall_stone_slab_trowel,1,12), new ItemStack(Item.dyePowder, 1, 1)); //
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wall_stone_slab_trowel,8,15), new ItemStack(Blocks.wall_stone_slab_trowel,1,12), new ItemStack(Blocks.wall_stone_slab_trowel,1,12), new ItemStack(Blocks.wall_stone_slab_trowel,1,12), new ItemStack(Blocks.wall_stone_slab_trowel,1,12), new ItemStack(Blocks.wall_stone_slab_trowel,1,12), new ItemStack(Blocks.wall_stone_slab_trowel,1,12), new ItemStack(Blocks.wall_stone_slab_trowel,1,12), new ItemStack(Blocks.wall_stone_slab_trowel,1,12), new ItemStack(Item.dyePowder, 1, 0)); //Black
        
        //Recipe roofs
        GameRegistry.addShapelessRecipe(new ItemStack(Items.roofing_tile,2,0), new ItemStack(Item.brick,1,0));
        
        GameRegistry.addRecipe(new ItemStack(SharpnetRoofsBlocks1,1,0), new Object[]
        {
            "RRR",
            "RRR",
            "RRR",
            'R', Items.roofing_tile,
        });
        
            //Black
        GameRegistry.addRecipe(new ItemStack(SharpnetRoofsBlocks1,1,1), new Object[]
        {
            "RRR",
            "RDR",
            "RRR",
            'R', Items.roofing_tile, 'D', new ItemStack(Item.dyePowder,1,0),
        });
            //Red
        GameRegistry.addRecipe(new ItemStack(SharpnetRoofsBlocks1,1,4), new Object[]
        {
            "RRR",
            "RDR",
            "RRR",
            'R', Items.roofing_tile, 'D', new ItemStack(Item.dyePowder,1,1),
        });
            //Green
        GameRegistry.addRecipe(new ItemStack(SharpnetRoofsBlocks1,1,3), new Object[]
        {
            "RRR",
            "RDR",
            "RRR",
            'R', Items.roofing_tile, 'D', new ItemStack(Item.dyePowder,1,2),
        });
            //Blue
        GameRegistry.addRecipe(new ItemStack(SharpnetRoofsBlocks1,1,2), new Object[]
        {
            "RRR",
            "RDR",
            "RRR",
            'R', Items.roofing_tile, 'D', new ItemStack(Item.dyePowder,1,4),
        });
            //Yellow
        GameRegistry.addRecipe(new ItemStack(SharpnetRoofsBlocks1,1,5), new Object[]
        {
            "RRR",
            "RDR",
            "RRR",
            'R', Items.roofing_tile, 'D', new ItemStack(Item.dyePowder,1,11),
        });
        
        
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
        Recipes.compressor.addRecipe(new RecipeInputItemStack(ic2.api.item.Items.getItem("lavaCell")) , null, new ItemStack(Blocks.PR_block_stonesID,1,3) );
        
    }
    
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        
    }
}
