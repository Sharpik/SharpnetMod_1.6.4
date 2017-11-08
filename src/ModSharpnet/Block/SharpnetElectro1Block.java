package ModSharpnet.Block;

import ModSharpnet.Blocks;
import ModSharpnet.Items;
import static ModSharpnet.ModSharpnet.ModProjectRed;
import static ModSharpnet.ModSharpnet.SharpnetFlowerBlocks1ID;
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
    
    public static final String[] Types = new String[] {"mixer", "cofee_machine", "kettle", "color_extractor"};
    
    @SideOnly(Side.CLIENT)
    public Icon[] iconArray;
    private int itemInHandID = 0;
    private int itemInHandMeta = 0;
    private int BlockMeta = 0;
    private int ex_color = -1;
    private int ex_color_count = 1;
    private boolean ex_cloth = false;
    
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
        else {itemInHandID = 0; itemInHandMeta = 0; BlockMeta = par1World.getBlockMetadata(par2, par3, par4);}
        
        if(itemInHandID != 0)
        {
            //cofee_machine
            if(BlockMeta == 1)
            {
                if(itemInHandID == Items.cofee_beans.itemID)
                {
                    spawnItem(par5EntityPlayer, par1World, par2, par3, par4, new ItemStack(Items.cofee,1));
                    damageItemInHands(par5EntityPlayer);
                }
                
                if( (itemInHandID == Item.dyePowder.itemID) && (itemInHandMeta == 3) )
                {
                    spawnItem(par5EntityPlayer, par1World, par2, par3, par4, new ItemStack(Items.hot_chocolate,1));
                    damageItemInHands(par5EntityPlayer);
                }
            }
            
            //kettle
            if(BlockMeta == 2)
            {
                if(itemInHandID == Items.tea_leaves.itemID)
                {
                    spawnItem(par5EntityPlayer, par1World, par2, par3, par4, new ItemStack(Items.cup_of_tea,1));
                    damageItemInHands(par5EntityPlayer);
                }
            }
            
            //color_extractor
            if(BlockMeta == 3)
            {
                ex_color = -1;
                ex_color_count = 1;
                ex_cloth = false;
                
                // Black
                if(itemInHandID == Item.coal.itemID)
                {
                    ex_color = 15;
                    ex_color_count = 3;
                }
                if(ModProjectRed)
                {
                    // Basalt to Black
                    if( (itemInHandID == Blocks.PR_block_stonesID) && ((itemInHandMeta == 2) || (itemInHandMeta == 3)) )
                    {
                        ex_color = 15;
                        ex_color_count = 3;
                    }
                }
                
                // Red
                if( (itemInHandID == Item.redstone.itemID) || (itemInHandID == Block.plantRed.blockID) )
                {
                    ex_color = 14;
                }
                
                // Brown
                if(itemInHandID == Block.wood.blockID)
                {
                    ex_color = 12;
                }
                
                // Blue from Fuschia Flower
                if( (itemInHandID == SharpnetFlowerBlocks1ID) && (itemInHandMeta == 2) )
                {
                    ex_color = 11;
                }
                
                // Yellow
                if(itemInHandID == Block.plantYellow.blockID)
                {
                    ex_color = 4;
                    ex_color_count = 2;
                }
                if(itemInHandID == Block.sand.blockID)
                {
                    ex_color = 4;
                }
                
                // Gray
                if(itemInHandID == Block.gravel.blockID)
                {
                    ex_color = 7;
                    ex_color_count = 2;
                }
                
                // Lime
                if(itemInHandID == Block.reed.blockID)
                {
                    ex_color = 5;
                }
                
                // Green
                if( (itemInHandID == Block.grass.blockID) || (itemInHandID == Block.leaves.blockID) )
                {
                    ex_color = 13;
                }
                
                // Wool
                if(itemInHandID == Block.cloth.blockID)
                {
                    ex_color = itemInHandMeta;
                    ex_cloth = true;
                }
                
                //Color spawner
                switch(ex_color)
                {
                    case 0:
                        //White
                        spawnItem(par5EntityPlayer, par1World, par2, par3, par4, new ItemStack(Item.dyePowder,ex_color_count,15));
                        damageItemInHands(par5EntityPlayer);
                        break;
                    case 1:
                        //Orange
                        spawnItem(par5EntityPlayer, par1World, par2, par3, par4, new ItemStack(Item.dyePowder,ex_color_count,14));
                        damageItemInHands(par5EntityPlayer);
                        break;
                    case 2:
                        //Magenta
                        spawnItem(par5EntityPlayer, par1World, par2, par3, par4, new ItemStack(Item.dyePowder,ex_color_count,13));
                        damageItemInHands(par5EntityPlayer);
                        break;
                    case 3:
                        //Light blue
                        spawnItem(par5EntityPlayer, par1World, par2, par3, par4, new ItemStack(Item.dyePowder,ex_color_count,12));
                        damageItemInHands(par5EntityPlayer);
                        break;
                    case 4:
                        //Yellow
                        spawnItem(par5EntityPlayer, par1World, par2, par3, par4, new ItemStack(Item.dyePowder,ex_color_count,11));
                        damageItemInHands(par5EntityPlayer);
                        break;
                    case 5:
                        //Lime
                        spawnItem(par5EntityPlayer, par1World, par2, par3, par4, new ItemStack(Item.dyePowder,ex_color_count,10));
                        damageItemInHands(par5EntityPlayer);
                        break;
                    case 6:
                        //Pink
                        spawnItem(par5EntityPlayer, par1World, par2, par3, par4, new ItemStack(Item.dyePowder,ex_color_count,9));
                        damageItemInHands(par5EntityPlayer);
                        break;
                    case 7:
                        //Gray
                        spawnItem(par5EntityPlayer, par1World, par2, par3, par4, new ItemStack(Item.dyePowder,ex_color_count,8));
                        damageItemInHands(par5EntityPlayer);
                        break;
                    case 8:
                        //Light gray
                        spawnItem(par5EntityPlayer, par1World, par2, par3, par4, new ItemStack(Item.dyePowder,ex_color_count,7));
                        damageItemInHands(par5EntityPlayer);
                        break;
                    case 9:
                        //Cyan
                        spawnItem(par5EntityPlayer, par1World, par2, par3, par4, new ItemStack(Item.dyePowder,ex_color_count,6));
                        damageItemInHands(par5EntityPlayer);
                        break;
                    case 10:
                        //Purple
                        spawnItem(par5EntityPlayer, par1World, par2, par3, par4, new ItemStack(Item.dyePowder,ex_color_count,5));
                        damageItemInHands(par5EntityPlayer);
                        break;
                    case 11:
                        //Blue
                        spawnItem(par5EntityPlayer, par1World, par2, par3, par4, new ItemStack(Item.dyePowder,ex_color_count,4));
                        damageItemInHands(par5EntityPlayer);
                        break;
                    case 12:
                        //Brown
                        spawnItem(par5EntityPlayer, par1World, par2, par3, par4, new ItemStack(Item.dyePowder,ex_color_count,3));
                        damageItemInHands(par5EntityPlayer);
                        break;
                    case 13:
                        //Green
                        spawnItem(par5EntityPlayer, par1World, par2, par3, par4, new ItemStack(Item.dyePowder,ex_color_count,2));
                        damageItemInHands(par5EntityPlayer);
                        break;
                    case 14:
                        //Red
                        spawnItem(par5EntityPlayer, par1World, par2, par3, par4, new ItemStack(Item.dyePowder,ex_color_count,1));
                        damageItemInHands(par5EntityPlayer);
                        break;
                    case 15:
                        //Black
                        spawnItem(par5EntityPlayer, par1World, par2, par3, par4, new ItemStack(Item.dyePowder,ex_color_count,0));
                        damageItemInHands(par5EntityPlayer);
                        break;
                }
                
                if(ex_cloth)
                {
                    spawnItem(par5EntityPlayer, par1World, par2, par3, par4, new ItemStack(Block.cloth,1,0));
                }
            }
            
        }
        
        
    }
    
    public void spawnItem(EntityPlayer par5EntityPlayer, World par1World,int x,int y,int z, ItemStack Item)
    {
        EntityItem Ispawn1 = new EntityItem(par1World,x,y,z,Item);
        if (!par1World.isRemote)
        {
            par1World.spawnEntityInWorld(Ispawn1);
        }
    }
    
    public void damageItemInHands(EntityPlayer par5EntityPlayer)
    {
        itemInHandID = par5EntityPlayer.getCurrentEquippedItem().itemID;
        itemInHandMeta = par5EntityPlayer.getCurrentEquippedItem().getItemDamage();
        
        //if (ItemS.itemID == 0){par5EntityPlayer.inventory.setInventorySlotContents(par5EntityPlayer.inventory.currentItem, (ItemStack)null);}
        if(itemInHandID != 0)
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
