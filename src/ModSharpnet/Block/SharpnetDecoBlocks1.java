package ModSharpnet.Block;

import ModSharpnet.Items;
import static ModSharpnet.ModSharpnet.modid;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

public class SharpnetDecoBlocks1 extends Block
{
    public int dropID = 0;
    public int dropMeta = 0;
    public int dropCount = 0;
    
    public SharpnetDecoBlocks1(int par1)
    {
        super(par1, Material.wood);
        setUnlocalizedName("Sharpnet Decoration Blocks");
        setHardness(0.3F);
        setResistance(1.0F);
        setBurnProperties(par1, 60, 60);
        setStepSound(Block.soundWoodFootstep);
        setCreativeTab(CreativeTabs.tabDecorations);
    }
    
    // TADY ZMENIT POCET VARIANT 1 - 16
    public int pocet = 8;    
    
    @Override
    public void breakBlock(World world, int x, int y, int z, int par5, int par6)
    {
        dropCount = 1;
        
        switch(par6)
        {
            case 0: dropID = Items.barrel.itemID; dropMeta = 0; break;
            case 1: dropID = Items.barrel_of_wine.itemID; dropMeta = 0; break;
            default: dropID = par5; dropMeta = par6; break;
        }
        
        if (dropID != 0)
        {
            ItemStack SpawnedItemStack = new ItemStack(dropID, dropCount, dropMeta);
            EntityItem SpawnedItemEntity = new EntityItem(world,x,y,z,SpawnedItemStack);
            world.spawnEntityInWorld(SpawnedItemEntity);
        }
    }
    
    @Override
    public float getBlockHardness(World par1World, int par2, int par3, int par4)
    {
        switch(par1World.getBlockMetadata(par2, par3, par4))
        {
            case 0: { return 1.0F; }
            case 1: { return 1.0F; }
            case 2: { return 0.5F; }
            default: { return this.blockHardness; }
        }
    }
    
    @Override
    public int idDropped (int par1, Random par2Random, int par3)
    {
          return 0;
    }
    
    @Override
    public int damageDropped (int metadata)
    {
            return 0;
    }
    
    @Override
    public int quantityDropped(Random par1Random)
    {
        return 0;
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
                case 0:
                {
                    isSided[i] = true;
                    // TOP
                    topIcon[i] = par1.registerIcon(modid+":others/barell2_top");
                    // BOTTOM
                    bottomIcon[i] = par1.registerIcon(modid+":others/barell_top");
                    // SIDES
                    sideIcon[i] = par1.registerIcon(modid+":others/barell_side");
                    break;
                }
                case 1:
                {
                    isSided[i] = true;
                    // TOP
                    topIcon[i] = par1.registerIcon(modid+":others/barell2_top");
                    // BOTTOM
                    bottomIcon[i] = par1.registerIcon(modid+":others/barell_top");
                    // SIDES
                    sideIcon[i] = par1.registerIcon(modid+":others/barell2_side");
                    break;
                }
                case 2:
                {
                    icons[i] = par1.registerIcon(modid+":others/haystack");isSided[i]=false;break;
                }
                case 3:
                {
                    isSided[i] = true;
                    // TOP
                    topIcon[i] = par1.registerIcon(modid+":money_stacks/10E_top");
                    // BOTTOM
                    bottomIcon[i] = par1.registerIcon(modid+":money_stacks/money_pallet_bottom");
                    // SIDES
                    sideIcon[i] = par1.registerIcon(modid+":money_stacks/money_pallet2");
                    break;
                }
                case 4:
                {
                    isSided[i] = true;
                    // TOP
                    topIcon[i] = par1.registerIcon(modid+":money_stacks/100E_top");
                    // BOTTOM
                    bottomIcon[i] = par1.registerIcon(modid+":money_stacks/money_pallet_bottom");
                    // SIDES
                    sideIcon[i] = par1.registerIcon(modid+":money_stacks/money_pallet2");
                    break;
                }
                case 5:
                {
                    isSided[i] = true;
                    // TOP
                    topIcon[i] = par1.registerIcon(modid+":money_stacks/1000E_top");
                    // BOTTOM
                    bottomIcon[i] = par1.registerIcon(modid+":money_stacks/money_pallet_bottom");
                    // SIDES
                    sideIcon[i] = par1.registerIcon(modid+":money_stacks/money_pallet2");
                    break;
                }
                case 6:
                {
                    isSided[i] = true;
                    // TOP
                    topIcon[i] = par1.registerIcon(modid+":others/roulette_top");
                    // BOTTOM
                    bottomIcon[i] = par1.registerIcon(modid+":others/roulette_side");
                    // SIDES
                    sideIcon[i] = par1.registerIcon(modid+":others/roulette_side");
                    break;
                }
                case 7:{icons[i] = par1.registerIcon(modid+":others/roulette_sid2");isSided[i]=false;break;}
                case 8:{icons[i] = par1.registerIcon(modid+":others/roulette_side");isSided[i]=false;break;}
                /*
                case 9:{icons[i] = par1.registerIcon(modid+":walls_trowel/blockWall.cyan");isSided[i]=false;break;}
                case 10:{icons[i] = par1.registerIcon(modid+":walls_trowel/blockWall.purple");isSided[i]=false;break;}
                case 11:{icons[i] = par1.registerIcon(modid+":walls_trowel/blockWall.blue");isSided[i]=false;break;}
                case 12:{icons[i] = par1.registerIcon(modid+":walls_trowel/blockWall.brown");isSided[i]=false;break;}
                case 13:{icons[i] = par1.registerIcon(modid+":walls_trowel/blockWall.green");isSided[i]=false;break;}
                case 14:{icons[i] = par1.registerIcon(modid+":walls_trowel/blockWall.red");isSided[i]=false;break;}
                case 15:{icons[i] = par1.registerIcon(modid+":walls_trowel/blockWall.black");isSided[i]=false;break;}
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
