package ModSharpnet.Block;

import static ModSharpnet.ModSharpnet.modid;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.Icon;

public class SharpnetStairsBlocks extends BlockStairs
{
    public Block extender;
    
    @SideOnly(Side.CLIENT)
    public Icon[] iconArray;
    
    public SharpnetStairsBlocks(int id, Block extender)
    {
        super(id, extender, 1);
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.useNeighborBrightness[id] = true;
    }
    
    @Override
    public boolean isOpaqueCube()
    {
        return false;
    }

    @SideOnly(Side.CLIENT)
    /**
     * When this method is called, your block should register all the icons it needs with the given IconRegister. This
     * is the only chance you get to register icons.
     */
    @Override
    public void registerIcons(IconRegister par1IconRegister)
    {
        this.blockIcon =  par1IconRegister.registerIcon(this.extender.getIcon(extender.blockID, 0).toString());
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public Icon getIcon(int par1,int par2)
    {
        return this.iconArray[par2];
    }
    
}
