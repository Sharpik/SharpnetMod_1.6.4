package ModSharpnet.Block;

import ModSharpnet.Blocks;
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
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

public class SharpnetWallTrowelCobblestoneBlock extends Block
{
    
    private static int itemInHandID = 0;
    private static int blockMeta = 0;
    
    public SharpnetWallTrowelCobblestoneBlock(int par1,String par2Material)
    {
        super(par1, Material.rock);
        setUnlocalizedName("Sharpnet Trowel Wall Cobblestone");
        setHardness(2.0F).setStepSound(Block.soundStoneFootstep);
        setResistance(10.0F);
        setCreativeTab(CreativeTabs.tabBlock);
    }
    
    // TADY ZMENIT POCET VARIANT 1 - 16
    public int pocet = 16;
    
    @Override
    public int idDropped (int par1, Random par2Random, int par3)
    {
          //return this.blockID;
        return 4;
    }
    
    @Override
    public int damageDropped (int metadata)
    {
            //return metadata;
        return 0;
    }
    
    @Override
    public int quantityDropped(Random par1Random)
    {
        return 1;
    }
    
    @Override
    public boolean onBlockActivated(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9)
    {
        if ((par5EntityPlayer.getCurrentEquippedItem()) != null)
        {
            itemInHandID = par5EntityPlayer.getCurrentEquippedItem().itemID;
            blockMeta = par1World.getBlockMetadata(par2, par3, par4);

            if ( (itemInHandID == Items.IC2_blackPainterID) && ( blockMeta != 15 ) ){par1World.setBlock(par2, par3 , par4, Blocks.wall_cobblestone_trowel_block.blockID, 15, 2); damageItemInHands(par5EntityPlayer,Items.IC2_painterID); return true;}
            if ( (itemInHandID == Items.IC2_redPainterID) && ( blockMeta != 14 )){par1World.setBlock(par2, par3 , par4, Blocks.wall_cobblestone_trowel_block.blockID, 14, 2); damageItemInHands(par5EntityPlayer,Items.IC2_painterID); return true;}
            if ( (itemInHandID == Items.IC2_greenPainterID) && ( blockMeta != 13 )){par1World.setBlock(par2, par3 , par4, Blocks.wall_cobblestone_trowel_block.blockID, 13, 2); damageItemInHands(par5EntityPlayer,Items.IC2_painterID); return true;}
            if ( (itemInHandID == Items.IC2_brownPainterID) && ( blockMeta != 12 )){par1World.setBlock(par2, par3 , par4, Blocks.wall_cobblestone_trowel_block.blockID, 12, 2); damageItemInHands(par5EntityPlayer,Items.IC2_painterID); return true;}
            if ( (itemInHandID == Items.IC2_bluePainterID) && ( blockMeta != 11 )){par1World.setBlock(par2, par3 , par4, Blocks.wall_cobblestone_trowel_block.blockID, 11, 2); damageItemInHands(par5EntityPlayer,Items.IC2_painterID); return true;}
            if ( (itemInHandID == Items.IC2_purplePainterID) && ( blockMeta != 10 )){par1World.setBlock(par2, par3 , par4, Blocks.wall_cobblestone_trowel_block.blockID, 10, 2); damageItemInHands(par5EntityPlayer,Items.IC2_painterID); return true;}
            if ( (itemInHandID == Items.IC2_cyanPainterID) && ( blockMeta != 9 )){par1World.setBlock(par2, par3 , par4, Blocks.wall_cobblestone_trowel_block.blockID, 9, 2); damageItemInHands(par5EntityPlayer,Items.IC2_painterID); return true;}
            if ( (itemInHandID == Items.IC2_lightGreyPainterID) && ( blockMeta != 8 )){par1World.setBlock(par2, par3 , par4, Blocks.wall_cobblestone_trowel_block.blockID, 8, 2); damageItemInHands(par5EntityPlayer,Items.IC2_painterID); return true;}
            if ( (itemInHandID == Items.IC2_darkGreyPainterID) && ( blockMeta != 7 )){par1World.setBlock(par2, par3 , par4, Blocks.wall_cobblestone_trowel_block.blockID, 7, 2); damageItemInHands(par5EntityPlayer,Items.IC2_painterID); return true;}
            if ( (itemInHandID == Items.IC2_pinkPainterID) && ( blockMeta != 6 )){par1World.setBlock(par2, par3 , par4, Blocks.wall_cobblestone_trowel_block.blockID, 6, 2); damageItemInHands(par5EntityPlayer,Items.IC2_painterID); return true;}
            if ( (itemInHandID == Items.IC2_limePainterID) && ( blockMeta != 5 )){par1World.setBlock(par2, par3 , par4, Blocks.wall_cobblestone_trowel_block.blockID, 5, 2); damageItemInHands(par5EntityPlayer,Items.IC2_painterID); return true;}
            if ( (itemInHandID == Items.IC2_yellowPainterID) && ( blockMeta != 4 )){par1World.setBlock(par2, par3 , par4, Blocks.wall_cobblestone_trowel_block.blockID, 4, 2); damageItemInHands(par5EntityPlayer,Items.IC2_painterID); return true;}
            if ( (itemInHandID == Items.IC2_cloudPainterID) && ( blockMeta != 3 )){par1World.setBlock(par2, par3 , par4, Blocks.wall_cobblestone_trowel_block.blockID, 3, 2); damageItemInHands(par5EntityPlayer,Items.IC2_painterID); return true;}
            if ( (itemInHandID == Items.IC2_magentaPainterID) && ( blockMeta != 2 )){par1World.setBlock(par2, par3 , par4, Blocks.wall_cobblestone_trowel_block.blockID, 2, 2); damageItemInHands(par5EntityPlayer,Items.IC2_painterID); return true;}
            if ( (itemInHandID == Items.IC2_orangePainterID) && ( blockMeta != 1 )){par1World.setBlock(par2, par3 , par4, Blocks.wall_cobblestone_trowel_block.blockID, 1, 2); damageItemInHands(par5EntityPlayer,Items.IC2_painterID); return true;}
            if ( (itemInHandID == Items.IC2_whitePainterID) && ( blockMeta != 0 )){par1World.setBlock(par2, par3 , par4, Blocks.wall_cobblestone_trowel_block.blockID, 0, 2); damageItemInHands(par5EntityPlayer,Items.IC2_painterID); return true;}
            
        }
        return false;
    }
    
