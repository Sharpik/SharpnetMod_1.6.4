package ModSharpnet;

import static ModSharpnet.ModSharpnet.modid;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

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
    public void registericons(IconRegister IconRegister)
    {
        this.blockIcon = IconRegister.registerIcon(modid+":roads/road_gray");
    }
    
}
