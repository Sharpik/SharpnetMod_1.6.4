package ModSharpnet.Block;

import static ModSharpnet.ModSharpnet.RenderPaneID;
import net.minecraft.block.BlockPane;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;

public class SharpnetPanelsBlock  extends BlockPane
{

    @SideOnly(Side.CLIENT)
    private Icon[] iconArray;
    
    private int BlocksCount;
    private String[] Textures;
    private String[] names;
    public String[][] BlocksInfo = new String[16][2];

    public SharpnetPanelsBlock(int ID, String[][] blocksInfo, Material material)
    {
        super(ID, "", "", material, true);
        this.BlocksInfo = blocksInfo;
        
        this.BlocksCount = blocksInfo.length;
        this.names = new String[this.BlocksCount];
        this.Textures = new String[this.BlocksCount];
        
        for(int i = 0; i < this.BlocksCount; i++)
        {
            if(this.BlocksInfo[i][0] != null) { this.names[i] = this.BlocksInfo[i][0]; } else { this.names[i] = "Error"; }
            if(this.BlocksInfo[i][1] != null) { this.Textures[i] = this.BlocksInfo[i][1]; } else { this.Textures[i] = "Error"; }
        }
    }
    
    @SideOnly(Side.CLIENT)
    public void getSubBlocks(int par1, CreativeTabs par2CreativeTabs, List par3List)
    {
            for (int i = 0; i < this.BlocksCount; i++)
            {
                    par3List.add(new ItemStack(par1, 1, i));
            }
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister par1IconRegister)
    {
            this.iconArray = new Icon[this.Textures.length];

            for (int i = 0; i < this.iconArray.length; ++i)
            {
                this.iconArray[i] = par1IconRegister.registerIcon(Textures[i]);
            }

            this.blockIcon = this.iconArray[0];
    }
    
    @Override
    public int getRenderType()
    {
            return RenderPaneID;
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public Icon getIcon(int par1, int par2)
    {
            return this.iconArray[par2 % this.iconArray.length];
    }
    
    @Override
    public Icon getSideTextureIndex()
    {
            return this.getSideTextureIndex(0);
    }
    
    public Icon getSideTextureIndex(int metadata)
    {
            return this.iconArray[metadata % this.iconArray.length];
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public int getRenderBlockPass()
    {
            return 1;
    }
}
