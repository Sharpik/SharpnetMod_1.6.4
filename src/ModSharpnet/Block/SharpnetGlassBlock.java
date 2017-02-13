package ModSharpnet.Block;

import static ModSharpnet.ModSharpnet.modid;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;

public class SharpnetGlassBlock extends Block
{
    
    private int BlocksCount;
    private String[] glassTypes;
    private String[] names;
    public String[][] BlocksInfo = new String[16][2];
    
    @SideOnly(Side.CLIENT)
    public Icon[] iconArray;
    
    public SharpnetGlassBlock(int id, String[][] blocksInfo)
    {
        super(id, Material.glass);
        setStepSound(Block.soundGlassFootstep);
        
        this.BlocksInfo = blocksInfo;
        
        this.BlocksCount = blocksInfo.length;
        this.names = new String[this.BlocksCount];
        this.glassTypes = new String[this.BlocksCount];
        
        for(int i = 0; i < this.BlocksCount; i++)
        {
            if(this.BlocksInfo[i][0] != null) { this.names[i] = this.BlocksInfo[i][0]; } else { this.names[i] = "Error"; }
            if(this.BlocksInfo[i][1] != null) { this.glassTypes[i] = this.BlocksInfo[i][1]; } else { this.glassTypes[i] = "Error"; }
        }
    }
    @Override
    public int idDropped (int par1, Random par2Random, int par3)
    {
          return this.blockID;
    }
    
    @Override
    public int damageDropped (int metadata)
    {
            return metadata;
    }
    
    @Override
    public int quantityDropped(Random par1Random)
    {
        return 1;
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister par1IconRegister)
    {
        this.iconArray = new Icon[glassTypes.length];

        for (int i = 0; i < this.iconArray.length; ++i)
        {
            this.iconArray[i] = par1IconRegister.registerIcon(modid+":" + glassTypes[i]);
        }
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public Icon getIcon(int par1,int par2)
    {
        return this.iconArray[par2];
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public void getSubBlocks(int par1, CreativeTabs par2CreativeTabs, List subBlocks)
    {
        for (int sub = 0; sub < this.BlocksCount; ++sub)
        {
            subBlocks.add(new ItemStack(par1, 1, sub));
        }
    }
}
