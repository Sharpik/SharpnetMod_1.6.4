package ModSharpnet.Block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

public class SharpnetStairsBlocks extends BlockStairs
{
    public Block extender;
    public int extenderMeta;
    
    @SideOnly(Side.CLIENT)
    public Icon[] iconArray;
    
    public SharpnetStairsBlocks(int id, Block extender, int extenderMeta)
    {
        super(id, extender, extenderMeta);
        this.extender = extender;
        this.extenderMeta = extenderMeta;
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.useNeighborBrightness[id] = true;
        
    }
    
    @Override
    public boolean isOpaqueCube()
    {
        return false;
    }
    
    @Override
    public void onBlockClicked(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer)
    {
        return;
    }
    
    @Override
    public boolean onBlockActivated(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9)
    {
        return false;
    }

    @SideOnly(Side.CLIENT)
    private Icon[] icons;
    
    @SideOnly(Side.CLIENT)
    /**
     * When this method is called, your block should register all the icons it needs with the given IconRegister. This
     * is the only chance you get to register icons.
     */
    @Override
    public void registerIcons(IconRegister par1IconRegister)
    {
        this.icons = new Icon[1];
        this.icons[0] = par1IconRegister.registerIcon(this.extender.getIcon(0, extenderMeta).getIconName());
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public Icon getIcon(int par1,int par2)
    {
        return this.icons[0];
    }
}
