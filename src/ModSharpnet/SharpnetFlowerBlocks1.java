package ModSharpnet;

import static ModSharpnet.ModSharpnet.modid;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.world.World;


public class SharpnetFlowerBlocks1 extends BlockFlower
{
    public static final String[] flowerTypes = new String[] {"daffodil", "flora_cactus", "fuchsia", "sunflower", "bonsai", "snapdragon", "red_dicot", "tulips", "african_daisy", "dahilia", "daffodil", "yellow_dicot", "bird_of_paradise", "okee_giant", "mantis_shrimp", "hedgehog_cactus"};
    
    @SideOnly(Side.CLIENT)
    public Icon[] iconArray;

    public SharpnetFlowerBlocks1(int id, Material par2Material)
    {
        super(id, Material.plants);
        float f = 0.2F;
        this.setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, f * 3.0F, 0.5F + f);
    }
    
    public SharpnetFlowerBlocks1(int par1)
    {
        this(par1, Material.plants);
    }
    
    /**
     * Returns the MetaData of the items to drop on destruction.
     */
    @Override
    public int damageDropped (int metadata)
    {
            return metadata;
    }
    
    @Override
    public int quantityDropped(Random par1Random)
    {
        return 1;
    }

    /**
     * Returns the usual quantity dropped by the block plus a bonus of 1 to 'i' (inclusive).
     */
    @Override
    public int quantityDroppedWithBonus(int par1, Random par2Random)
    {
        return 1 + par2Random.nextInt(par1 * 2 + 1);
    }

    @Override
    public boolean canPlaceBlockAt(World par1World, int par2, int par3, int par4)
    {
        int l = par1World.getBlockId(par2, par3, par4);
        Block block = Block.blocksList[l];
        return (block == null || block.isBlockReplaceable(par1World, par2, par3, par4)) && canThisPlantGrowOnThisBlockID(l);
    }

    @Override
    protected boolean canThisPlantGrowOnThisBlockID(int par1)
    {
        return par1 == Block.grass.blockID || par1 == Block.dirt.blockID || par1 == Block.tilledField.blockID || par1 == Block.sand.blockID;
    }
    
    @Override
    public boolean canBlockStay(World par1World, int par2, int par3, int par4)
    {
        /*
        boolean soil_grass[] = {false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false};
        boolean soil_dirt[] = {false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false};
        boolean soil_field[] = {false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false};
        boolean soil_sand[] = {false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false};
        boolean nexter = false;
        
        int WBlockSoilId = par1World.getBlockId(par2, par3 - 1, par4);
        int WBlockMeta = par1World.getBlockMetadata(par2, par3, par4);
        par1World.
        
        soil_grass[0] = true;
        soil_dirt[0] = true;
        soil_field[0] = true;
        soil_sand[0] = false;
        
        soil_grass[1] = true;
        soil_dirt[1] = true;
        soil_field[1] = true;
        soil_sand[1] = true;
        
        soil_grass[2] = true;
        soil_dirt[2] = true;
        soil_field[2] = true;
        soil_sand[2] = false;
        
        soil_grass[3] = true;
        soil_dirt[3] = true;
        soil_field[3] = true;
        soil_sand[3] = false;
        
        soil_grass[4] = true;
        soil_dirt[4] = true;
        soil_field[4] = true;
        soil_sand[4] = false;
        
        soil_grass[5] = true;
        soil_dirt[5] = true;
        soil_field[5] = true;
        soil_sand[5] = false;
        
        soil_grass[6] = true;
        soil_dirt[6] = true;
        soil_field[6] = true;
        soil_sand[6] = false;
        
        soil_grass[7] = true;
        soil_dirt[7] = true;
        soil_field[7] = true;
        soil_sand[7] = false;
        
        soil_grass[8] = true;
        soil_dirt[8] = true;
        soil_field[8] = true;
        soil_sand[8] = false;
        
        soil_grass[9] = true;
        soil_dirt[9] = true;
        soil_field[9] = true;
        soil_sand[9] = false;
        
        soil_grass[10] = true;
        soil_dirt[10] = true;
        soil_field[10] = true;
        soil_sand[10] = false;
        
        soil_grass[11] = true;
        soil_dirt[11] = true;
        soil_field[11] = true;
        soil_sand[11] = false;
        
        soil_grass[12] = true;
        soil_dirt[12] = true;
        soil_field[12] = true;
        soil_sand[12] = true;
        
        soil_grass[13] = true;
        soil_dirt[13] = true;
        soil_field[13] = true;
        soil_sand[13] = true;
        
        soil_grass[14] = true;
        soil_dirt[14] = true;
        soil_field[14] = true;
        soil_sand[14] = true;
        
        soil_grass[15] = true;
        soil_dirt[15] = true;
        soil_field[15] = true;
        soil_sand[15] = true;
        
        if (soil_grass[WBlockMeta] && (WBlockSoilId == Block.grass.blockID) ) {nexter = true;}
        if (soil_dirt[WBlockMeta] && (WBlockSoilId == Block.dirt.blockID) ) {nexter = true;}
        if (soil_field[WBlockMeta] && (WBlockSoilId == Block.tilledField.blockID) ) {nexter = true;}
        if (soil_sand[WBlockMeta] && (WBlockSoilId == Block.sand.blockID) ) {nexter = true;}
        
        //debug
        //System.out.println("SharpnetMod Debug: Meta:" + WBlockMeta + " Soil:" + WBlockSoilId + " nexter:" + nexter + " Sand:" + soil_sand[WBlockMeta]);
        
        //if ( (par1World.getFullBlockLightValue(par2, par3, par4) >= 8 || par1World.canBlockSeeTheSky(par2, par3, par4)) && ( nexter ) )
        if ( nexter  )
        {
            return true;
        }
        else return false;
        */
        
        List soil = new ArrayList<Integer>();
        
        soil.add(Block.grass.blockID);
        soil.add(Block.dirt.blockID);
        soil.add(Block.tilledField.blockID);
        
        int WBlockSoilId = par1World.getBlockId(par2, par3 - 1, par4);
        int WBlockMeta = par1World.getBlockMetadata(par2, par3, par4);
        
        switch(WBlockMeta)
        {
            case 1: soil.add(Block.sand.blockID); break;
            case 12: soil.add(Block.sand.blockID); break;
            case 13: soil.add(Block.sand.blockID); break;
            case 14: soil.add(Block.sand.blockID); break;
            case 15: soil.add(Block.sand.blockID); break;
        }
        
        if ( soil.contains(WBlockSoilId) )
        {
            return true;
        }
        else return false;
        
    }

    /**
     * Called when the player destroys a block with an item that can harvest it. (i, j, k) are the coordinates of the
     * block and l is the block's subtype/damage.
     */
    @Override
    public void harvestBlock(World par1World, EntityPlayer par2EntityPlayer, int par3, int par4, int par5, int par6)
    {
        super.harvestBlock(par1World, par2EntityPlayer, par3, par4, par5, par6);
    }

    /**
     * Get the block's damage value (for use with pick block).
     */
    @Override
    public int getDamageValue(World par1World, int par2, int par3, int par4)
    {
        return par1World.getBlockMetadata(par2, par3, par4);
    }

    @SideOnly(Side.CLIENT)

    /**
     * returns a list of blocks with the same ID, but different meta (eg: wood returns 4 blocks)
     */
    @Override
    public void getSubBlocks(int par1, CreativeTabs par2CreativeTabs, List subBlocks)
    {
        for (int sub = 0; sub < flowerTypes.length; ++sub)
        {
            subBlocks.add(new ItemStack(par1, 1, sub));
        }
    }

    @SideOnly(Side.CLIENT)
    /**
     * When this method is called, your block should register all the icons it needs with the given IconRegister. This
     * is the only chance you get to register icons.
     */
    @Override
    public void registerIcons(IconRegister par1IconRegister)
    {
        this.iconArray = new Icon[flowerTypes.length];

        for (int i = 0; i < this.iconArray.length; ++i)
        {
            this.iconArray[i] = par1IconRegister.registerIcon(modid+":flowers/" + flowerTypes[i]);
        }
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public Icon getIcon(int par1,int par2)
    {
        return this.iconArray[par2];
    }
}
