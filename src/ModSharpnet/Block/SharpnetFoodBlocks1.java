package ModSharpnet.Block;

import ModSharpnet.Items;
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
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.Icon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class SharpnetFoodBlocks1 extends Block
{
    
    //public static final String[] foodTypes = new String[] {"plate_pizza", "plate_salad", "plate_salad_filet", "blank", "blank", "blank", "blank", "blank", "blank", "blank", "blank", "blank", "blank", "blank", "blank", "blank"};
    public static final String[] foodTypes = new String[] {"pizza", "potato_salad", "salad_fillet"};
    
    @SideOnly(Side.CLIENT)
    public Icon[] iconArray;
    private int dropID;
    private int blockMetaData;
    
    public SharpnetFoodBlocks1(int par1)
    {
        super(par1, Material.cake);
        this.setHardness(0.1F);
        this.setResistance(0.1F);
        this.setStepSound(Block.soundClothFootstep);
        this.setCreativeTab((CreativeTabs)null);
        //this.setCreativeTab(CreativeTabs.tabDecorations);
        setBurnProperties(par1, 30, 30);
        this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.0625F, 1.0F);
        this.renderSide(0);
    }
    
    @Override
    public AxisAlignedBB getCollisionBoundingBoxFromPool(World par1World, int par2, int par3, int par4)
    {
        byte b0 = 0;
        float f = 0.0625F;
        return AxisAlignedBB.getAABBPool().getAABB((double)par2 + this.minX, (double)par3 + this.minY, (double)par4 + this.minZ, (double)par2 + this.maxX, (double)((float)par3 + (float)b0 * f), (double)par4 + this.maxZ);
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
    
    public void setBlockBoundsForItemRender()
    {
        this.renderSide(0);
    }
    
    protected void renderSide(int par1)
    {
        byte b0 = 0;
        float f = (float)(1 * (1 + b0)) / 16.0F;
        this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, f, 1.0F);
    }
    
    @SideOnly(Side.CLIENT)
    @Override
    public boolean shouldSideBeRendered(IBlockAccess par1IBlockAccess, int par2, int par3, int par4, int par5)
    {
        return par5 == 1 ? true : super.shouldSideBeRendered(par1IBlockAccess, par2, par3, par4, par5);
    }
    
    public void getDroping(int ID,int metadata, World world, int x, int y, int z)
    {
        if(ID != 0){dropID = ID;}
        if(metadata != 0){blockMetaData = metadata;} else{blockMetaData = world.getBlockMetadata(x, y, z);}
        switch(blockMetaData)
        {
            case 0: dropID = Items.pizza.itemID; break;
            case 1: dropID = Items.salad.itemID; break;
            case 2: dropID = Items.salad_fillet.itemID; break;
                /*
            case 3: dropID = Items.whiskey.itemID; break;
            case 4: dropID = Items.tequilla_silver.itemID; break;
            case 5: dropID = Items.tequilla_gold.itemID; break;
            case 6: dropID = Items.rum.itemID; break;
            case 7: dropID = Items.semtex.itemID; break;
            case 8: dropID = Items.cup_of_tea.itemID; break;
            case 9: dropID = Items.hot_chocolate.itemID; break;
            case 10: dropID = Items.honey.itemID; break;
            case 11: dropID = Items.catchup.itemID; break;
            case 12: dropID = Items.glass_of_vine.itemID; break;
            case 13: dropID = Items.vodka.itemID; break;
            case 14: dropID = Items.cocacola.itemID; break;
            case 15: dropID = Items.bottle.itemID; break;
                        */
            default: dropID = 0; break;
        }
        if (dropID != 0)
        {
            ItemStack ItemTospawn = new ItemStack(dropID, 1, 0);
            EntityItem Ispawn1 = new EntityItem(world,x,y,z,ItemTospawn);
            world.spawnEntityInWorld(Ispawn1);
        }
    }
    
    @Override
    public void breakBlock(World world, int x, int y, int z, int par5, int par6)
    {
        getDroping(0,0,world,x,y,z);
    }
    
    @Override
    public int idDropped (int par1, Random par2Random, int par3)
    {
        return 0;
    }
    
    @Override
    public int damageDropped (int metadata)
    {
        return 0;
    }
    
    @Override
    public int quantityDropped(Random par1Random)
    {
        return 1;
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void getSubBlocks(int par1, CreativeTabs par2CreativeTabs, List subBlocks)
    {
        for (int sub = 0; sub < foodTypes.length; ++sub)
        {
            subBlocks.add(new ItemStack(par1, 1, sub));
        }
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void registerIcons(IconRegister par1IconRegister)
    {
        this.iconArray = new Icon[foodTypes.length];
        //this.iconArray = new Icon[2];

        for (int i = 0; i < this.iconArray.length; ++i)
        {
            this.iconArray[i] = par1IconRegister.registerIcon(modid+":drinks&food/" + foodTypes[i]);
        }
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public Icon getIcon(int par1,int par2)
    {
        return this.iconArray[par2];
    }
    
}