    public void damageItemInHands(EntityPlayer par5EntityPlayer, int id)
    {
        if ( par5EntityPlayer.inventory.getCurrentItem().getItemDamage() < (par5EntityPlayer.inventory.getCurrentItem().getMaxDamage()) )
        {
            par5EntityPlayer.inventory.getCurrentItem().damageItem(1, par5EntityPlayer);
        }
        else
        {
            if (id == 0){par5EntityPlayer.inventory.setInventorySlotContents(par5EntityPlayer.inventory.currentItem, (ItemStack)null);}
            else {par5EntityPlayer.inventory.setInventorySlotContents(par5EntityPlayer.inventory.currentItem, new ItemStack(id,1,0));}
        }
        return;
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
                case 0:{icons[i] = par1.registerIcon(modid+":walls_trowel/blockWall.white");isSided[i]=false;break;}
                case 1:{icons[i] = par1.registerIcon(modid+":walls_trowel/blockWall.orange");isSided[i]=false;break;}
                case 2:{icons[i] = par1.registerIcon(modid+":walls_trowel/blockWall.magenta");isSided[i]=false;break;}
                case 3:{icons[i] = par1.registerIcon(modid+":walls_trowel/blockWall.lightBlue");isSided[i]=false;break;}
                case 4:{icons[i] = par1.registerIcon(modid+":walls_trowel/blockWall.yellow");isSided[i]=false;break;}
                case 5:{icons[i] = par1.registerIcon(modid+":walls_trowel/blockWall.lime");isSided[i]=false;break;}
                case 6:{icons[i] = par1.registerIcon(modid+":walls_trowel/blockWall.pink");isSided[i]=false;break;}
                case 7:{icons[i] = par1.registerIcon(modid+":walls_trowel/blockWall.gray");isSided[i]=false;break;}
                case 8:{icons[i] = par1.registerIcon(modid+":walls_trowel/blockWall.lightGray");isSided[i]=false;break;}
                case 9:{icons[i] = par1.registerIcon(modid+":walls_trowel/blockWall.cyan");isSided[i]=false;break;}
                case 10:{icons[i] = par1.registerIcon(modid+":walls_trowel/blockWall.purple");isSided[i]=false;break;}
                case 11:{icons[i] = par1.registerIcon(modid+":walls_trowel/blockWall.blue");isSided[i]=false;break;}
                case 12:{icons[i] = par1.registerIcon(modid+":walls_trowel/blockWall.brown");isSided[i]=false;break;}
                case 13:{icons[i] = par1.registerIcon(modid+":walls_trowel/blockWall.green");isSided[i]=false;break;}
                case 14:{icons[i] = par1.registerIcon(modid+":walls_trowel/blockWall.red");isSided[i]=false;break;}
                case 15:{icons[i] = par1.registerIcon(modid+":walls_trowel/blockWall.black");isSided[i]=false;break;}
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
