package ModSharpnet.Block;

import ModSharpnet.Blocks;
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
    private static final int painterID = ic2.api.item.Items.getItem("painter").itemID;
    private static final int blackPainterID = ic2.api.item.Items.getItem("blackPainter").itemID;
    private static final int redPainterID = ic2.api.item.Items.getItem("redPainter").itemID;
    private static final int greenPainterID = ic2.api.item.Items.getItem("greenPainter").itemID;
    private static final int brownPainterID = ic2.api.item.Items.getItem("brownPainter").itemID;
    private static final int bluePainterID = ic2.api.item.Items.getItem("bluePainter").itemID;
    private static final int purplePainterID = ic2.api.item.Items.getItem("purplePainter").itemID;
    private static final int cyanPainterID = ic2.api.item.Items.getItem("cyanPainter").itemID;
    private static final int lightGreyPainterID = ic2.api.item.Items.getItem("lightGreyPainter").itemID;
    private static final int darkGreyPainterID = ic2.api.item.Items.getItem("darkGreyPainter").itemID;
    private static final int pinkPainterID = ic2.api.item.Items.getItem("pinkPainter").itemID;
    private static final int limePainterID = ic2.api.item.Items.getItem("limePainter").itemID;
    private static final int yellowPainterID = ic2.api.item.Items.getItem("yellowPainter").itemID;
    private static final int cloudPainterID = ic2.api.item.Items.getItem("cloudPainter").itemID;
    private static final int magentaPainterID = ic2.api.item.Items.getItem("magentaPainter").itemID;
    private static final int orangePainterID = ic2.api.item.Items.getItem("orangePainter").itemID;
    private static final int whitePainterID = ic2.api.item.Items.getItem("whitePainter").itemID;
    
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
    public void onBlockClicked(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer)
    {
        if ((par5EntityPlayer.getCurrentEquippedItem()) != null)
        { itemInHandID = par5EntityPlayer.getCurrentEquippedItem().itemID; }
        
        if (itemInHandID == blackPainterID){par1World.setBlock(par2, par3 , par4, Blocks.wall_cobblestone_trowel_block.blockID, 15, 2); damageItemInHands(par5EntityPlayer,painterID);}
        if (itemInHandID == redPainterID){par1World.setBlock(par2, par3 , par4, Blocks.wall_cobblestone_trowel_block.blockID, 14, 2); damageItemInHands(par5EntityPlayer,painterID);}
        if (itemInHandID == greenPainterID){par1World.setBlock(par2, par3 , par4, Blocks.wall_cobblestone_trowel_block.blockID, 13, 2); damageItemInHands(par5EntityPlayer,painterID);}
        if (itemInHandID == brownPainterID){par1World.setBlock(par2, par3 , par4, Blocks.wall_cobblestone_trowel_block.blockID, 12, 2); damageItemInHands(par5EntityPlayer,painterID);}
        if (itemInHandID == bluePainterID){par1World.setBlock(par2, par3 , par4, Blocks.wall_cobblestone_trowel_block.blockID, 11, 2); damageItemInHands(par5EntityPlayer,painterID);}
        if (itemInHandID == purplePainterID){par1World.setBlock(par2, par3 , par4, Blocks.wall_cobblestone_trowel_block.blockID, 10, 2); damageItemInHands(par5EntityPlayer,painterID);}
        if (itemInHandID == cyanPainterID){par1World.setBlock(par2, par3 , par4, Blocks.wall_cobblestone_trowel_block.blockID, 9, 2); damageItemInHands(par5EntityPlayer,painterID);}
        if (itemInHandID == lightGreyPainterID){par1World.setBlock(par2, par3 , par4, Blocks.wall_cobblestone_trowel_block.blockID, 8, 2); damageItemInHands(par5EntityPlayer,painterID);}
        if (itemInHandID == darkGreyPainterID){par1World.setBlock(par2, par3 , par4, Blocks.wall_cobblestone_trowel_block.blockID, 7, 2); damageItemInHands(par5EntityPlayer,painterID);}
        if (itemInHandID == pinkPainterID){par1World.setBlock(par2, par3 , par4, Blocks.wall_cobblestone_trowel_block.blockID, 6, 2); damageItemInHands(par5EntityPlayer,painterID);}
        if (itemInHandID == limePainterID){par1World.setBlock(par2, par3 , par4, Blocks.wall_cobblestone_trowel_block.blockID, 5, 2); damageItemInHands(par5EntityPlayer,painterID);}
        if (itemInHandID == yellowPainterID){par1World.setBlock(par2, par3 , par4, Blocks.wall_cobblestone_trowel_block.blockID, 4, 2); damageItemInHands(par5EntityPlayer,painterID);}
        if (itemInHandID == cloudPainterID){par1World.setBlock(par2, par3 , par4, Blocks.wall_cobblestone_trowel_block.blockID, 3, 2); damageItemInHands(par5EntityPlayer,painterID);}
        if (itemInHandID == magentaPainterID){par1World.setBlock(par2, par3 , par4, Blocks.wall_cobblestone_trowel_block.blockID, 2, 2); damageItemInHands(par5EntityPlayer,painterID);}
        if (itemInHandID == orangePainterID){par1World.setBlock(par2, par3 , par4, Blocks.wall_cobblestone_trowel_block.blockID, 1, 2); damageItemInHands(par5EntityPlayer,painterID);}
        if (itemInHandID == whitePainterID){par1World.setBlock(par2, par3 , par4, Blocks.wall_cobblestone_trowel_block.blockID, 0, 2); damageItemInHands(par5EntityPlayer,painterID);}
        
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
