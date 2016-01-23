package ModSharpnet.Block;

import ModSharpnet.Blocks;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;

public class SharpnetCobblestoneItemWalls1 extends ItemBlock
{
	
	public SharpnetCobblestoneItemWalls1(int id)
        {
		super(id);
		setHasSubtypes(true);
	}
	
        @Override
	public String getUnlocalizedName(ItemStack itemstack)
        {
            int damage = itemstack.getItemDamage();
            return "CobblestoneWalls1." + damage;
	}
        
        @Override
	public int getMetadata (int damageValue)
        {
		return damageValue;
	}
        
        @Override
        public Icon getIconFromDamage(int par1)
        {
            return Blocks.SharpnetCobblestoneWalls1.getIcon(0, par1);
        }

}