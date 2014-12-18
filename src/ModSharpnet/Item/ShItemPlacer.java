package ModSharpnet.Item;

//import net.minecraftforge.common.ForgeDirection;
//import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ShItemPlacer extends Item
{
    private int setBlockID;
    private int setBlockMeta;
    
    public ShItemPlacer(int ID, int blockID, int blockMeta)
    {
        super(ID);
        this.setBlockID = blockID;
        this.setBlockMeta = blockMeta;
    }
    
    @Override
    public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10)
    {
        if (par7 != 1)
        {
            return false;
        }
        else if (par2EntityPlayer.canPlayerEdit(par4, par5, par6, par7, par1ItemStack) && par2EntityPlayer.canPlayerEdit(par4, par5 + 1, par6, par7, par1ItemStack))
        {
            if (par3World.getBlockId(par4, par5 + 1, par6) == 0)
            {
                par3World.setBlock(par4, par5 + 1, par6, this.setBlockID, this.setBlockMeta, 2);
                --par1ItemStack.stackSize;
                return true;
            }
            else
            {
                return false;
            }
        }
        else {return false;}
    }
}
