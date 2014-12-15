package ModSharpnet;

import static ModSharpnet.ModSharpnet.sharpnetFlowerBlocks1;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;

public class SharpnetFlowerItemBlocks1 extends ItemBlock
{
	
	public SharpnetFlowerItemBlocks1(int id)
        {
		super(id);
		setHasSubtypes(true);
	}
        
        @Override
	public String getUnlocalizedName(ItemStack itemstack)
        {
            int damage = itemstack.getItemDamage();
            String name = "FlowerBlocks1";
            return getUnlocalizedName() + "." + name + "." + damage;
	}
        
        @Override
	public int getMetadata (int damageValue)
        {
		return damageValue;
	}
        
        @Override
        public Icon getIconFromDamage(int par1)
        {
            return sharpnetFlowerBlocks1.getIcon(0, par1);
        }

}