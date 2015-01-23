package ModSharpnet.Block;

import ModSharpnet.Blocks;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;

public class SharpnetWallTrowelStoneSlabItemBlocks extends ItemBlock
{
	
	public SharpnetWallTrowelStoneSlabItemBlocks(int id)
        {
		super(id);
		setHasSubtypes(true);
	}
	
        @Override
	public String getUnlocalizedName(ItemStack itemstack)
        {
            int damage = itemstack.getItemDamage();
            return Blocks.wall_stone_slab_trowel.getUnlocalizedName() + "." + damage;
	}
        
        @Override
	public int getMetadata (int damageValue)
        {
		return damageValue;
	}
        
        @Override
        public Icon getIconFromDamage(int par1)
        {
            return Blocks.wall_stone_slab_trowel.getIcon(0, par1);
        }

}