package ModSharpnet;

import static ModSharpnet.ModSharpnet.modid;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

class SharpnetRoadStairsGray extends BlockStairs
{
    
    private Block ExtendedBlock;
    
    public SharpnetRoadStairsGray(int BlockID, Block ExtendedBlock, int BlockMeta)
    {
        super( BlockID, ExtendedBlock, BlockMeta);
        
        this.ExtendedBlock = ExtendedBlock;
        setCreativeTab(CreativeTabs.tabBlock);
        this.useNeighborBrightness[BlockID] = true;
    }
    
    @SideOnly(Side.CLIENT)
    public void registericons(IconRegister IconRegister)
    {
        this.blockIcon = IconRegister.registerIcon(modid+":roads/road_gray");
    }
    
}
