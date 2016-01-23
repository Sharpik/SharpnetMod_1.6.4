package ModSharpnet.Block;

import static ModSharpnet.ModSharpnet.modid;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;

public class SharpnetStoneBlocks1 extends Block
{
    
    public SharpnetStoneBlocks1(int par1)
    {
        super(par1, Material.rock);
        setHardness(3.0F).setStepSound(Block.soundStoneFootstep);
        setResistance(12.0F);
        setCreativeTab(CreativeTabs.tabBlock);
    }
    
    // TADY ZMENIT POCET VARIANT 1 - 16
    public int pocet = 4;
    
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
    
    @SideOnly(Side.CLIENT)
    public static Icon[] topIcon;
    
    @SideOnly(Side.CLIENT)
    public static Icon[] bottomIcon;
    
    @SideOnly(Side.CLIENT)
    public static Icon[] sideIcon;
    
    
    @SideOnly(Side.CLIENT)
    public static Icon[] icons;
    @SideOnly(Side.CLIENT)
    public static boolean[] isSided;
    
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister par1)
    {
        icons = new Icon[pocet];
        topIcon = new Icon[pocet];
        bottomIcon = new Icon[pocet];
        sideIcon = new Icon[pocet];
        isSided = new boolean[pocet];
        
        for (int i = 0; i < icons.length; i++)
        {
            switch(i)
            {
                case 0:{icons[i] = par1.registerIcon(modid+":stone/stone1");isSided[i]=false;break;}
                case 1:{icons[i] = par1.registerIcon(modid+":stone/stone2");isSided[i]=false;break;}
                case 2:{icons[i] = par1.registerIcon(modid+":stone/stone3");isSided[i]=false;break;}
                case 3:{icons[i] = par1.registerIcon(modid+":stone/stone4");isSided[i]=false;break;}
                /*
                case 4:{icons[i] = par1.registerIcon(modid+":stone/stone5");isSided[i]=false;break;}
                case 5:{icons[i] = par1.registerIcon(modid+":stone/stone6");isSided[i]=false;break;}
                case 6:{icons[i] = par1.registerIcon(modid+":stone/stone7");isSided[i]=false;break;}
                case 7:{icons[i] = par1.registerIcon(modid+":stone/stone8");isSided[i]=false;break;}
                case 8:{icons[i] = par1.registerIcon(modid+":stone/stone9");isSided[i]=false;break;}
                case 9:{icons[i] = par1.registerIcon(modid+":stone/stone10");isSided[i]=false;break;}
                case 10:{icons[i] = par1.registerIcon(modid+":stone/stone11");isSided[i]=false;break;}
                case 11:{icons[i] = par1.registerIcon(modid+":stone/stone12");isSided[i]=false;break;}
                case 12:{icons[i] = par1.registerIcon(modid+":stone/stone13");isSided[i]=false;break;}
                case 13:{icons[i] = par1.registerIcon(modid+":stone/stone14");isSided[i]=false;break;}
                case 14:{icons[i] = par1.registerIcon(modid+":stone/stone15");isSided[i]=false;break;}
                case 15:{icons[i] = par1.registerIcon(modid+":stone/stone16");isSided[i]=false;break;}
                */
                default:{icons[i] = par1.registerIcon(modid+":error");break;}
                // Sided block
                /*case 12:
                {
                    isSided[i] = true;
                    // TOP
                    topIcon[i] = par1.registerIcon(modid+":walls/wall_1.1");
                    // BOTTOM
                    bottomIcon[i] = par1.registerIcon(modid+":walls/wall_1.2");
                    // SIDES
                    sideIcon[i] = par1.registerIcon(modid+":walls/wall_1");
                    break;
                }*/
            }
            
        }
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public Icon getIcon(int side,int meta)
    {
        if (isSided[meta] == true )
        {
            switch(side)
            {
                case 0:
                    return bottomIcon[meta];
                case 1:
                    return topIcon[meta];
                default:
                    return sideIcon[meta];
            }
        }
        else
        {
            return icons[meta];
        }
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
    
}
