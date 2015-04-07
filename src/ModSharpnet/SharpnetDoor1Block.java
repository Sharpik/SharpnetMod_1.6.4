package ModSharpnet;

import static ModSharpnet.ModSharpnet.modid;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.Random;
import static net.minecraft.block.Block.setBurnProperties;
import net.minecraft.block.BlockDoor;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.IconFlipped;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.Icon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

class SharpnetDoor1Block extends BlockDoor
{
    @SideOnly(Side.CLIENT)
    private Icon[] Ikona1;
    
    @SideOnly(Side.CLIENT)
    private Icon[] Ikona2;
    
    public SharpnetDoor1Block(int door1_block_ID, Material par2Material)
    {
        super(door1_block_ID, par2Material);
        setUnlocalizedName("Sharpnet Door 1");
        setHardness(1.0F);
        setResistance(2.0F);
        setLightOpacity(0);
        setBurnProperties(door1_block_ID, 30, 60);
    }
    
    @SideOnly(Side.CLIENT)
    @Override
    public Icon getIcon(int par1, int par2)
    {
        return this.Ikona2[0];
    }
    
    @SideOnly(Side.CLIENT)
    @Override
    public Icon getBlockTexture(IBlockAccess par1IBlockAccess, int par2, int par3, int par4, int par5)
    {
        if (par5 != 1 && par5 != 0)
        {
            int i1 = this.getFullMetadata(par1IBlockAccess, par2, par3, par4);
            int j1 = i1 & 3;
            boolean flag = (i1 & 4) != 0;
            boolean flag1 = false;
            boolean flag2 = (i1 & 8) != 0;

            if (flag)
            {
                if (j1 == 0 && par5 == 2)
                {
                    flag1 = !flag1;
                }
                else if (j1 == 1 && par5 == 5)
                {
                    flag1 = !flag1;
                }
                else if (j1 == 2 && par5 == 3)
                {
                    flag1 = !flag1;
                }
                else if (j1 == 3 && par5 == 4)
                {
                    flag1 = !flag1;
                }
            }
            else
            {
                if (j1 == 0 && par5 == 5)
                {
                    flag1 = !flag1;
                }
                else if (j1 == 1 && par5 == 3)
                {
                    flag1 = !flag1;
                }
                else if (j1 == 2 && par5 == 4)
                {
                    flag1 = !flag1;
                }
                else if (j1 == 3 && par5 == 2)
                {
                    flag1 = !flag1;
                }

                if ((i1 & 16) != 0)
                {
                    flag1 = !flag1;
                }
            }

            return flag2 ? this.Ikona1[flag1 ? 1 : 0] : this.Ikona2[flag1 ? 1 : 0];
        }
        else
        {
            return this.Ikona2[0];
        }
    }
    
    @SideOnly(Side.CLIENT)
    @Override
    public void registerIcons(IconRegister par1IconRegister)
    {
        this.Ikona1 = new Icon[2];
        this.Ikona2 = new Icon[2];
        this.Ikona1[0] = par1IconRegister.registerIcon(modid+":doors/door_1.1");
        this.Ikona2[0] = par1IconRegister.registerIcon(modid+":doors/door_1.2");
        this.Ikona1[1] = new IconFlipped(this.Ikona1[0], true, false);
        this.Ikona2[1] = new IconFlipped(this.Ikona2[0], true, false);
    }
    
    @Override
    public int idDropped(int par1, Random par2Random, int par3)
    {
        return (par1 & 8) != 0 ? 0 : (this.blockID-1);
    }
    
    @Override
    public int idPicked(World par1World, int par2, int par3, int par4)
    {
        return this.blockID-1;
    }
    
    @Override
    public int quantityDropped(Random par1Random)
    {
        return 1;
    }
    
    @Override
    public void onBlockHarvested(World par1World, int par2, int par3, int par4, int par5, EntityPlayer par6EntityPlayer)
    {
        if (par6EntityPlayer.capabilities.isCreativeMode && (par5 & 8) != 0 && par1World.getBlockId(par2, par3 - 1, par4) == this.blockID)
        {
            par1World.setBlockToAir(par2, par3 - 1, par4);
        }
    }
}
