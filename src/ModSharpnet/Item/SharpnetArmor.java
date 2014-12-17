package ModSharpnet.Item;

import static ModSharpnet.ModSharpnet.modid;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class SharpnetArmor extends ItemArmor
{
    private String TexturePath = modid + ":textures/armor/";
    private String getItemTextureName = "";
    
    public SharpnetArmor(int par1, EnumArmorMaterial par2EnumArmorMaterial, int par3, int par4, int MaxDam, String TextureName, String ItemTextureName)
    {
        super(par1, par2EnumArmorMaterial, par3, par4);
        this.setMaxDamage(MaxDam);
        this.getItemTextureName = ItemTextureName;
        this.setTextureName(TextureName, par4);
    }
    
    private String setTextureName( String TextureName, int par4)
    {
        switch(par4)
        {
            case 0: this.TexturePath += TextureName + "_1.png"; break;
            case 1: this.TexturePath += TextureName + "_1.png"; break;
            case 2: this.TexturePath += TextureName + "_2.png"; break;
            case 3: this.TexturePath += TextureName + "_1.png"; break;
        }
        return this.TexturePath;
    }
    
    @SideOnly(Side.CLIENT)
    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
    {
        return this.TexturePath;
    }
    
    @SideOnly(Side.CLIENT)
    @Override
    public void registerIcons(IconRegister register)
    {
        this.itemIcon = register.registerIcon(modid+":" + this.getItemTextureName);
    }
    
}
