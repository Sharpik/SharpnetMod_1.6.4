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
import cpw.mods.fml.common.SidedProxy;
import static net.minecraft.block.Block.soundLadderFootstep;
import static net.minecraft.block.Block.soundMetalFootstep;
import net.minecraft.block.BlockHalfSlab;
import net.minecraftforge.oredict.OreDictionary;
import cpw.mods.fml.client.registry.RenderingRegistry;

import ModSharpnet.Events.*;
import ModSharpnet.Item.*;
import ModSharpnet.Block.*; 
import ModSharpnet.Recipes.*;
import static net.minecraft.block.Block.soundSnowFootstep;


@Mod(modid="ModSharpnet", name="SharpnetMod", version="1.0.8", dependencies="required-after:IC2;required-after:BuildCraft|Core;required-after:ProjRed|Core")
@NetworkMod(clientSideRequired=true, serverSideRequired=true)

public class ModSharpnet
{
    @Instance(value = "ModSharpnet")
    public static ModSharpnet instance;
    public static String modid = "ModSharpnet";
    
    @SidedProxy(clientSide="ModSharpnet.ClientProxy", serverSide="ModSharpnet.CommonProxy")
    public static CommonProxy proxy;
    
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
    
    public static Block SharpnetFlowerBlocks1;
    public static int SharpnetFlowerBlocks1ID;
    
    public static Block SharpnetFlowerBlocks2;
    public static int SharpnetFlowerBlocks2ID;
    
    public static Block SharpnetTilesSlabBlocks1;
    public static int SharpnetTilesSlabBlocks1ID;
    
    public static Block SharpnetTilesSlabBlocks2;
    public static int SharpnetTilesSlabBlocks2ID;
    
    public static Block SharpnetTilesSlabBlocks3;
    public static int SharpnetTilesSlabBlocks3ID;
    
    public static Block SharpnetTilesWoodSlabBlocks1;
    public static int SharpnetTilesWoodSlabBlocks1_ID;
            
    public static Block SharpnetTilesWoodSlabBlocks2;
    public static int SharpnetTilesWoodSlabBlocks2_ID;
    
    public static Block SharpnetBushesBlocks;
    public static int SharpnetBushesBlocksID;
    
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
    public static boolean WorldGen;
    public static boolean WorldGenOres;
    public static boolean WorldGenFlowers;
    public static boolean ModIndustrialCraft2;
    public static boolean ModProjectRed;
    public static boolean ModBuildCraft;
    public static boolean ModFlansMod;
    public static boolean ModForgeMicroPartsMod;
    
    //public static Item 
    //public static int 
    
    //public static Block ;
    //public static int ;
    
    //Material Register
    public static EnumArmorMaterial SharpnetArmorCloth = EnumHelper.addArmorMaterial("SharpnetArmorCloth", 5, new int[] {1, 3, 2, 1}, 30);
    public static Material SharpnetRoadsBlocksMaterial = new ShMaterial(MapColor.stoneColor);
    
    //Render Regidter
    public static int RenderPaneID;
    
    // Config register
    public void initConfiguration(FMLInitializationEvent event)
    {
        Configuration config = new Configuration(new File("config/SharpnetMod_1.6.4.cfg"));
        config.load();
        
        ModProjectRed = config.get("boolean", "ModProjectRed", true).getBoolean(true);
        ModBuildCraft = config.get("boolean", "ModBuildCraft", true).getBoolean(true);
        ModIndustrialCraft2 = config.get("boolean", "ModIndustrialCraft2", true).getBoolean(true);
        ModFlansMod = config.get("boolean", "ModFlansMod", true).getBoolean(true);
        ModForgeMicroPartsMod = config.get("boolean", "ModForgeMicroPartsMod", true).getBoolean(true);
        
        if(ModForgeMicroPartsMod)
        {
            //Items.Forge_itemMicro_id = config.get("item", "Forge_itemMicro.id", 24875).getInt();
            Items.Forge_stoneRod_id = config.get("item", "Forge_stoneRod.id", 25135).getInt();
        }
        
        if(ModProjectRed)
        {
            Configuration config_mod_PR = new Configuration(new File("config/ProjectRed.cfg"));
            config_mod_PR.load();
            
            //Blocks
            Blocks.PR_block_stonesID = config_mod_PR.get("block", "block_stonesID", 0).getInt();
            Items.PR_item_saw_gold_ID = config_mod_PR.get("item", "goldsaw", 0).getInt()+256;
            Items.PR_peridotsaw_ID = config_mod_PR.get("item", "peridotsaw", 0).getInt()+256;
            Items.PR_rubysaw_ID = config_mod_PR.get("item", "rubysaw", 0).getInt()+256;
            Items.PR_sapphiresaw_ID = config_mod_PR.get("item", "sapphiresaw", 0).getInt()+256;
            Items.PR_item_sawID = config_mod_PR.get("item", "item_sawID", 0).getInt()+256;
        }
        if(ModBuildCraft)
        {
            Configuration config_mod_BC = new Configuration(new File("config/buildcraft/main.conf"));
            config_mod_BC.load();
            
            //Items
            Items.BC_Bucket_Oil_ID = (config_mod_BC.get("item", "bucketOil.id", 19107).getInt())+256;
            Items.BC_Bucket_Fuel_ID = (config_mod_BC.get("item", "bucketFuel.id", 19110).getInt())+256;
            Items.BC_redstoneChipset_ID = (config_mod_BC.get("item", "redstoneChipset.id", 19117).getInt())+256;
            Items.BC_pipeGateAutarchic_ID = (config_mod_BC.get("item", "pipeGateAutarchic.id", 19140).getInt())+256;
        }
        
        if(ModFlansMod)
        {
            //Items
            Items.FLANS_Fuel_Barrel_ID = (config.get("item", "FLANS_Fuel_Barrel", 27130).getInt());
            Items.FLANS_Fuel_Canister_ID = (config.get("item", "FLANS_Fuel_Canister", 27131).getInt());
            Items.FLANS_Steel_ID = (config.get("item", "FLANS_Steel", 27000).getInt());
        }
        
        //Others
        SHdebug = config.get("boolean", "SHdebug", false).getBoolean(false);
        WorldGen = config.get("boolean", "WorldGen", false).getBoolean(false);
        WorldGenOres = config.get("boolean", "WorldGenOres", false).getBoolean(false);
        WorldGenFlowers = config.get("boolean", "WorldGenFlowers", false).getBoolean(false);
        
        //Blocks ID
        //Blocks.minecraft_red_sandstone_ID = config.get("Blocks", "minecraft:red_sandstone", 179).getInt();
        //Blocks.minecraft_red_sandstone_stairs_ID = config.get("Blocks", "minecraft:red_sandstone_stairs", 180).getInt();
        Blocks.SharpnetWindowsBlocks1_ID = config.get("Blocks", "SharpnetWindowsBlocks1", 2505).getInt();
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
        SharpnetFlowerBlocks1ID = config.get("Blocks", "SharpnetFlowerBlocks1", 2504).getInt();
        Blocks.drinks1_block_ID = config.get("Blocks", "drinks1_block", 2515).getInt();
        Blocks.food1_block_ID = config.get("Blocks", "food1_block", 2516).getInt();
        Blocks.wall_cobblestone_trowel_block_ID = config.get("Blocks", "wall_cobblestone_trowel_block", 2517).getInt();
        Blocks.wall_bricks_trowel_block_ID = config.get("Blocks", "wall_bricks_trowel_block", 2518).getInt();
        Blocks.wall_stone_slab_trowel_block_ID = config.get("Blocks", "wall_stone_slab_trowel_block", 2519).getInt();
        Blocks.SharpnetPlantsBlocks2ID =  config.get("Blocks", "SharpnetPlantsBlocks2", 2545).getInt();
        Blocks.lighting_stick_block_ID =  config.get("Blocks", "lighting_stick_block", 2546).getInt();
        Blocks.door1_block_ID = config.get("Blocks", "door1_block", 2547).getInt();
        Blocks.door_secret1_block_ID = config.get("Blocks", "door_secret1_block", 2548).getInt();
        Blocks.door_secret2_block_ID = config.get("Blocks", "door_secret2_block", 2549).getInt();
        Blocks.door_secret3_block_ID = config.get("Blocks", "door_secret3_block", 2550).getInt();
        Blocks.door5_block_ID = config.get("Blocks", "door5_block", 2551).getInt();
        Blocks.door6_block_ID = config.get("Blocks", "door6_block", 2552).getInt();
        Blocks.door7_block_ID = config.get("Blocks", "door7_block", 2553).getInt();
        Blocks.door8_block_ID = config.get("Blocks", "door8_block", 2554).getInt();
        Blocks.door9_block_ID = config.get("Blocks", "door9_block", 2555).getInt();
        Blocks.door10_block_ID = config.get("Blocks", "door10_block", 2556).getInt();
        Blocks.door11_block_ID = config.get("Blocks", "door11_block", 2557).getInt();
        Blocks.door12_block_ID = config.get("Blocks", "door12_block", 2558).getInt();
        //Place holder for ST doors 2559
        Blocks.panel_metal1_block_ID = config.get("Blocks", "panel_metal1_block", 2560).getInt();
        Blocks.ladder_iron1_block_ID = config.get("Blocks", "ladder_iron1_block", 2561).getInt();
        Blocks.electro1_block_ID = config.get("Blocks", "electro1_block", 2562).getInt();
        Blocks.garden_deco_block_ID = config.get("Blocks", "garden_deco_block", 2563).getInt();
        Blocks.deco1_block_ID = config.get("Blocks", "deco1_block", 2565).getInt();
        SharpnetTilesSlabBlocks1ID = config.get("Blocks", "SharpnetTilesSlabBlocks1", 2566).getInt();
        SharpnetTilesSlabBlocks2ID = config.get("Blocks", "SharpnetTilesSlabBlocks2", 2567).getInt();
        SharpnetTilesSlabBlocks3ID = config.get("Blocks", "SharpnetTilesSlabBlocks3", 2568).getInt();
        Blocks.SharpnetMoneyBlock_ID = config.get("Blocks", "SharpnetMoneyBlock", 3102).getInt();
        SharpnetTilesWoodSlabBlocks1_ID = config.get("Blocks", "SharpnetTilesWoodSlabBlocks1", 3124).getInt();
        SharpnetTilesWoodSlabBlocks2_ID = config.get("Blocks", "SharpnetTilesWoodSlabBlocks2", 3127).getInt();
        Blocks.SharpnetBricksBlocks1_ID = config.get("Blocks", "SharpnetBricksBlocks1", 2569).getInt();
        Blocks.SharpnetCobblestoneBlocks1_ID = config.get("Blocks", "SharpnetCobblestoneBlocks1", 2570).getInt();
        Blocks.SharpnetStoneBlocks1_ID = config.get("Blocks", "SharpnetStoneBlocks1", 2571).getInt();
        Blocks.SharpnetCobblestoneWalls1_ID = config.get("Blocks", "SharpnetCobblestoneWalls1", 2572).getInt();
        Blocks.roof1_stairs_ID = config.get("Blocks", "roof1_stairs", 2573).getInt();
        Blocks.roof1_stairs_black_ID = config.get("Blocks", "roof1_stairs_black", 2574).getInt();
        Blocks.roof1_stairs_blue_ID = config.get("Blocks", "roof1_stairs_blue", 2575).getInt();
        Blocks.roof1_stairs_green_ID = config.get("Blocks", "roof1_stairs_green", 2576).getInt();
        Blocks.roof1_stairs_red_ID = config.get("Blocks", "roof1_stairs_red", 2577).getInt();
        Blocks.roof1_stairs_yellow_ID = config.get("Blocks", "roof1_stairs_yellow", 2578).getInt();
        Blocks.roof2_stairs_ID = config.get("Blocks", "roof2_stairs", 2579).getInt();
        Blocks.panel_wood1_block_ID = config.get("Blocks", "panel_wood1_block", 2580).getInt();
        SharpnetFlowerBlocks2ID = config.get("Blocks", "SharpnetFlowerBlocks2", 2581).getInt();
        SharpnetBushesBlocksID = config.get("Blocks", "SharpnetBushesBlocks", 2582).getInt();
        Blocks.SharpnetStairsTile1_ID = config.get("Blocks", "SharpnetStairsTile1", 2583).getInt();
        Blocks.SharpnetStairsTile5_ID = config.get("Blocks", "SharpnetStairsTile5", 2584).getInt();
        Blocks.SharpnetStairsTile11_ID = config.get("Blocks", "SharpnetStairsTile11", 2585).getInt();
        Blocks.SharpnetPoster1_ID = config.get("Blocks", "SharpnetPoster1", 2586).getInt();
        Blocks.SharpnetPoster2_ID = config.get("Blocks", "SharpnetPoster2", 2587).getInt();
        Blocks.SharpnetStocks10000_ID = config.get("Blocks", "SharpnetStocks10000", 2588).getInt();
        Blocks.drinks2_block_ID = config.get("Blocks", "drinks2_block", 2589).getInt();
        Blocks.lamps1_block_ID = config.get("Blocks", "lamps1_block", 2590).getInt();
        Blocks.garden_deco_block_ID = config.get("Blocks", "garden_deco_block", 2591).getInt();
        Blocks.flowerPot1_block_ID = config.get("Blocks", "flowerPot1_block", 2592).getInt();
        Blocks.SharpnetSnowHillSnow_ID = config.get("Blocks", "snowhillsnow_block", 2593).getInt();
        
        
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
        Items.armor_skirt_purple_ID = (config.get("Items", "armor_skirt_purple", 6656).getInt())-256;
        Items.armor_skirt_green_ID = (config.get("Items", "armor_skirt_green", 6657).getInt())-256;
        Items.armor_tshirt_red_ID = (config.get("Items", "armor_tshirt_red", 6658).getInt())-256;
        //Items Alcohol
        Items.bottle_ID = (config.get("Items", "bottle", 6522).getInt())-256;
        Items.beer_ID = (config.get("Items", "beer", 6523).getInt())-256;
        Items.wine_red_ID = (config.get("Items", "wine_red", 6524).getInt())-256;
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
        Items.glass_of_red_vine_ID = (config.get("Items", "glass_of_red_vine", 6535).getInt())-256;
        Items.vodka_ID = (config.get("Items", "vodka", 6536).getInt())-256;
        Items.cocacola_ID = (config.get("Items", "cocacola", 6537).getInt())-256;
        Items.guttalax_ID = (config.get("Items", "guttalax", 6538).getInt())-256;
        Items.pizza_ID = (config.get("Items", "pizza", 6539).getInt())-256;
        Items.salad_ID = (config.get("Items", "salad", 6540).getInt())-256;
        Items.salad_fillet_ID = (config.get("Items", "salad_fillet", 6541).getInt())-256;
        Items.test_tube_ID = (config.get("Items", "test_tube", 6607).getInt())-256;
        Items.mixed_ethanol_ID = (config.get("Items", "mixed_ethanol", 6608).getInt())-256;
        Items.destiledEthanol_1_ID = (config.get("Items", "destiledEthanol_1", 6609).getInt())-256;
        Items.destiledEthanol_2_ID = (config.get("Items", "destiledEthanol_2", 6610).getInt())-256;
        Items.destiledEthanol_3_ID = (config.get("Items", "destiledEthanol_3", 6611).getInt())-256;
        Items.liquid_sugar_ID = (config.get("Items", "liquid_sugar", 6612).getInt())-256;
        Items.bottle_of_milk_ID = (config.get("Items", "bottle_of_milk", 6613).getInt())-256;
        Items.wine_white_ID = (config.get("Items", "wine_white", 6652).getInt())-256;
        Items.glass_of_white_vine_ID = (config.get("Items", "glass_of_white_vine", 6653).getInt())-256;
        
        //Items Food
        Items.mutton_raw_ID = (config.get("Items", "mutton_raw", 423).getInt())-256;
        Items.mutton_cooked_ID = (config.get("Items", "mutton_cooked", 424).getInt())-256;
        Items.tea_seeds_ID = (config.get("Items", "tea_seeds", 6544).getInt())-256;
        Items.tea_leaves_ID = (config.get("Items", "tea_leaves", 6545).getInt())-256;
        Items.cofee_beans_raw_ID = (config.get("Items", "cofee_beans_raw", 6567).getInt())-256;
        Items.cofee_beans_ID = (config.get("Items", "cofee_beans", 6568).getInt())-256;
        Items.grape_red_seeds_ID = (config.get("Items", "grape_red_seeds", 6569).getInt())-256;
        Items.grape_red_ID = (config.get("Items", "grape_red", 6570).getInt())-256;
        Items.sliced_potatoe_ID = (config.get("Items", "sliced_potatoe", 6613).getInt())-256;
        Items.potatoes_chips_ID = (config.get("Items", "potatoes_chips", 6614).getInt())-256;
        Items.flour_ID = (config.get("Items", "flour", 6615).getInt())-256;
        Items.dough_ID = (config.get("Items", "dough", 6616).getInt())-256;
        Items.butter_ID = (config.get("Items", "butter", 6617).getInt())-256;
        Items.tomato_puree_ID = (config.get("Items", "tomato_puree", 6618).getInt())-256;
        Items.cheese_ID = (config.get("Items", "cheese", 6619).getInt())-256;
        Items.raw_pizza_ID = (config.get("Items", "raw_pizza", 6620).getInt())-256;
        Items.slice_of_bread_ID = (config.get("Items", "slice_of_bread", 6621).getInt())-256;
        Items.breadcrumbs_ID = (config.get("Items", "breadcrumbs", 6622).getInt())-256;
        Items.fillet_ID = (config.get("Items", "fillet", 6623).getInt())-256;
        Items.popcorn_ID = (config.get("Items", "popcorn", 6643).getInt())-256;
        Items.gingerbread_dough_ID = (config.get("Items", "gingerbread_dough", 6645).getInt())-256;
        Items.gingerbread1_ID = (config.get("Items", "gingerbread1", 6645).getInt())-256;
        Items.gingerbread2_ID = (config.get("Items", "gingerbread2", 6646).getInt())-256;
        Items.chocolate_ID = (config.get("Items", "chocolate", 6647).getInt())-256;
        Items.bonbon_ID = (config.get("Items", "bonbon", 6648).getInt())-256;
        Items.grape_white_seeds_ID = (config.get("Items", "grape_white_seeds", 6654).getInt())-256;
        Items.grape_white_ID = (config.get("Items", "grape_white", 6655).getInt())-256;

        //Items Tools
        Items.trowel_ID = (config.get("Items", "trowel", 6542).getInt())-256;
        Items.stuff_of_day_ID = (config.get("Items", "stuff_of_day", 6546).getInt())-256;
        Items.stuff_of_night_ID = (config.get("Items", "stuff_of_night", 6547).getInt())-256;
        Items.stuff_of_weather_ID = (config.get("Items", "stuff_of_weather", 6548).getInt())-256;
        Items.stuff_of_death_ID = (config.get("Items", "stuff_of_death", 6549).getInt())-256;
        Items.stuff_of_warp_ID = (config.get("Items", "stuff_of_warp", 6550).getInt())-256;
                
        Items.CD_1_ID = (config.get("Items", "CD_1", 6626).getInt())-256;
        Items.CD_2_ID = (config.get("Items", "CD_2", 6627).getInt())-256;
        Items.debug_ID = (config.get("Items", "debug", 6642).getInt())-256;
        Items.lighter_ID = (config.get("Items", "lighter", 6643).getInt())-256;
        Items.rake_ID = (config.get("Items", "rake", 6649).getInt())-256;
        
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
        Items.barrel_ID = (config.get("Items", "barrel", 6563).getInt())-256;
        Items.barrel_of_wine_red_ID = (config.get("Items", "barrel_of_wine_red", 6564).getInt())-256;
        Items.barrel_of_wine_white_ID = (config.get("Items", "barrel_of_wine_white", 6651).getInt())-256;
                
        //Items Resources
        Items.roofing_tile_ID = (config.get("Items", "roofing_tile", 6543).getInt())-256;
        Items.cloth_black_ID = (config.get("Items", "cloth_black", 6571).getInt())-256;
        Items.cloth_blue_ID = (config.get("Items", "cloth_blue", 6572).getInt())-256;
        Items.cloth_brown_ID = (config.get("Items", "cloth_brown", 6573).getInt())-256;
        Items.cloth_gray_ID = (config.get("Items", "cloth_gray", 6574).getInt())-256;
        Items.cloth_green_ID = (config.get("Items", "cloth_green", 6575).getInt())-256;
        Items.cloth_orange_ID = (config.get("Items", "cloth_orange", 6576).getInt())-256;
        Items.cloth_red_ID = (config.get("Items", "cloth_red", 6577).getInt())-256;
        Items.cloth_white_ID = (config.get("Items", "cloth_white", 6578).getInt())-256;
        Items.cloth_yellow_ID = (config.get("Items", "cloth_yellow", 6579).getInt())-256;
        Items.roll_of_paper_black_ID = (config.get("Items", "roll_of_paper_black", 6580).getInt())-256;
        Items.roll_of_paper_blue_ID = (config.get("Items", "roll_of_paper_blue", 6581).getInt())-256;
        Items.roll_of_paper_brown_ID = (config.get("Items", "roll_of_paper_brown", 6582).getInt())-256;
        Items.roll_of_paper_green_ID = (config.get("Items", "roll_of_paper_green", 6583).getInt())-256;
        Items.roll_of_paper_orange_ID = (config.get("Items", "roll_of_paper_orange", 6584).getInt())-256;
        Items.roll_of_paper_red_ID = (config.get("Items", "roll_of_paper_red", 6585).getInt())-256;
        Items.roll_of_paper_white_ID = (config.get("Items", "roll_of_paper_white", 6586).getInt())-256;
        Items.roll_of_paper_yellow_ID = (config.get("Items", "roll_of_paper_yellow", 6587).getInt())-256;
        Items.tile_black_ID = (config.get("Items", "tile_black", 6588).getInt())-256;
        Items.tile_blue_ID = (config.get("Items", "tile_blue", 6589).getInt())-256;
        Items.tile_brown_ID = (config.get("Items", "tile_brown", 6590).getInt())-256;
        Items.tile_green_ID = (config.get("Items", "tile_green", 6591).getInt())-256;
        Items.tile_grey_ID = (config.get("Items", "tile_grey", 6592).getInt())-256;
        Items.tile_orange_ID = (config.get("Items", "tile_orange", 6593).getInt())-256;
        Items.tile_red_ID = (config.get("Items", "tile_red", 6594).getInt())-256;
        Items.tile_white_ID = (config.get("Items", "tile_white", 6595).getInt())-256;
        Items.tile_yellow_ID = (config.get("Items", "tile_yellow", 6596).getInt())-256;
        Items.wood_tile_oak_ID = (config.get("Items", "wood_tile_oak", 6597).getInt())-256;
        Items.wood_tile_birch_ID = (config.get("Items", "wood_tile_birch", 6598).getInt())-256;
        Items.wood_tile_spruce_ID = (config.get("Items", "wood_tile_spruce", 6599).getInt())-256;
        Items.wood_tile_jungle_ID = (config.get("Items", "wood_tile_jungle", 6600).getInt())-256;
        Items.wood_tile_black_ID = (config.get("Items", "wood_tile_black", 6601).getInt())-256;
        Items.wood_tile_blue_ID = (config.get("Items", "wood_tile_blue", 6602).getInt())-256;
        Items.wood_tile_green_ID = (config.get("Items", "wood_tile_green", 6603).getInt())-256;
        Items.wood_tile_orange_ID = (config.get("Items", "wood_tile_orange", 6604).getInt())-256;
        Items.wood_tile_red_ID = (config.get("Items", "wood_tile_red", 6605).getInt())-256;
        Items.wood_tile_yellow_ID = (config.get("Items", "wood_tile_yellow", 6606).getInt())-256;
        Items.iron_bar_ID = (config.get("Items", "iron_bar", 6624).getInt())-256;
        Items.IngotSteel_ID = (config.get("Items", "IngotSteel", 6625).getInt())-256;
        Items.oil_cell_ID = (config.get("Items", "oil_cell", 6646).getInt())-256;
        Items.fuel_cell_ID = (config.get("Items", "fuel_cell", 6647).getInt())-256;
        Items.cement_ID = (config.get("Items", "cement", 6648).getInt())-256;
        
        //Items Value
        Items.cent_ID = (config.get("Items", "cent", 6015).getInt())-256;
        Items.money10eu_ID = (config.get("Items", "money10eu", 6016).getInt())-256;
        Items.money100eu_ID = (config.get("Items", "money100eu", 6017).getInt())-256;
        Items.money1000eu_ID = (config.get("Items", "money1000eu", 6018).getInt())-256;
        Items.stack_9x10euMoneys_ID = (config.get("Items", "stack_9x10euMoneys", 6019).getInt())-256;
        Items.stack_9x100euMoneys_ID = (config.get("Items", "stack_9x100euMoneys", 6020).getInt())-256;
        Items.stack_9x1000euMoneys_ID = (config.get("Items", "stack_9x1000euMoneys", 6021).getInt())-256;
        Items.los_100e_items_ID = (config.get("Items", "los_100e_items", 6115).getInt())-256;
        Items.los_100e_money_ID = (config.get("Items", "los_100e_money", 6116).getInt())-256;
        Items.rulette_10E_ID = (config.get("Items", "rulette_10E", 6117).getInt())-256;
        Items.rulette_100E_ID = (config.get("Items", "rulette_100E", 6118).getInt())-256;
        Items.guess_10E_ID = (config.get("Items", "guess_10E", 6119).getInt())-256;
        Items.guess_100E_ID = (config.get("Items", "guess_100E", 6120).getInt())-256;
        Items.sgros_ID = (config.get("Items", "sgros", 6101).getInt())-256;
        Items.zgros_ID = (config.get("Items", "zgros", 6102).getInt())-256;
        Items.rulette_10E_ID = (config.get("Items", "rulette_10E", 6644).getInt())-256;
        Items.rulette_100E_ID = (config.get("Items", "rulette_100E", 6645).getInt())-256;
        
        // Other Mods
        
        //Save config file changes
        config.save();
        
        //Render Register
        RenderPaneID = RenderingRegistry.getNextAvailableRenderId();
        RenderingRegistry.registerBlockHandler(new RenderPane(RenderPaneID));
    }
    
