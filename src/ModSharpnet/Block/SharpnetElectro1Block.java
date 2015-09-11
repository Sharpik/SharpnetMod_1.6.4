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
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

public class SharpnetElectro1Block extends Block
{
    
    public static final String[] Types = new String[] {"mixer", "cofee_machine", "kettle"};
    
    @SideOnly(Side.CLIENT)
    public Icon[] iconArray;
    private int itemInHandID = 0;
    private int itemInHandMeta = 0;
    private int BlockMeta = 0;
    
    public SharpnetElectro1Block(int par1)
    {
        super(par1, Material.glass);
        this.setHardness(0.3F);
        this.setResistance(0.1F);
        this.setStepSound(Block.soundGlassFootstep);
        this.setCreativeTab(CreativeTabs.tabDecorations);
        //setBurnProperties(par1, 60, 60);
        
        float f = 0.3F;
        this.setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, f * 3.0F, 0.5F + f);
    }
    
    @Override
    public void onBlockClicked(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer)
    {
        if ((par5EntityPlayer.getCurrentEquippedItem()) != null)
        {
            itemInHandID = par5EntityPlayer.getCurrentEquippedItem().itemID;
            itemInHandMeta = par5EntityPlayer.getCurrentEquippedItem().getItemDamage();
            BlockMeta = par1World.getBlockMetadata(par2, par3, par4);
        }
        else {itemInHandID = 0; itemInHandMeta = 0;}
        
        if ( (itemInHandID == Items.tea_leaves.itemID) && (itemInHandMeta == 0) )
        {
            if(BlockMeta == 2)
            {
                spawnItem(par5EntityPlayer, par1World, par2, par3, par4, Items.tea_leaves, Items.cup_of_tea, 0, 1);
            }
        }
        if ( (itemInHandID == Items.cofee_beans.itemID) && (itemInHandMeta == 0) )
        {
            if(BlockMeta == 1)
            {
                spawnItem(par5EntityPlayer, par1World, par2, par3, par4, Items.cofee_beans, Items.cofee, 0, 1);
            }
        }
        if ( (itemInHandID == Item.dyePowder.itemID) && (itemInHandMeta == 3) )
        {
            if(BlockMeta == 1)
            {
                spawnItem(par5EntityPlayer, par1World, par2, par3, par4, Item.dyePowder, Items.hot_chocolate, 3, 1);
            }
        }
        
    }
    
    public void spawnItem(EntityPlayer par5EntityPlayer, World par1World,int x,int y,int z, Item ItemIn, Item ItemOut, int ItemInMeta , int ItemNum)
    {
        damageItemInHands(par5EntityPlayer,ItemIn.itemID, ItemInMeta);
        ItemStack Itemspawn1 = new ItemStack(ItemOut,ItemNum);
        EntityItem Ispawn1 = new EntityItem(par1World,x,y,z,Itemspawn1);
        if (!par1World.isRemote)
        {
            par1World.spawnEntityInWorld(Ispawn1);
        }
    }
    
    public void damageItemInHands(EntityPlayer par5EntityPlayer, int id, int meta)
    {
        if (id == 0){par5EntityPlayer.inventory.setInventorySlotContents(par5EntityPlayer.inventory.currentItem, (ItemStack)null);}
        else
        {
            par5EntityPlayer.inventory.decrStackSize(par5EntityPlayer.inventory.currentItem, 1);
        }
    }
    
    // make it non colidable :)
    @Override
    public AxisAlignedBB getCollisionBoundingBoxFromPool(World par1World, int par2, int par3, int par4)
    {
        return null;
    }
    
    @Override
    public boolean isOpaqueCube()
    {
        return false;
    }
    
    @Override
    public boolean renderAsNormalBlock()
    {
        return false;
    }
    
    @Override
    public int getRenderType()
    {
        return 1;
    } 
    
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
    public int getDamageValue(World par1World, int par2, int par3, int par4)
    {
        return par1World.getBlockMetadata(par2, par3, par4);
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void getSubBlocks(int par1, CreativeTabs par2CreativeTabs, List subBlocks)
    {
        for (int sub = 0; sub < Types.length; ++sub)
        {
            subBlocks.add(new ItemStack(par1, 1, sub));
        }
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void registerIcons(IconRegister par1IconRegister)
    {
        this.iconArray = new Icon[Types.length];

        for (int i = 0; i < this.iconArray.length; ++i)
        {
            this.iconArray[i] = par1IconRegister.registerIcon(modid+":electro/" + Types[i]);
        }
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public Icon getIcon(int par1,int par2)
    {
        return this.iconArray[par2];
    }
    
}
