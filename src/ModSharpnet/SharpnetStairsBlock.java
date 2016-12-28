package ModSharpnet;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

import static ModSharpnet.ModSharpnet.modid;

class SharpnetStairsBlock extends BlockStairs
{
    private Block ExtendedBlock;
    private String Texture;
    
    public String[] BlockInfo = new String[2];
    
    public SharpnetStairsBlock(int BlockID, Block ExtendedBlock, int BlockMeta, String[] blockInfo)
    {
        super( BlockID, ExtendedBlock, BlockMeta);
        
        this.ExtendedBlock = ExtendedBlock;
        setCreativeTab(CreativeTabs.tabBlock);
        this.useNeighborBrightness[BlockID] = true;
        
        this.BlockInfo = blockInfo;
        setUnlocalizedName(BlockInfo[0]);
        this.Texture = BlockInfo[1];
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
        this.blockIcon = IconRegister.registerIcon(modid + ":" + this.Texture);
    }
    
}
