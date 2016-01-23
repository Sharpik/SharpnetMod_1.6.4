package ModSharpnet.Block;

import static ModSharpnet.ModSharpnet.modid;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockWall;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;

public class SharpnetCobblestoneWalls1 extends BlockWall
{
    
    public SharpnetCobblestoneWalls1(int par1, Block ExtendedBlock)
    {
        super(par1, ExtendedBlock);
        this.setHardness(ExtendedBlock.blockHardness);
        this.setResistance(ExtendedBlock.blockResistance / 3.0F);
        this.setStepSound(ExtendedBlock.stepSound);
        this.setCreativeTab(CreativeTabs.tabBlock);
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
                case 0:{icons[i] = par1.registerIcon(modid+":cobblestone/cobblestone1");isSided[i]=false;break;}
                case 1:{icons[i] = par1.registerIcon(modid+":cobblestone/cobblestone2");isSided[i]=false;break;}
                case 2:{icons[i] = par1.registerIcon(modid+":cobblestone/cobblestone3");isSided[i]=false;break;}
                case 3:{icons[i] = par1.registerIcon(modid+":cobblestone/cobblestone4");isSided[i]=false;break;}
                /*
                case 4:{icons[i] = par1.registerIcon(modid+":cobblestone/cubes1");isSided[i]=false;break;}
                case 5:{icons[i] = par1.registerIcon(modid+":cobblestone/cubes2");isSided[i]=false;break;}
                case 6:{icons[i] = par1.registerIcon(modid+":cobblestone/cubes3");isSided[i]=false;break;}
                case 7:{icons[i] = par1.registerIcon(modid+":cobblestone/cubes4");isSided[i]=false;break;}
                case 8:{icons[i] = par1.registerIcon(modid+":cobblestone/cubes5");isSided[i]=false;break;}
                case 9:{icons[i] = par1.registerIcon(modid+":cobblestone/cubes6");isSided[i]=false;break;}
                case 10:{icons[i] = par1.registerIcon(modid+":cobblestone/cubes7");isSided[i]=false;break;}
                case 11:{icons[i] = par1.registerIcon(modid+":cobblestone/blockWall.blue");isSided[i]=false;break;}
                case 12:{icons[i] = par1.registerIcon(modid+":cobblestone/blockWall.brown");isSided[i]=false;break;}
                case 13:{icons[i] = par1.registerIcon(modid+":cobblestone/blockWall.green");isSided[i]=false;break;}
                case 14:{icons[i] = par1.registerIcon(modid+":cobblestone/blockWall.red");isSided[i]=false;break;}
                case 15:{icons[i] = par1.registerIcon(modid+":cobblestone/blockWall.black");isSided[i]=false;break;}
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
