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

public class SharpnetBushesBlocks extends BlockFlower
{
    private int BlocksCount;
    private String[] bushesTypes;
    private String[] names;
    public String[][] BlocksInfo = new String[16][2];
    
    @SideOnly(Side.CLIENT)
    public Icon[] iconArray;

    public SharpnetBushesBlocks(int id, String[][] blocksInfo)
    {
        super(id, Material.plants);
        float f = 0.2F;
        this.setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, f * 3.0F, 0.5F + f);
        this.BlocksInfo = blocksInfo;
        
        this.BlocksCount = blocksInfo.length;
        this.names = new String[this.BlocksCount];
        this.bushesTypes = new String[this.BlocksCount];
        
        for(int i = 0; i < this.BlocksCount; i++)
        {
            if(this.BlocksInfo[i][0] != null) { this.names[i] = this.BlocksInfo[i][0]; } else { this.names[i] = "Error"; }
            if(this.BlocksInfo[i][1] != null) { this.bushesTypes[i] = this.BlocksInfo[i][1]; } else { this.bushesTypes[i] = "Error"; }
        }
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
        int l_down = par1World.getBlockId(par2, par3 - 1, par4);
        Block block = Block.blocksList[l];
        return (block == null || block.isBlockReplaceable(par1World, par2, par3, par4)) && canThisPlantGrowOnThisBlockID(l_down);
    }

    @Override
    protected boolean canThisPlantGrowOnThisBlockID(int par1)
    {
        return par1 == Block.grass.blockID || par1 == Block.dirt.blockID || par1 == Block.tilledField.blockID || par1 == Block.sand.blockID;
    }
    
    @Override
    public boolean canBlockStay(World par1World, int par2, int par3, int par4)
    {
        
        List soil = new ArrayList<Integer>();
        
        soil.add(Block.grass.blockID);
        soil.add(Block.dirt.blockID);
        soil.add(Block.tilledField.blockID);
        
        int WBlockOriginId = par1World.getBlockId(par2, par3, par4);
        int WBlockSoilId = par1World.getBlockId(par2, par3 - 1, par4);
        int WBlockMeta = par1World.getBlockMetadata(par2, par3, par4);
        
        //these bushes can stay on sand
        /*
        if (WBlockOriginId == SharpnetFlowerBlocks1.blockID)
        {
            switch(WBlockMeta)
            {
                case 1: soil.add(Block.sand.blockID); break;
            }
        }
        */
        
        if ( soil.contains(WBlockSoilId) )
        {
            return true;
        }
        else return false;
        
    }
    
    /**
     * The type of render function that is called for this block
     */
    @Override
    public int getRenderType()
    {
        return 6;
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
        for (int sub = 0; sub < this.BlocksCount; ++sub)
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
        this.iconArray = new Icon[bushesTypes.length];

        for (int i = 0; i < this.iconArray.length; ++i)
        {
            this.iconArray[i] = par1IconRegister.registerIcon(modid+":" + bushesTypes[i]);
        }
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public Icon getIcon(int par1,int par2)
    {
        return this.iconArray[par2];
    }
}
