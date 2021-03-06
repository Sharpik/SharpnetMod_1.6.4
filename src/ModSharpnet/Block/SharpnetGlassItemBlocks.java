package ModSharpnet.Block;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;

public class SharpnetGlassItemBlocks extends ItemBlock
{
	
    private String name = "";
    private final Block block = Block.blocksList[this.getBlockID()];
    
	public SharpnetGlassItemBlocks(int id)
        {
		super(id);
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