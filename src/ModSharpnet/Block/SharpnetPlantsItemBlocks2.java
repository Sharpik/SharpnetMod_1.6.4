package ModSharpnet.Block;

import ModSharpnet.Blocks;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;

public class SharpnetPlantsItemBlocks2 extends ItemBlock
{
     private Block block = Blocks.SharpnetPlantsBlocks2;
    
    public SharpnetPlantsItemBlocks2(int id)
    {
	super(id);
	setHasSubtypes(true);
    }
    
    @Override
    public String getUnlocalizedName(ItemStack itemstack)
    {
        int damage = itemstack.getItemDamage();
        return block.getUnlocalizedName() + "." + damage;
    }

    @Override
    public int getMetadata (int damageValue)
    {
            return damageValue;
    }
    
    @Override
        public Icon getIconFromDamage(int par1)
        {
            return block.getIcon(0, par1);
        }
}
