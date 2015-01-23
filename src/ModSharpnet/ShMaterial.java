package ModSharpnet;

import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

public class ShMaterial extends Material
{
    ShMaterial(MapColor par1Map)
    {
        super(par1Map);
        this.setRequiresTool();
        //this.setImmovableMobility();
    }
}
