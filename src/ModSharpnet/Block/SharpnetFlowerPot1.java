package ModSharpnet.Block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import static ModSharpnet.ModSharpnet.SharpnetFlowerBlocks1;
import net.minecraft.creativetab.CreativeTabs;

public class SharpnetFlowerPot1 extends Block
{
    public SharpnetFlowerPot1(int par1)
    {
        super(par1, Material.circuits);
        this.setBlockBoundsForItemRender();
        this.setHardness(0.0F);
        this.setStepSound(soundPowderFootstep);
        this.setCreativeTab(CreativeTabs.tabDecorations);
        this.setTextureName("minecraft:flower_pot");
    }

    /**
     * Sets the block's bounds for rendering it as an item
     */
    @Override
    public void setBlockBoundsForItemRender()
    {
        float f = 0.375F;
        float f1 = f / 2.0F;
        this.setBlockBounds(0.5F - f1, 0.0F, 0.5F - f1, 0.5F + f1, f, 0.5F + f1);
    }

    /**
     * Is this block (a) opaque and (b) a full 1m cube?  This determines whether or not to render the shared face of two
     * adjacent blocks and also whether the player can attach torches, redstone wire, etc to this block.
     */
    @Override
    public boolean isOpaqueCube()
    {
        return false;
    }

    /**
     * The type of render function that is called for this block
     */
    @Override
    public int getRenderType()
    {
        return 33;
    }

    /**
     * If this block doesn't render as an ordinary block it will return False (examples: signs, buttons, stairs, etc)
     */
    @Override
    public boolean renderAsNormalBlock()
    {
        return false;
    }

    /**
     * Called upon block activation (right click on the block.)
     */
    @Override
    public boolean onBlockActivated(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9)
    {
        ItemStack itemstack = par5EntityPlayer.inventory.getCurrentItem();

        if (itemstack == null)
        {
            return false;
        }
        else if (par1World.getBlockMetadata(par2, par3, par4) != 0)
        {
            return false;
        }
        else
        {
            int i1 = getMetaForPlant(itemstack);

            if (i1 > 0)
            {
                par1World.setBlockMetadataWithNotify(par2, par3, par4, i1, 2);

                if (!par5EntityPlayer.capabilities.isCreativeMode && --itemstack.stackSize <= 0)
                {
                    par5EntityPlayer.inventory.setInventorySlotContents(par5EntityPlayer.inventory.currentItem, (ItemStack)null);
                }

                return true;
            }
            else
            {
                return false;
            }
        }
    }

    @SideOnly(Side.CLIENT)

    /**
     * only called by clickMiddleMouseButton , and passed to inventory.setCurrentItem (along with isCreative)
     */
    @Override
    public int idPicked(World par1World, int par2, int par3, int par4)
    {
        ItemStack itemstack = getPlantForMeta(par1World.getBlockMetadata(par2, par3, par4));
        return itemstack == null ? Item.flowerPot.itemID : itemstack.itemID;
    }

    /**
     * Get the block's damage value (for use with pick block).
     */
    @Override
    public int getDamageValue(World par1World, int par2, int par3, int par4)
    {
        ItemStack itemstack = getPlantForMeta(par1World.getBlockMetadata(par2, par3, par4));
        return itemstack == null ? Item.flowerPot.itemID : itemstack.getItemDamage();
    }

    @SideOnly(Side.CLIENT)

    /**
     * Returns true only if block is flowerPot
     */
    @Override
    public boolean isFlowerPot()
    {
        return true;
    }

    /**
     * Checks to see if its valid to put this block at the specified coordinates. Args: world, x, y, z
     */
    @Override
    public boolean canPlaceBlockAt(World par1World, int par2, int par3, int par4)
    {
        return super.canPlaceBlockAt(par1World, par2, par3, par4) && par1World.doesBlockHaveSolidTopSurface(par2, par3 - 1, par4);
    }

