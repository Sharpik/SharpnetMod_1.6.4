package ModSharpnet.Item;

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
import net.minecraft.util.Icon;
import net.minecraft.world.World;

public class SharpnetDrinksBlocks1 extends Block
{
    
    public static final String[] drinkTypes = new String[] {"beer", "wine", "cofee", "whiskey", "tequilla_s", "tequilla_g", "rum", "semtex", "tea_cup", "chocolate_hot", "blank", "blank", "blank", "blank", "blank", "blank"};
    
    @SideOnly(Side.CLIENT)
    public Icon[] iconArray;
    private int dropID;
    private int blockMetaData;
    
    public SharpnetDrinksBlocks1(int par1)
    {
        super(par1, Material.glass);
        this.setHardness(0.0F);
        this.setResistance(0.0F);
        this.setStepSound(Block.soundGlassFootstep);
        this.setCreativeTab((CreativeTabs)null);
        setBurnProperties(par1, 30, 60);
        float f = 0.2F;
        this.setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, f * 3.0F, 0.5F + f);
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
    
    public void getDroping(int ID,int metadata, World world, int x, int y, int z)
    {
        if(ID != 0){dropID = ID;}
        if(metadata != 0){blockMetaData = metadata;} else {blockMetaData = world.getBlockMetadata(x, y, z);}
        switch(blockMetaData)
        {
            case 0: dropID = Items.beer_ID; break;
            case 1: dropID = Items.wine_ID; break;
            /*
            case 2: dropID = Items.; break;
            case 3: dropID = Items.; break;
            case 4: dropID = Items.; break;
            case 5: dropID = Items.; break;
            case 6: dropID = Items.; break;
            case 7: dropID = Items.; break;
            case 8: dropID = Items.; break;
            case 9: dropID = Items.; break;
            case 10: dropID = Items.; break;
            case 11: dropID = Items.; break;
            */
            default: dropID = Items.bottle_ID; break;
        }
        ItemStack ItemTospawn = new ItemStack(dropID, 1, 0);
        EntityItem Ispawn1 = new EntityItem(world,x,y,z,ItemTospawn);
        world.spawnEntityInWorld(Ispawn1);
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
    /**
     * returns a list of blocks with the same ID, but different meta (eg: wood returns 4 blocks)
     */
    @Override
    public void getSubBlocks(int par1, CreativeTabs par2CreativeTabs, List subBlocks)
    {
        for (int sub = 0; sub < drinkTypes.length; ++sub)
        {
            subBlocks.add(new ItemStack(par1, 1, sub));
        }
    }

    @SideOnly(Side.CLIENT)
    /**
     * When this method is called, your block should register all the icons it needs with the given IconRegister. This
     * is the only chance you get to register icons.
     */
    @Override
    public void registerIcons(IconRegister par1IconRegister)
    {
        this.iconArray = new Icon[drinkTypes.length];

        for (int i = 0; i < this.iconArray.length; ++i)
        {
            this.iconArray[i] = par1IconRegister.registerIcon(modid+":drinks&food/" + drinkTypes[i]);
        }
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public Icon getIcon(int par1,int par2)
    {
        return this.iconArray[par2];
    }
    
}
