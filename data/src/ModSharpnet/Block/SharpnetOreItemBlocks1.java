package ModSharpnet.Block;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class SharpnetOreItemBlocks1 extends ItemBlock
{
	
	public SharpnetOreItemBlocks1(int id)
        {
		super(id);
		setHasSubtypes(true);
	}
	
        @Override
	public String getUnlocalizedName(ItemStack itemstack)
        {
            int damage = itemstack.getItemDamage();
            String name = "OreBlocks1";
            return getUnlocalizedName() + "." + name + "." + damage;
	}
        
        @Override
	public int getMetadata (int damageValue)
        {
		return damageValue;
	}

}