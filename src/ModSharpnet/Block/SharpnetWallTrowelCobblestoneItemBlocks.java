package ModSharpnet.Block;

import ModSharpnet.Blocks;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;

public class SharpnetWallTrowelCobblestoneItemBlocks extends ItemBlock
{
	
	public SharpnetWallTrowelCobblestoneItemBlocks(int id)
        {
		super(id);
		setHasSubtypes(true);
	}
	
        @Override
	public String getUnlocalizedName(ItemStack itemstack)
        {
            int damage = itemstack.getItemDamage();
            return Blocks.wall_cobblestone_trowel_block.getUnlocalizedName() + "." + damage;
	}
        
        @Override
	public int getMetadata (int damageValue)
        {
		return damageValue;
	}
        
        @Override
        public Icon getIconFromDamage(int par1)
        {
            return Blocks.wall_cobblestone_trowel_block.getIcon(0, par1);
        }

}