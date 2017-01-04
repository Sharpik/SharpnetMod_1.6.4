package ModSharpnet.Item;

import ModSharpnet.Blocks;
import static ModSharpnet.ModSharpnet.modid;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class SharpnetLighter extends Item
{
    
    private int blockType;
    
    public SharpnetLighter(int par1)
    {
        super(par1);
        this.setMaxStackSize(1);
        this.setMaxDamage(64);
        this.setCreativeTab(CreativeTabs.tabTools);
        this.setTextureName(modid+":tools/lighter");
    }
    @Override
    public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10)
    {
        if(!par3World.isRemote)
        {
            blockType = par3World.getBlockId(par4, par5+1, par6);
            if(par1ItemStack.getItemDamage() < par1ItemStack.getMaxDamage())
            {
                switch(blockType)
                {
                    case 0: par3World.setBlock(par4, par5+1 , par6, Block.fire.blockID, 0, 2); par1ItemStack.damageItem(1, par2EntityPlayer); break;
                    default: return false;
                }
            }
            else
            {
                par2EntityPlayer.inventory.setInventorySlotContents(par2EntityPlayer.inventory.currentItem, (ItemStack)null);
                return false;
            }
            return true;
        }
        else {return false;}
    }
}
