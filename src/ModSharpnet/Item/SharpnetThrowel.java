package ModSharpnet.Item;

import ModSharpnet.Blocks;
import static ModSharpnet.ModSharpnet.modid;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class SharpnetThrowel extends Item
{
    
    private int blockType;
    
    public SharpnetThrowel(int par1)
    {
        super(par1);
        this.setMaxStackSize(1);
        this.setMaxDamage(8);
        this.setCreativeTab(CreativeTabs.tabTools);
        this.setTextureName(modid+":tools/trowel");
    }
    
    // Par4,5,6 are X, Y, Z
    // Par7 is the side of the block that is hit (1 == topSide)
    // floats are hitx, hity and hitz, these are the cooridantes where exactly you hit the block from 1.0F to 0.F﻿
    @Override
    public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10)
    {   
        if(!par3World.isRemote)
        {
            blockType = par3World.getBlockId(par4, par5, par6);
            if(par1ItemStack.getItemDamage() < par1ItemStack.getMaxDamage())
            {
            switch(blockType)
            {
                case 4: par3World.setBlock(par4, par5 , par6, Blocks.wall_cobblestone_trowel_block.blockID, 12, 2); par1ItemStack.damageItem(1, par2EntityPlayer); break;
                case 43: par3World.setBlock(par4, par5 , par6, Blocks.wall_stone_slab_trowel_block.blockID, 12, 2); par1ItemStack.damageItem(1, par2EntityPlayer); break;
                case 45: par3World.setBlock(par4, par5 , par6, Blocks.wall_bricks_trowel_block.blockID, 12, 2); par1ItemStack.damageItem(1, par2EntityPlayer); break;
                default: return false;
            }
            return true;
            }
            else
            {
                par1ItemStack.setItemName("Throwel - empty");
                return false;
            }
        }
        else {return false;}
    }
    
}
