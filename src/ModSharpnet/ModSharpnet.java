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

import ModSharpnet.Item.*;
import ModSharpnet.Block.*;

import ic2.api.recipe.RecipeInputItemStack;
import ic2.api.recipe.Recipes;

@Mod(modid="ModSharpnet", name="SharpnetMod", version="1.0.3", dependencies="required-after:IC2")
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
    
    public static Block sharpnetFlowerBlocks1;
    public static int sharpnetFlowerBlocks1ID;
    
    public static Block SharpnetTilesSlabBlocks1;
    public static int SharpnetTilesSlabBlocks1ID;
    
    public static Block SharpnetTilesSlabBlocks2;
    public static int SharpnetTilesSlabBlocks2ID;
    
    public static Block SharpnetTilesSlabBlocks3;
    public static int SharpnetTilesSlabBlocks3ID;
    
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
        Blocks.money_block_ID = config.get("Blocks", "money_block", 2564).getInt();
        Blocks.deco1_block_ID = config.get("Blocks", "deco1_block", 2565).getInt();
        SharpnetTilesSlabBlocks1ID = config.get("Blocks", "SharpnetTilesSlabBlocks1", 2566).getInt();
        SharpnetTilesSlabBlocks2ID = config.get("Blocks", "SharpnetTilesSlabBlocks2", 2567).getInt();
        SharpnetTilesSlabBlocks3ID = config.get("Blocks", "SharpnetTilesSlabBlocks3", 2568).getInt();
        
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
        Items.test_tube_ID = (config.get("Items", "test_tube", 6607).getInt())-256;
        Items.mixed_ethanol_ID = (config.get("Items", "mixed_ethanol", 6608).getInt())-256;
        Items.destiledEthanol_1_ID = (config.get("Items", "destiledEthanol_1", 6609).getInt())-256;
        Items.destiledEthanol_2_ID = (config.get("Items", "destiledEthanol_2", 6610).getInt())-256;
        Items.destiledEthanol_3_ID = (config.get("Items", "destiledEthanol_3", 6611).getInt())-256;
        Items.liquid_sugar_ID = (config.get("Items", "liquid_sugar", 6612).getInt())-256;
        Items.bottle_of_milk_ID = (config.get("Items", "bottle_of_milk", 6613).getInt())-256;
        
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
        Items.barrel_of_wine_ID = (config.get("Items", "barrel_of_wine", 6564).getInt())-256;
                
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
        
        proxy.registerRenderInformation();
        
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
        LanguageRegistry.addName(new ItemStack(SharpnetPlantsBlocks1, 1, 12), "Vine Plant");
        LanguageRegistry.addName(new ItemStack(SharpnetPlantsBlocks1, 1, 13), "Vine Plant");
        LanguageRegistry.addName(new ItemStack(SharpnetPlantsBlocks1, 1, 14), "Vine Plant");
        
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
        
        Blocks.panel_metal1_block = new SharpnetPanels1Block(Blocks.panel_metal1_block_ID, modid+":building/metal1",modid+":building/metal1",Material.iron, true).setHardness(2.0F).setResistance(5.0F).setStepSound(soundMetalFootstep).setUnlocalizedName("Panel Metal 1");
        GameRegistry.registerBlock(Blocks.panel_metal1_block, "Sharpnetpanel_metal1_block");
        LanguageRegistry.addName(new ItemStack(Blocks.panel_metal1_block, 1, 0), "Panel Metal 1");
        
        Blocks.ladder_iron1_block = new SharpnetLadder1Block(Blocks.ladder_iron1_block_ID).setTextureName(modid+":others/ladder_iron1").setHardness(0.4F).setStepSound(soundLadderFootstep).setUnlocalizedName("Ladder Iron 1");
        GameRegistry.registerBlock(Blocks.ladder_iron1_block, "SharpnetLaderIron1_block");
        LanguageRegistry.addName(new ItemStack(Blocks.ladder_iron1_block, 1, 0), "Ladder Iron 1");
        
        Blocks.electro1_block = new SharpnetElectro1Block(Blocks.electro1_block_ID).setUnlocalizedName("SharpnetElectro1Block");
        GameRegistry.registerBlock(Blocks.electro1_block, SharpnetElectro1ItemBlocks.class, Blocks.electro1_block.getUnlocalizedName());
        LanguageRegistry.addName(new ItemStack(Blocks.electro1_block, 1, 0), "Mixer");
        LanguageRegistry.addName(new ItemStack(Blocks.electro1_block, 1, 1), "Cofee Machine");
        LanguageRegistry.addName(new ItemStack(Blocks.electro1_block, 1, 2), "Electric Kettle");
        
        Blocks.money_block = new SharpnetMoneyBlock(Blocks.money_block_ID).setUnlocalizedName("SharpnetMoneyBlock");
        GameRegistry.registerBlock(Blocks.money_block, SharpnetMoneyItemBlock.class, Blocks.money_block.getUnlocalizedName());
        LanguageRegistry.addName(new ItemStack(Blocks.money_block, 1, 0), "9 Cents");
        LanguageRegistry.addName(new ItemStack(Blocks.money_block, 1, 1), "8 Euro");
        LanguageRegistry.addName(new ItemStack(Blocks.money_block, 1, 2), "Money Bag 81C");
        LanguageRegistry.addName(new ItemStack(Blocks.money_block, 1, 3), "Money Bag 72E");
        LanguageRegistry.addName(new ItemStack(Blocks.money_block, 1, 4), "Money stack 9x10E");
        LanguageRegistry.addName(new ItemStack(Blocks.money_block, 1, 5), "Money stack 9x100E");
        LanguageRegistry.addName(new ItemStack(Blocks.money_block, 1, 6), "Money stack 9x1000E");
        
        Blocks.deco1_block = new SharpnetDecoBlocks1(Blocks.deco1_block_ID).setUnlocalizedName("SharpnetDecorationBlocks");
        GameRegistry.registerBlock(Blocks.deco1_block, SharpnetDecoItemBlocks1.class, Blocks.deco1_block.getUnlocalizedName());
        LanguageRegistry.addName(new ItemStack(Blocks.deco1_block, 1, 0), "Barell");
        LanguageRegistry.addName(new ItemStack(Blocks.deco1_block, 1, 1), "Barell of Vine");
        LanguageRegistry.addName(new ItemStack(Blocks.deco1_block, 1, 2), "Hay Stack");
        LanguageRegistry.addName(new ItemStack(Blocks.deco1_block, 1, 3), "Money Pallet 10E");
        LanguageRegistry.addName(new ItemStack(Blocks.deco1_block, 1, 4), "Money Pallet 100E");
        LanguageRegistry.addName(new ItemStack(Blocks.deco1_block, 1, 5), "Money Pallet 1000E");
        
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
        
        Items.grape_red = new ItemFood(Items.grape_red_ID, 3 , 0.2F, false ).setUnlocalizedName("grape_red").setTextureName(modid+":food/grape_red");
        GameRegistry.registerItem(Items.grape_red, "Grape Red");
        LanguageRegistry.addName(new ItemStack(Items.grape_red, 1, 0), "Grape Red");
        
        Items.bottle_of_milk = new ItemFood(Items.bottle_of_milk_ID, 4 , 1.0F, false ).setUnlocalizedName("bottle_of_milk").setTextureName(modid+":drinks&food/milk_bottle");
        GameRegistry.registerItem(Items.bottle_of_milk, "Bottle of Milk");
        LanguageRegistry.addName(new ItemStack(Items.bottle_of_milk, 1, 0), "Bottle of Milk");
        
        Items.sliced_potatoe = (new Item(Items.sliced_potatoe_ID).setUnlocalizedName("sliced_potatoe").setTextureName(modid+":food/potatoe_sliced").setCreativeTab(CreativeTabs.tabFood));
        GameRegistry.registerItem(Items.sliced_potatoe, "Sliced Potatoe");
        LanguageRegistry.addName(new ItemStack(Items.sliced_potatoe, 1, 0), "Sliced Potatoe");
        
        Items.potatoes_chips = new ItemFood(Items.potatoes_chips_ID, 1 , 0.2F, false ).setUnlocalizedName("potatoes_chips").setTextureName(modid+":food/potato_chips");
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
        
        Items.cheese = new ItemFood(Items.cheese_ID, 4 , 2.5F, false ).setUnlocalizedName("cheese").setTextureName(modid+":food/cheese");
        GameRegistry.registerItem(Items.cheese, "Cheese");
        LanguageRegistry.addName(new ItemStack(Items.cheese, 1, 0), "Cheese");
        
        Items.raw_pizza = (new Item(Items.raw_pizza_ID).setUnlocalizedName("raw_pizza").setTextureName(modid+":drinks&food/pizza1").setCreativeTab(CreativeTabs.tabFood));
        GameRegistry.registerItem(Items.raw_pizza, "Raw Pizza");
        LanguageRegistry.addName(new ItemStack(Items.raw_pizza, 1, 0), "Raw Pizza");
        
        Items.slice_of_bread = new ItemFood(Items.slice_of_bread_ID, 1 , 0.8F, false ).setUnlocalizedName("slice_of_bread").setTextureName(modid+":food/bread_slice_of");
        GameRegistry.registerItem(Items.slice_of_bread, "Slice of Bread");
        LanguageRegistry.addName(new ItemStack(Items.slice_of_bread, 1, 0), "Slice of Bread");
        
        Items.breadcrumbs = (new Item(Items.breadcrumbs_ID).setUnlocalizedName("breadcrumbs").setTextureName(modid+":food/breadcrumbs").setCreativeTab(CreativeTabs.tabMaterials));
        GameRegistry.registerItem(Items.breadcrumbs, "Breadcrumbs");
        LanguageRegistry.addName(new ItemStack(Items.breadcrumbs, 1, 0), "Breadcrumbs");
        
        Items.fillet = new ItemFood(Items.fillet_ID, 4 , 1.0F, false ).setUnlocalizedName("fillet").setTextureName(modid+":food/fillet");
        GameRegistry.registerItem(Items.fillet, "Fillet");
        LanguageRegistry.addName(new ItemStack(Items.fillet, 1, 0), "Fillet");
        
        Items.popcorn = new ItemFood(Items.popcorn_ID, 2 , 0.5F, false ).setUnlocalizedName("popcorn").setTextureName(modid+":food/popcorn");
        GameRegistry.registerItem(Items.popcorn, "Popcorn");
        LanguageRegistry.addName(new ItemStack(Items.popcorn, 1, 0), "Popcorn");
        
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
                
        Items.barrel = (new ShItemPlacer(Items.barrel_ID, Blocks.deco1_block.blockID,0).setUnlocalizedName("barrel").setTextureName(modid+":resources/barrel").setCreativeTab(CreativeTabs.tabDecorations));
        GameRegistry.registerItem(Items.barrel, "Barrel");
        LanguageRegistry.addName(new ItemStack(Items.barrel, 1, 0), "Barrel");
        
        Items.barrel_of_wine = (new ShItemPlacer(Items.barrel_of_wine_ID, Blocks.deco1_block.blockID,1).setUnlocalizedName("barrel_of_wine").setTextureName(modid+":resources/barrel_of_wine").setCreativeTab(CreativeTabs.tabDecorations));
        GameRegistry.registerItem(Items.barrel_of_wine, "Barrel of Wine");
        LanguageRegistry.addName(new ItemStack(Items.barrel_of_wine, 1, 0), "Barrel of Wine");
        
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
        
        OreDictionary.registerOre("ingotSteel", Items.IngotSteel);
        
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


        //Recipes
        
        //Recipes register stack alliases
        //ItemStack TomatoSeeds = new ItemStack(SharpnetTomatoSeeds);
        //ItemStack Tomato = new ItemStack(SharpnetTomato);
        //GameRegistry.addShapelessRecipe(new ItemStack(SharpnetTomatoSeeds, 1), new ItemStack(SharpnetTomato));
        //GameRegistry.addShapelessRecipe(TomatoSeeds, Tomato);
        
        //Recipes Old
        GameRegistry.addShapelessRecipe(new ItemStack(Item.flint,1,0), new ItemStack(Block.gravel,1,0), new ItemStack(Block.gravel,1,0));
        GameRegistry.addShapelessRecipe(new ItemStack(Item.seeds,2,0), new ItemStack(Item.wheat,1,0));
        GameRegistry.addRecipe(new ItemStack(Block.stoneDoubleSlab,1,0), new Object[]
        {
            "S",
            "S",
            'S', Block.stoneSingleSlab
        });
        GameRegistry.addRecipe(new ItemStack(Block.cobblestoneMossy,1,0), new Object[]
        {
            "W",
            "S",
            'S', Block.stone, 'W', Item.seeds
        });
        GameRegistry.addRecipe(new ItemStack(Block.grass,1,0), new Object[]
        {
            "W",
            "S",
            'S', Block.dirt, 'W', Item.seeds
        });
        GameRegistry.addRecipe(new ItemStack(Block.blockClay,1,0), new Object[]
        {
            "W",
            "S",
            'S', Block.gravel, 'W', Block.dirt
        });
        GameRegistry.addRecipe(new ItemStack(Block.web,1,0), new Object[]
        {
            "S S",
            " S ",
            "S S",
            'S', Item.silk
        });
        for (int x = 0; x < 16; x++ )
        {
            GameRegistry.addRecipe(new ItemStack(Item.silk,3,0), new Object[]
            {
                "W",
                "W",
                'W', new ItemStack(Block.cloth,1,x)
            });
        }
        GameRegistry.addRecipe(new ItemStack(Item.slimeBall,4,0), new Object[]
        {
            " C ",
            "SSS",
            'C', Block.cactus, 'S', Item.sugar
        });
        
        //Ore Dictionary
        /*
        GameRegistry.addRecipe(new ShapedOreRecipe(Item.bucketEmpty, new Object[]{
        "FF",
        'F', "ingotCopper"
        }));
        GameRegistry.addRecipe(new ShapelessOreRecipe(Item.bucketEmpty, "ingotCopper"));
        */
        
        GameRegistry.addShapelessRecipe(new ItemStack(SharpnetTomatoSeeds, 1), new ItemStack(SharpnetTomato));
        GameRegistry.addShapelessRecipe(new ItemStack(SharpnetCucumberSeeds, 1), new ItemStack(SharpnetCucumber));
        GameRegistry.addShapelessRecipe(new ItemStack(SharpnetCornSeeds, 1), new ItemStack(SharpnetCorn));
        GameRegistry.addShapelessRecipe(new ItemStack(Items.grape_red_seeds, 1), new ItemStack(Items.grape_red));
        
        GameRegistry.addShapelessRecipe(new ItemStack(Items.sliced_potatoe, 1,0), new ItemStack(Item.potato, 1, 0));
        GameRegistry.addShapelessRecipe(new ItemStack(Items.flour, 4,0), new ItemStack(Item.wheat, 1, 0), new ItemStack(Item.wheat, 1, 0));
        GameRegistry.addShapelessRecipe(new ItemStack(Items.flour, 2,0), new ItemStack(Item.seeds, 1, 0), new ItemStack(Item.seeds, 1, 0));
        GameRegistry.addShapelessRecipe(new ItemStack(Items.dough, 1,0), new ItemStack(Items.flour, 1, 0));
        GameRegistry.addShapelessRecipe(new ItemStack(Items.tomato_puree, 2,0), new ItemStack(SharpnetTomato, 1, 0), new ItemStack(Item.sugar, 1, 0));
        GameRegistry.addShapelessRecipe(new ItemStack(Items.slice_of_bread, 4,0), new ItemStack(Item.bread, 1, 0));
        GameRegistry.addShapelessRecipe(new ItemStack(Items.butter, 1,0), new ItemStack(Item.bucketMilk.setContainerItem(Item.bucketEmpty), 1, 0));
        GameRegistry.addShapelessRecipe(new ItemStack(Items.butter, 1,0), new ItemStack(Items.bottle_of_milk, 1, 0));
        GameRegistry.addShapelessRecipe(new ItemStack(Items.cheese, 2,0), new ItemStack(Item.bucketMilk.setContainerItem(Item.bucketEmpty), 1, 0), new ItemStack(Items.butter, 1,0));
        GameRegistry.addShapelessRecipe(new ItemStack(Items.cheese, 2,0), new ItemStack(Items.bottle_of_milk, 1, 0), new ItemStack(Items.butter, 1,0));
        GameRegistry.addShapelessRecipe(new ItemStack(Items.salad, 1,0), new ItemStack(Item.potato, 1, 0), new ItemStack(SharpnetCucumber, 1,0), new ItemStack(Item.carrot, 1, 0), new ItemStack(Item.sugar, 1, 0));
        GameRegistry.addShapelessRecipe(new ItemStack(Items.breadcrumbs, 1,0), new ItemStack(Items.slice_of_bread, 1, 0));
        
        //Recipes Filet
        GameRegistry.addShapelessRecipe(new ItemStack(Items.fillet, 2,0), new ItemStack(Items.mutton_cooked, 1, 0), new ItemStack(Items.breadcrumbs, 1, 0), new ItemStack(Items.breadcrumbs, 1, 0));
        GameRegistry.addShapelessRecipe(new ItemStack(Items.fillet, 2,0), new ItemStack(Item.porkCooked, 1, 0), new ItemStack(Items.breadcrumbs, 1, 0), new ItemStack(Items.breadcrumbs, 1, 0));
        GameRegistry.addShapelessRecipe(new ItemStack(Items.fillet, 3,0), new ItemStack(Item.beefCooked, 1, 0), new ItemStack(Items.breadcrumbs, 1, 0), new ItemStack(Items.breadcrumbs, 1, 0), new ItemStack(Items.breadcrumbs, 1, 0));
        GameRegistry.addShapelessRecipe(new ItemStack(Items.fillet, 1,0), new ItemStack(Item.chickenCooked, 1, 0), new ItemStack(Items.breadcrumbs, 1, 0));
        GameRegistry.addShapelessRecipe(new ItemStack(Items.fillet, 1,0), new ItemStack(Item.fishCooked, 1, 0), new ItemStack(Items.breadcrumbs, 1, 0));
        
        GameRegistry.addShapelessRecipe(new ItemStack(Items.salad_fillet, 1,0), new ItemStack(Items.salad, 1, 0), new ItemStack(Items.fillet, 1, 0));
        
        GameRegistry.addRecipe(new ItemStack(Items.catchup,1,0), new Object[]
        {
            "TTT",
            "TBT",
            "TTT",
            'T', Items.tomato_puree, 'B', Items.bottle
        });
        
        GameRegistry.addRecipe(new ItemStack(Items.raw_pizza,1,0), new Object[]
        {
            " C ",
            "TDT",
            "   ",
            'T', Items.tomato_puree, 'C', Items.cheese, 'D', Items.dough
        });
        
        //Smelting
        GameRegistry.addSmelting(Items.mutton_raw.itemID, new ItemStack(Items.mutton_cooked, 1), 0.35F);
        GameRegistry.addSmelting(Items.tea_leaves.itemID, new ItemStack(Items.cup_of_tea, 1), 0.35F);
        GameRegistry.addSmelting(Items.cofee_beans_raw.itemID, new ItemStack(Items.cofee_beans, 1), 0.35F);
        GameRegistry.addSmelting(Items.cofee_beans.itemID, new ItemStack(Items.cofee, 1), 0.35F);
        GameRegistry.addSmelting(Items.sliced_potatoe.itemID, new ItemStack(Items.potatoes_chips, 1), 0.35F);
        GameRegistry.addSmelting(Items.dough.itemID, new ItemStack(Item.bread, 1), 0.35F);
        GameRegistry.addSmelting(Items.raw_pizza.itemID, new ItemStack(Items.pizza, 1), 0.35F);
        GameRegistry.addSmelting(SharpnetCorn.itemID, new ItemStack(Items.popcorn, 3), 0.35F);
        
        GameRegistry.addSmelting(Items.mixed_ethanol.itemID, new ItemStack(Items.destiledEthanol_1, 1), 0.35F);
        GameRegistry.addSmelting(Items.destiledEthanol_1.itemID, new ItemStack(Items.destiledEthanol_2, 1), 0.35F);
        GameRegistry.addSmelting(Items.destiledEthanol_2.itemID, new ItemStack(Items.destiledEthanol_3, 1), 0.35F);
        
        GameRegistry.addSmelting(Item.ingotIron.itemID, new ItemStack(Items.IngotSteel, 1), 0.35F);
        
        //Recipe Flower duplication
        GameRegistry.addShapelessRecipe(new ItemStack(Block.plantRed, 4,0), new ItemStack(Block.plantRed, 1, 0), new ItemStack(Item.dyePowder, 1, 15));
        GameRegistry.addShapelessRecipe(new ItemStack(Block.plantYellow, 4,0), new ItemStack(Block.plantYellow, 1, 0), new ItemStack(Item.dyePowder, 1, 15));
        
        GameRegistry.addShapelessRecipe(new ItemStack(sharpnetFlowerBlocks1, 2,0), new ItemStack(sharpnetFlowerBlocks1, 1, 0), new ItemStack(Item.dyePowder, 1, 15));
        GameRegistry.addShapelessRecipe(new ItemStack(sharpnetFlowerBlocks1, 2,1), new ItemStack(sharpnetFlowerBlocks1, 1, 1), new ItemStack(Item.dyePowder, 1, 15));
        GameRegistry.addShapelessRecipe(new ItemStack(sharpnetFlowerBlocks1, 4,2), new ItemStack(sharpnetFlowerBlocks1, 1, 2), new ItemStack(Item.dyePowder, 1, 15));
        GameRegistry.addShapelessRecipe(new ItemStack(sharpnetFlowerBlocks1, 4,3), new ItemStack(sharpnetFlowerBlocks1, 1, 3), new ItemStack(Item.dyePowder, 1, 15));
        GameRegistry.addShapelessRecipe(new ItemStack(sharpnetFlowerBlocks1, 2,4), new ItemStack(sharpnetFlowerBlocks1, 1, 4), new ItemStack(Item.dyePowder, 1, 15));
        GameRegistry.addShapelessRecipe(new ItemStack(sharpnetFlowerBlocks1, 4,5), new ItemStack(sharpnetFlowerBlocks1, 1, 5), new ItemStack(Item.dyePowder, 1, 15));
        GameRegistry.addShapelessRecipe(new ItemStack(sharpnetFlowerBlocks1, 4,6), new ItemStack(sharpnetFlowerBlocks1, 1, 6), new ItemStack(Item.dyePowder, 1, 15));
        GameRegistry.addShapelessRecipe(new ItemStack(sharpnetFlowerBlocks1, 4,7), new ItemStack(sharpnetFlowerBlocks1, 1, 7), new ItemStack(Item.dyePowder, 1, 15));
        GameRegistry.addShapelessRecipe(new ItemStack(sharpnetFlowerBlocks1, 3,8), new ItemStack(sharpnetFlowerBlocks1, 1, 8), new ItemStack(Item.dyePowder, 1, 15));
        GameRegistry.addShapelessRecipe(new ItemStack(sharpnetFlowerBlocks1, 2,9), new ItemStack(sharpnetFlowerBlocks1, 1, 9), new ItemStack(Item.dyePowder, 1, 15));
        GameRegistry.addShapelessRecipe(new ItemStack(sharpnetFlowerBlocks1, 5,10), new ItemStack(sharpnetFlowerBlocks1, 1, 10), new ItemStack(Item.dyePowder, 1, 15));
        GameRegistry.addShapelessRecipe(new ItemStack(sharpnetFlowerBlocks1, 4,11), new ItemStack(sharpnetFlowerBlocks1, 1, 11), new ItemStack(Item.dyePowder, 1, 15));
        GameRegistry.addShapelessRecipe(new ItemStack(sharpnetFlowerBlocks1, 2,12), new ItemStack(sharpnetFlowerBlocks1, 1, 12), new ItemStack(Item.dyePowder, 1, 15));
        GameRegistry.addShapelessRecipe(new ItemStack(sharpnetFlowerBlocks1, 3,13), new ItemStack(sharpnetFlowerBlocks1, 1, 13), new ItemStack(Item.dyePowder, 1, 15));
        GameRegistry.addShapelessRecipe(new ItemStack(sharpnetFlowerBlocks1, 2,14), new ItemStack(sharpnetFlowerBlocks1, 1, 14), new ItemStack(Item.dyePowder, 1, 15));
        GameRegistry.addShapelessRecipe(new ItemStack(sharpnetFlowerBlocks1, 2,15), new ItemStack(sharpnetFlowerBlocks1, 1, 15), new ItemStack(Item.dyePowder, 1, 15));
        
        //Recipe Gunpowder
        GameRegistry.addShapelessRecipe(new ItemStack(Item.gunpowder, 1,0), new ItemStack(Item.coal, 1, 0), new ItemStack(Item.redstone, 1, 0));
        
        //Recipe Exchange Charocoal to Coal
        GameRegistry.addShapelessRecipe(new ItemStack(Item.coal, 1,0), new ItemStack(Item.coal, 1, 1));
        
        //Exchange IC2
        GameRegistry.addShapelessRecipe(new ItemStack(Item.bucketWater, 1, 0), new ItemStack(Item.bucketEmpty, 1, 0), new ItemStack(ic2.api.item.Items.getItem("waterCell").getItem(), 1, 0));
        GameRegistry.addShapelessRecipe(new ItemStack(ic2.api.item.Items.getItem("waterCell").getItem(), 1, 0), new ItemStack(Item.bucketWater.setContainerItem(Item.bucketEmpty), 1, 0), new ItemStack(ic2.api.item.Items.getItem("cell").getItem(), 1, 0));
        
        //Recipe TNT
        GameRegistry.addRecipe(new ItemStack(Block.tnt,1,0), new Object[]
        {
            " W ",
            "GRG",
            "SSS",
            'G', Item.gunpowder, 'R', Item.redstone, 'S', Block.sand, 'W', new ItemStack(Block.planks, 1, 0)
        });
        
        GameRegistry.addShapelessRecipe(new ItemStack(Items.iron_bar, 7), new ItemStack(Block.fenceIron));
        //Recipe Iron Lader
        GameRegistry.addRecipe(new ItemStack(Blocks.ladder_iron1_block,1,0), new Object[]
        {
            "I I",
            "III",
            "I I",
            'I', Items.iron_bar
        });
        
        //Recipe Drinks
        GameRegistry.addRecipe(new ItemStack(Items.test_tube,6,0), new Object[]
        {
            "G",
            "G",
            'G', Block.glass
        });
        
        GameRegistry.addRecipe(new ItemStack(Items.mixed_ethanol,1,0), new Object[]
        {
            "TC",
            'C', Item.potato, 'T', Items.test_tube
        });
        
        GameRegistry.addRecipe(new ItemStack(Items.mixed_ethanol,1,0), new Object[]
        {
            "TCC",
            'C', Item.reed, 'T', Items.test_tube
        });
        
        GameRegistry.addRecipe(new ItemStack(Items.liquid_sugar,1,0), new Object[]
        {
            "TCO",
            'C', Item.sugar, 'T', Items.test_tube, 'O', new ItemStack(Item.dyePowder,1,14)
        });
        
        GameRegistry.addRecipe(new ItemStack(Items.beer,1,0), new Object[]
        {
            "BTS",
            'B', Items.bottle, 'T', Items.destiledEthanol_1, 'S', Item.wheat
        });
        
        GameRegistry.addRecipe(new ItemStack(Items.bottle_of_milk,1,0), new Object[]
        {
            "UB",
            'B', Items.bottle, 'U', Item.bucketMilk.setContainerItem(Item.bucketEmpty)
        });
        
        GameRegistry.addRecipe(new ItemStack(Items.guttalax,1,0), new Object[]
        {
            "TM",
            'T', Items.test_tube, 'M', Item.rottenFlesh
        });
        
        GameRegistry.addRecipe(new ItemStack(Items.whiskey,1,0), new Object[]
        {
            "BTS",
            'B', Items.bottle, 'T', Items.destiledEthanol_3, 'S', Item.wheat
        });
        
        GameRegistry.addRecipe(new ItemStack(Items.vodka,1,0), new Object[]
        {
            "BT",
            'B', Items.bottle, 'T', Items.destiledEthanol_3
        });
        
        GameRegistry.addRecipe(new ItemStack(Items.tequilla_silver,1,0), new Object[]
        {
            "BTS",
            'B', Items.bottle, 'T', Items.destiledEthanol_3, 'S', new ItemStack(Item.dyePowder,1,2)
        });
        
        GameRegistry.addRecipe(new ItemStack(Items.tequilla_gold,1,0), new Object[]
        {
            "BTS",
            'B', Items.bottle, 'T', Items.tequilla_silver, 'S', Item.ingotGold
        });
        
        GameRegistry.addRecipe(new ItemStack(Items.rum,1,0), new Object[]
        {
            "BTS",
            'B', Items.bottle, 'T', Items.destiledEthanol_3, 'S', Item.reed
        });
        
        //Recipe Throwel
        GameRegistry.addRecipe(new ItemStack(Items.trowel,1,0), new Object[]
        {
            " SC",
            "II ",
            'S', Item.stick, 'C', Item.clay, 'I', Item.ingotIron
        });
        GameRegistry.addShapelessRecipe(new ItemStack(Items.trowel,1,0), new ItemStack(Items.trowel,1,8), Item.clay);
        
        //Recipe Bottle Empty
        GameRegistry.addRecipe(new ItemStack(Items.bottle,6,0), new Object[]
        {
            " W ",
            "GGG",
            "GGG",
            'W', new ItemStack(5,1,0), 'G', new ItemStack(20,1,0)
        });
        //Recipe Barrel
        GameRegistry.addRecipe(new ItemStack(Items.barrel,1,0), new Object[]
        {
            "W W",
            "W W",
            "W W",
            'W', new ItemStack(5,1,0)
        });
        //Recipe Barrel of Vine
        GameRegistry.addRecipe(new ItemStack(Items.barrel_of_wine,1,0), new Object[]
        {
            "GGG",
            "GBG",
            "GGG",
            'G', Items.grape_red, 'B', new ItemStack(Items.barrel,1,0)
        });
        //Recipe Bottle of Vine
        GameRegistry.addRecipe(new ItemStack(Items.wine,6,0), new Object[]
        {
            "G G",
            "GBG",
            "G G",
            'B', new ItemStack(Items.barrel_of_wine,1,0), 'G', Items.bottle
        });
        //Recipe Glass of Vine
         GameRegistry.addShapelessRecipe(new ItemStack(Items.glass_of_vine, 3,0), new ItemStack(Items.wine, 1, 0));
        
        //Recipe Door 1
        GameRegistry.addRecipe(new ItemStack(Items.door1_block_item,1,0), new Object[]
        {
            "WW ",
            "WW ",
            "WW ",
            'W', new ItemStack(SharpnetTilesWoodBlocks1,1,0)
        });
        //Recipe Door 5
        GameRegistry.addRecipe(new ItemStack(Items.door5_block_item,1,0), new Object[]
        {
            "WW ",
            "WW ",
            "WW ",
            'W', new ItemStack(SharpnetTilesWoodBlocks1,1,4)
        });
        //Recipe Door 6
        GameRegistry.addRecipe(new ItemStack(Items.door6_block_item,1,0), new Object[]
        {
            "WW ",
            "WW ",
            "WW ",
            'W', new ItemStack(5,1,3)
        });
        //Recipe Door 7
        GameRegistry.addRecipe(new ItemStack(Items.door7_block_item,1,0), new Object[]
        {
            "WW ",
            "VV ",
            "WW ",
            'W', new ItemStack(SharpnetTilesWoodBlocks1,1,4), 'V', new ItemStack(5,1,3)
        });
        //Recipe Door 8
        GameRegistry.addRecipe(new ItemStack(Items.door8_block_item,1,0), new Object[]
        {
            "WW ",
            "WW ",
            "WW ",
            'W', new ItemStack(SharpnetTilesWoodBlocks1,1,2)
        });
        //Recipe Door 9
        GameRegistry.addRecipe(new ItemStack(Items.door9_block_item,1,0), new Object[]
        {
            "VV ",
            "WW ",
            "VV ",
            'W', new ItemStack(SharpnetTilesWoodBlocks1,1,2), 'V', new ItemStack(5,1,3)
        });
        //Recipe Door 10
        GameRegistry.addRecipe(new ItemStack(Items.door10_block_item,1,0), new Object[]
        {
            "GG ",
            "WW ",
            "WW ",
            'G', new ItemStack(20,1,0), 'W', new ItemStack(5,1,2)
        });
        //Recipe Door 11
        GameRegistry.addRecipe(new ItemStack(Items.door11_block_item,1,0), new Object[]
        {
            "WW ",
            "GG ",
            "WW ",
            'G', new ItemStack(20,1,0), 'W', new ItemStack(5,1,3)
        });
        //Recipe Door 12
        GameRegistry.addRecipe(new ItemStack(Items.door12_block_item,1,0), new Object[]
        {
            "WW ",
            "WW ",
            "WW ",
            'W', new ItemStack(SharpnetTilesWoodBlocks1,1,5)
        });
        //Recipe Door Secret Book
        GameRegistry.addRecipe(new ItemStack(Items.door_secret1_block_item,1,0), new Object[]
        {
            "WW ",
            "BBL",
            "WW ",
            'B', new ItemStack(340,1,0), 'W', new ItemStack(5,1,3), 'L', new ItemStack(69,1,0)
        });
        //Recipe Door Secret Moss
        GameRegistry.addRecipe(new ItemStack(Items.door_secret2_block_item,1,0), new Object[]
        {
            "SS ",
            "SSL",
            "SS ",
            'S', new ItemStack(48,1,0), 'L', new ItemStack(69,1,0)
        });
        //Recipe Door Secret Cobble
        GameRegistry.addRecipe(new ItemStack(Items.door_secret3_block_item,1,0), new Object[]
        {
            "SS ",
            "SSL",
            "SS ",
            'S', new ItemStack(Block.cobblestone,1,0), 'L', new ItemStack(69,1,0)
        });
        
        //Recipe Wood Tile Oak
        GameRegistry.addRecipe(new ItemStack(Items.wood_tile_oak,4,0), new Object[]
        {
            "W ",
            " W",
            'W', new ItemStack(Block.planks,1,0)
        });
        //Recipe Wood Tile Birch
        GameRegistry.addRecipe(new ItemStack(Items.wood_tile_birch,4,0), new Object[]
        {
            "W ",
            " W",
            'W', new ItemStack(Block.planks,1,1)
        });
        //Recipe Wood Tile Birch
        GameRegistry.addRecipe(new ItemStack(Items.wood_tile_birch,4,0), new Object[]
        {
            "W W",
            " C ",
            "W W",
            'W', new ItemStack(Items.wood_tile_oak,1,0), 'C', new ItemStack(Item.dyePowder,1,15)
        });
        //Recipe Wood Tile Birch
        GameRegistry.addRecipe(new ItemStack(Items.wood_tile_birch,4,0), new Object[]
        {
            "W W",
            " C ",
            "W W",
            'W', new ItemStack(Items.wood_tile_spruce,1,0), 'C', new ItemStack(Item.dyePowder,1,15)
        });
        //Recipe Wood Tile Birch
        GameRegistry.addRecipe(new ItemStack(Items.wood_tile_birch,4,0), new Object[]
        {
            "W W",
            " C ",
            "W W",
            'W', new ItemStack(Items.wood_tile_jungle,1,0), 'C', new ItemStack(Item.dyePowder,1,15)
        });
        //Recipe Wood Tile Spruce
        GameRegistry.addRecipe(new ItemStack(Items.wood_tile_spruce,4,0), new Object[]
        {
            "W ",
            " W",
            'W', new ItemStack(Block.planks,1,2)
        });
        //Recipe Wood Tile Jungle
        GameRegistry.addRecipe(new ItemStack(Items.wood_tile_jungle,4,0), new Object[]
        {
            "W ",
            " W",
            'W', new ItemStack(Block.planks,1,3)
        });
        
        //Recipe Tiles Wood White
        GameRegistry.addRecipe(new ItemStack(SharpnetTilesWoodBlocks1,1,7), new Object[]
        {
            "WW",
            "WW",
            'W', new ItemStack(Items.wood_tile_birch,1,0)
        });
        //Recipe Tiles Wood Black
        GameRegistry.addRecipe(new ItemStack(SharpnetTilesWoodBlocks1,2,1), new Object[]
        {
            "WWW",
            "WCW",
            "WWW",
            'W', new ItemStack(Items.wood_tile_birch,1,0), 'C', new ItemStack(Item.dyePowder,1,0)
        });
        //Recipe Tiles Wood Blue
        GameRegistry.addRecipe(new ItemStack(SharpnetTilesWoodBlocks1,2,2), new Object[]
        {
            "WWW",
            "WCW",
            "WWW",
            'W', new ItemStack(Items.wood_tile_birch,1,0), 'C', new ItemStack(Item.dyePowder,1,4)
        });
        //Recipe Tiles Wood Green
        GameRegistry.addRecipe(new ItemStack(SharpnetTilesWoodBlocks1,2,3), new Object[]
        {
            "WWW",
            "WCW",
            "WWW",
            'W', new ItemStack(Items.wood_tile_birch,1,0), 'C', new ItemStack(Item.dyePowder,1,2)
        });
        //Recipe Tiles Wood Orange
        GameRegistry.addRecipe(new ItemStack(SharpnetTilesWoodBlocks1,2,4), new Object[]
        {
            "WWW",
            "WCW",
            "WWW",
            'W', new ItemStack(Items.wood_tile_birch,1,0), 'C', new ItemStack(Item.dyePowder,1,14)
        });
        //Recipe Tiles Wood Red
        GameRegistry.addRecipe(new ItemStack(SharpnetTilesWoodBlocks1,2,5), new Object[]
        {
            "WWW",
            "WCW",
            "WWW",
            'W', new ItemStack(Items.wood_tile_birch,1,0), 'C', new ItemStack(Item.dyePowder,1,1)
        });
        //Recipe Tiles Wood Yellow
        GameRegistry.addRecipe(new ItemStack(SharpnetTilesWoodBlocks1,2,6), new Object[]
        {
            "WWW",
            "WCW",
            "WWW",
            'W', new ItemStack(Items.wood_tile_birch,1,0), 'C', new ItemStack(Item.dyePowder,1,11)
        });
        //Recipe Tiles Wood White
        GameRegistry.addRecipe(new ItemStack(SharpnetTilesWoodBlocks1,2,0), new Object[]
        {
            "WWW",
            "WCW",
            "WWW",
            'W', new ItemStack(Items.wood_tile_birch,1,0), 'C', new ItemStack(Item.dyePowder,1,15)
        });
        //Recipe Wooden Floor 1
        GameRegistry.addRecipe(new ItemStack(SharpnetTilesWoodBlocks2,1,0), new Object[]
        {
            "WW",
            "WW",
            'W', new ItemStack(Items.wood_tile_oak,1,0)
        });
        //Recipe Wooden Floor 2
        GameRegistry.addRecipe(new ItemStack(SharpnetTilesWoodBlocks2,1,1), new Object[]
        {
            "WW",
            "WW",
            'W', new ItemStack(Items.wood_tile_jungle,1,0)
        });
        //Recipe Wooden Floor 3
        GameRegistry.addRecipe(new ItemStack(SharpnetTilesWoodBlocks2,1,2), new Object[]
        {
            "WW",
            "WW",
            'W', new ItemStack(Items.wood_tile_spruce,1,0)
        });
        //Recipe Wooden Floor 4
        GameRegistry.addRecipe(new ItemStack(SharpnetTilesWoodBlocks2,1,3), new Object[]
        {
            "WW",
            "PP",
            'W', new ItemStack(Items.wood_tile_oak,1,0), 'P', new ItemStack(Items.wood_tile_birch,1,0)
        });
        //Recipe Wooden Floor 5
        GameRegistry.addRecipe(new ItemStack(SharpnetTilesWoodBlocks2,1,4), new Object[]
        {
            "WP",
            "PW",
            'W', new ItemStack(Items.wood_tile_oak,1,0), 'P', new ItemStack(Items.wood_tile_spruce,1,0)
        });
        
        //Recipe Lighting Stick
        GameRegistry.addRecipe(new ItemStack(Blocks.lighting_stick_block,4,0), new Object[]
        {
            " G",
            "S ",
            'S', new ItemStack(Item.stick,1,0), 'G', new ItemStack(Item.glowstone,1,0)
        });
        
        //Recipe Tile
        GameRegistry.addShapelessRecipe(new ItemStack(Items.tile_brown,2,0), new ItemStack(Item.brick,1,0));
        //Recipe Tile Black
        GameRegistry.addRecipe(new ItemStack(Items.tile_black,8,0), new Object[]
        {
            "TTT",
            "TCT",
            "TTT",
            'T', new ItemStack(Items.tile_brown,1,0), 'C', new ItemStack(Item.dyePowder,1,0)
        });
        GameRegistry.addRecipe(new ItemStack(Items.tile_black,8,0), new Object[]
        {
            "TTT",
            "TCT",
            "TTT",
            'T', new ItemStack(Items.tile_brown,1,0), 'C', new ItemStack(Item.dyePowder,1,0)
        });
        GameRegistry.addRecipe(new ItemStack(Items.tile_red,8,0), new Object[]
        {
            "TTT",
            "TCT",
            "TTT",
            'T', new ItemStack(Items.tile_brown,1,0), 'C', new ItemStack(Item.dyePowder,1,1)
        });
        GameRegistry.addRecipe(new ItemStack(Items.tile_green,8,0), new Object[]
        {
            "TTT",
            "TCT",
            "TTT",
            'T', new ItemStack(Items.tile_brown,1,0), 'C', new ItemStack(Item.dyePowder,1,2)
        });
        GameRegistry.addRecipe(new ItemStack(Items.tile_blue,8,0), new Object[]
        {
            "TTT",
            "TCT",
            "TTT",
            'T', new ItemStack(Items.tile_brown,1,0), 'C', new ItemStack(Item.dyePowder,1,4)
        });
        GameRegistry.addRecipe(new ItemStack(Items.tile_grey,8,0), new Object[]
        {
            "TTT",
            "TCT",
            "TTT",
            'T', new ItemStack(Items.tile_brown,1,0), 'C', new ItemStack(Item.dyePowder,1,8)
        });
        GameRegistry.addRecipe(new ItemStack(Items.tile_orange,8,0), new Object[]
        {
            "TTT",
            "TCT",
            "TTT",
            'T', new ItemStack(Items.tile_brown,1,0), 'C', new ItemStack(Item.dyePowder,1,14)
        });
        GameRegistry.addRecipe(new ItemStack(Items.tile_white,8,0), new Object[]
        {
            "TTT",
            "TCT",
            "TTT",
            'T', new ItemStack(Items.tile_brown,1,0), 'C', new ItemStack(Item.dyePowder,1,15)
        });
        GameRegistry.addRecipe(new ItemStack(Items.tile_yellow,8,0), new Object[]
        {
            "TTT",
            "TCT",
            "TTT",
            'T', new ItemStack(Items.tile_brown,1,0), 'C', new ItemStack(Item.dyePowder,1,11)
        });
        
        //Recipe Tiles Blocks
        GameRegistry.addRecipe(new ItemStack(SharpnetTilesBlocks1,1,0), new Object[]
        {
            "TT",
            "TT",
            'T', new ItemStack(Items.tile_brown,1,0)
        });
        GameRegistry.addRecipe(new ItemStack(SharpnetTilesBlocks1,1,1), new Object[]
        {
            "AB",
            "BA",
            'A', new ItemStack(Items.tile_grey,1,0), 'B', new ItemStack(Items.tile_blue,1,0)
        });
        GameRegistry.addRecipe(new ItemStack(SharpnetTilesBlocks1,1,2), new Object[]
        {
            "AB",
            "BA",
            'A', new ItemStack(Items.tile_red,1,0), 'B', new ItemStack(Items.tile_grey,1,0)
        });
        GameRegistry.addRecipe(new ItemStack(SharpnetTilesBlocks1,1,3), new Object[]
        {
            "AB",
            "BA",
            'A', new ItemStack(Items.tile_black,1,0), 'B', new ItemStack(Items.tile_white,1,0)
        });
        GameRegistry.addRecipe(new ItemStack(SharpnetTilesBlocks1,2,4), new Object[]
        {
            "ABA",
            "BAB",
            "ABA",
            'A', new ItemStack(Items.tile_yellow,1,0), 'B', new ItemStack(Items.tile_white,1,0)
        });
        GameRegistry.addRecipe(new ItemStack(SharpnetTilesBlocks1,2,5), new Object[]
        {
            "AAA",
            "BBB",
            "AAA",
            'A', new ItemStack(Items.tile_brown,1,0), 'B', new ItemStack(Items.tile_yellow,1,0)
        });
        GameRegistry.addRecipe(new ItemStack(SharpnetTilesBlocks1,1,6), new Object[]
        {
            "AB",
            "BB",
            'A', new ItemStack(Items.tile_brown,1,0), 'B', new ItemStack(Items.tile_white,1,0)
        });
        GameRegistry.addRecipe(new ItemStack(SharpnetTilesBlocks1,2,7), new Object[]
        {
            "AAA",
            "ABA",
            "AAA",
            'A', new ItemStack(Items.tile_white,1,0), 'B', new ItemStack(Items.tile_yellow,1,0)
        });
        GameRegistry.addRecipe(new ItemStack(SharpnetTilesBlocks1,2,8), new Object[]
        {
            "ABB",
            "BBB",
            "BBA",
            'A', new ItemStack(Items.tile_brown,1,0), 'B', new ItemStack(Items.tile_orange,1,0)
        });
        GameRegistry.addRecipe(new ItemStack(SharpnetTilesBlocks1,2,9), new Object[]
        {
            "AAB",
            "BCB",
            "DAC",
            'A', new ItemStack(Items.tile_blue,1,0), 'B', new ItemStack(Items.tile_brown,1,0), 'C', new ItemStack(Items.tile_grey,1,0), 'D', new ItemStack(Items.tile_black,1,0)
        });
        GameRegistry.addRecipe(new ItemStack(SharpnetTilesBlocks1,1,10), new Object[]
        {
            "AA",
            "AA",
            'A', new ItemStack(Items.tile_white,1,0)
        });
        GameRegistry.addRecipe(new ItemStack(SharpnetTilesBlocks1,1,11), new Object[]
        {
            "AB",
            "AA",
            'A', new ItemStack(Items.tile_green,1,0), 'B', new ItemStack(Items.tile_blue,1,0)
        });
        GameRegistry.addRecipe(new ItemStack(SharpnetTilesBlocks1,1,12), new Object[]
        {
            "AB",
            "AA",
            'A', new ItemStack(Items.tile_grey,1,0), 'B', new ItemStack(Items.tile_red,1,0)
        });
        GameRegistry.addRecipe(new ItemStack(SharpnetTilesBlocks1,1,13), new Object[]
        {
            "AB",
            "CC",
            'A', new ItemStack(Items.tile_red,1,0), 'B', new ItemStack(Items.tile_orange,1,0), 'C', new ItemStack(Items.tile_white,1,0)
        });
        GameRegistry.addRecipe(new ItemStack(SharpnetTilesBlocks1,2,14), new Object[]
        {
            "ABA",
            "BCB",
            "ABA",
            'A', new ItemStack(Items.tile_orange,1,0), 'B', new ItemStack(Items.tile_brown,1,0), 'C', new ItemStack(Items.tile_black,1,0)
        });
        GameRegistry.addRecipe(new ItemStack(SharpnetTilesBlocks1,2,15), new Object[]
        {
            "BAB",
            "CBC",
            "BAB",
            'A', new ItemStack(Items.tile_green,1,0), 'B', new ItemStack(Items.tile_red,1,0), 'C', new ItemStack(Items.tile_yellow,1,0)
        });
        
        //Recipes Tiles Blocks Slabs
        GameRegistry.addRecipe(new ItemStack(SharpnetTilesSlabBlocks1,4,0), new Object[]
        {
            "AA",
            'A', new ItemStack(SharpnetTilesBlocks1,1,0)
        });
        GameRegistry.addRecipe(new ItemStack(SharpnetTilesSlabBlocks1,4,1), new Object[]
        {
            "AA",
            'A', new ItemStack(SharpnetTilesBlocks1,1,1)
        });
        GameRegistry.addRecipe(new ItemStack(SharpnetTilesSlabBlocks1,4,2), new Object[]
        {
            "AA",
            'A', new ItemStack(SharpnetTilesBlocks1,1,2)
        });
        GameRegistry.addRecipe(new ItemStack(SharpnetTilesSlabBlocks1,4,3), new Object[]
        {
            "AA",
            'A', new ItemStack(SharpnetTilesBlocks1,1,3)
        });
        GameRegistry.addRecipe(new ItemStack(SharpnetTilesSlabBlocks1,4,4), new Object[]
        {
            "AA",
            'A', new ItemStack(SharpnetTilesBlocks1,1,4)
        });
        GameRegistry.addRecipe(new ItemStack(SharpnetTilesSlabBlocks1,4,5), new Object[]
        {
            "AA",
            'A', new ItemStack(SharpnetTilesBlocks1,1,5)
        });
        GameRegistry.addRecipe(new ItemStack(SharpnetTilesSlabBlocks1,4,6), new Object[]
        {
            "AA",
            'A', new ItemStack(SharpnetTilesBlocks1,1,6)
        });
        GameRegistry.addRecipe(new ItemStack(SharpnetTilesSlabBlocks1,4,7), new Object[]
        {
            "AA",
            'A', new ItemStack(SharpnetTilesBlocks1,1,7)
        });
        GameRegistry.addRecipe(new ItemStack(SharpnetTilesSlabBlocks2,4,0), new Object[]
        {
            "AA",
            'A', new ItemStack(SharpnetTilesBlocks1,1,8)
        });
        GameRegistry.addRecipe(new ItemStack(SharpnetTilesSlabBlocks2,4,1), new Object[]
        {
            "AA",
            'A', new ItemStack(SharpnetTilesBlocks1,1,9)
        });
        GameRegistry.addRecipe(new ItemStack(SharpnetTilesSlabBlocks2,4,2), new Object[]
        {
            "AA",
            'A', new ItemStack(SharpnetTilesBlocks1,1,10)
        });
        GameRegistry.addRecipe(new ItemStack(SharpnetTilesSlabBlocks2,4,3), new Object[]
        {
            "AA",
            'A', new ItemStack(SharpnetTilesBlocks1,1,11)
        });
        GameRegistry.addRecipe(new ItemStack(SharpnetTilesSlabBlocks2,4,4), new Object[]
        {
            "AA",
            'A', new ItemStack(SharpnetTilesBlocks1,1,12)
        });
        GameRegistry.addRecipe(new ItemStack(SharpnetTilesSlabBlocks2,4,5), new Object[]
        {
            "AA",
            'A', new ItemStack(SharpnetTilesBlocks1,1,13)
        });
        GameRegistry.addRecipe(new ItemStack(SharpnetTilesSlabBlocks2,4,6), new Object[]
        {
            "AA",
            'A', new ItemStack(SharpnetTilesBlocks1,1,14)
        });
        GameRegistry.addRecipe(new ItemStack(SharpnetTilesSlabBlocks2,4,7), new Object[]
        {
            "AA",
            'A', new ItemStack(SharpnetTilesBlocks1,1,15)
        });
        GameRegistry.addRecipe(new ItemStack(SharpnetTilesSlabBlocks3,4,0), new Object[]
        {
            "AA",
            'A', new ItemStack(SharpnetTilesBlocks2,1,0)
        });
        GameRegistry.addRecipe(new ItemStack(SharpnetTilesSlabBlocks3,4,1), new Object[]
        {
            "AA",
            'A', new ItemStack(SharpnetTilesBlocks2,1,1)
        });
        GameRegistry.addRecipe(new ItemStack(SharpnetTilesSlabBlocks3,4,2), new Object[]
        {
            "AA",
            'A', new ItemStack(SharpnetTilesBlocks2,1,2)
        });
        GameRegistry.addRecipe(new ItemStack(SharpnetTilesSlabBlocks3,4,3), new Object[]
        {
            "AA",
            'A', new ItemStack(SharpnetTilesBlocks2,1,3)
        });
        
        //Recipes Cloth
        GameRegistry.addRecipe(new ItemStack(Items.cloth_white,1,0), new Object[]
        {
            "SS",
            'S', Item.silk
        });
        GameRegistry.addShapelessRecipe(new ItemStack(Items.cloth_black,1,0), new ItemStack(Items.cloth_white,1,0), new ItemStack(Item.dyePowder,1,0));
        GameRegistry.addShapelessRecipe(new ItemStack(Items.cloth_blue,1,0), new ItemStack(Items.cloth_white,1,0), new ItemStack(Item.dyePowder,1,4));
        GameRegistry.addShapelessRecipe(new ItemStack(Items.cloth_brown,1,0), new ItemStack(Items.cloth_white,1,0), new ItemStack(Item.dyePowder,1,3));
        GameRegistry.addShapelessRecipe(new ItemStack(Items.cloth_gray,1,0), new ItemStack(Items.cloth_white,1,0), new ItemStack(Item.dyePowder,1,8));
        GameRegistry.addShapelessRecipe(new ItemStack(Items.cloth_green,1,0), new ItemStack(Items.cloth_white,1,0), new ItemStack(Item.dyePowder,1,2));
        GameRegistry.addShapelessRecipe(new ItemStack(Items.cloth_orange,1,0), new ItemStack(Items.cloth_white,1,0), new ItemStack(Item.dyePowder,1,14));
        GameRegistry.addShapelessRecipe(new ItemStack(Items.cloth_red,1,0), new ItemStack(Items.cloth_white,1,0), new ItemStack(Item.dyePowder,1,1));
        GameRegistry.addShapelessRecipe(new ItemStack(Items.cloth_yellow,1,0), new ItemStack(Items.cloth_white,1,0), new ItemStack(Item.dyePowder,1,11));

        //Recipe Armors
        GameRegistry.addRecipe(new ItemStack(Items.armor_formal_boots,1,0), new Object[]
        {
            "   ",
            "C C",
            "CDC",
            'C', Items.cloth_black, 'D', Item.diamond
        });
        GameRegistry.addRecipe(new ItemStack(Items.armor_formal_trousers,1,0), new Object[]
        {
            " D ",
            "C C",
            "C C",
            'C', Items.cloth_black, 'D', Item.diamond
        });
        GameRegistry.addRecipe(new ItemStack(Items.armor_formal_suit,1,0), new Object[]
        {
            " D ",
            "CCC",
            " C ",
            'C', Items.cloth_black, 'D', Item.diamond
        });
        
        GameRegistry.addRecipe(new ItemStack(Items.armor_jeans_black,1,0), new Object[]
        {
            "   ",
            "CCC",
            "C C",
            'C', Items.cloth_black
        });
        GameRegistry.addRecipe(new ItemStack(Items.armor_jeans_blue,1,0), new Object[]
        {
            " C ",
            "C C",
            "C C",
            'C', Items.cloth_blue
        });
        GameRegistry.addRecipe(new ItemStack(Items.armor_trousers_black,1,0), new Object[]
        {
            " C ",
            "C C",
            "C C",
            'C', Items.cloth_black
        });
        GameRegistry.addRecipe(new ItemStack(Items.armor_tshirt_black,1,0), new Object[]
        {
            " C ",
            "CDC",
            " C ",
            'C', Items.cloth_black, 'D', Items.cloth_white
        });
        GameRegistry.addRecipe(new ItemStack(Items.armor_tshirt_blue,1,0), new Object[]
        {
            " C ",
            "CCC",
            " C ",
            'C', Items.cloth_blue
        });
        GameRegistry.addRecipe(new ItemStack(Items.armor_tshirt_green,1,0), new Object[]
        {
            " C ",
            "CCC",
            " C ",
            'C', Items.cloth_green
        });
        GameRegistry.addRecipe(new ItemStack(Items.armor_tshirt_orange,1,0), new Object[]
        {
            " C ",
            "CCC",
            " C ",
            'C', Items.cloth_orange
        });
        GameRegistry.addRecipe(new ItemStack(Items.armor_tshirt_white,1,0), new Object[]
        {
            " C ",
            "CCC",
            " C ",
            'C', Items.cloth_white
        });
        GameRegistry.addRecipe(new ItemStack(Items.armor_sunglasses,1,0), new Object[]
        {
            "GWG",
            'G', Block.thinGlass, 'W', new ItemStack(Block.cloth,1,0)
        });
        
        //Recipe Roll of Papper
        GameRegistry.addRecipe(new ItemStack(Items.roll_of_paper_white,1,0), new Object[]
        {
            "PP ",
            "PP ",
            "PP ",
            'P', Item.paper
        });
        GameRegistry.addRecipe(new ItemStack(Items.roll_of_paper_black,1,0), new Object[]
        {
            "PC",
            'P', Items.roll_of_paper_white, 'C', new ItemStack(Item.dyePowder,1,0)
        });
        GameRegistry.addRecipe(new ItemStack(Items.roll_of_paper_blue,1,0), new Object[]
        {
            "PC",
            'P', Items.roll_of_paper_white, 'C', new ItemStack(Item.dyePowder,1,4)
        });
        GameRegistry.addRecipe(new ItemStack(Items.roll_of_paper_brown,1,0), new Object[]
        {
            "PC",
            'P', Items.roll_of_paper_white, 'C', new ItemStack(Item.dyePowder,1,3)
        });
        GameRegistry.addRecipe(new ItemStack(Items.roll_of_paper_green,1,0), new Object[]
        {
            "PC",
            'P', Items.roll_of_paper_white, 'C', new ItemStack(Item.dyePowder,1,2)
        });
        GameRegistry.addRecipe(new ItemStack(Items.roll_of_paper_orange,1,0), new Object[]
        {
            "PC",
            'P', Items.roll_of_paper_white, 'C', new ItemStack(Item.dyePowder,1,14)
        });
        GameRegistry.addRecipe(new ItemStack(Items.roll_of_paper_red,1,0), new Object[]
        {
            "PC",
            'P', Items.roll_of_paper_white, 'C', new ItemStack(Item.dyePowder,1,1)
        });
        GameRegistry.addRecipe(new ItemStack(Items.roll_of_paper_yellow,1,0), new Object[]
        {
            "PC",
            'P', Items.roll_of_paper_white, 'C', new ItemStack(Item.dyePowder,1,11)
        });
        
        //Recipe Walls
        GameRegistry.addRecipe(new ItemStack(SharpnetWallsBlocks1,8,0), new Object[]
        {
            "ABA",
            "B B",
            "ABA",
            'A', Items.roll_of_paper_white, 'B', Items.roll_of_paper_brown
        });
        GameRegistry.addRecipe(new ItemStack(SharpnetWallsBlocks1,8,1), new Object[]
        {
            "ABA",
            "B B",
            "ABA",
            'A', Items.roll_of_paper_white, 'B', Items.roll_of_paper_black
        });
        GameRegistry.addRecipe(new ItemStack(SharpnetWallsBlocks1,3,2), new Object[]
        {
            "A  ",
            "A  ",
            "A  ",
            'A', Items.roll_of_paper_brown
        });
        GameRegistry.addRecipe(new ItemStack(SharpnetWallsBlocks1,3,3), new Object[]
        {
            "A  ",
            "B  ",
            "B  ",
            'A', Items.roll_of_paper_brown, 'B', Items.roll_of_paper_red
        });
        GameRegistry.addRecipe(new ItemStack(SharpnetWallsBlocks1,3,4), new Object[]
        {
            "AAA",
            "   ",
            "   ",
            'A', Items.roll_of_paper_orange
        });
        GameRegistry.addRecipe(new ItemStack(SharpnetWallsBlocks1,3,5), new Object[]
        {
            "ABA",
            "   ",
            "   ",
            'A', Items.roll_of_paper_blue, 'B', Items.roll_of_paper_white
        });
        GameRegistry.addRecipe(new ItemStack(SharpnetWallsBlocks1,3,6), new Object[]
        {
            "A  ",
            "B  ",
            "A  ",
            'A', Items.roll_of_paper_blue, 'B', Items.roll_of_paper_yellow
        });
        GameRegistry.addRecipe(new ItemStack(SharpnetWallsBlocks1,9,7), new Object[]
        {
            "AAA",
            "BCB",
            "AAA",
            'A', Items.roll_of_paper_white, 'B', Items.roll_of_paper_green, 'C', Items.roll_of_paper_red
        });
        GameRegistry.addRecipe(new ItemStack(SharpnetWallsBlocks1,3,8), new Object[]
        {
            "ABA",
            "   ",
            "   ",
            'A', Items.roll_of_paper_blue, 'B', Items.roll_of_paper_yellow
        });
        GameRegistry.addRecipe(new ItemStack(SharpnetWallsBlocks1,3,9), new Object[]
        {
            "ABA",
            "   ",
            "   ",
            'A', Items.roll_of_paper_red, 'B', Items.roll_of_paper_white
        });
        GameRegistry.addRecipe(new ItemStack(SharpnetWallsBlocks1,3,10), new Object[]
        {
            "ABA",
            "   ",
            "   ",
            'A', Items.roll_of_paper_black, 'B', Items.roll_of_paper_white
        });
        GameRegistry.addRecipe(new ItemStack(SharpnetWallsBlocks1,3,11), new Object[]
        {
            "ABA",
            "   ",
            "   ",
            'A', Items.roll_of_paper_green, 'B', Items.roll_of_paper_yellow
        });
        GameRegistry.addRecipe(new ItemStack(SharpnetWallsBlocks1,8,12), new Object[]
        {
            "AAA",
            "A A",
            "AAA",
            'A', Items.wood_tile_spruce
        });
        
        //Recipe throwel wall
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Block.cobblestone,1,0), Item.clay);
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wall_cobblestone_trowel_block,8,0), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Item.dyePowder, 1, 15)); //White
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wall_cobblestone_trowel_block,8,1), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Item.dyePowder, 1, 14)); //Orange
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wall_cobblestone_trowel_block,8,2), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Item.dyePowder, 1, 13)); //
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wall_cobblestone_trowel_block,8,3), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Item.dyePowder, 1, 12)); //
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wall_cobblestone_trowel_block,8,4), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Item.dyePowder, 1, 11)); //
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wall_cobblestone_trowel_block,8,5), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Item.dyePowder, 1, 10)); //
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wall_cobblestone_trowel_block,8,6), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Item.dyePowder, 1, 9)); //
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wall_cobblestone_trowel_block,8,7), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Item.dyePowder, 1, 8)); //
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wall_cobblestone_trowel_block,8,8), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Item.dyePowder, 1, 7)); //
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wall_cobblestone_trowel_block,8,9), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Item.dyePowder, 1, 6)); //
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wall_cobblestone_trowel_block,8,10), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Item.dyePowder, 1, 5)); //
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wall_cobblestone_trowel_block,8,11), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Item.dyePowder, 1, 4)); //
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wall_cobblestone_trowel_block,8,13), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Item.dyePowder, 1, 2)); //
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wall_cobblestone_trowel_block,8,14), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Item.dyePowder, 1, 1)); //
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wall_cobblestone_trowel_block,8,15), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Blocks.wall_cobblestone_trowel_block,1,12), new ItemStack(Item.dyePowder, 1, 0)); //Black
        
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Block.brick,1,0), Item.clay);
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wall_bricks_trowel_block,8,0), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Item.dyePowder, 1, 15)); //White
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wall_bricks_trowel_block,8,1), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Item.dyePowder, 1, 14)); //Orange
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wall_bricks_trowel_block,8,2), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Item.dyePowder, 1, 13)); //
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wall_bricks_trowel_block,8,3), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Item.dyePowder, 1, 12)); //
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wall_bricks_trowel_block,8,4), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Item.dyePowder, 1, 11)); //
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wall_bricks_trowel_block,8,5), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Item.dyePowder, 1, 10)); //
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wall_bricks_trowel_block,8,6), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Item.dyePowder, 1, 9)); //
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wall_bricks_trowel_block,8,7), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Item.dyePowder, 1, 8)); //
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wall_bricks_trowel_block,8,8), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Item.dyePowder, 1, 7)); //
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wall_bricks_trowel_block,8,9), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Item.dyePowder, 1, 6)); //
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wall_bricks_trowel_block,8,10), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Item.dyePowder, 1, 5)); //
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wall_bricks_trowel_block,8,11), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Item.dyePowder, 1, 4)); //
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wall_bricks_trowel_block,8,13), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Item.dyePowder, 1, 2)); //
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wall_bricks_trowel_block,8,14), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Item.dyePowder, 1, 1)); //
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wall_bricks_trowel_block,8,15), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Blocks.wall_bricks_trowel_block,1,12), new ItemStack(Item.dyePowder, 1, 0)); //Black
        
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Block.stoneDoubleSlab,1,0), Item.clay);
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wall_stone_slab_trowel_block,8,0), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Item.dyePowder, 1, 15)); //White
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wall_stone_slab_trowel_block,8,1), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Item.dyePowder, 1, 14)); //Orange
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wall_stone_slab_trowel_block,8,2), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Item.dyePowder, 1, 13)); //
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wall_stone_slab_trowel_block,8,3), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Item.dyePowder, 1, 12)); //
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wall_stone_slab_trowel_block,8,4), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Item.dyePowder, 1, 11)); //
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wall_stone_slab_trowel_block,8,5), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Item.dyePowder, 1, 10)); //
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wall_stone_slab_trowel_block,8,6), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Item.dyePowder, 1, 9)); //
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wall_stone_slab_trowel_block,8,7), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Item.dyePowder, 1, 8)); //
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wall_stone_slab_trowel_block,8,8), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Item.dyePowder, 1, 7)); //
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wall_stone_slab_trowel_block,8,9), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Item.dyePowder, 1, 6)); //
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wall_stone_slab_trowel_block,8,10), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Item.dyePowder, 1, 5)); //
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wall_stone_slab_trowel_block,8,11), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Item.dyePowder, 1, 4)); //
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wall_stone_slab_trowel_block,8,13), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Item.dyePowder, 1, 2)); //
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wall_stone_slab_trowel_block,8,14), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Item.dyePowder, 1, 1)); //
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wall_stone_slab_trowel_block,8,15), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Blocks.wall_stone_slab_trowel_block,1,12), new ItemStack(Item.dyePowder, 1, 0)); //Black
        
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
        //Register Slab
        Item.itemsList[SharpnetTilesSlabBlocks1.blockID] = new ShItemSlab(SharpnetTilesSlabBlocks1.blockID-256, (BlockHalfSlab)SharpnetTilesSlabBlocks1, (BlockHalfSlab)SharpnetTilesBlocks1, false, 0);
        Item.itemsList[SharpnetTilesSlabBlocks2.blockID] = new ShItemSlab(SharpnetTilesSlabBlocks2.blockID-256, (BlockHalfSlab)SharpnetTilesSlabBlocks2, (BlockHalfSlab)SharpnetTilesBlocks1, false, 8);
        Item.itemsList[SharpnetTilesSlabBlocks3.blockID] = new ShItemSlab(SharpnetTilesSlabBlocks3.blockID-256, (BlockHalfSlab)SharpnetTilesSlabBlocks3, (BlockHalfSlab)SharpnetTilesBlocks2, false, 0);
        
    }
}
