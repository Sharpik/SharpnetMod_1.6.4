package ModSharpnet.Item;

import static ModSharpnet.ModSharpnet.modid;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class SharpnetRoofingTile extends Item
{

    public SharpnetRoofingTile(int roofing_tile_ID)
    {
        super(roofing_tile_ID);
        this.setCreativeTab(CreativeTabs.tabMaterials);
        this.setTextureName(modid+":resources/roofing_tile");
    }
    
}
