package ModSharpnet.Block;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class SharpnetPanelsItemBlock extends ItemBlock
{
	public SharpnetPanelsItemBlock(int id)
	{
		super(id);
		this.setMaxDamage(0);
		this.setHasSubtypes(true);
	}

	@Override
	public int getMetadata(int damage)
	{
		return damage;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public Icon getIconFromDamage(int par1)
	{
		return Block.blocksList[this.getBlockID()].getIcon(0, par1);
	}

	@Override
	public String getUnlocalizedName(ItemStack itemstack)
	{
		return Block.blocksList[this.getBlockID()].getUnlocalizedName() + "." + itemstack.getItemDamage();
	}

	@Override
	public String getUnlocalizedName()
	{
		return Block.blocksList[this.getBlockID()].getUnlocalizedName() + ".0";
	}
}
