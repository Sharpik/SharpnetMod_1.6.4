package ModSharpnet.Item;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class ShItemPlacerSubtypes extends Item
{
    private int[] setBlockID;
    private int[] setBlockMeta;
    private int item_variants;
    private String[] textures;
    private String[] UnlocalizedNames;
    
    public ShItemPlacerSubtypes(int ID, String[][] blocksInfo)
    {
        super(ID);
        this.setHasSubtypes(true);
        
        this.item_variants = blocksInfo.length;
        this.UnlocalizedNames = new String[this.item_variants];
        this.textures = new String[this.item_variants];
        this.setBlockID = new int[this.item_variants];
        this.setBlockMeta = new int[this.item_variants];
        
        for(int i = 0; i < this.item_variants; i++)
        {
            if(blocksInfo[i][0] != null) { this.UnlocalizedNames[i] = blocksInfo[i][0]; } else { this.UnlocalizedNames[i] = "Name Error"; }
            if(blocksInfo[i][1] != null) { this.textures[i] = blocksInfo[i][1]; } else { this.textures[i] = "Texture Error"; }
            if(blocksInfo[i][2] != null)
            {
                try
                {
                    this.setBlockID[i] = Integer.parseInt(blocksInfo[i][2]);
                }
                catch (NumberFormatException e)
                {
                    this.setBlockID[i] = 0;
                }
            }
            else { this.setBlockID[i] = 0; }
            
            if(blocksInfo[i][3] != null)
            {
                try
                {
                    this.setBlockMeta[i] = Integer.parseInt(blocksInfo[i][3]);
                }
                catch (NumberFormatException e)
                {
                    this.setBlockMeta[i] = 0;
                }
            }
            else { this.setBlockMeta[i] = 0; }
            //Debug
            //System.out.println("SHDebug: " + this.BlocksInfo[i][0] + "; " + this.BlocksInfo[i][1] + "; " + this.BlocksInfo[i][2] + "; " + this.BlocksInfo[i][3] );
        }
    }

    @Override
    public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10)
    {
        int meta = par1ItemStack.getItemDamage();
        if(!par3World.isRemote)
        {
            if (par7 != 1)
            {
                return false;
            }
            else if (par2EntityPlayer.canPlayerEdit(par4, par5, par6, par7, par1ItemStack) && par2EntityPlayer.canPlayerEdit(par4, par5 + 1, par6, par7, par1ItemStack))
            {
                if (par3World.getBlockId(par4, par5 + 1, par6) == 0)
                {
                    par3World.setBlock(par4, par5 + 1, par6, this.setBlockID[meta], this.setBlockMeta[meta], 2);
                    --par1ItemStack.stackSize;
                    return true;
                }
                else
                {
                    return false;
                }
            }
            return false;
        }
        else{ return false; }
    }
    
    @SideOnly(Side.CLIENT)
       private Icon[] icons;
      
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister par1IconRegister)
    {
           icons = new Icon[item_variants];

           for(int i = 0; i < icons.length; i++)
           {
                  icons[i] = par1IconRegister.registerIcon(textures[i]);
           }
    }

    public String getUnlocalizedName(ItemStack par1ItemStack)
    {
        int i = MathHelper.clamp_int(par1ItemStack.getItemDamage(), 0, 15);
        return super.getUnlocalizedName() + "." + UnlocalizedNames[i];
    }
      
    public Icon getIconFromDamage(int par1)
    {
       return icons[par1];
    }

    
    @SideOnly(Side.CLIENT)
    public void getSubItems(int par1, CreativeTabs par2CreativeTabs, List par3List)
    {
       for (int x = 0; x < item_variants; x++)
        {
            par3List.add(new ItemStack(this, 1, x));
        }
    }
}
