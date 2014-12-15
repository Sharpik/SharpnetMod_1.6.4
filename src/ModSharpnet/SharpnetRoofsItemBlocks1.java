package ModSharpnet;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class SharpnetRoofsItemBlocks1 extends ItemBlock
{
	
	public SharpnetRoofsItemBlocks1(int id)
        {
		super(id);
		setHasSubtypes(true);
	}
	
	@Override
	public String getUnlocalizedName(ItemStack itemstack)
        {
            String name = "";
            String name2 = "TileRoofBlock1";
            
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