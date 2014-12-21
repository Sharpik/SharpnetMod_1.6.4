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
import ModSharpnet.Block.*;
import ModSharpnet.Item.*;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraftforge.common.EnumHelper;

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
    
    //Material Register
    public static EnumArmorMaterial SharpnetArmorCloth = EnumHelper.addArmorMaterial("SharpnetArmorCloth", 5, new int[] {1, 3, 2, 1}, 30);
    
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
        Blocks.drinks1_block_ID = config.get("Blocks", "drinks1_block", 2515).getInt();
        
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
        Items.guttalax_ID = (config.get("Items", "guttalax", 6538).getInt())-256;
       
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
        
        //Item Alcohol
        Items.beer = new ShItemFoodPlacer1(Items.beer_ID, 4, 2.0F, false, Blocks.drinks1_block_ID, 0, 20).setUnlocalizedName("Beer").setTextureName(modid+":drinks&food/beer");
        GameRegistry.registerItem(Items.beer, "Beer");
        LanguageRegistry.addName(new ItemStack(Items.beer, 1, 0), "Beer");
        
        Items.wine = new ShItemFoodPlacer1(Items.wine_ID, 10, 3.0F, false, Blocks.drinks1_block_ID, 1, 60).setUnlocalizedName("Wine").setTextureName(modid+":drinks&food/wine");
        GameRegistry.registerItem(Items.wine, "Wine");
        LanguageRegistry.addName(new ItemStack(Items.wine, 1, 0), "Wine");
        
        Items.bottle = new ShItemPlacer(Items.bottle_ID, Blocks.drinks1_block_ID, 0).setUnlocalizedName("Bottle_Empty").setTextureName(modid+":drinks&food/bottle");
        GameRegistry.registerItem(Items.bottle, "Bottle Empty");
        LanguageRegistry.addName(new ItemStack(Items.bottle, 1, 0), "Bottle Empty");
        
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
