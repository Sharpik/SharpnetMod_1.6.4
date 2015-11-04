package ModSharpnet;

import static ModSharpnet.ModSharpnet.modid;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.BlockHalfSlab;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

public class SharpnetTilesWoodSlabBlocks2 extends BlockHalfSlab
{
    
    public SharpnetTilesWoodSlabBlocks2(int par1, boolean par2, Material par3Material)
    {
        super(par1, par2, Material.wood);
        setUnlocalizedName("TilesWoodSlabBlocks2Block");
        setHardness(1.0F).setStepSound(Block.soundWoodFootstep);
        setResistance(2.0F);
        setCreativeTab(CreativeTabs.tabBlock);
        this.useNeighborBrightness[par1] = true;
    }
    
    // !!! Je třeba registrovat v post ini !!!
    
    // TADY ZMENIT POCET VARIANT 1 - 8
    public int pocet = 5;
    
    @Override
    @SideOnly(Side.CLIENT)
    public int idPicked(World par1World, int par2, int par3, int par4)
    {
        return this.blockID;
    }
    
    @SideOnly(Side.CLIENT)
    private Icon[] icons;
    
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister par1)
    {
        icons = new Icon[pocet];
        
        for (int i = 0; i < icons.length; i++)
        {
            switch(i)
            {
                case 0:{icons[i] = par1.registerIcon(modid+":tiles_wood/DP4");break;}
                case 1:{icons[i] = par1.registerIcon(modid+":tiles_wood/DP5");break;}
                case 2:{icons[i] = par1.registerIcon(modid+":tiles_wood/DP6");break;}
                case 3:{icons[i] = par1.registerIcon(modid+":tiles_wood/DP8");break;}
                case 4:{icons[i] = par1.registerIcon(modid+":tiles_wood/DP9");break;}
                /*
                case 5:{icons[i] = par1.registerIcon(modid+":tiles_wood/w_floor1_red");break;}
                case 6:{icons[i] = par1.registerIcon(modid+":tiles_wood/w_floor1_yellow");break;}
                case 7:{icons[i] = par1.registerIcon(modid+":tiles_wood/w_floor1_normal");break;}
                */
                default:{icons[i] = par1.registerIcon(modid+":error");break;}
            }
            
        }
    }
    
    private boolean isBlockSingleSlab(int par0)
    {
        return true;
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public Icon getIcon(int par1,int par2)
    {
        if (par2 < pocet) { return icons[par2]; }
        if (par2 > 7) { return icons[par2-pocet]; }
        return this.blockIcon;
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public void getSubBlocks(int par1, CreativeTabs par2CreativeTabs, List par3List)
    {
        for(int i = 0; i < pocet; i++)
          {
                 par3List.add(new ItemStack(par1, 1, i));
          }
    }

    @Override
    public String getFullSlabName(int id) { if (id < 0) { id = 0; } return this.getUnlocalizedName(); }
    
}
