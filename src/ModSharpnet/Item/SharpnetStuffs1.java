package ModSharpnet.Item;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatMessageComponent;
import net.minecraft.world.World;

public class SharpnetStuffs1 extends Item
{
    public int StuffType = 0;
    
    public SharpnetStuffs1(int id, int typeOfEffect, int uses)
    {
        super(id);
        this.maxStackSize = 1;
        this.setMaxDamage(uses);
        this.setCreativeTab(CreativeTabs.tabMisc);
        this.StuffType = typeOfEffect;
    }

    // Par4,5,6 are X, Y, Z
    // Par7 is the side of the block that is hit (1 == topSide)
    // floats are hitx, hity and hitz, these are the cooridantes where exactly you hit the block from 1.0F to 0.F
    /*
    @Override
    public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10)
    {
        return false;
    }
    */
    @Override
    public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
        //Check for serverside only
        if (!par2World.isRemote)
        {
            switch(StuffType)
            {
                case 0: break;
                case 1:
                    par2World.setRainStrength(0.0F);
                    par2World.getWorldInfo().setRaining(false);
                    par3EntityPlayer.sendChatToPlayer(new ChatMessageComponent().addText("Its Sunny Day Now!"));
                    par1ItemStack.damageItem(1, par3EntityPlayer);
                    break;
                case 2:
                    par2World.setRainStrength(1.0F);
                    par2World.getWorldInfo().setRaining(true);
                    par3EntityPlayer.sendChatToPlayer(new ChatMessageComponent().addText("Its Raining Now!"));
                    par1ItemStack.damageItem(1, par3EntityPlayer);
                    break;
                case 3:
                    par2World.setWorldTime(6000);
                    par3EntityPlayer.sendChatToPlayer(new ChatMessageComponent().addText("Its 6:00 O clock!"));
                    par1ItemStack.damageItem(1, par3EntityPlayer);
                    break;
                case 4:
                    par2World.setWorldTime(20000);
                    par3EntityPlayer.sendChatToPlayer(new ChatMessageComponent().addText("Its 20:00 O clock!"));
                    par1ItemStack.damageItem(1, par3EntityPlayer);
                    break;
            }

            par3EntityPlayer.setItemInUse(par1ItemStack, this.getMaxItemUseDuration(par1ItemStack));
        }
        return par1ItemStack;
    }
    
    @Override
    public boolean hitEntity(ItemStack par1ItemStack, EntityLivingBase par2EntityLivingBase, EntityLivingBase par3EntityLivingBase)
    {
        par1ItemStack.damageItem(1, par3EntityLivingBase);
        return true;
    }
    
    @Override
    public boolean onBlockDestroyed(ItemStack par1ItemStack, World par2World, int par3, int par4, int par5, int par6, EntityLivingBase par7EntityLivingBase)
    {
        if ((double)Block.blocksList[par3].getBlockHardness(par2World, par4, par5, par6) != 0.0D)
        {
            par1ItemStack.damageItem(2, par7EntityLivingBase);
        }

        return true;
    }

    @SideOnly(Side.CLIENT)
    public boolean isFull3D()
    {
        return true;
    }

    /**
     * returns the action that specifies what animation to play when the items is being used
     * @param par1ItemStack
     * @return 
     */
    @Override
    public EnumAction getItemUseAction(ItemStack par1ItemStack)
    {
        return EnumAction.block;
    }
    
    /**
     * How long it takes to use or consume an item
     * @param par1ItemStack
     * @return 
     */
    @Override
    public int getMaxItemUseDuration(ItemStack par1ItemStack)
    {
        return 72000;
    }

    /**
     * Returns if the item (tool) can harvest results from the block type.
     * @param par1Block
     * @return 
     */
    @Override
    public boolean canHarvestBlock(Block par1Block)
    {
        if (par1Block.blockID == Block.web.blockID) {return true;}
        else {return false;}
    }

    /**
     * Return the enchantability factor of the item, most of the time is based on material.
     * @return 
     */
    @Override
    public int getItemEnchantability()
    {
        //return this.toolMaterial.getEnchantability();
        return 0;
    }

}
