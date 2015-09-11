package ModSharpnet;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class SharpnetTilesItemSlabBlocks2 extends ItemBlock
{
	
	public SharpnetTilesItemSlabBlocks2(int id)
        {
		super(id);
		setHasSubtypes(true);
	}
	
	@Override
	public String getUnlocalizedName(ItemStack itemstack)
        {
            String name = "";
            String name2 = "TileSlabBlock2";
            
            int damage = itemstack.getItemDamage();
            
            switch(damage)
            {
                case 0:
                {
                    name = name2 + damage;
                    break;
                }
                case 1:
                {
                    name = name2 + damage;
                    break;
                }
                default:
                    name = "Error Name in: " + name2 + " " + damage;
                    break;
            }
		return getUnlocalizedName() + "." + name;
	}
        
        @Override
	public int getMetadata (int damageValue)
        {
		return damageValue;
	}

}