    /**
     * Lets the block know when one of its neighbor changes. Doesn't know which neighbor changed (coordinates passed are
     * their own) Args: x, y, z, neighbor blockID
     */
    @Override
    public void onNeighborBlockChange(World par1World, int par2, int par3, int par4, int par5)
    {
        if (!par1World.doesBlockHaveSolidTopSurface(par2, par3 - 1, par4))
        {
            this.dropBlockAsItem(par1World, par2, par3, par4, par1World.getBlockMetadata(par2, par3, par4), 0);
            par1World.setBlockToAir(par2, par3, par4);
        }
    }

    /**
     * Drops the block items with a specified chance of dropping the specified items
     */
    @Override
    public void dropBlockAsItemWithChance(World par1World, int par2, int par3, int par4, int par5, float par6, int par7)
    {
        /*
        super.dropBlockAsItemWithChance(par1World, par2, par3, par4, par5, par6, par7);
        if (par5 > 0)
        {
            ItemStack itemstack = getPlantForMeta(par5);

            if (itemstack != null)
            {
                this.dropBlockAsItem_do(par1World, par2, par3, par4, itemstack);
            }
        }
        */
        ItemStack itemstack = getPlantForMeta(par5);
        if (itemstack != null)
        {
            this.dropBlockAsItem_do(par1World, par2, par3, par4, itemstack);
        }
    }

    /**
     * Returns the ID of the items to drop on destruction.
     */
    @Override
    public int idDropped(int par1, Random par2Random, int par3)
    {
        return Item.flowerPot.itemID;
    }

    /**
     * Return the item associated with the specified flower pot metadata value.
     */
    public static ItemStack getPlantForMeta(int par0)
    {
        switch (par0)
        {
            case 1:
                return new ItemStack(SharpnetFlowerBlocks1, 1, 0);
            case 2:
                return new ItemStack(SharpnetFlowerBlocks1, 1, 1);
            case 3:
                return new ItemStack(SharpnetFlowerBlocks1, 1, 2);
            case 4:
                return new ItemStack(SharpnetFlowerBlocks1, 1, 3);
            case 5:
                return new ItemStack(SharpnetFlowerBlocks1, 1, 4);
            case 6:
                return new ItemStack(SharpnetFlowerBlocks1, 1, 5);
            case 7:
                return new ItemStack(SharpnetFlowerBlocks1, 1, 6);
            case 8:
                return new ItemStack(SharpnetFlowerBlocks1, 1, 7);
            case 9:
                return new ItemStack(SharpnetFlowerBlocks1, 1, 8);
            case 10:
                return new ItemStack(SharpnetFlowerBlocks1, 1, 9);
            case 11:
                return new ItemStack(SharpnetFlowerBlocks1, 1, 10);
            case 12:
                return new ItemStack(SharpnetFlowerBlocks1, 1, 11);
            case 13:
                return new ItemStack(SharpnetFlowerBlocks1, 1, 12);
            case 14:
                return new ItemStack(SharpnetFlowerBlocks1, 1, 13);
            case 15:
                return new ItemStack(SharpnetFlowerBlocks1, 1, 14);
            default:
                return null;
        }
    }

    /**
     * Return the flower pot metadata value associated with the specified item.
     */
    public static int getMetaForPlant(ItemStack par0ItemStack)
    {
        // Set return value 1 - 15 for each plant
        int i = par0ItemStack.getItem().itemID;

        if (i == SharpnetFlowerBlocks1.blockID)
        {
            switch (par0ItemStack.getItemDamage())
            {
                case 0:
                    return 1;
                case 1:
                    return 2;
                case 2:
                    return 3;
                case 3:
                    return 4;
                case 4:
                    return 5;
                case 5:
                    return 6;
                case 6:
                    return 7;
                case 7:
                    return 8;
                case 8:
                    return 9;
                case 9:
                    return 10;
                case 10:
                    return 11;
                case 11:
                    return 12;
                case 12:
                    return 13;
                case 13:
                    return 14;
                case 14:
                    return 15;
            }
        }
        
        return 0;
    }
}
