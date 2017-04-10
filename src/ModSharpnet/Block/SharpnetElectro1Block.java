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
                // Black
                if(itemInHandID == Item.coal.itemID)
                {
                    spawnItem(par5EntityPlayer, par1World, par2, par3, par4, new ItemStack(Item.dyePowder,1,0));
                    damageItemInHands(par5EntityPlayer);
                }
                if(ModProjectRed)
                {
                    // Basalt to Black
                    if( (itemInHandID == Blocks.PR_block_stonesID) && ((itemInHandMeta == 1) || (itemInHandMeta == 3)) )
                    {
                        spawnItem(par5EntityPlayer, par1World, par2, par3, par4, new ItemStack(Item.dyePowder,1,0));
                        damageItemInHands(par5EntityPlayer);
                    }
                }
                
                // Red
                if(itemInHandID == Item.redstone.itemID)
                {
                    spawnItem(par5EntityPlayer, par1World, par2, par3, par4, new ItemStack(Item.dyePowder,1,1));
                    damageItemInHands(par5EntityPlayer);
                }
                
                // Brown
                if(itemInHandID == Block.wood.blockID)
                {
                    spawnItem(par5EntityPlayer, par1World, par2, par3, par4, new ItemStack(Item.dyePowder,1,3));
                    damageItemInHands(par5EntityPlayer);
                }
                
                // Blue from Fuschia Flower
                if( (itemInHandID == SharpnetFlowerBlocks1ID) && (itemInHandMeta == 2) )
                {
                    spawnItem(par5EntityPlayer, par1World, par2, par3, par4, new ItemStack(Item.dyePowder,1,4));
                    damageItemInHands(par5EntityPlayer);
                }
                
                // Yellow
                if(itemInHandID == Block.sand.blockID)
                {
                    spawnItem(par5EntityPlayer, par1World, par2, par3, par4, new ItemStack(Item.dyePowder,1,11));
                    damageItemInHands(par5EntityPlayer);
                }
                
                // Gray
                if(itemInHandID == Block.gravel.blockID)
                {
                    spawnItem(par5EntityPlayer, par1World, par2, par3, par4, new ItemStack(Item.dyePowder,1,8));
                    damageItemInHands(par5EntityPlayer);
                }
                
                // Lime
                if(itemInHandID == Block.reed.blockID)
                {
                    spawnItem(par5EntityPlayer, par1World, par2, par3, par4, new ItemStack(Item.dyePowder,1,10));
                    damageItemInHands(par5EntityPlayer);
                }
                
                // Green
                if( (itemInHandID == Block.grass.blockID) || (itemInHandID == Block.leaves.blockID) )
                {
                    spawnItem(par5EntityPlayer, par1World, par2, par3, par4, new ItemStack(Item.dyePowder,1,2));
                    damageItemInHands(par5EntityPlayer);
                }
                
                // Wool
                if(itemInHandID == Block.cloth.blockID)
                {
                    if(itemInHandMeta == 0)
                    {
                        spawnItem(par5EntityPlayer, par1World, par2, par3, par4, new ItemStack(Item.dyePowder,1,15));
                        damageItemInHands(par5EntityPlayer);
                    }
                    if(itemInHandMeta == 1)
                    {
                        spawnItem(par5EntityPlayer, par1World, par2, par3, par4, new ItemStack(Item.dyePowder,1,14));
                        spawnItem(par5EntityPlayer, par1World, par2, par3, par4, new ItemStack(Block.cloth,1,0));
                        damageItemInHands(par5EntityPlayer);
                    }
                    if(itemInHandMeta == 2)
                    {
                        spawnItem(par5EntityPlayer, par1World, par2, par3, par4, new ItemStack(Item.dyePowder,1,13));
                        spawnItem(par5EntityPlayer, par1World, par2, par3, par4, new ItemStack(Block.cloth,1,0));
                        damageItemInHands(par5EntityPlayer);
                    }
                    if(itemInHandMeta == 3)
                    {
                        spawnItem(par5EntityPlayer, par1World, par2, par3, par4, new ItemStack(Item.dyePowder,1,12));
                        spawnItem(par5EntityPlayer, par1World, par2, par3, par4, new ItemStack(Block.cloth,1,0));
                        damageItemInHands(par5EntityPlayer);
                    }
                    if(itemInHandMeta == 4)
                    {
                        spawnItem(par5EntityPlayer, par1World, par2, par3, par4, new ItemStack(Item.dyePowder,1,11));
                        spawnItem(par5EntityPlayer, par1World, par2, par3, par4, new ItemStack(Block.cloth,1,0));
                        damageItemInHands(par5EntityPlayer);
                    }
                    if(itemInHandMeta == 5)
                    {
                        spawnItem(par5EntityPlayer, par1World, par2, par3, par4, new ItemStack(Item.dyePowder,1,10));
                        spawnItem(par5EntityPlayer, par1World, par2, par3, par4, new ItemStack(Block.cloth,1,0));
                        damageItemInHands(par5EntityPlayer);
                    }
                    if(itemInHandMeta == 6)
                    {
                        spawnItem(par5EntityPlayer, par1World, par2, par3, par4, new ItemStack(Item.dyePowder,1,9));
                        spawnItem(par5EntityPlayer, par1World, par2, par3, par4, new ItemStack(Block.cloth,1,0));
                        damageItemInHands(par5EntityPlayer);
                    }
                    if(itemInHandMeta == 7)
                    {
                        spawnItem(par5EntityPlayer, par1World, par2, par3, par4, new ItemStack(Item.dyePowder,1,8));
                        spawnItem(par5EntityPlayer, par1World, par2, par3, par4, new ItemStack(Block.cloth,1,0));
                        damageItemInHands(par5EntityPlayer);
                    }
                    if(itemInHandMeta == 8)
                    {
                        spawnItem(par5EntityPlayer, par1World, par2, par3, par4, new ItemStack(Item.dyePowder,1,7));
                        spawnItem(par5EntityPlayer, par1World, par2, par3, par4, new ItemStack(Block.cloth,1,0));
                        damageItemInHands(par5EntityPlayer);
                    }
                    if(itemInHandMeta == 9)
                    {
                        spawnItem(par5EntityPlayer, par1World, par2, par3, par4, new ItemStack(Item.dyePowder,1,6));
                        spawnItem(par5EntityPlayer, par1World, par2, par3, par4, new ItemStack(Block.cloth,1,0));
                        damageItemInHands(par5EntityPlayer);
                    }
                    if(itemInHandMeta == 10)
                    {
                        spawnItem(par5EntityPlayer, par1World, par2, par3, par4, new ItemStack(Item.dyePowder,1,5));
                        spawnItem(par5EntityPlayer, par1World, par2, par3, par4, new ItemStack(Block.cloth,1,0));
                        damageItemInHands(par5EntityPlayer);
                    }
                    if(itemInHandMeta == 11)
                    {
                        spawnItem(par5EntityPlayer, par1World, par2, par3, par4, new ItemStack(Item.dyePowder,1,4));
                        spawnItem(par5EntityPlayer, par1World, par2, par3, par4, new ItemStack(Block.cloth,1,0));
                        damageItemInHands(par5EntityPlayer);
                    }
                    if(itemInHandMeta == 12)
                    {
                        spawnItem(par5EntityPlayer, par1World, par2, par3, par4, new ItemStack(Item.dyePowder,1,3));
                        spawnItem(par5EntityPlayer, par1World, par2, par3, par4, new ItemStack(Block.cloth,1,0));
                        damageItemInHands(par5EntityPlayer);
                    }
                    if(itemInHandMeta == 13)
                    {
                        spawnItem(par5EntityPlayer, par1World, par2, par3, par4, new ItemStack(Item.dyePowder,1,2));
                        spawnItem(par5EntityPlayer, par1World, par2, par3, par4, new ItemStack(Block.cloth,1,0));
                        damageItemInHands(par5EntityPlayer);
                    }
                    if(itemInHandMeta == 14)
                    {
                        spawnItem(par5EntityPlayer, par1World, par2, par3, par4, new ItemStack(Item.dyePowder,1,1));
                        spawnItem(par5EntityPlayer, par1World, par2, par3, par4, new ItemStack(Block.cloth,1,0));
                        damageItemInHands(par5EntityPlayer);
                    }
                    if(itemInHandMeta == 15)
                    {
                        spawnItem(par5EntityPlayer, par1World, par2, par3, par4, new ItemStack(Item.dyePowder,1,0));
                        spawnItem(par5EntityPlayer, par1World, par2, par3, par4, new ItemStack(Block.cloth,1,0));
                        damageItemInHands(par5EntityPlayer);
                    }
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
