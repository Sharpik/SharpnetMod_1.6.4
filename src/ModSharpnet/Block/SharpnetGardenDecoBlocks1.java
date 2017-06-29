package ModSharpnet.Block;

import ModSharpnet.Blocks;
import ModSharpnet.Items;
import static ModSharpnet.ModSharpnet.ModProjectRed;
import static ModSharpnet.ModSharpnet.SharpnetFlowerBlocks1ID;
import static ModSharpnet.ModSharpnet.modid;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

public class SharpnetGardenDecoBlocks1 extends Block
{
    
    public static final String[] Types = new String[] {"gar_dwarf", "gar_smurf", "x-mass_tree", "gar_stone1", "gar_stone2", "gar_stone3", "gar_stone4", "graveyard_stone1", "graveyard_stone2", "church_bell"};
    
    @SideOnly(Side.CLIENT)
    public Icon[] iconArray;
    private int itemInHandID = 0;
    private int itemInHandMeta = 0;
    private int BlockMeta = 0;
    
    public SharpnetGardenDecoBlocks1(int par1)
    {
        super(par1, Material.ground);
        this.setHardness(0.2F);
        this.setResistance(0.1F);
        this.setLightValue(1.0F);
        this.setStepSound(Block.soundStoneFootstep);
        this.setCreativeTab(CreativeTabs.tabDecorations);
        //setBurnProperties(par1, 60, 60);
        
        float f = 0.3F;
        this.setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, f * 3.0F, 0.5F + f);
    }
    
    // make it non colidable :)
    @Override
    public AxisAlignedBB getCollisionBoundingBoxFromPool(World par1World, int par2, int par3, int par4)
    {
        return null;
    }
    
    @Override
    public boolean isOpaqueCube()
    {
        return false;
    }
    
    @Override
    public boolean renderAsNormalBlock()
    {
        return false;
    }
    
    @Override
    public int getRenderType()
    {
        return 1;
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
    public int getDamageValue(World par1World, int par2, int par3, int par4)
    {
        return par1World.getBlockMetadata(par2, par3, par4);
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void getSubBlocks(int par1, CreativeTabs par2CreativeTabs, List subBlocks)
    {
        for (int sub = 0; sub < Types.length; ++sub)
        {
            subBlocks.add(new ItemStack(par1, 1, sub));
        }
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void registerIcons(IconRegister par1IconRegister)
    {
        this.iconArray = new Icon[Types.length];

        for (int i = 0; i < this.iconArray.length; ++i)
        {
            this.iconArray[i] = par1IconRegister.registerIcon(modid+":garden_decor/" + Types[i]);
        }
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public Icon getIcon(int par1,int par2)
    {
        return this.iconArray[par2];
    }
    
}
