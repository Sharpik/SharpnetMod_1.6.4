package ModSharpnet;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;

public class SharpnetPlantsItemBlocks1 extends ItemBlock
{
    private final Block block = ModSharpnet.SharpnetPlantsBlocks1;
    private int ThisMaxDamage = 0;
    
    public SharpnetPlantsItemBlocks1(int id)
    {
	super(id);
	setHasSubtypes(true);
        ThisMaxDamage = SharpnetPlantsBlocks1.pocet - 1;
    }
    
    @Override
    public String getUnlocalizedName(ItemStack itemstack)
    {
        int damage = itemstack.getItemDamage();
        
        if (damage <= ThisMaxDamage)
        {
            //debug
            if (ModSharpnet.SHdebug == true) System.out.println("SharpnetMod Plant Block Item 1: Unlocalized Name Reg:" + block.getUnlocalizedName() + " Damage: " + damage + " MaxDamage: " + ThisMaxDamage);
            
            return block.getUnlocalizedName() + "." + damage;
        }
        return null;
    }

    @Override
    public int getMetadata (int damageValue)
    {
            return ThisMaxDamage;
    }
    
    @Override
    public Icon getIconFromDamage(int par1)
    {
        if (par1 <= ThisMaxDamage)
        {
            //debug
            if (ModSharpnet.SHdebug == true) System.out.println("SharpnetMod Plant Block Item 1: Icon Reg Meta: " + par1 + " MaxMeta: " + ThisMaxDamage);
            return block.getIcon(0, par1);
        }
        return null;
    }
}