    @EventHandler
    public void registerRenderers()
    {
        
    }
    
    //The Main function.. Alfa and Omega.. The core of Universe :)
    @EventHandler
    public void load(FMLInitializationEvent event)
    {
        //Execute the config file
        this.initConfiguration(event);
        
        //Register own proxy settings
        proxy.registerRenderInformation();
        
        
        //Sharpnet Blocks
        Blocks.SharpnetWindowsBlocks1 = new SharpnetGlassBlock(Blocks.SharpnetWindowsBlocks1_ID, new String[][]
        {
            {"wind_type_1_white","windows/wind_type_1_white"},
            {"wind_type_1_black","windows/wind_type_1_black"},
            {"wind_type_1_blue","windows/wind_type_1_blue"},
            {"wind_type_1_blue_light","windows/wind_type_1_blue_light"},
            {"wind_type_1_brown","windows/wind_type_1_brown"},
            {"wind_type_1_brown_light","windows/wind_type_1_brown_light"},
            {"wind_type_1_green","windows/wind_type_1_green"},
            {"wind_type_1_orange","windows/wind_type_1_orange"},
            {"wind_type_1_red","windows/wind_type_1_red"},
            {"wind_type_1_yellow","windows/wind_type_1_yellow"},
            {"wind_type_2_white","windows/wind_type_2_white"},
            {"wind_type_3_white","windows/wind_type_3_white"},
            {"wind_type_6","windows/wind_type_6"},
            {"wind_type_7","windows/wind_type_7"},
            {"wind_type_8","windows/wind_type_8"},
            {"wind_type_9","windows/wind_type_9"}
        }).setUnlocalizedName("SharpnetWindowsBlocks1").setHardness(0.3F).setResistance(0.1F).setCreativeTab(CreativeTabs.tabDecorations);
        GameRegistry.registerBlock(Blocks.SharpnetWindowsBlocks1, SharpnetGlassItemBlocks.class, Blocks.SharpnetWindowsBlocks1.getUnlocalizedName());
        LanguageRegistry.addName(new ItemStack(Blocks.SharpnetWindowsBlocks1, 1, 0), "Window type 1 white");
        LanguageRegistry.addName(new ItemStack(Blocks.SharpnetWindowsBlocks1, 1, 1), "Window type 1 black");
        LanguageRegistry.addName(new ItemStack(Blocks.SharpnetWindowsBlocks1, 1, 2), "Window type 1 blue");
        LanguageRegistry.addName(new ItemStack(Blocks.SharpnetWindowsBlocks1, 1, 3), "Window type 1 light blue");
        LanguageRegistry.addName(new ItemStack(Blocks.SharpnetWindowsBlocks1, 1, 4), "Window type 1 brown");
        LanguageRegistry.addName(new ItemStack(Blocks.SharpnetWindowsBlocks1, 1, 5), "Window type 1 light brown");
        LanguageRegistry.addName(new ItemStack(Blocks.SharpnetWindowsBlocks1, 1, 6), "Window type 1 green");
        LanguageRegistry.addName(new ItemStack(Blocks.SharpnetWindowsBlocks1, 1, 7), "Window type 1 orange");
        LanguageRegistry.addName(new ItemStack(Blocks.SharpnetWindowsBlocks1, 1, 8), "Window type 1 red");
        LanguageRegistry.addName(new ItemStack(Blocks.SharpnetWindowsBlocks1, 1, 9), "Window type 1 yellow");
        LanguageRegistry.addName(new ItemStack(Blocks.SharpnetWindowsBlocks1, 1, 10), "Window type 2 white");
        LanguageRegistry.addName(new ItemStack(Blocks.SharpnetWindowsBlocks1, 1, 11), "Window type 3 white");
        LanguageRegistry.addName(new ItemStack(Blocks.SharpnetWindowsBlocks1, 1, 12), "Window type 6");
        LanguageRegistry.addName(new ItemStack(Blocks.SharpnetWindowsBlocks1, 1, 13), "Window type 7");
        LanguageRegistry.addName(new ItemStack(Blocks.SharpnetWindowsBlocks1, 1, 14), "Window type 8");
        LanguageRegistry.addName(new ItemStack(Blocks.SharpnetWindowsBlocks1, 1, 15), "Window type 9");
        
        SharpnetBuildingBlocks1 = new SharpnetBuildingBlocks1(SharpnetBuildingBlocks1ID, "sharpnetbuildingblock1");
        GameRegistry.registerBlock(SharpnetBuildingBlocks1, SharpnetBuildingItemBlocks1.class, "SharpnetBuildingBlocks1");
        LanguageRegistry.addName(new ItemStack(SharpnetBuildingBlocks1, 1, 0), "Construction Block");
        LanguageRegistry.addName(new ItemStack(SharpnetBuildingBlocks1, 1, 1), "Metal 1 Block");
        LanguageRegistry.addName(new ItemStack(SharpnetBuildingBlocks1, 1, 2), "Metal 2 Block");
        LanguageRegistry.addName(new ItemStack(SharpnetBuildingBlocks1, 1, 3), "Metal 3 Block");
        LanguageRegistry.addName(new ItemStack(SharpnetBuildingBlocks1, 1, 4), "Metal 4 Block");
        LanguageRegistry.addName(new ItemStack(SharpnetBuildingBlocks1, 1, 5), "Metal 5 Block");
        
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
        
        SharpnetTilesBlocks1 = new SharpnetTilesBlocks1(SharpnetTilesBlocks1ID, true, "TilesBlocks1");
        GameRegistry.registerBlock(SharpnetTilesBlocks1, SharpnetTilesItemBlocks1.class, "TilesBlocks1");
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
        
        SharpnetTilesBlocks2 = new SharpnetTilesBlocks2(SharpnetTilesBlocks2ID, true, "TilesBlocks2");
        GameRegistry.registerBlock(SharpnetTilesBlocks2, SharpnetTilesItemBlocks2.class, "TilesBlocks2");
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
        
        Blocks.SharpnetStairsTile1 = new SharpnetStairsBlock(Blocks.SharpnetStairsTile1_ID, SharpnetTilesBlocks1, 0, new String[]
        {"StairsTile1","tiles_stone/tile1"});
        GameRegistry.registerBlock(Blocks.SharpnetStairsTile1, "StairsTile1");
        LanguageRegistry.addName(new ItemStack(Blocks.SharpnetStairsTile1, 1, 0), "Stairs Tile 1");
        
        Blocks.SharpnetStairsTile5 = new SharpnetStairsBlock(Blocks.SharpnetStairsTile5_ID, SharpnetTilesBlocks1, 4, new String[]
        {"StairsTile5","tiles_stone/tile5"});
        GameRegistry.registerBlock(Blocks.SharpnetStairsTile5, "StairsTile5");
        LanguageRegistry.addName(new ItemStack(Blocks.SharpnetStairsTile5, 1, 0), "Stairs Tile 5");
        
        Blocks.SharpnetStairsTile11 = new SharpnetStairsBlock(Blocks.SharpnetStairsTile11_ID, SharpnetTilesBlocks1, 10, new String[]
        {"StairsTile11","tiles_stone/tile11"});
        GameRegistry.registerBlock(Blocks.SharpnetStairsTile11, "StairsTile11");
        LanguageRegistry.addName(new ItemStack(Blocks.SharpnetStairsTile11, 1, 0), "Stairs Tile 11");
        
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
        
        SharpnetRoadStairsGray = new SharpnetRoadStairsGray(SharpnetRoadStairsGrayID, SharpnetRoadsBlocks1, 0).setUnlocalizedName("SharpnetRoadStairsGray");
        GameRegistry.registerBlock(SharpnetRoadStairsGray, "SharpnetRoadStairsGray");
        LanguageRegistry.addName(new ItemStack(SharpnetRoadStairsGray, 1, 0), "Road Stairs Gray");
        
        SharpnetRoadStairsBlack = new SharpnetRoadStairsBlack(SharpnetRoadStairsBlackID, SharpnetRoadsBlocks1, 2).setUnlocalizedName("SharpnetRoadStairsBlack");
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
        LanguageRegistry.addName(new ItemStack(SharpnetPlantsBlocks1, 1, 12), "Vine Red Plant");
        LanguageRegistry.addName(new ItemStack(SharpnetPlantsBlocks1, 1, 13), "Vine Red Plant");
        LanguageRegistry.addName(new ItemStack(SharpnetPlantsBlocks1, 1, 14), "Vine Red Plant");
        
        Blocks.SharpnetPlantsBlocks2 = new SharpnetPlantsBlocks2(Blocks.SharpnetPlantsBlocks2ID, Material.plants);
        GameRegistry.registerBlock(Blocks.SharpnetPlantsBlocks2, SharpnetPlantsItemBlocks2.class, "SharpnetPlantsBlocks2");
        LanguageRegistry.addName(new ItemStack(Blocks.SharpnetPlantsBlocks2, 1, 0), "Tea Plant");
        LanguageRegistry.addName(new ItemStack(Blocks.SharpnetPlantsBlocks2, 1, 1), "Tea Plant");
        LanguageRegistry.addName(new ItemStack(Blocks.SharpnetPlantsBlocks2, 1, 2), "Tea Plant");
        LanguageRegistry.addName(new ItemStack(Blocks.SharpnetPlantsBlocks2, 1, 3), "Cofee Plant");
        LanguageRegistry.addName(new ItemStack(Blocks.SharpnetPlantsBlocks2, 1, 4), "Cofee Plant");
        LanguageRegistry.addName(new ItemStack(Blocks.SharpnetPlantsBlocks2, 1, 5), "Cofee Plant");
        LanguageRegistry.addName(new ItemStack(Blocks.SharpnetPlantsBlocks2, 1, 6), "Wine White Plant");
        LanguageRegistry.addName(new ItemStack(Blocks.SharpnetPlantsBlocks2, 1, 7), "Wine White Plant");
        LanguageRegistry.addName(new ItemStack(Blocks.SharpnetPlantsBlocks2, 1, 8), "Wine White Plant");
        /*
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
               
        SharpnetFlowerBlocks1 = new SharpnetFlowerBlocks(SharpnetFlowerBlocks1ID, new String[][]
        {
            {"daffodil","flowers/daffodil"},
            {"flora_cactus","flowers/flora_cactus"},
            {"fuchsia","flowers/fuchsia"},
            {"sunflower","flowers/sunflower"},
            {"bonsai","flowers/bonsai"},
            {"snapdragon","flowers/snapdragon"},
            {"red_dicot","flowers/red_dicot"},
            {"tulips","flowers/tulips"},
            {"african_daisy","flowers/african_daisy"},
            {"dahilia","flowers/dahilia"},
            {"lacustrine","flowers/lacustrine"},
            {"yellow_dicot","flowers/yellow_dicot"},
            {"bird_of_paradise","flowers/bird_of_paradise"},
            {"okee_giant","flowers/okee_giant"},
            {"mantis_shrimp","flowers/mantis_shrimp"},
            {"hedgehog_cactus","flowers/hedgehog_cactus"}
        }).setUnlocalizedName("SharpnetFlowerBlocks1").setHardness(0.0F).setResistance(0.0F).setCreativeTab(CreativeTabs.tabDecorations).setStepSound(Block.soundGrassFootstep);
        GameRegistry.registerBlock(SharpnetFlowerBlocks1, SharpnetFlowerItemBlocks.class, SharpnetFlowerBlocks1.getUnlocalizedName());
        LanguageRegistry.addName(new ItemStack(SharpnetFlowerBlocks1, 1, 0), "Daffodil Flower");
        LanguageRegistry.addName(new ItemStack(SharpnetFlowerBlocks1, 1, 1), "Flora Cactus");
        LanguageRegistry.addName(new ItemStack(SharpnetFlowerBlocks1, 1, 2), "Fuchsia");
        LanguageRegistry.addName(new ItemStack(SharpnetFlowerBlocks1, 1, 3), "Sunflower");
        LanguageRegistry.addName(new ItemStack(SharpnetFlowerBlocks1, 1, 4), "Bonsai");
        LanguageRegistry.addName(new ItemStack(SharpnetFlowerBlocks1, 1, 5), "Snap Dragon");
        LanguageRegistry.addName(new ItemStack(SharpnetFlowerBlocks1, 1, 6), "Reddicot Flower");
        LanguageRegistry.addName(new ItemStack(SharpnetFlowerBlocks1, 1, 7), "Tulips");
        LanguageRegistry.addName(new ItemStack(SharpnetFlowerBlocks1, 1, 8), "African Daisy");
        LanguageRegistry.addName(new ItemStack(SharpnetFlowerBlocks1, 1, 9), "Dahilia Flower");
        LanguageRegistry.addName(new ItemStack(SharpnetFlowerBlocks1, 1, 10), "Lacustrine");
        LanguageRegistry.addName(new ItemStack(SharpnetFlowerBlocks1, 1, 11), "Yellow Dicot");
        LanguageRegistry.addName(new ItemStack(SharpnetFlowerBlocks1, 1, 12), "Bird of Paradise");
        LanguageRegistry.addName(new ItemStack(SharpnetFlowerBlocks1, 1, 13), "Okee Giant");
        LanguageRegistry.addName(new ItemStack(SharpnetFlowerBlocks1, 1, 14), "Mantis Shrimp");
        LanguageRegistry.addName(new ItemStack(SharpnetFlowerBlocks1, 1, 15), "Hedgehog Cactus");
        
        SharpnetFlowerBlocks2 = new SharpnetFlowerBlocks(SharpnetFlowerBlocks2ID, new String[][]
        {
            {"mech1","flowers/mech1"},
            {"sukulent1","flowers/sukulent1"},
            {"sukulent2","flowers/sukulent2"},
            {"sukulent3","flowers/sukulent3"}
        }).setUnlocalizedName("SharpnetFlowerBlocks2").setHardness(0.0F).setResistance(0.0F).setCreativeTab(CreativeTabs.tabDecorations).setStepSound(Block.soundGrassFootstep);
        GameRegistry.registerBlock(SharpnetFlowerBlocks2, SharpnetFlowerItemBlocks.class, SharpnetFlowerBlocks2.getUnlocalizedName());
        LanguageRegistry.addName(new ItemStack(SharpnetFlowerBlocks2, 1, 0), "Mechus 1");
        LanguageRegistry.addName(new ItemStack(SharpnetFlowerBlocks2, 1, 1), "Sukulentus 1");
        LanguageRegistry.addName(new ItemStack(SharpnetFlowerBlocks2, 1, 2), "Sukulentus 2");
        LanguageRegistry.addName(new ItemStack(SharpnetFlowerBlocks2, 1, 3), "Sukulentus 3");
        
        SharpnetBushesBlocks = new SharpnetBushesBlocks(SharpnetBushesBlocksID, new String[][]
        {
            {"bush1","bushes/bush1"}
        }).setUnlocalizedName("SharpnetBushesBlocks").setHardness(0.0F).setResistance(0.0F).setCreativeTab(CreativeTabs.tabDecorations).setStepSound(Block.soundGrassFootstep);
        GameRegistry.registerBlock(SharpnetBushesBlocks, SharpnetBushesItemBlocks.class, SharpnetBushesBlocks.getUnlocalizedName());
        LanguageRegistry.addName(new ItemStack(SharpnetBushesBlocks, 1, 0), "Bush 1");
        
        //Blocks Alcohol
        Blocks.drinks1_block = new SharpnetDrinksBlocks1(Blocks.drinks1_block_ID).setUnlocalizedName("SharpnetDrinksBlocks1");
        GameRegistry.registerBlock(Blocks.drinks1_block, SharpnetDrinksItemBlocks1.class, Blocks.drinks1_block.getUnlocalizedName());
        LanguageRegistry.addName(new ItemStack(Blocks.drinks1_block, 1, 0), "Beer");
        LanguageRegistry.addName(new ItemStack(Blocks.drinks1_block, 1, 1), "Wine Red");
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
        LanguageRegistry.addName(new ItemStack(Blocks.drinks1_block, 1, 12), "Glass of red Vine");
        LanguageRegistry.addName(new ItemStack(Blocks.drinks1_block, 1, 13), "Vodka");
        LanguageRegistry.addName(new ItemStack(Blocks.drinks1_block, 1, 14), "CocaCola");
        LanguageRegistry.addName(new ItemStack(Blocks.drinks1_block, 1, 15), "Bottle");
        
        //Blocks Alcohol
        Blocks.drinks2_block = new SharpnetDrinksBlocks2(Blocks.drinks2_block_ID).setUnlocalizedName("SharpnetDrinksBlocks2");
        GameRegistry.registerBlock(Blocks.drinks2_block, SharpnetDrinksItemBlocks2.class, Blocks.drinks2_block.getUnlocalizedName());
        LanguageRegistry.addName(new ItemStack(Blocks.drinks2_block, 1, 0), "Wine White");
        
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
        
        Blocks.wall_cobblestone_trowel_block = new SharpnetWallTrowelCobblestoneBlock(Blocks.wall_cobblestone_trowel_block_ID, "SharpnetWallTrowelCobblestoneBlock");
        GameRegistry.registerBlock(Blocks.wall_cobblestone_trowel_block, SharpnetWallTrowelCobblestoneItemBlocks.class, "SharpnetWallTrowelCobblestoneBlock");
        LanguageRegistry.addName(new ItemStack(Blocks.wall_cobblestone_trowel_block, 1, 0), "Cobblestone Trowel Wall - White");
        LanguageRegistry.addName(new ItemStack(Blocks.wall_cobblestone_trowel_block, 1, 1), "Cobblestone Trowel Wall - Orange");
        LanguageRegistry.addName(new ItemStack(Blocks.wall_cobblestone_trowel_block, 1, 2), "Cobblestone Trowel Wall - Magenta");
        LanguageRegistry.addName(new ItemStack(Blocks.wall_cobblestone_trowel_block, 1, 3), "Cobblestone Trowel Wall - Light Blue");
        LanguageRegistry.addName(new ItemStack(Blocks.wall_cobblestone_trowel_block, 1, 4), "Cobblestone Trowel Wall - Yellow");
        LanguageRegistry.addName(new ItemStack(Blocks.wall_cobblestone_trowel_block, 1, 5), "Cobblestone Trowel Wall - Lime");
        LanguageRegistry.addName(new ItemStack(Blocks.wall_cobblestone_trowel_block, 1, 6), "Cobblestone Trowel Wall - Pink");
        LanguageRegistry.addName(new ItemStack(Blocks.wall_cobblestone_trowel_block, 1, 7), "Cobblestone Trowel Wall - Gray");
        LanguageRegistry.addName(new ItemStack(Blocks.wall_cobblestone_trowel_block, 1, 8), "Cobblestone Trowel Wall - Light Gray");
        LanguageRegistry.addName(new ItemStack(Blocks.wall_cobblestone_trowel_block, 1, 9), "Cobblestone Trowel Wall - Cyan");
        LanguageRegistry.addName(new ItemStack(Blocks.wall_cobblestone_trowel_block, 1, 10), "Cobblestone Trowel Wall - Purple");
        LanguageRegistry.addName(new ItemStack(Blocks.wall_cobblestone_trowel_block, 1, 11), "Cobblestone Trowel Wall - Blue");
        LanguageRegistry.addName(new ItemStack(Blocks.wall_cobblestone_trowel_block, 1, 12), "Cobblestone Trowel Wall - Brown");
        LanguageRegistry.addName(new ItemStack(Blocks.wall_cobblestone_trowel_block, 1, 13), "Cobblestone Trowel Wall - Green");
        LanguageRegistry.addName(new ItemStack(Blocks.wall_cobblestone_trowel_block, 1, 14), "Cobblestone Trowel Wall - Red");
        LanguageRegistry.addName(new ItemStack(Blocks.wall_cobblestone_trowel_block, 1, 15), "Cobblestone Trowel Wall - Black");
        
        Blocks.wall_bricks_trowel_block = new SharpnetWallTrowelBricksBlock(Blocks.wall_bricks_trowel_block_ID, "SharpnetWallTrowelBricksBlock");
        GameRegistry.registerBlock(Blocks.wall_bricks_trowel_block, SharpnetWallTrowelBricksItemBlocks.class, "SharpnetWallTrowelBricksBlock");
        LanguageRegistry.addName(new ItemStack(Blocks.wall_bricks_trowel_block, 1, 0), "Bricks Trowel Wall - White");
        LanguageRegistry.addName(new ItemStack(Blocks.wall_bricks_trowel_block, 1, 1), "Bricks Trowel Wall - Orange");
        LanguageRegistry.addName(new ItemStack(Blocks.wall_bricks_trowel_block, 1, 2), "Bricks Trowel Wall - Magenta");
        LanguageRegistry.addName(new ItemStack(Blocks.wall_bricks_trowel_block, 1, 3), "Bricks Trowel Wall - Light Blue");
        LanguageRegistry.addName(new ItemStack(Blocks.wall_bricks_trowel_block, 1, 4), "Bricks Trowel Wall - Yellow");
        LanguageRegistry.addName(new ItemStack(Blocks.wall_bricks_trowel_block, 1, 5), "Bricks Trowel Wall - Lime");
        LanguageRegistry.addName(new ItemStack(Blocks.wall_bricks_trowel_block, 1, 6), "Bricks Trowel Wall - Pink");
        LanguageRegistry.addName(new ItemStack(Blocks.wall_bricks_trowel_block, 1, 7), "Bricks Trowel Wall - Gray");
        LanguageRegistry.addName(new ItemStack(Blocks.wall_bricks_trowel_block, 1, 8), "Bricks Trowel Wall - Light Gray");
        LanguageRegistry.addName(new ItemStack(Blocks.wall_bricks_trowel_block, 1, 9), "Bricks Trowel Wall - Cyan");
        LanguageRegistry.addName(new ItemStack(Blocks.wall_bricks_trowel_block, 1, 10), "Bricks Trowel Wall - Purple");
        LanguageRegistry.addName(new ItemStack(Blocks.wall_bricks_trowel_block, 1, 11), "Bricks Trowel Wall - Blue");
        LanguageRegistry.addName(new ItemStack(Blocks.wall_bricks_trowel_block, 1, 12), "Bricks Trowel Wall - Brown");
        LanguageRegistry.addName(new ItemStack(Blocks.wall_bricks_trowel_block, 1, 13), "Bricks Trowel Wall - Green");
        LanguageRegistry.addName(new ItemStack(Blocks.wall_bricks_trowel_block, 1, 14), "Bricks Trowel Wall - Red");
        LanguageRegistry.addName(new ItemStack(Blocks.wall_bricks_trowel_block, 1, 15), "Bricks Trowel Wall - Black");
        
        Blocks.wall_stone_slab_trowel_block = new SharpnetWallTrowelStoneSlabBlock(Blocks.wall_stone_slab_trowel_block_ID, "SharpnetWallTrowelStoneSlabBlock");
        GameRegistry.registerBlock(Blocks.wall_stone_slab_trowel_block, SharpnetWallTrowelStoneSlabItemBlocks.class, "SharpnetWallTrowelStoneSlabBlock");
        LanguageRegistry.addName(new ItemStack(Blocks.wall_stone_slab_trowel_block, 1, 0), "Stone Slab Trowel Wall - White");
        LanguageRegistry.addName(new ItemStack(Blocks.wall_stone_slab_trowel_block, 1, 1), "Stone Slab Trowel Wall - Orange");
        LanguageRegistry.addName(new ItemStack(Blocks.wall_stone_slab_trowel_block, 1, 2), "Stone Slab Trowel Wall - Magenta");
        LanguageRegistry.addName(new ItemStack(Blocks.wall_stone_slab_trowel_block, 1, 3), "Stone Slab Trowel Wall - Light Blue");
        LanguageRegistry.addName(new ItemStack(Blocks.wall_stone_slab_trowel_block, 1, 4), "Stone Slab Trowel Wall - Yellow");
        LanguageRegistry.addName(new ItemStack(Blocks.wall_stone_slab_trowel_block, 1, 5), "Stone Slab Trowel Wall - Lime");
        LanguageRegistry.addName(new ItemStack(Blocks.wall_stone_slab_trowel_block, 1, 6), "Stone Slab Trowel Wall - Pink");
        LanguageRegistry.addName(new ItemStack(Blocks.wall_stone_slab_trowel_block, 1, 7), "Stone Slab Trowel Wall - Gray");
        LanguageRegistry.addName(new ItemStack(Blocks.wall_stone_slab_trowel_block, 1, 8), "Stone Slab Trowel Wall - Light Gray");
        LanguageRegistry.addName(new ItemStack(Blocks.wall_stone_slab_trowel_block, 1, 9), "Stone Slab Trowel Wall - Cyan");
        LanguageRegistry.addName(new ItemStack(Blocks.wall_stone_slab_trowel_block, 1, 10), "Stone Slab Trowel Wall - Purple");
        LanguageRegistry.addName(new ItemStack(Blocks.wall_stone_slab_trowel_block, 1, 11), "Stone Slab Trowel Wall - Blue");
        LanguageRegistry.addName(new ItemStack(Blocks.wall_stone_slab_trowel_block, 1, 12), "Stone Slab Trowel Wall - Brown");
        LanguageRegistry.addName(new ItemStack(Blocks.wall_stone_slab_trowel_block, 1, 13), "Stone Slab Trowel Wall - Green");
        LanguageRegistry.addName(new ItemStack(Blocks.wall_stone_slab_trowel_block, 1, 14), "Stone Slab Trowel Wall - Red");
        LanguageRegistry.addName(new ItemStack(Blocks.wall_stone_slab_trowel_block, 1, 15), "Stone Slab Trowel Wall - Black");
        
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
        
        Blocks.panel_metal1_block = new SharpnetPanelsBlock(Blocks.panel_metal1_block_ID, new String[][]
        {
            {"metal1",modid+":building/metal1"},
            {"metal2",modid+":building/metal2"},
            {"metal3",modid+":building/metal3"},
            {"metal4",modid+":building/metal4"},
            {"metal5",modid+":building/metal5"}
        }, Material.iron).setHardness(2.0F).setResistance(5.0F).setStepSound(soundMetalFootstep).setUnlocalizedName("SharpnetPanelMetal1");
        GameRegistry.registerBlock(Blocks.panel_metal1_block, SharpnetPanelsItemBlock.class, Blocks.panel_metal1_block.getUnlocalizedName());
        LanguageRegistry.addName(new ItemStack(Blocks.panel_metal1_block, 1, 0), "Panel Metal 1");
        LanguageRegistry.addName(new ItemStack(Blocks.panel_metal1_block, 1, 1), "Panel Metal 2");
        LanguageRegistry.addName(new ItemStack(Blocks.panel_metal1_block, 1, 2), "Panel Metal 3");
        LanguageRegistry.addName(new ItemStack(Blocks.panel_metal1_block, 1, 3), "Panel Metal 4");
        LanguageRegistry.addName(new ItemStack(Blocks.panel_metal1_block, 1, 4), "Panel Metal 5");
        
        
        Blocks.panel_wood1_block = new SharpnetPanelsBlock(Blocks.panel_wood1_block_ID, new String[][]
        {
            {"w_floor1_black",modid+":tiles_wood/w_floor1_black"},
            {"w_floor1_blue",modid+":tiles_wood/w_floor1_blue"},
            {"w_floor1_green",modid+":tiles_wood/w_floor1_green"},
            {"w_floor1_normal",modid+":tiles_wood/w_floor1_normal"},
            {"w_floor1_orange",modid+":tiles_wood/w_floor1_orange"},
            {"w_floor1_red",modid+":tiles_wood/w_floor1_red"},
            {"w_floor1_white",modid+":tiles_wood/w_floor1_white"},
            {"w_floor1_yellow",modid+":tiles_wood/w_floor1_yellow"}
        }, Material.wood).setHardness(1.0F).setResistance(2.0F).setStepSound(Block.soundWoodFootstep).setUnlocalizedName("SharpnetPanelWood1");
        GameRegistry.registerBlock(Blocks.panel_wood1_block, SharpnetPanelsItemBlock.class, Blocks.panel_wood1_block.getUnlocalizedName());
        LanguageRegistry.addName(new ItemStack(Blocks.panel_wood1_block, 1, 0), "Panel Wood Black");
        LanguageRegistry.addName(new ItemStack(Blocks.panel_wood1_block, 1, 1), "Panel Wood Blue");
        LanguageRegistry.addName(new ItemStack(Blocks.panel_wood1_block, 1, 2), "Panel Wood Green");
        LanguageRegistry.addName(new ItemStack(Blocks.panel_wood1_block, 1, 3), "Panel Wood Brown");
        LanguageRegistry.addName(new ItemStack(Blocks.panel_wood1_block, 1, 4), "Panel Wood Orange");
        LanguageRegistry.addName(new ItemStack(Blocks.panel_wood1_block, 1, 5), "Panel Wood Red");
        LanguageRegistry.addName(new ItemStack(Blocks.panel_wood1_block, 1, 6), "Panel Wood White");
        LanguageRegistry.addName(new ItemStack(Blocks.panel_wood1_block, 1, 7), "Panel Wood Yellow");
        
        Blocks.ladder_iron1_block = new SharpnetLadder1Block(Blocks.ladder_iron1_block_ID).setTextureName(modid+":others/ladder_iron1").setHardness(1.0F).setResistance(5.0F).setStepSound(soundLadderFootstep).setUnlocalizedName("Ladder Iron 1");
        GameRegistry.registerBlock(Blocks.ladder_iron1_block, "SharpnetLaderIron1_block");
        LanguageRegistry.addName(new ItemStack(Blocks.ladder_iron1_block, 1, 0), "Ladder Iron 1");
        
        Blocks.electro1_block = new SharpnetElectro1Block(Blocks.electro1_block_ID).setUnlocalizedName("SharpnetElectro1Block");
        GameRegistry.registerBlock(Blocks.electro1_block, SharpnetElectro1ItemBlocks.class, Blocks.electro1_block.getUnlocalizedName());
        LanguageRegistry.addName(new ItemStack(Blocks.electro1_block, 1, 0), "Mixer");
        LanguageRegistry.addName(new ItemStack(Blocks.electro1_block, 1, 1), "Cofee Machine");
        LanguageRegistry.addName(new ItemStack(Blocks.electro1_block, 1, 2), "Electric Kettle");
        LanguageRegistry.addName(new ItemStack(Blocks.electro1_block, 1, 3), "Color Extractor");
        
        Blocks.SharpnetMoneyBlock = new SharpnetMoneyBlock(Blocks.SharpnetMoneyBlock_ID).setUnlocalizedName("SharpnetMoneyBlock");
        GameRegistry.registerBlock(Blocks.SharpnetMoneyBlock, SharpnetMoneyItemBlock.class, Blocks.SharpnetMoneyBlock.getUnlocalizedName());
        LanguageRegistry.addName(new ItemStack(Blocks.SharpnetMoneyBlock, 1, 0), "9 Cents");
        LanguageRegistry.addName(new ItemStack(Blocks.SharpnetMoneyBlock, 1, 1), "8 Euro");
        LanguageRegistry.addName(new ItemStack(Blocks.SharpnetMoneyBlock, 1, 2), "Money Bag 81C");
        LanguageRegistry.addName(new ItemStack(Blocks.SharpnetMoneyBlock, 1, 3), "Money Bag 72E");
        LanguageRegistry.addName(new ItemStack(Blocks.SharpnetMoneyBlock, 1, 4), "Money stack 90E");
        LanguageRegistry.addName(new ItemStack(Blocks.SharpnetMoneyBlock, 1, 5), "Money stack 900E");
        LanguageRegistry.addName(new ItemStack(Blocks.SharpnetMoneyBlock, 1, 6), "Money stack 9000E");
        
        Blocks.deco1_block = new SharpnetDecoBlocks1(Blocks.deco1_block_ID).setUnlocalizedName("SharpnetDecorationBlocks");
        GameRegistry.registerBlock(Blocks.deco1_block, SharpnetDecoItemBlocks1.class, Blocks.deco1_block.getUnlocalizedName());
        LanguageRegistry.addName(new ItemStack(Blocks.deco1_block, 1, 0), "Barrel");
        LanguageRegistry.addName(new ItemStack(Blocks.deco1_block, 1, 1), "Barrel of red Vine");
        LanguageRegistry.addName(new ItemStack(Blocks.deco1_block, 1, 2), "Barrel of white Vine");
        LanguageRegistry.addName(new ItemStack(Blocks.deco1_block, 1, 3), "Money Pallet 810E");
        LanguageRegistry.addName(new ItemStack(Blocks.deco1_block, 1, 4), "Money Pallet 8100E");
        LanguageRegistry.addName(new ItemStack(Blocks.deco1_block, 1, 5), "Money Pallet 81000E");
        LanguageRegistry.addName(new ItemStack(Blocks.deco1_block, 1, 6), "Roulette");
        LanguageRegistry.addName(new ItemStack(Blocks.deco1_block, 1, 7), "Roulette table - Red");
        LanguageRegistry.addName(new ItemStack(Blocks.deco1_block, 1, 8), "Roulette table - Black");
        LanguageRegistry.addName(new ItemStack(Blocks.deco1_block, 1, 9), "Roulette table");
        LanguageRegistry.addName(new ItemStack(Blocks.deco1_block, 1, 10), "Hay Stack");
        
        SharpnetTilesSlabBlocks1 = new SharpnetTilesSlabBlocks1(SharpnetTilesSlabBlocks1ID, false, Material.rock);
        GameRegistry.registerBlock(SharpnetTilesSlabBlocks1, SharpnetTilesItemSlabBlocks1.class, "TilesSlabBlocks1");
        LanguageRegistry.addName(new ItemStack(SharpnetTilesSlabBlocks1, 1, 0), "Slab Tile 1");
        LanguageRegistry.addName(new ItemStack(SharpnetTilesSlabBlocks1, 1, 1), "Slab Tile 2");
        LanguageRegistry.addName(new ItemStack(SharpnetTilesSlabBlocks1, 1, 2), "Slab Tile 3");
        LanguageRegistry.addName(new ItemStack(SharpnetTilesSlabBlocks1, 1, 3), "Slab Tile 4");
        LanguageRegistry.addName(new ItemStack(SharpnetTilesSlabBlocks1, 1, 4), "Slab Tile 5");
        LanguageRegistry.addName(new ItemStack(SharpnetTilesSlabBlocks1, 1, 5), "Slab Tile 6");
        LanguageRegistry.addName(new ItemStack(SharpnetTilesSlabBlocks1, 1, 6), "Slab Tile 7");
        LanguageRegistry.addName(new ItemStack(SharpnetTilesSlabBlocks1, 1, 7), "Slab Tile 8");
        
        SharpnetTilesSlabBlocks2 = new SharpnetTilesSlabBlocks2(SharpnetTilesSlabBlocks2ID, false, Material.rock);
        GameRegistry.registerBlock(SharpnetTilesSlabBlocks2, SharpnetTilesItemSlabBlocks2.class, "TilesSlabBlocks2");
        LanguageRegistry.addName(new ItemStack(SharpnetTilesSlabBlocks2, 1, 0), "Slab Tile 9");
        LanguageRegistry.addName(new ItemStack(SharpnetTilesSlabBlocks2, 1, 1), "Slab Tile 10");
        LanguageRegistry.addName(new ItemStack(SharpnetTilesSlabBlocks2, 1, 2), "Slab Tile 11");
        LanguageRegistry.addName(new ItemStack(SharpnetTilesSlabBlocks2, 1, 3), "Slab Tile 12");
        LanguageRegistry.addName(new ItemStack(SharpnetTilesSlabBlocks2, 1, 4), "Slab Tile 13");
        LanguageRegistry.addName(new ItemStack(SharpnetTilesSlabBlocks2, 1, 5), "Slab Tile 14");
        LanguageRegistry.addName(new ItemStack(SharpnetTilesSlabBlocks2, 1, 6), "Slab Tile 15");
        LanguageRegistry.addName(new ItemStack(SharpnetTilesSlabBlocks2, 1, 7), "Slab Tile 16");
        
        SharpnetTilesSlabBlocks3 = new SharpnetTilesSlabBlocks3(SharpnetTilesSlabBlocks3ID, false, Material.rock);
        GameRegistry.registerBlock(SharpnetTilesSlabBlocks3, SharpnetTilesItemSlabBlocks3.class, "TilesSlabBlocks3");
        LanguageRegistry.addName(new ItemStack(SharpnetTilesSlabBlocks3, 1, 0), "Slab Tile 17");
        LanguageRegistry.addName(new ItemStack(SharpnetTilesSlabBlocks3, 1, 1), "Slab Tile 18");
        LanguageRegistry.addName(new ItemStack(SharpnetTilesSlabBlocks3, 1, 2), "Slab Tile 19");
        LanguageRegistry.addName(new ItemStack(SharpnetTilesSlabBlocks3, 1, 3), "Slab Tile 20");
        
        SharpnetTilesWoodSlabBlocks1 = new SharpnetTilesWoodSlabBlocks1(SharpnetTilesWoodSlabBlocks1_ID, false, Material.wood);
        GameRegistry.registerBlock(SharpnetTilesWoodSlabBlocks1, SharpnetTilesWoodItemSlabBlocks1.class, "TilesWoodSlabBlocks1");
        LanguageRegistry.addName(new ItemStack(SharpnetTilesWoodSlabBlocks1, 1, 0), "Wodeen Floor White Slab");
        LanguageRegistry.addName(new ItemStack(SharpnetTilesWoodSlabBlocks1, 1, 1), "Wodeen Floor Black Slab");
        LanguageRegistry.addName(new ItemStack(SharpnetTilesWoodSlabBlocks1, 1, 2), "Wodeen Floor Blue Slab");
        LanguageRegistry.addName(new ItemStack(SharpnetTilesWoodSlabBlocks1, 1, 3), "Wodeen Floor Green Slab");
        LanguageRegistry.addName(new ItemStack(SharpnetTilesWoodSlabBlocks1, 1, 4), "Wodeen Floor Orange Slab");
        LanguageRegistry.addName(new ItemStack(SharpnetTilesWoodSlabBlocks1, 1, 5), "Wodeen Floor Red Slab");
        LanguageRegistry.addName(new ItemStack(SharpnetTilesWoodSlabBlocks1, 1, 6), "Wodeen Floor Yellow Slab");
        LanguageRegistry.addName(new ItemStack(SharpnetTilesWoodSlabBlocks1, 1, 7), "Wodeen Floor Normal Slab");
        
        SharpnetTilesWoodSlabBlocks2 = new SharpnetTilesWoodSlabBlocks2(SharpnetTilesWoodSlabBlocks2_ID, false, Material.wood);
        GameRegistry.registerBlock(SharpnetTilesWoodSlabBlocks2, SharpnetTilesWoodItemSlabBlocks2.class, "TilesWoodSlabBlocks2");
        LanguageRegistry.addName(new ItemStack(SharpnetTilesWoodSlabBlocks2, 1, 0), "Wodeen Floor 1 Slab");
        LanguageRegistry.addName(new ItemStack(SharpnetTilesWoodSlabBlocks2, 1, 1), "Wodeen Floor 2 Slab");
        LanguageRegistry.addName(new ItemStack(SharpnetTilesWoodSlabBlocks2, 1, 2), "Wodeen Floor 3 Slab");
        LanguageRegistry.addName(new ItemStack(SharpnetTilesWoodSlabBlocks2, 1, 3), "Wodeen Floor 4 Slab");
        LanguageRegistry.addName(new ItemStack(SharpnetTilesWoodSlabBlocks2, 1, 4), "Wodeen Floor 5 Slab");
        
        Blocks.SharpnetBricksBlocks1 = new SharpnetBricksBlocks1(Blocks.SharpnetBricksBlocks1_ID).setUnlocalizedName("BricksBlocks1");
        GameRegistry.registerBlock(Blocks.SharpnetBricksBlocks1, SharpnetBricksItemBlocks1.class, Blocks.SharpnetBricksBlocks1.getUnlocalizedName());
        LanguageRegistry.addName(new ItemStack(Blocks.SharpnetBricksBlocks1, 1, 0), "Bricks Block 1");
        LanguageRegistry.addName(new ItemStack(Blocks.SharpnetBricksBlocks1, 1, 1), "Bricks Block 2");
        LanguageRegistry.addName(new ItemStack(Blocks.SharpnetBricksBlocks1, 1, 2), "Bricks Block 3");
        LanguageRegistry.addName(new ItemStack(Blocks.SharpnetBricksBlocks1, 1, 3), "Bricks Block 4");
        LanguageRegistry.addName(new ItemStack(Blocks.SharpnetBricksBlocks1, 1, 4), "Bricks Block 5");
        LanguageRegistry.addName(new ItemStack(Blocks.SharpnetBricksBlocks1, 1, 5), "Bricks Block 6");
        LanguageRegistry.addName(new ItemStack(Blocks.SharpnetBricksBlocks1, 1, 6), "Bricks Block 7");
        LanguageRegistry.addName(new ItemStack(Blocks.SharpnetBricksBlocks1, 1, 7), "Bricks Block 8");
        LanguageRegistry.addName(new ItemStack(Blocks.SharpnetBricksBlocks1, 1, 8), "Cubes Block 1");
        LanguageRegistry.addName(new ItemStack(Blocks.SharpnetBricksBlocks1, 1, 9), "Cubes Block 2");
        LanguageRegistry.addName(new ItemStack(Blocks.SharpnetBricksBlocks1, 1, 10), "Cubes Block 3");
        LanguageRegistry.addName(new ItemStack(Blocks.SharpnetBricksBlocks1, 1, 11), "Cubes Block 4");
        LanguageRegistry.addName(new ItemStack(Blocks.SharpnetBricksBlocks1, 1, 12), "Cubes Block 5");
        LanguageRegistry.addName(new ItemStack(Blocks.SharpnetBricksBlocks1, 1, 13), "Cubes Block 6");
        LanguageRegistry.addName(new ItemStack(Blocks.SharpnetBricksBlocks1, 1, 14), "Cubes Block 7");
        LanguageRegistry.addName(new ItemStack(Blocks.SharpnetBricksBlocks1, 1, 15), "Cubes Block 8");
        
        Blocks.SharpnetCobblestoneBlocks1 = new SharpnetCobblestoneBlocks1(Blocks.SharpnetCobblestoneBlocks1_ID).setUnlocalizedName("CobblestoneBlocks1");
        GameRegistry.registerBlock(Blocks.SharpnetCobblestoneBlocks1, SharpnetCobblestoneItemBlocks1.class, Blocks.SharpnetCobblestoneBlocks1.getUnlocalizedName());
        LanguageRegistry.addName(new ItemStack(Blocks.SharpnetCobblestoneBlocks1, 1, 0), "Cobblestone Block 1");
        LanguageRegistry.addName(new ItemStack(Blocks.SharpnetCobblestoneBlocks1, 1, 1), "Cobblestone Block 2");
        LanguageRegistry.addName(new ItemStack(Blocks.SharpnetCobblestoneBlocks1, 1, 2), "Cobblestone Block 3");
        LanguageRegistry.addName(new ItemStack(Blocks.SharpnetCobblestoneBlocks1, 1, 3), "Cobblestone Block 4");
        /*
        LanguageRegistry.addName(new ItemStack(Blocks.SharpnetCobblestoneBlocks1, 1, 4), "Cobblestone Block 1");
        LanguageRegistry.addName(new ItemStack(Blocks.SharpnetCobblestoneBlocks1, 1, 5), "Cobblestone Block 2");
        LanguageRegistry.addName(new ItemStack(Blocks.SharpnetCobblestoneBlocks1, 1, 6), "Cobblestone Block 3");
        LanguageRegistry.addName(new ItemStack(Blocks.SharpnetCobblestoneBlocks1, 1, 7), "Cobblestone Block 4");
        LanguageRegistry.addName(new ItemStack(Blocks.SharpnetCobblestoneBlocks1, 1, 8), "Cobblestone Block 5");
        LanguageRegistry.addName(new ItemStack(Blocks.SharpnetCobblestoneBlocks1, 1, 9), "Cobblestone Block 6");
        LanguageRegistry.addName(new ItemStack(Blocks.SharpnetCobblestoneBlocks1, 1, 10), "Cobblestone Block 7");
        */
        
        Blocks.SharpnetCobblestoneWalls1 = new SharpnetCobblestoneWalls1(Blocks.SharpnetCobblestoneWalls1_ID, Blocks.SharpnetCobblestoneBlocks1).setUnlocalizedName("CobblestoneWalls1");
        GameRegistry.registerBlock(Blocks.SharpnetCobblestoneWalls1, SharpnetCobblestoneItemWalls1.class, Blocks.SharpnetCobblestoneWalls1.getUnlocalizedName());
        LanguageRegistry.addName(new ItemStack(Blocks.SharpnetCobblestoneWalls1, 1, 0), "Cobblestone Wall 1");
        LanguageRegistry.addName(new ItemStack(Blocks.SharpnetCobblestoneWalls1, 1, 1), "Cobblestone Wall 2");
        LanguageRegistry.addName(new ItemStack(Blocks.SharpnetCobblestoneWalls1, 1, 2), "Cobblestone Wall 3");
        LanguageRegistry.addName(new ItemStack(Blocks.SharpnetCobblestoneWalls1, 1, 3), "Cobblestone Wall 4");
        
        Blocks.SharpnetStoneBlocks1 = new SharpnetStoneBlocks1(Blocks.SharpnetStoneBlocks1_ID).setUnlocalizedName("StoneBlocks1");
        GameRegistry.registerBlock(Blocks.SharpnetStoneBlocks1, SharpnetStoneItemBlocks1.class, Blocks.SharpnetStoneBlocks1.getUnlocalizedName());
        LanguageRegistry.addName(new ItemStack(Blocks.SharpnetStoneBlocks1, 1, 0), "Stone Block 1");
        LanguageRegistry.addName(new ItemStack(Blocks.SharpnetStoneBlocks1, 1, 1), "Stone Block 2");
        LanguageRegistry.addName(new ItemStack(Blocks.SharpnetStoneBlocks1, 1, 2), "Stone Block 3");
        LanguageRegistry.addName(new ItemStack(Blocks.SharpnetStoneBlocks1, 1, 3), "Stone Block 4");
        
        //Stairs
        Blocks.roof1_stairs = new SharpnetStairsBlocks(Blocks.roof1_stairs_ID, SharpnetRoofsBlocks1, 0).setUnlocalizedName("SharpnetRoof1Stairs");
        GameRegistry.registerBlock(Blocks.roof1_stairs, Blocks.roof1_stairs.getUnlocalizedName());
        LanguageRegistry.addName(new ItemStack(Blocks.roof1_stairs, 1, 0), "Roof 1 stairs");
        
        Blocks.roof1_stairs_black = new SharpnetStairsBlocks(Blocks.roof1_stairs_black_ID, SharpnetRoofsBlocks1, 1).setUnlocalizedName("SharpnetRoof1StairsBlack");
        GameRegistry.registerBlock(Blocks.roof1_stairs_black, Blocks.roof1_stairs_black.getUnlocalizedName());
        LanguageRegistry.addName(new ItemStack(Blocks.roof1_stairs_black, 1, 0), "Roof 1 stairs - Black");
        
        Blocks.roof1_stairs_blue = new SharpnetStairsBlocks(Blocks.roof1_stairs_blue_ID, SharpnetRoofsBlocks1, 2).setUnlocalizedName("SharpnetRoof1StairsBlue");
        GameRegistry.registerBlock(Blocks.roof1_stairs_blue, Blocks.roof1_stairs_blue.getUnlocalizedName());
        LanguageRegistry.addName(new ItemStack(Blocks.roof1_stairs_blue, 1, 0), "Roof 1 stairs - Blue");
        
        Blocks.roof1_stairs_green = new SharpnetStairsBlocks(Blocks.roof1_stairs_green_ID, SharpnetRoofsBlocks1, 3).setUnlocalizedName("SharpnetRoof1StairsGreen");
        GameRegistry.registerBlock(Blocks.roof1_stairs_green, Blocks.roof1_stairs_green.getUnlocalizedName());
        LanguageRegistry.addName(new ItemStack(Blocks.roof1_stairs_green, 1, 0), "Roof 1 stairs - Black");
        
        Blocks.roof1_stairs_red = new SharpnetStairsBlocks(Blocks.roof1_stairs_red_ID, SharpnetRoofsBlocks1, 4).setUnlocalizedName("SharpnetRoof1StairsRed");
        GameRegistry.registerBlock(Blocks.roof1_stairs_red, Blocks.roof1_stairs_red.getUnlocalizedName());
        LanguageRegistry.addName(new ItemStack(Blocks.roof1_stairs_red, 1, 0), "Roof 1 stairs - Red");
        
        Blocks.roof1_stairs_yellow = new SharpnetStairsBlocks(Blocks.roof1_stairs_yellow_ID, SharpnetRoofsBlocks1, 5).setUnlocalizedName("SharpnetRoof1StairsYellow");
        GameRegistry.registerBlock(Blocks.roof1_stairs_yellow, Blocks.roof1_stairs_yellow.getUnlocalizedName());
        LanguageRegistry.addName(new ItemStack(Blocks.roof1_stairs_yellow, 1, 0), "Roof 1 stairs - Yellow");
        
        Blocks.roof2_stairs = new SharpnetStairsBlocks(Blocks.roof2_stairs_ID, SharpnetRoofsBlocks1, 6).setUnlocalizedName("SharpnetRoof2Stairs");
        GameRegistry.registerBlock(Blocks.roof2_stairs, Blocks.roof2_stairs.getUnlocalizedName());
        LanguageRegistry.addName(new ItemStack(Blocks.roof2_stairs, 1, 0), "Roof 2 stairs");
        
        Blocks.SharpnetPoster1 = new SharpnetPostsBlocks(Blocks.SharpnetPoster1_ID, Material.circuits).setUnlocalizedName("sharpnetposter1")
        .setHardness(0.4F).setTextureName(modid+":carpets/Koberec2").setCreativeTab(CreativeTabs.tabDecorations);
        GameRegistry.registerBlock(Blocks.SharpnetPoster1, Blocks.SharpnetPoster1.getUnlocalizedName());
        LanguageRegistry.addName(new ItemStack(Blocks.SharpnetPoster1, 1, 0), "Poster 1");
        
        Blocks.SharpnetPoster2 = new SharpnetPostsBlocks(Blocks.SharpnetPoster2_ID, Material.circuits).setUnlocalizedName("sharpnetposter2")
        .setHardness(0.4F).setTextureName(modid+":others/sharpnet").setCreativeTab(CreativeTabs.tabDecorations);
        GameRegistry.registerBlock(Blocks.SharpnetPoster2, Blocks.SharpnetPoster2.getUnlocalizedName());
        LanguageRegistry.addName(new ItemStack(Blocks.SharpnetPoster2, 1, 0), "Poster 2");
        
        Blocks.SharpnetStocks10000 = new SharpnetPostsBlocks(Blocks.SharpnetStocks10000_ID, Material.circuits).setUnlocalizedName("sharpnetstocks10000")
        .setHardness(0.4F).setTextureName(modid+":money_stacks/stock").setCreativeTab(CreativeTabs.tabDecorations);
        GameRegistry.registerBlock(Blocks.SharpnetStocks10000, Blocks.SharpnetStocks10000.getUnlocalizedName());
        LanguageRegistry.addName(new ItemStack(Blocks.SharpnetStocks10000, 1, 0), "Sharpnet Stocks 10000");
        
        Blocks.lamps1_block = new SharpnetLamps1Block(Blocks.lamps1_block_ID).setUnlocalizedName("SharpnetLamps1Block");
        GameRegistry.registerBlock(Blocks.lamps1_block, SharpnetLamps1ItemBlocks.class, Blocks.lamps1_block.getUnlocalizedName());
        LanguageRegistry.addName(new ItemStack(Blocks.lamps1_block, 1, 0), "Garden Lamp 1");
        LanguageRegistry.addName(new ItemStack(Blocks.lamps1_block, 1, 1), "Garden Lamp 2");
        LanguageRegistry.addName(new ItemStack(Blocks.lamps1_block, 1, 2), "Lamp Modern 1");
        LanguageRegistry.addName(new ItemStack(Blocks.lamps1_block, 1, 3), "Lamp Modern 2");
        LanguageRegistry.addName(new ItemStack(Blocks.lamps1_block, 1, 4), "Lamp Old 1");
        LanguageRegistry.addName(new ItemStack(Blocks.lamps1_block, 1, 5), "Lamp Old 2");
        LanguageRegistry.addName(new ItemStack(Blocks.lamps1_block, 1, 6), "Candelier 1");
        LanguageRegistry.addName(new ItemStack(Blocks.lamps1_block, 1, 7), "Bulb - On");
        
        Blocks.garden_deco_block = new SharpnetGardenDecoBlocks1(Blocks.garden_deco_block_ID).setUnlocalizedName("SharpnetGardenDecoBlocks1");
        GameRegistry.registerBlock(Blocks.garden_deco_block, SharpnetGardenDecoItemBlocks1.class, Blocks.garden_deco_block.getUnlocalizedName());
        LanguageRegistry.addName(new ItemStack(Blocks.garden_deco_block, 1, 0), "Dwarf");
        LanguageRegistry.addName(new ItemStack(Blocks.garden_deco_block, 1, 1), "Smurf");
        LanguageRegistry.addName(new ItemStack(Blocks.garden_deco_block, 1, 2), "X-Mass Tree");
        LanguageRegistry.addName(new ItemStack(Blocks.garden_deco_block, 1, 3), "Stone 1");
        LanguageRegistry.addName(new ItemStack(Blocks.garden_deco_block, 1, 4), "Stone 2");
        LanguageRegistry.addName(new ItemStack(Blocks.garden_deco_block, 1, 5), "Stone 3");
        LanguageRegistry.addName(new ItemStack(Blocks.garden_deco_block, 1, 6), "Stone 4");
        LanguageRegistry.addName(new ItemStack(Blocks.garden_deco_block, 1, 7), "Graveyard 1");
        LanguageRegistry.addName(new ItemStack(Blocks.garden_deco_block, 1, 8), "Graveyard 2");
        LanguageRegistry.addName(new ItemStack(Blocks.garden_deco_block, 1, 9), "Church Bell");
        
        /* ToDo
        Blocks.flowerPot1_block = new SharpnetFlowerPot1(Blocks.flowerPot1_block_ID).setUnlocalizedName("SharpnetFlowerPot1");
        GameRegistry.registerBlock(Blocks.flowerPot1_block, Blocks.flowerPot1_block.getUnlocalizedName());
        LanguageRegistry.addName(new ItemStack(Blocks.flowerPot1_block, 1, 0), "SH. Flower Pot 1");
        */
        
        Blocks.SharpnetSnowHillSnow = new SharpnetSnowHillSnowBlocks(Blocks.SharpnetSnowHillSnow_ID, new String[][]
        {
            {"snow1","minecraft:snow"},
            {"snow2","minecraft:snow"},
            {"snow3","minecraft:snow"}
        }).setUnlocalizedName("SharpnetSnowHillSnowBlocks").setHardness(0.2F).setResistance(0.0F).setCreativeTab(CreativeTabs.tabDecorations).setStepSound(Block.soundSnowFootstep);
        GameRegistry.registerBlock(Blocks.SharpnetSnowHillSnow, SharpnetSnowHillSnowItemBlocks.class, Blocks.SharpnetSnowHillSnow.getUnlocalizedName());
        LanguageRegistry.addName(new ItemStack(Blocks.SharpnetSnowHillSnow, 1, 0), "Snow (Blue)");
        LanguageRegistry.addName(new ItemStack(Blocks.SharpnetSnowHillSnow, 1, 1), "Snow (Red)");
        LanguageRegistry.addName(new ItemStack(Blocks.SharpnetSnowHillSnow, 1, 2), "Snow (Black)");
        
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
        
        Items.mutton_raw = (new ItemFood(Items.mutton_raw_ID, 3 , 0.3F, true).setUnlocalizedName("Mutton_Raw").setTextureName(modid+":food/mutton_raw"));
        GameRegistry.registerItem(Items.mutton_raw, "Mutton Raw");
        LanguageRegistry.addName(new ItemStack(Items.mutton_raw, 1, 0), "Mutton Raw");
        
        //Place holder Mutton for next MC version
        Items.mutton_cooked = new ShItemFood(Items.mutton_cooked_ID, 6 , 0.8F, true ).setUnlocalizedName("mutton_cooked").setTextureName(modid+":food/mutton_cooked");
        GameRegistry.registerItem(Items.mutton_cooked, "Mutton Cooked");
        LanguageRegistry.addName(new ItemStack(Items.mutton_cooked, 1, 0), "Mutton Cooked");
        
        Items.tea_seeds = new ShItemSeeds(Items.tea_seeds_ID, Blocks.SharpnetPlantsBlocks2.blockID, Block.tilledField.blockID, 0).setUnlocalizedName("SharpnetTeaSeedsItem").setTextureName(modid+":seeds/seeds_tea");
        GameRegistry.registerItem(Items.tea_seeds, "Tea Seeds");
        LanguageRegistry.addName(new ItemStack(Items.tea_seeds, 1, 0), "Tea Seeds");
        
        Items.tea_leaves = (new Item(Items.tea_leaves_ID).setUnlocalizedName("Tea_Leaves").setTextureName(modid+":drinks&food/tea_leaves").setCreativeTab(CreativeTabs.tabFood));
        GameRegistry.registerItem(Items.tea_leaves, "Tea Leaves");
        LanguageRegistry.addName(new ItemStack(Items.tea_leaves, 1, 0), "Tea Leaves");
        
        Items.cofee_beans_raw = new ShItemSeeds(Items.cofee_beans_raw_ID, Blocks.SharpnetPlantsBlocks2.blockID, Block.tilledField.blockID, 3).setUnlocalizedName("SharpnetCofeeSeedsItem").setTextureName(modid+":seeds/seeds_cofee");
        GameRegistry.registerItem(Items.cofee_beans_raw, "Cofee Beans Raw");
        LanguageRegistry.addName(new ItemStack(Items.cofee_beans_raw, 1, 0), "Cofee Beans Raw");
        
        Items.cofee_beans = (new Item(Items.cofee_beans_ID).setUnlocalizedName("Cofee_Beans").setTextureName(modid+":drinks&food/cofee_beans").setCreativeTab(CreativeTabs.tabFood));
        GameRegistry.registerItem(Items.cofee_beans, "Cofee Beans");
        LanguageRegistry.addName(new ItemStack(Items.cofee_beans, 1, 0), "Cofee Beans");
        
        Items.grape_red_seeds = new ShItemSeeds(Items.grape_red_seeds_ID, SharpnetPlantsBlocks1.blockID, Block.tilledField.blockID, 12).setUnlocalizedName("SharpnetGrapeRedSeedsItem").setTextureName(modid+":seeds/seeds_grape_red");
        GameRegistry.registerItem(Items.grape_red_seeds, "Grape Red Seeds");
        LanguageRegistry.addName(new ItemStack(Items.grape_red_seeds, 1, 0), "Grape Red Seeds");
        
        Items.grape_red = new ShItemFood(Items.grape_red_ID, 4 , 0.2F, false ).setUnlocalizedName("grape_red").setTextureName(modid+":food/grape_red");
        GameRegistry.registerItem(Items.grape_red, "Grape Red");
        LanguageRegistry.addName(new ItemStack(Items.grape_red, 1, 0), "Grape Red");
        
        Items.grape_white_seeds = new ShItemSeeds(Items.grape_white_seeds_ID, Blocks.SharpnetPlantsBlocks2.blockID, Block.tilledField.blockID, 6).setUnlocalizedName("SharpnetGrapeWhiteSeedsItem").setTextureName(modid+":seeds/seeds_grape_white");
        GameRegistry.registerItem(Items.grape_white_seeds, "Grape White Seeds");
        LanguageRegistry.addName(new ItemStack(Items.grape_white_seeds, 1, 0), "Grape White Seeds");
        
        Items.grape_white = new ShItemFood(Items.grape_white_ID, 4 , 0.2F, false ).setUnlocalizedName("grape_white").setTextureName(modid+":food/grape_white");
        GameRegistry.registerItem(Items.grape_white, "Grape White");
        LanguageRegistry.addName(new ItemStack(Items.grape_white, 1, 0), "Grape White");
        
        Items.bottle_of_milk = new ShItemFood(Items.bottle_of_milk_ID, 6 , 1.0F, false ).setUnlocalizedName("bottle_of_milk").setTextureName(modid+":drinks&food/milk_bottle");
        GameRegistry.registerItem(Items.bottle_of_milk, "Bottle of Milk");
        LanguageRegistry.addName(new ItemStack(Items.bottle_of_milk, 1, 0), "Bottle of Milk");
        
        Items.sliced_potatoe = (new Item(Items.sliced_potatoe_ID).setUnlocalizedName("sliced_potatoe").setTextureName(modid+":food/potatoe_sliced").setCreativeTab(CreativeTabs.tabFood));
        GameRegistry.registerItem(Items.sliced_potatoe, "Sliced Potatoe");
        LanguageRegistry.addName(new ItemStack(Items.sliced_potatoe, 1, 0), "Sliced Potatoe");
        
        Items.potatoes_chips = new ShItemFood(Items.potatoes_chips_ID, 2 , 0.4F, false ).setUnlocalizedName("potatoes_chips").setTextureName(modid+":food/potato_chips");
        GameRegistry.registerItem(Items.potatoes_chips, "Potatoes Chips");
        LanguageRegistry.addName(new ItemStack(Items.potatoes_chips, 1, 0), "Potatoes Chips");
        
        Items.flour = (new Item(Items.flour_ID).setUnlocalizedName("flour").setTextureName(modid+":food/flour").setCreativeTab(CreativeTabs.tabFood));
        GameRegistry.registerItem(Items.flour, "Flour");
        LanguageRegistry.addName(new ItemStack(Items.flour, 1, 0), "Flour");
        
        Items.dough = (new Item(Items.dough_ID).setUnlocalizedName("dough").setTextureName(modid+":food/dough").setCreativeTab(CreativeTabs.tabFood));
        GameRegistry.registerItem(Items.dough, "Dough");
        LanguageRegistry.addName(new ItemStack(Items.dough, 1, 0), "Dough");
        
        Items.butter = (new Item(Items.butter_ID).setUnlocalizedName("butter").setTextureName(modid+":food/butter").setCreativeTab(CreativeTabs.tabFood));
        GameRegistry.registerItem(Items.butter, "Butter");
        LanguageRegistry.addName(new ItemStack(Items.butter, 1, 0), "Butter");
        
        Items.tomato_puree = (new Item(Items.tomato_puree_ID).setUnlocalizedName("tomato_puree").setTextureName(modid+":food/tomato_puree").setCreativeTab(CreativeTabs.tabFood));
        GameRegistry.registerItem(Items.tomato_puree, "Tomato Puree");
        LanguageRegistry.addName(new ItemStack(Items.tomato_puree, 1, 0), "Tomato Puree");
        
        Items.cheese = new ShItemFood(Items.cheese_ID, 8 , 2.5F, false ).setUnlocalizedName("cheese").setTextureName(modid+":food/cheese");
        GameRegistry.registerItem(Items.cheese, "Cheese");
        LanguageRegistry.addName(new ItemStack(Items.cheese, 1, 0), "Cheese");
        
        Items.raw_pizza = (new Item(Items.raw_pizza_ID).setUnlocalizedName("raw_pizza").setTextureName(modid+":drinks&food/pizza1").setCreativeTab(CreativeTabs.tabFood));
        GameRegistry.registerItem(Items.raw_pizza, "Raw Pizza");
        LanguageRegistry.addName(new ItemStack(Items.raw_pizza, 1, 0), "Raw Pizza");
        
        Items.slice_of_bread = new ShItemFood(Items.slice_of_bread_ID, 2 , 0.8F, false ).setUnlocalizedName("slice_of_bread").setTextureName(modid+":food/bread_slice_of");
        GameRegistry.registerItem(Items.slice_of_bread, "Slice of Bread");
        LanguageRegistry.addName(new ItemStack(Items.slice_of_bread, 1, 0), "Slice of Bread");
        
        Items.breadcrumbs = (new Item(Items.breadcrumbs_ID).setUnlocalizedName("breadcrumbs").setTextureName(modid+":food/breadcrumbs").setCreativeTab(CreativeTabs.tabMaterials));
        GameRegistry.registerItem(Items.breadcrumbs, "Breadcrumbs");
        LanguageRegistry.addName(new ItemStack(Items.breadcrumbs, 1, 0), "Breadcrumbs");
        
        Items.fillet = new ShItemFood(Items.fillet_ID, 7 , 1.0F, false ).setUnlocalizedName("fillet").setTextureName(modid+":food/fillet");
        GameRegistry.registerItem(Items.fillet, "Fillet");
        LanguageRegistry.addName(new ItemStack(Items.fillet, 1, 0), "Fillet");
        
        Items.popcorn = new ShItemFood(Items.popcorn_ID, 2 , 0.5F, false ).setUnlocalizedName("popcorn").setTextureName(modid+":food/popcorn");
        GameRegistry.registerItem(Items.popcorn, "Popcorn");
        LanguageRegistry.addName(new ItemStack(Items.popcorn, 1, 0), "Popcorn");
        
        Items.chocolate = new ShItemFood(Items.chocolate_ID, 5 , 1.0F, false ).setUnlocalizedName("chocolate").setTextureName(modid+":food/chocolate");
        GameRegistry.registerItem(Items.chocolate, "Chocolate");
        LanguageRegistry.addName(new ItemStack(Items.chocolate, 1, 0), "Chocolate");
        
        Items.gingerbread_dough = (new Item(Items.gingerbread_dough_ID).setUnlocalizedName("gingerbread_dough").setTextureName(modid+":food/gingerbread_dough").setCreativeTab(CreativeTabs.tabFood));
        GameRegistry.registerItem(Items.gingerbread_dough, "Gingerbread Dough");
        LanguageRegistry.addName(new ItemStack(Items.gingerbread_dough, 1, 0), "Dough");
        
        Items.gingerbread1 = new ShItemFood(Items.gingerbread1_ID, 3 , 0.5F, false ).setUnlocalizedName("gingerbread1").setTextureName(modid+":food/gingerbread1");
        GameRegistry.registerItem(Items.gingerbread1, "Gingerbread 1");
        LanguageRegistry.addName(new ItemStack(Items.gingerbread1, 1, 0), "Gingerbread 1");
        
        Items.gingerbread2 = new ShItemFood(Items.gingerbread2_ID, 3 , 0.5F, false ).setUnlocalizedName("gingerbread2").setTextureName(modid+":food/gingerbread2");
        GameRegistry.registerItem(Items.gingerbread2, "Gingerbread 2");
        LanguageRegistry.addName(new ItemStack(Items.gingerbread2, 1, 0), "Gingerbread 2");
        
        Items.bonbon = new ShItemFood(Items.bonbon_ID, 2 , 0.4F, false ).setUnlocalizedName("bonbon").setTextureName(modid+":food/bonbon");
        GameRegistry.registerItem(Items.bonbon, "bonbon");
        LanguageRegistry.addName(new ItemStack(Items.bonbon, 1, 0), "bonbon");
        
        //Item Alcohol
        Items.beer = new ShItemFoodPlacer(Items.beer_ID, 6, 2.0F, false, Blocks.drinks1_block.blockID, 0, 2, 20).setUnlocalizedName("Beer").setTextureName(modid+":drinks&food/beer");
        GameRegistry.registerItem(Items.beer, "Beer");
        LanguageRegistry.addName(new ItemStack(Items.beer, 1, 0), "Beer");
        
        Items.wine_red = new ShItemFoodPlacer(Items.wine_red_ID, 10, 3.0F, false, Blocks.drinks1_block.blockID, 1, 2, 60).setUnlocalizedName("Wine_red").setTextureName(modid+":drinks&food/wine_red");
        GameRegistry.registerItem(Items.wine_red, "Wine Red");
        LanguageRegistry.addName(new ItemStack(Items.wine_red, 1, 0), "Wine Red");
        
        Items.wine_white = new ShItemFoodPlacer(Items.wine_white_ID, 10, 3.0F, false, Blocks.drinks2_block.blockID, 0, 2, 60).setUnlocalizedName("Wine_white").setTextureName(modid+":drinks&food/wine_white");
        GameRegistry.registerItem(Items.wine_white, "Wine White");
        LanguageRegistry.addName(new ItemStack(Items.wine_white, 1, 0), "Wine White");
        
        Items.cofee = new ShItemFoodPlacer(Items.cofee_ID, 3, 0.5F, false, Blocks.drinks1_block.blockID, 2, 1, 40).setUnlocalizedName("Cofee").setTextureName(modid+":drinks&food/cofee");
        GameRegistry.registerItem(Items.cofee, "Cofee");
        LanguageRegistry.addName(new ItemStack(Items.cofee, 1, 0), "Cofee");
        
        Items.whiskey = new ShItemFoodPlacer(Items.whiskey_ID, 14, 3.0F, false, Blocks.drinks1_block.blockID, 3, 2, 60).setUnlocalizedName("Whiskey").setTextureName(modid+":drinks&food/whiskey");
        GameRegistry.registerItem(Items.whiskey, "Whiskey");
        LanguageRegistry.addName(new ItemStack(Items.whiskey, 1, 0), "Whiskey");
        
        Items.tequilla_silver = new ShItemFoodPlacer(Items.tequilla_silver_ID, 12, 1.0F, false, Blocks.drinks1_block.blockID, 4, 2, 60).setUnlocalizedName("Tequilla_silver").setTextureName(modid+":drinks&food/tequilla_s");
        GameRegistry.registerItem(Items.tequilla_silver, "Tequilla Silver");
        LanguageRegistry.addName(new ItemStack(Items.tequilla_silver, 1, 0), "Tequilla Silver");
        
        Items.tequilla_gold = new ShItemFoodPlacer(Items.tequilla_gold_ID, 13, 1.2F, false, Blocks.drinks1_block.blockID, 5, 2, 60).setUnlocalizedName("Tequilla_gold").setTextureName(modid+":drinks&food/tequilla_g");
        GameRegistry.registerItem(Items.tequilla_gold, "Tequilla Gold");
        LanguageRegistry.addName(new ItemStack(Items.tequilla_gold, 1, 0), "Tequilla Gold");
        
        Items.rum = new ShItemFoodPlacer(Items.rum_ID, 10, 1.0F, false, Blocks.drinks1_block.blockID, 6, 2, 50).setUnlocalizedName("Rum").setTextureName(modid+":drinks&food/rum");
        GameRegistry.registerItem(Items.rum, "Rum");
        LanguageRegistry.addName(new ItemStack(Items.rum, 1, 0), "Rum");
        
        Items.semtex = new ShItemFoodPlacer(Items.semtex_ID, 5, 0.5F, false, Blocks.drinks1_block.blockID, 7, 1, 60).setUnlocalizedName("Semtex").setTextureName(modid+":drinks&food/semtex");
        GameRegistry.registerItem(Items.semtex, "Semtex");
        LanguageRegistry.addName(new ItemStack(Items.semtex, 1, 0), "Semtex");
        
        Items.cup_of_tea = new ShItemFoodPlacer(Items.cup_of_tea_ID, 4, 0.5F, false, Blocks.drinks1_block.blockID, 8, 0, 0).setUnlocalizedName("Cup_of_tea").setTextureName(modid+":drinks&food/tea_cup");
        GameRegistry.registerItem(Items.cup_of_tea, "Cup of Tea");
        LanguageRegistry.addName(new ItemStack(Items.cup_of_tea, 1, 0), "Cup of Tea");
        
        Items.hot_chocolate = new ShItemFoodPlacer(Items.hot_chocolate_ID, 7, 0.8F, false, Blocks.drinks1_block.blockID, 9, 0, 0).setUnlocalizedName("Hot_chocolate").setTextureName(modid+":drinks&food/chocolate_hot");
        GameRegistry.registerItem(Items.hot_chocolate, "Hot Chocolate");
        LanguageRegistry.addName(new ItemStack(Items.hot_chocolate, 1, 0), "Hot Chocolate");
        
        Items.honey = new ShItemFoodPlacer(Items.honey_ID, 4, 0.8F, false, Blocks.drinks1_block.blockID, 10, 0, 0).setUnlocalizedName("Honey").setTextureName(modid+":drinks&food/honey");
        GameRegistry.registerItem(Items.honey, "Honey");
        LanguageRegistry.addName(new ItemStack(Items.honey, 1, 0), "Honey");
        
        Items.catchup = new ShItemFoodPlacer(Items.catchup_ID, 9, 1.0F, false, Blocks.drinks1_block.blockID, 11, 0, 0).setUnlocalizedName("Catchup").setTextureName(modid+":drinks&food/catchup");
        GameRegistry.registerItem(Items.catchup, "Catchup");
        LanguageRegistry.addName(new ItemStack(Items.catchup, 1, 0), "Catchup");
        
        Items.glass_of_red_vine = new ShItemFoodPlacer(Items.glass_of_red_vine_ID, 3, 3.0F, false, Blocks.drinks1_block.blockID, 12, 2, 15).setUnlocalizedName("Glass_of_red_vine").setTextureName(modid+":drinks&food/glass_of_vine_red");
        GameRegistry.registerItem(Items.glass_of_red_vine, "Glass of red vine");
        LanguageRegistry.addName(new ItemStack(Items.glass_of_red_vine, 1, 0), "Glass of red vine");
        
        Items.glass_of_white_vine = new ShItemFoodPlacer(Items.glass_of_white_vine_ID, 3, 3.0F, false, Blocks.drinks2_block.blockID, 1, 2, 15).setUnlocalizedName("Glass_of_white_vine").setTextureName(modid+":drinks&food/glass_of_vine_white");
        GameRegistry.registerItem(Items.glass_of_white_vine, "Glass of white vine");
        LanguageRegistry.addName(new ItemStack(Items.glass_of_white_vine, 1, 0), "Glass of white vine");
        
        Items.vodka = new ShItemFoodPlacer(Items.vodka_ID, 10, 1.0F, false, Blocks.drinks1_block.blockID, 13, 2, 5).setUnlocalizedName("Vodka").setTextureName(modid+":drinks&food/vodka");
        GameRegistry.registerItem(Items.vodka, "Vodka");
        LanguageRegistry.addName(new ItemStack(Items.vodka, 1, 0), "Vodka");
        
        Items.cocacola = new ShItemFoodPlacer(Items.cocacola_ID, 6, 0.8F, false, Blocks.drinks1_block.blockID, 14, 1, 20).setUnlocalizedName("Cocacola").setTextureName(modid+":drinks&food/cocacola");
        GameRegistry.registerItem(Items.cocacola, "Cocacola");
        LanguageRegistry.addName(new ItemStack(Items.cocacola, 1, 0), "Cocacola");
        
        Items.bottle = new ShItemPlacer(Items.bottle_ID, Blocks.drinks1_block.blockID, 15).setUnlocalizedName("Bottle_Empty").setTextureName(modid+":drinks&food/bottle");
        GameRegistry.registerItem(Items.bottle, "Bottle Empty");
        LanguageRegistry.addName(new ItemStack(Items.bottle, 1, 0), "Bottle Empty");
        
        Items.pizza = new ShItemFoodPlacer(Items.pizza_ID, 20, 3.0F, false, Blocks.food1_block.blockID, 0, 0, 0).setUnlocalizedName("Pizza").setTextureName(modid+":drinks&food/pizza2");
        GameRegistry.registerItem(Items.pizza, "Pizza");
        LanguageRegistry.addName(new ItemStack(Items.pizza, 1, 0), "Pizza");
        
        Items.salad = new ShItemFoodPlacer(Items.salad_ID, 6, 0.8F, false, Blocks.food1_block.blockID, 1, 0, 0).setUnlocalizedName("Salad").setTextureName(modid+":drinks&food/potato_salad");
        GameRegistry.registerItem(Items.salad, "Salad");
        LanguageRegistry.addName(new ItemStack(Items.salad, 1, 0), "Salad");
        
        Items.salad_fillet = new ShItemFoodPlacer(Items.salad_fillet_ID, 18, 0.8F, false, Blocks.food1_block.blockID, 2, 0, 0).setUnlocalizedName("salad_fillet").setTextureName(modid+":drinks&food/salad_fillet");
        GameRegistry.registerItem(Items.salad_fillet, "Salad + Fillet");
        LanguageRegistry.addName(new ItemStack(Items.salad_fillet, 1, 0), "Salad + Fillet");
                
        Items.barrel = (new ShItemPlacer(Items.barrel_ID, Blocks.deco1_block.blockID,0).setUnlocalizedName("barrel").setTextureName(modid+":resources/barrel").setCreativeTab(CreativeTabs.tabDecorations));
        GameRegistry.registerItem(Items.barrel, "Barrel");
        LanguageRegistry.addName(new ItemStack(Items.barrel, 1, 0), "Barrel");
        
        Items.barrel_of_wine_red = (new ShItemPlacer(Items.barrel_of_wine_red_ID, Blocks.deco1_block.blockID,1).setUnlocalizedName("barrel_of_wine_red").setTextureName(modid+":resources/barrel_of_wine_red").setCreativeTab(CreativeTabs.tabDecorations));
        GameRegistry.registerItem(Items.barrel_of_wine_red, "Barrel of Wine Red");
        LanguageRegistry.addName(new ItemStack(Items.barrel_of_wine_red, 1, 0), "Barrel of Wine Red");
        
        Items.barrel_of_wine_white = (new ShItemPlacer(Items.barrel_of_wine_white_ID, Blocks.deco1_block.blockID,2).setUnlocalizedName("barrel_of_wine").setTextureName(modid+":resources/barrel_of_wine_white").setCreativeTab(CreativeTabs.tabDecorations));
        GameRegistry.registerItem(Items.barrel_of_wine_white, "Barrel of Wine White");
        LanguageRegistry.addName(new ItemStack(Items.barrel_of_wine_white, 1, 0), "Barrel of Wine White");
        
        Items.test_tube = (new Item(Items.test_tube_ID).setUnlocalizedName("test_tube").setTextureName(modid+":drinks&food/test_tube").setCreativeTab(CreativeTabs.tabMaterials));
        GameRegistry.registerItem(Items.test_tube, "Test Tube");
        LanguageRegistry.addName(new ItemStack(Items.test_tube, 1, 0), "Test Tube");
        
        Items.mixed_ethanol = (new Item(Items.mixed_ethanol_ID).setUnlocalizedName("mixed_ethanol").setTextureName(modid+":drinks&food/test_tube_2").setCreativeTab(CreativeTabs.tabMaterials));
        GameRegistry.registerItem(Items.mixed_ethanol, "Mixed Ethanol");
        LanguageRegistry.addName(new ItemStack(Items.mixed_ethanol, 1, 0), "Mixed Ethanol");
        
        Items.destiledEthanol_1 = (new Item(Items.destiledEthanol_1_ID).setUnlocalizedName("destiledEthanol_1").setTextureName(modid+":drinks&food/test_tube_3").setCreativeTab(CreativeTabs.tabMaterials));
        GameRegistry.registerItem(Items.destiledEthanol_1, "1 Destiled Ethanol");
        LanguageRegistry.addName(new ItemStack(Items.destiledEthanol_1, 1, 0), "1 Destiled Ethanol");
        
        Items.destiledEthanol_2 = (new Item(Items.destiledEthanol_2_ID).setUnlocalizedName("destiledEthanol_2").setTextureName(modid+":drinks&food/test_tube_4").setCreativeTab(CreativeTabs.tabMaterials));
        GameRegistry.registerItem(Items.destiledEthanol_2, "2 Destiled Ethanol");
        LanguageRegistry.addName(new ItemStack(Items.destiledEthanol_2, 1, 0), "2 Destiled Ethanol");
        
        Items.destiledEthanol_3 = (new Item(Items.destiledEthanol_3_ID).setUnlocalizedName("destiledEthanol_3").setTextureName(modid+":drinks&food/test_tube_5").setCreativeTab(CreativeTabs.tabMaterials));
        GameRegistry.registerItem(Items.destiledEthanol_3, "3 Destiled Ethanol");
        LanguageRegistry.addName(new ItemStack(Items.destiledEthanol_3, 1, 0), "3 Destiled Ethanol");
        
        Items.liquid_sugar = (new Item(Items.liquid_sugar_ID).setUnlocalizedName("liquid_sugar").setTextureName(modid+":drinks&food/flask_sugar").setCreativeTab(CreativeTabs.tabMaterials));
        GameRegistry.registerItem(Items.liquid_sugar, "Liquid Sugar");
        LanguageRegistry.addName(new ItemStack(Items.liquid_sugar, 1, 0), "Liquid Sugar");
        
        //Records
        Items.CD_1 = new ShRecord(Items.CD_1_ID, "modsharpnet:cd1") .setTextureName(modid+":records/1") .setUnlocalizedName("cd1");
        GameRegistry.registerItem(Items.CD_1, "CD 1");
        LanguageRegistry.addName(new ItemStack(Items.CD_1, 1, 0), "CD 1");
        Items.CD_2 = new ShRecord(Items.CD_2_ID, "modsharpnet:cd2") .setTextureName(modid+":records/2") .setUnlocalizedName("cd2");
        GameRegistry.registerItem(Items.CD_2, "CD 2");
        LanguageRegistry.addName(new ItemStack(Items.CD_2, 1, 0), "CD 2");
        
        //Value
        Items.cent = (new Item(Items.cent_ID).setUnlocalizedName("cent").setTextureName(modid+":resources/cent").setCreativeTab(CreativeTabs.tabDecorations));
        GameRegistry.registerItem(Items.cent, "Cent");
        LanguageRegistry.addName(new ItemStack(Items.cent, 1, 0), "Cent");
        
        Items.money10eu = (new Item(Items.money10eu_ID).setUnlocalizedName("10eu").setTextureName(modid+":resources/10eu").setCreativeTab(CreativeTabs.tabDecorations));
        GameRegistry.registerItem(Items.money10eu, "10eu");
        LanguageRegistry.addName(new ItemStack(Items.money10eu, 1, 0), "10eu");
        
        Items.money100eu = (new Item(Items.money100eu_ID).setUnlocalizedName("100eu").setTextureName(modid+":resources/100eu").setCreativeTab(CreativeTabs.tabDecorations));
        GameRegistry.registerItem(Items.money100eu, "100eu");
        LanguageRegistry.addName(new ItemStack(Items.money100eu, 1, 0), "100eu");
        
        Items.money1000eu = (new Item(Items.money1000eu_ID).setUnlocalizedName("1000eu").setTextureName(modid+":resources/1000eu").setCreativeTab(CreativeTabs.tabDecorations));
        GameRegistry.registerItem(Items.money1000eu, "1000eu");
        LanguageRegistry.addName(new ItemStack(Items.money1000eu, 1, 0), "1000eu");
        
        Items.stack_9x10euMoneys = (new ShItemPlacer(Items.stack_9x10euMoneys_ID, Blocks.SharpnetMoneyBlock.blockID,4).setUnlocalizedName("stack_9x10euMoneys").setTextureName(modid+":resources/10E_stack").setCreativeTab(CreativeTabs.tabDecorations));
        GameRegistry.registerItem(Items.stack_9x10euMoneys, "Stack of 90Eu");
        LanguageRegistry.addName(new ItemStack(Items.stack_9x10euMoneys, 1, 0), "Stack of 90Eu");
        
        Items.stack_9x100euMoneys = (new ShItemPlacer(Items.stack_9x100euMoneys_ID, Blocks.SharpnetMoneyBlock.blockID,5).setUnlocalizedName("stack_9x100euMoneys").setTextureName(modid+":resources/100E_stack").setCreativeTab(CreativeTabs.tabDecorations));
        GameRegistry.registerItem(Items.stack_9x100euMoneys, "Stack of 900Eu");
        LanguageRegistry.addName(new ItemStack(Items.stack_9x100euMoneys, 1, 0), "Stack of 900Eu");
        
        Items.stack_9x1000euMoneys = (new ShItemPlacer(Items.stack_9x1000euMoneys_ID, Blocks.SharpnetMoneyBlock.blockID,6).setUnlocalizedName("stack_9x1000euMoneys").setTextureName(modid+":resources/1000E_stack").setCreativeTab(CreativeTabs.tabDecorations));
        GameRegistry.registerItem(Items.stack_9x1000euMoneys, "Stack of 9000Eu");
        LanguageRegistry.addName(new ItemStack(Items.stack_9x1000euMoneys, 1, 0), "Stack of 9000Eu");
        
        Items.sgros = (new Item(Items.sgros_ID).setUnlocalizedName("sgros").setTextureName(modid+":resources/gros_s").setCreativeTab(CreativeTabs.tabDecorations));
        GameRegistry.registerItem(Items.sgros, "Stribrnak");
        LanguageRegistry.addName(new ItemStack(Items.sgros, 1, 0), "Stribrnak");
        
        Items.zgros = (new Item(Items.zgros_ID).setUnlocalizedName("zgros").setTextureName(modid+":resources/gros_z").setCreativeTab(CreativeTabs.tabDecorations));
        GameRegistry.registerItem(Items.zgros, "Zlatak");
        LanguageRegistry.addName(new ItemStack(Items.zgros, 1, 0), "Zlatak");
        
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
        
        Items.armor_skirt_purple = (new SharpnetArmor(Items.armor_skirt_purple_ID, SharpnetArmorCloth, 0, 2, 6, "skirt_purple", "armor/short").setUnlocalizedName("skirt_purple"));
        GameRegistry.registerItem(Items.armor_trousers_black, "Skirt Purple");
        LanguageRegistry.addName(new ItemStack(Items.armor_skirt_purple, 1, 0), "Skirt Purple");
        
        Items.armor_skirt_green = (new SharpnetArmor(Items.armor_skirt_green_ID, SharpnetArmorCloth, 0, 2, 6, "skirt_green", "armor/short").setUnlocalizedName("askirt_green"));
        GameRegistry.registerItem(Items.armor_skirt_green, "Skirt Green");
        LanguageRegistry.addName(new ItemStack(Items.armor_skirt_green, 1, 0), "Skirt Green");
        
        Items.armor_tshirt_red = (new SharpnetArmor(Items.armor_tshirt_red_ID, SharpnetArmorCloth, 0, 1, 10, "tshirt_red", "armor/body").setUnlocalizedName("t-shirt_red"));
        GameRegistry.registerItem(Items.armor_tshirt_red, "T-Shirt Red");
        LanguageRegistry.addName(new ItemStack(Items.armor_tshirt_red, 1, 0), "T-Shirt Red");
        
        //Item Tools
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
        
        Items.debug = (new debugItem(Items.debug_ID).setUnlocalizedName("debug_item"));
        GameRegistry.registerItem(Items.debug, "Debug Item");
        LanguageRegistry.addName(new ItemStack(Items.debug, 1, 0), "Debug Item");
        
        Items.lighter = (new SharpnetLighter(Items.lighter_ID).setUnlocalizedName("lighter"));
        GameRegistry.registerItem(Items.lighter, "Lighter");
        LanguageRegistry.addName(new ItemStack(Items.lighter, 1, 0), "Lighter");
        
        Items.rake = (new SharpnetRake(Items.rake_ID).setUnlocalizedName("rake"));
        GameRegistry.registerItem(Items.rake, "Rake");
        LanguageRegistry.addName(new ItemStack(Items.rake, 1, 0), "Rake");
        
        //Item Resources
        Items.roofing_tile = (new Item(Items.roofing_tile_ID).setUnlocalizedName("Roofing_tile").setTextureName(modid+":resources/roofing_tile").setCreativeTab(CreativeTabs.tabMaterials));
        GameRegistry.registerItem(Items.roofing_tile, "Roofing Tile");
        LanguageRegistry.addName(new ItemStack(Items.roofing_tile, 1, 0), "Roofing Tile");
        
        Items.iron_bar = (new Item(Items.iron_bar_ID).setUnlocalizedName("iron_bar").setTextureName(modid+":resources/iron_bar").setCreativeTab(CreativeTabs.tabMaterials));
        GameRegistry.registerItem(Items.iron_bar, "Iron Bar");
        LanguageRegistry.addName(new ItemStack(Items.iron_bar, 1, 0), "Iron Bar");
        
        Items.IngotSteel = (new Item(Items.IngotSteel_ID).setUnlocalizedName("IngotSteel").setTextureName(modid+":resources/ingot_steel").setCreativeTab(CreativeTabs.tabMaterials));
        GameRegistry.registerItem(Items.IngotSteel, "Steel Ingot");
        LanguageRegistry.addName(new ItemStack(Items.IngotSteel, 1, 0), "Steel Ingot");
        //Register new material as Ore Dictionary one
        OreDictionary.registerOre("ingotSteel", Items.IngotSteel);
        
        Items.oil_cell = (new Item(Items.oil_cell_ID).setUnlocalizedName("oil_cell").setTextureName(modid+":resources/cell_oil").setCreativeTab(CreativeTabs.tabMaterials));
        GameRegistry.registerItem(Items.oil_cell, "Oil Cell");
        LanguageRegistry.addName(new ItemStack(Items.oil_cell, 1, 0), "Oil Cell");
        
        Items.fuel_cell = (new Item(Items.fuel_cell_ID).setUnlocalizedName("fuel_cell").setTextureName(modid+":resources/cell_fuel").setCreativeTab(CreativeTabs.tabMaterials));
        GameRegistry.registerItem(Items.fuel_cell, "Fuel Cell");
        LanguageRegistry.addName(new ItemStack(Items.fuel_cell, 1, 0), "Fuel Cell");
        
        Items.cement = (new Item(Items.cement_ID).setUnlocalizedName("cement").setTextureName(modid+":resources/cement_bag").setCreativeTab(CreativeTabs.tabMaterials));
        GameRegistry.registerItem(Items.cement, "Cement");
        LanguageRegistry.addName(new ItemStack(Items.cement, 1, 0), "Cement");
        
        
        Items.cloth_black = (new Item(Items.cloth_black_ID).setUnlocalizedName("Cloth_black").setTextureName(modid+":resources/cloth_black").setCreativeTab(CreativeTabs.tabMaterials));
        GameRegistry.registerItem(Items.cloth_black, "Cloth Black");
        LanguageRegistry.addName(new ItemStack(Items.cloth_black, 1, 0), "Cloth Black");
        Items.cloth_blue = (new Item(Items.cloth_blue_ID).setUnlocalizedName("Cloth_blue").setTextureName(modid+":resources/cloth_blue").setCreativeTab(CreativeTabs.tabMaterials));
        GameRegistry.registerItem(Items.cloth_blue, "Cloth Blue");
        LanguageRegistry.addName(new ItemStack(Items.cloth_blue, 1, 0), "Cloth Blue");
        Items.cloth_brown = (new Item(Items.cloth_brown_ID).setUnlocalizedName("Cloth_brown").setTextureName(modid+":resources/cloth_brown").setCreativeTab(CreativeTabs.tabMaterials));
        GameRegistry.registerItem(Items.cloth_brown, "Cloth Brown");
        LanguageRegistry.addName(new ItemStack(Items.cloth_brown, 1, 0), "Cloth Brown");
        Items.cloth_gray = (new Item(Items.cloth_gray_ID).setUnlocalizedName("Cloth_gray").setTextureName(modid+":resources/cloth_gray").setCreativeTab(CreativeTabs.tabMaterials));
        GameRegistry.registerItem(Items.cloth_gray, "Cloth Gray");
        LanguageRegistry.addName(new ItemStack(Items.cloth_gray, 1, 0), "Cloth Gray");
        Items.cloth_green = (new Item(Items.cloth_green_ID).setUnlocalizedName("Cloth_green").setTextureName(modid+":resources/cloth_green").setCreativeTab(CreativeTabs.tabMaterials));
        GameRegistry.registerItem(Items.cloth_green, "Cloth Green");
        LanguageRegistry.addName(new ItemStack(Items.cloth_green, 1, 0), "Cloth Green");
        Items.cloth_orange = (new Item(Items.cloth_orange_ID).setUnlocalizedName("Cloth_orange").setTextureName(modid+":resources/cloth_orange").setCreativeTab(CreativeTabs.tabMaterials));
        GameRegistry.registerItem(Items.cloth_orange, "Cloth Orange");
        LanguageRegistry.addName(new ItemStack(Items.cloth_orange, 1, 0), "Cloth Orange");
        Items.cloth_red = (new Item(Items.cloth_red_ID).setUnlocalizedName("Cloth_red").setTextureName(modid+":resources/cloth_red").setCreativeTab(CreativeTabs.tabMaterials));
        GameRegistry.registerItem(Items.cloth_red, "Cloth Red");
        LanguageRegistry.addName(new ItemStack(Items.cloth_red, 1, 0), "Cloth Red");
        Items.cloth_white = (new Item(Items.cloth_white_ID).setUnlocalizedName("Cloth_white").setTextureName(modid+":resources/cloth_white").setCreativeTab(CreativeTabs.tabMaterials));
        GameRegistry.registerItem(Items.cloth_white, "Cloth White");
        LanguageRegistry.addName(new ItemStack(Items.cloth_white, 1, 0), "Cloth White");
        Items.cloth_yellow = (new Item(Items.cloth_yellow_ID).setUnlocalizedName("Cloth_yellow").setTextureName(modid+":resources/cloth_yellow").setCreativeTab(CreativeTabs.tabMaterials));
        GameRegistry.registerItem(Items.cloth_yellow, "Cloth Yellow");
        LanguageRegistry.addName(new ItemStack(Items.cloth_yellow, 1, 0), "Cloth Yellow");
        
        Items.roll_of_paper_black = (new Item(Items.roll_of_paper_black_ID).setUnlocalizedName("Roll_of_paper_black").setTextureName(modid+":resources/roll_of_paper_black").setCreativeTab(CreativeTabs.tabMaterials));
        GameRegistry.registerItem(Items.roll_of_paper_black, "Roll of paper black");
        LanguageRegistry.addName(new ItemStack(Items.roll_of_paper_black, 1, 0), "Roll of paper black");
        Items.roll_of_paper_blue = (new Item(Items.roll_of_paper_blue_ID).setUnlocalizedName("Roll_of_paper_blue").setTextureName(modid+":resources/roll_of_paper_blue").setCreativeTab(CreativeTabs.tabMaterials));
        GameRegistry.registerItem(Items.roll_of_paper_blue, "Roll of paper blue");
        LanguageRegistry.addName(new ItemStack(Items.roll_of_paper_blue, 1, 0), "Roll of paper blue");
        Items.roll_of_paper_brown = (new Item(Items.roll_of_paper_brown_ID).setUnlocalizedName("Roll_of_paper_brown").setTextureName(modid+":resources/roll_of_paper_brown").setCreativeTab(CreativeTabs.tabMaterials));
        GameRegistry.registerItem(Items.roll_of_paper_brown, "Roll of paper brown");
        LanguageRegistry.addName(new ItemStack(Items.roll_of_paper_brown, 1, 0), "Roll of paper brown");
        Items.roll_of_paper_green = (new Item(Items.roll_of_paper_green_ID).setUnlocalizedName("Roll_of_paper_green").setTextureName(modid+":resources/roll_of_paper_green").setCreativeTab(CreativeTabs.tabMaterials));
        GameRegistry.registerItem(Items.roll_of_paper_green, "Roll of paper green");
        LanguageRegistry.addName(new ItemStack(Items.roll_of_paper_green, 1, 0), "Roll of paper green");
        Items.roll_of_paper_orange = (new Item(Items.roll_of_paper_orange_ID).setUnlocalizedName("Roll_of_paper_orange").setTextureName(modid+":resources/roll_of_paper_orange").setCreativeTab(CreativeTabs.tabMaterials));
        GameRegistry.registerItem(Items.roll_of_paper_orange, "Roll of paper orange");
        LanguageRegistry.addName(new ItemStack(Items.roll_of_paper_orange, 1, 0), "Roll of paper orange");
        Items.roll_of_paper_red = (new Item(Items.roll_of_paper_red_ID).setUnlocalizedName("Roll_of_paper_red").setTextureName(modid+":resources/roll_of_paper_red").setCreativeTab(CreativeTabs.tabMaterials));
        GameRegistry.registerItem(Items.roll_of_paper_red, "Roll of paper red");
        LanguageRegistry.addName(new ItemStack(Items.roll_of_paper_red, 1, 0), "Roll of paper red");
        Items.roll_of_paper_white = (new Item(Items.roll_of_paper_white_ID).setUnlocalizedName("Roll_of_paper_white").setTextureName(modid+":resources/roll_of_paper_white").setCreativeTab(CreativeTabs.tabMaterials));
        GameRegistry.registerItem(Items.roll_of_paper_white, "Roll of paper white");
        LanguageRegistry.addName(new ItemStack(Items.roll_of_paper_white, 1, 0), "Roll of paper white");
        Items.roll_of_paper_yellow = (new Item(Items.roll_of_paper_yellow_ID).setUnlocalizedName("Roll_of_paper_yellow").setTextureName(modid+":resources/roll_of_paper_yellow").setCreativeTab(CreativeTabs.tabMaterials));
        GameRegistry.registerItem(Items.roll_of_paper_yellow, "Roll of paper yellow");
        LanguageRegistry.addName(new ItemStack(Items.roll_of_paper_yellow, 1, 0), "Roll of paper yellow");
        
        Items.tile_black = (new Item(Items.tile_black_ID).setUnlocalizedName("Tile_black").setTextureName(modid+":resources/tile_black").setCreativeTab(CreativeTabs.tabMaterials));
        GameRegistry.registerItem(Items.tile_black, "Tile black");
        LanguageRegistry.addName(new ItemStack(Items.tile_black, 1, 0), "Tile black");
        Items.tile_blue = (new Item(Items.tile_blue_ID).setUnlocalizedName("Tile_blue").setTextureName(modid+":resources/tile_blue").setCreativeTab(CreativeTabs.tabMaterials));
        GameRegistry.registerItem(Items.tile_blue, "Tile blue");
        LanguageRegistry.addName(new ItemStack(Items.tile_blue, 1, 0), "Tile blue");
        Items.tile_brown = (new Item(Items.tile_brown_ID).setUnlocalizedName("Tile_brown").setTextureName(modid+":resources/tile_brown").setCreativeTab(CreativeTabs.tabMaterials));
        GameRegistry.registerItem(Items.tile_brown, "Tile brown");
        LanguageRegistry.addName(new ItemStack(Items.tile_brown, 1, 0), "Tile brown");
        Items.tile_green = (new Item(Items.tile_green_ID).setUnlocalizedName("Tile_green").setTextureName(modid+":resources/tile_green").setCreativeTab(CreativeTabs.tabMaterials));
        GameRegistry.registerItem(Items.tile_green, "Tile green");
        LanguageRegistry.addName(new ItemStack(Items.tile_green, 1, 0), "Tile green");
        Items.tile_grey = (new Item(Items.tile_grey_ID).setUnlocalizedName("Tile_grey").setTextureName(modid+":resources/tile_grey").setCreativeTab(CreativeTabs.tabMaterials));
        GameRegistry.registerItem(Items.tile_grey, "Tile grey");
        LanguageRegistry.addName(new ItemStack(Items.tile_grey, 1, 0), "Tile grey");
        Items.tile_orange = (new Item(Items.tile_orange_ID).setUnlocalizedName("Tile_orange").setTextureName(modid+":resources/tile_orange").setCreativeTab(CreativeTabs.tabMaterials));
        GameRegistry.registerItem(Items.tile_orange, "Tile orange");
        LanguageRegistry.addName(new ItemStack(Items.tile_orange, 1, 0), "Tile orange");
        Items.tile_red = (new Item(Items.tile_red_ID).setUnlocalizedName("Tile_red").setTextureName(modid+":resources/tile_red").setCreativeTab(CreativeTabs.tabMaterials));
        GameRegistry.registerItem(Items.tile_red, "Tile red");
        LanguageRegistry.addName(new ItemStack(Items.tile_red, 1, 0), "Tile red");
        Items.tile_white = (new Item(Items.tile_white_ID).setUnlocalizedName("Tile_white").setTextureName(modid+":resources/tile_white").setCreativeTab(CreativeTabs.tabMaterials));
        GameRegistry.registerItem(Items.tile_white, "Tile white");
        LanguageRegistry.addName(new ItemStack(Items.tile_white, 1, 0), "Tile white");
        Items.tile_yellow = (new Item(Items.tile_yellow_ID).setUnlocalizedName("Tile_yellow").setTextureName(modid+":resources/tile_yellow").setCreativeTab(CreativeTabs.tabMaterials));
        GameRegistry.registerItem(Items.tile_yellow, "Tile yellow");
        LanguageRegistry.addName(new ItemStack(Items.tile_yellow, 1, 0), "Tile yellow");
        
        Items.wood_tile_oak = (new Item(Items.wood_tile_oak_ID).setUnlocalizedName("Wood_tile_oak").setTextureName(modid+":resources/wood_tile_oak").setCreativeTab(CreativeTabs.tabMaterials));
        GameRegistry.registerItem(Items.wood_tile_oak, "Wood tile oak");
        LanguageRegistry.addName(new ItemStack(Items.wood_tile_oak, 1, 0), "Wood tile Oak");
        Items.wood_tile_birch = (new Item(Items.wood_tile_birch_ID).setUnlocalizedName("Wood_tile_birch").setTextureName(modid+":resources/wood_tile_birch").setCreativeTab(CreativeTabs.tabMaterials));
        GameRegistry.registerItem(Items.wood_tile_birch, "Wood tile birch");
        LanguageRegistry.addName(new ItemStack(Items.wood_tile_birch, 1, 0), "Wood tile birch");
        Items.wood_tile_spruce = (new Item(Items.wood_tile_spruce_ID).setUnlocalizedName("Wood_tile_spruce").setTextureName(modid+":resources/wood_tile_spruce").setCreativeTab(CreativeTabs.tabMaterials));
        GameRegistry.registerItem(Items.wood_tile_spruce, "Wood tile spruce");
        LanguageRegistry.addName(new ItemStack(Items.wood_tile_spruce, 1, 0), "Wood tile spruce");
        Items.wood_tile_jungle = (new Item(Items.wood_tile_jungle_ID).setUnlocalizedName("Wood_tile_jungle").setTextureName(modid+":resources/wood_tile_jungle").setCreativeTab(CreativeTabs.tabMaterials));
        GameRegistry.registerItem(Items.wood_tile_jungle, "Wood tile jungle");
        LanguageRegistry.addName(new ItemStack(Items.wood_tile_jungle, 1, 0), "Wood tile jungle");
        
        Items.wood_tile_black = (new Item(Items.wood_tile_black_ID).setUnlocalizedName("Wood_tile_black").setTextureName(modid+":resources/wood_tile_black").setCreativeTab(CreativeTabs.tabMaterials));
        GameRegistry.registerItem(Items.wood_tile_black, "Wood tile black");
        LanguageRegistry.addName(new ItemStack(Items.wood_tile_black, 1, 0), "Wood tile black");
        Items.wood_tile_blue = (new Item(Items.wood_tile_blue_ID).setUnlocalizedName("Wood_tile_blue").setTextureName(modid+":resources/wood_tile_blue").setCreativeTab(CreativeTabs.tabMaterials));
        GameRegistry.registerItem(Items.wood_tile_blue, "Wood tile blue");
        LanguageRegistry.addName(new ItemStack(Items.wood_tile_blue, 1, 0), "Wood tile blue");
        Items.wood_tile_green = (new Item(Items.wood_tile_green_ID).setUnlocalizedName("Wood_tile_green").setTextureName(modid+":resources/wood_tile_green").setCreativeTab(CreativeTabs.tabMaterials));
        GameRegistry.registerItem(Items.wood_tile_green, "Wood tile green");
        LanguageRegistry.addName(new ItemStack(Items.wood_tile_green, 1, 0), "Wood tile green");
        Items.wood_tile_orange = (new Item(Items.wood_tile_orange_ID).setUnlocalizedName("Wood_tile_orange").setTextureName(modid+":resources/wood_tile_orange").setCreativeTab(CreativeTabs.tabMaterials));
        GameRegistry.registerItem(Items.wood_tile_orange, "Wood tile orange");
        LanguageRegistry.addName(new ItemStack(Items.wood_tile_orange, 1, 0), "Wood tile orange");
        Items.wood_tile_red = (new Item(Items.wood_tile_red_ID).setUnlocalizedName("Wood_tile_red").setTextureName(modid+":resources/wood_tile_red").setCreativeTab(CreativeTabs.tabMaterials));
        GameRegistry.registerItem(Items.wood_tile_red, "Wood tile red");
        LanguageRegistry.addName(new ItemStack(Items.wood_tile_red, 1, 0), "Wood tile red");
        Items.wood_tile_yellow = (new Item(Items.wood_tile_yellow_ID).setUnlocalizedName("Wood_tile_yellow").setTextureName(modid+":resources/wood_tile_yellow").setCreativeTab(CreativeTabs.tabMaterials));
        GameRegistry.registerItem(Items.wood_tile_yellow, "Wood tile yellow");
        LanguageRegistry.addName(new ItemStack(Items.wood_tile_yellow, 1, 0), "Wood tile yellow");
        
        Items.rulette_10E = (new SharpnetChipRoulette_10e(Items.rulette_10E_ID).setUnlocalizedName("rulette_10E"));
        GameRegistry.registerItem(Items.rulette_10E, "Roulette 10E");
        LanguageRegistry.addName(new ItemStack(Items.rulette_10E, 1, 0), "Roulette 10E");
        
        Items.rulette_100E = (new SharpnetChipRoulette_100e(Items.rulette_100E_ID).setUnlocalizedName("rulette_100E"));
        GameRegistry.registerItem(Items.rulette_100E, "Roulette 100E");
        LanguageRegistry.addName(new ItemStack(Items.rulette_100E, 1, 0), "Roulette 100E");


        //Recipes
        
        //Recipes register stack alliases
        //ItemStack TomatoSeeds = new ItemStack(SharpnetTomatoSeeds);
        //ItemStack Tomato = new ItemStack(SharpnetTomato);
        //GameRegistry.addShapelessRecipe(new ItemStack(SharpnetTomatoSeeds, 1), new ItemStack(SharpnetTomato));
        //GameRegistry.addShapelessRecipe(TomatoSeeds, Tomato);
        
        //RecipesOreDict.register();
        
        RecipesRemove.unRegisterRecipes();
        
        RecipesExchange.register();
        RecipesOld.register();
        RecipesFood.register();
        RecipesResources.register();
        RecipesTools.register();
        RecipesElectronics.register();
        RecipesFlowers.register();
        RecipesDoors.register();
        RecipesWoodTiles.register();
        RecipesTiles.register();
        RecipesOtherBlocks.register();
        RecipesClothArmor.register();
        RecipesWalls.register();
        RecipesRoofs.register();
        RecipesCarpets.register();
        RecipesBricks.register();
        RecipesStone.register();
        RecipesCobblestone.register();
        RecipesMetals.register();
        RecipesPanels.register();
        RecipesWindows.register();
        RecipesLamps.register();
        RecipesDecoBlocks.register();
        RecipesIC2Machines.register();
        
        GameRegistry.registerFuelHandler(new Fuels());
        
        
        //Events Register
        MinecraftForge.EVENT_BUS.register(new SharpnetBonemealEvent());
        MinecraftForge.EVENT_BUS.register(new SharpnetEvent_LivingDrops());
        
        //World generator
        GameRegistry.registerWorldGenerator(new ShWorldGen());
    }
    
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        //Register Slabs Event Handler
        Item.itemsList[SharpnetTilesSlabBlocks1.blockID] = new ShItemSlab(SharpnetTilesSlabBlocks1.blockID-256, (BlockHalfSlab)SharpnetTilesSlabBlocks1, (BlockHalfSlab)SharpnetTilesBlocks1, false, 0);
        Item.itemsList[SharpnetTilesSlabBlocks2.blockID] = new ShItemSlab(SharpnetTilesSlabBlocks2.blockID-256, (BlockHalfSlab)SharpnetTilesSlabBlocks2, (BlockHalfSlab)SharpnetTilesBlocks1, false, 8);
        Item.itemsList[SharpnetTilesSlabBlocks3.blockID] = new ShItemSlab(SharpnetTilesSlabBlocks3.blockID-256, (BlockHalfSlab)SharpnetTilesSlabBlocks3, (BlockHalfSlab)SharpnetTilesBlocks2, false, 0);
        Item.itemsList[SharpnetTilesWoodSlabBlocks1.blockID] = new ShItemSlab(SharpnetTilesWoodSlabBlocks1.blockID-256, (BlockHalfSlab)SharpnetTilesWoodSlabBlocks1, (BlockHalfSlab)SharpnetTilesWoodSlabBlocks1, false, 0);
        Item.itemsList[SharpnetTilesWoodSlabBlocks2.blockID] = new ShItemSlab(SharpnetTilesWoodSlabBlocks2.blockID-256, (BlockHalfSlab)SharpnetTilesWoodSlabBlocks2, (BlockHalfSlab)SharpnetTilesWoodSlabBlocks2, false, 0);
        
    }
}
