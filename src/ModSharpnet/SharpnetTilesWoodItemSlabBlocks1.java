package ModSharpnet;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class SharpnetTilesWoodItemSlabBlocks1 extends ItemBlock
{
    
	public SharpnetTilesWoodItemSlabBlocks1(int id)
        {
		super(id);
		setHasSubtypes(true);
	}
	
	@Override
	public String getUnlocalizedName(ItemStack itemstack)
        {
            return getUnlocalizedName() + "." + itemstack.getItemDamage();
	}
        
        @Override
	public int getMetadata (int damageValue)
        {
		return damageValue;
	}

}