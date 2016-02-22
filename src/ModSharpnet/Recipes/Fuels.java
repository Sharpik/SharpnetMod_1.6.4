package ModSharpnet.Recipes;

import ModSharpnet.Items;
import cpw.mods.fml.common.IFuelHandler;
import net.minecraft.item.ItemStack;

public class Fuels implements IFuelHandler
{
    @Override
    public int getBurnTime(ItemStack fuel)
    {
            int var1 = fuel.itemID;

            if(var1 == 87)
            {
                    return 200;
            }
            else if(var1 == Items.oil_cell.itemID)
            {
                    return 1600;
            }
            else if(var1 == Items.fuel_cell.itemID)
            {
                    return 30560;
            }
            else
            {
                    return 0;
            }
    }
}