package ModSharpnet;

import static ModSharpnet.ModSharpnet.modid;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockHalfSlab;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

public class SharpnetTilesBlocks1 extends BlockHalfSlab
{

    public SharpnetTilesBlocks1(int par1, boolean par2,String par2Material)
    {
        super(par1, par2, Material.rock);
        setUnlocalizedName("TilesBlocks1Block");
        setHardness(1.0F).setStepSound(Block.soundStoneFootstep);
        setResistance(2.0F);
        setCreativeTab(CreativeTabs.tabBlock);
    }
    
    // TADY ZMENIT POCET VARIANT 1 - 16
    public int pocet = 16;
    
    @Override
    public int idDropped (int par1, Random par2Random, int par3)
    {
          return this.blockID;
    }
    
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
                case 0:{icons[i] = par1.registerIcon(modid+":tiles_stone/tile1");break;}
                case 1:{icons[i] = par1.registerIcon(modid+":tiles_stone/tile2");break;}
                case 2:{icons[i] = par1.registerIcon(modid+":tiles_stone/tile3");break;}
                case 3:{icons[i] = par1.registerIcon(modid+":tiles_stone/tile4");break;}
                case 4:{icons[i] = par1.registerIcon(modid+":tiles_stone/tile5");break;}
                case 5:{icons[i] = par1.registerIcon(modid+":tiles_stone/tile6");break;}
                case 6:{icons[i] = par1.registerIcon(modid+":tiles_stone/tile7");break;}
                case 7:{icons[i] = par1.registerIcon(modid+":tiles_stone/tile8");break;}
                case 8:{icons[i] = par1.registerIcon(modid+":tiles_stone/tile9");break;}
                case 9:{icons[i] = par1.registerIcon(modid+":tiles_stone/tile10");break;}
                case 10:{icons[i] = par1.registerIcon(modid+":tiles_stone/tile11");break;}
                case 11:{icons[i] = par1.registerIcon(modid+":tiles_stone/tile12");break;}
                case 12:{icons[i] = par1.registerIcon(modid+":tiles_stone/tile13");break;}
                case 13:{icons[i] = par1.registerIcon(modid+":tiles_stone/tile14");break;}
                case 14:{icons[i] = par1.registerIcon(modid+":tiles_stone/tile15");break;}
                case 15:{icons[i] = par1.registerIcon(modid+":tiles_stone/tile16");break;}
                default:{icons[i] = par1.registerIcon(modid+":error");break;}
            }
            
        }
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public Icon getIcon(int par1,int par2)
    {
        return icons[par2];
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
