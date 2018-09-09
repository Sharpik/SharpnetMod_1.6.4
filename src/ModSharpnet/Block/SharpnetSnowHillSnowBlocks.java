package ModSharpnet.Block;

import ModSharpnet.*;
import static ModSharpnet.ModSharpnet.modid;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

public class SharpnetSnowHillSnowBlocks extends Block
{
    private int BlocksCount;
    private String[] blockTexture;
    private String[] names;
    public String[][] BlocksInfo = new String[16][2];
    
    @SideOnly(Side.CLIENT)
    public Icon[] iconArray;

    public SharpnetSnowHillSnowBlocks(int id, String[][] blocksInfo)
    {
        super(id, Material.craftedSnow);
        this.BlocksInfo = blocksInfo;
        
        this.BlocksCount = blocksInfo.length;
        this.names = new String[this.BlocksCount];
        this.blockTexture = new String[this.BlocksCount];
        
        for(int i = 0; i < this.BlocksCount; i++)
        {
            if(this.BlocksInfo[i][0] != null) { this.names[i] = this.BlocksInfo[i][0]; } else { this.names[i] = "Error"; }
            if(this.BlocksInfo[i][1] != null) { this.blockTexture[i] = this.BlocksInfo[i][1]; } else { this.blockTexture[i] = "Error"; }
            
            switch(i)
            {
                //SnowHillBlock 1
                case 0: this.slipperiness = 1.0F; break;
                case 1: this.slipperiness = 1.2F; break;
                case 2: this.slipperiness = 1.5F; break;
            }
        }
    }
    
    @Override
    public int idDropped (int par1, Random par2Random, int par3)
    {
          return this.blockID;
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
        this.iconArray = new Icon[blockTexture.length];

        for (int i = 0; i < this.iconArray.length; ++i)
        {
            this.iconArray[i] = par1IconRegister.registerIcon(blockTexture[i]);
        }
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public Icon getIcon(int par1,int par2)
    {
        return this.iconArray[par2];
    }
    
    /**
     * Triggered whenever an entity collides with this block (enters into the block). Args: world, x, y, z, entity
     */
    @Override
    public void onEntityCollidedWithBlock(World par1World, int par2, int par3, int par4, Entity par5Entity)
    {
        int meta = par1World.getBlockMetadata(par2, par3, par4);
        double motion = 1D;
        switch(meta)
        {
            case 0: motion = 1.0D; break;
            case 1: motion = 1.5D; break;
            case 2: motion = 1.5D; break;
        }
        par5Entity.motionX *= motion; par5Entity.motionZ *= motion;
    }
}
