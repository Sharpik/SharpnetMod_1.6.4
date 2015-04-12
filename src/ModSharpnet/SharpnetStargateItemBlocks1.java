package ModSharpnet;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class SharpnetStargateItemBlocks1 extends ItemBlock
{
	private Block block = ModSharpnet.SharpnetStargateBlocks1;
        
	public SharpnetStargateItemBlocks1(int id)
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

}