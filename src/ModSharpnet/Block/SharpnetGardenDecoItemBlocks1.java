package ModSharpnet.Block;

import ModSharpnet.*;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;

public class SharpnetGardenDecoItemBlocks1 extends ItemBlock
{
	private String name = "";
        private Block block = Blocks.garden_deco_block;
        
	public SharpnetGardenDecoItemBlocks1(int id)
        {
                super(id);
                name = block.getUnlocalizedName();
		setHasSubtypes(true);
	}
        
        @Override
	public String getUnlocalizedName(ItemStack itemstack)
        {
            int damage = itemstack.getItemDamage();
            
            return name + "." + damage;
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