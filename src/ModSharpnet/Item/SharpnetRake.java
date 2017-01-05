package ModSharpnet.Item;

import static ModSharpnet.ModSharpnet.modid;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class SharpnetRake extends Item
{
    
    private int blockType;
    
    public SharpnetRake(int par1)
    {
        super(par1);
        this.setMaxStackSize(1);
        this.setMaxDamage(1024);
        this.setCreativeTab(CreativeTabs.tabTools);
        this.setTextureName(modid+":tools/rake");
    }
    
    @Override
    public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int posX, int posY, int posZ, int par7, float par8, float par9, float par10)
    { 
        for(int y = -1; y <= 1; y++)
        {
            for(int x = -2; x <= 2; x++)
            {
                for(int z = -2; z <= 2; z++)
                {
                    if(!par3World.isRemote)
                    {
                        blockType = par3World.getBlockId(posX + x, posY + y, posZ + z);

                        if(blockType == Block.snow.blockID)
                        {
                            if(par1ItemStack.getItemDamage() < par1ItemStack.getMaxDamage())
                            {
                                par3World.setBlock(posX + x, posY + y, posZ + z, 0, 0, 2);
                                par1ItemStack.damageItem(1, par2EntityPlayer);

                                ItemStack Itemspawn1 = new ItemStack(Item.snowball, 1);
                                EntityItem Ispawn1 = new EntityItem(par3World,posX,posY,posZ,Itemspawn1);
                                par3World.spawnEntityInWorld(Ispawn1);
                            }
                            else
                            {
                                par2EntityPlayer.inventory.setInventorySlotContents(par2EntityPlayer.inventory.currentItem, (ItemStack)null);
                                return false;
                            }
                        }
                    }
                }
            }
        }
        return true;
        
    }
}
