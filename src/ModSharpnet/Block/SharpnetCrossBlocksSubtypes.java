package ModSharpnet.Block;

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
import net.minecraft.world.World;

public class SharpnetCrossBlocksSubtypes extends Block
{
   
    @SideOnly(Side.CLIENT)
    public Icon[] iconArray;
    
    private int[] BlockDropID;
    private int[] BlockDropMeta;
    private int[] BlockDropCount;
    private int block_variants;
    private String[] textures;
    private String[] UnlocalizedNames;
    
    public SharpnetCrossBlocksSubtypes(int ID, Material material, String[][] blocksInfo)
    {
        super(ID, material);
        //Material material = Material.ground;
        //this.setHardness(0.2F);
        //this.setResistance(0.1F);
        //this.setLightValue(1.0F);
        //this.setStepSound(Block.soundStoneFootstep);
        //this.setCreativeTab(CreativeTabs.tabDecorations);
        //setBurnProperties(par1, 60, 60);
        
        float f = 0.3F;
        this.setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, f * 3.0F, 0.5F + f);
        
        this.block_variants = blocksInfo.length;
        this.UnlocalizedNames = new String[this.block_variants];
        this.textures = new String[this.block_variants];
        this.BlockDropID = new int[this.block_variants];
        this.BlockDropMeta = new int[this.block_variants];
        this.BlockDropCount = new int[this.block_variants];
        
        for(int i = 0; i < this.block_variants; i++)
        {
            if(blocksInfo[i][0] != null) { this.UnlocalizedNames[i] = blocksInfo[i][0]; } else { this.UnlocalizedNames[i] = "Name Error"; }
            if(blocksInfo[i][1] != null) { this.textures[i] = blocksInfo[i][1]; } else { this.textures[i] = "Texture Error"; }
            if(blocksInfo[i][2] != null) { this.BlockDropID[i] = Integer.parseInt(blocksInfo[i][2]); } else { this.BlockDropID[i] = 0; }
            if(blocksInfo[i][3] != null) { this.BlockDropMeta[i] = Integer.parseInt(blocksInfo[i][3]); } else { this.BlockDropMeta[i] = 0; }
            if(blocksInfo[i][4] != null) { this.BlockDropCount[i] = Integer.parseInt(blocksInfo[i][4]); } else { this.BlockDropCount[i] = 0; }
            //Debug
            //System.out.println("SHDebug: " + this.BlocksInfo[i][0] + "; " + this.BlocksInfo[i][1] + "; " + this.BlocksInfo[i][2] + "; " + this.BlocksInfo[i][3] + "; " + this.BlocksInfo[i][4] );
        }
        
    }
    
    @Override
    public void breakBlock(World world, int x, int y, int z, int BlockID, int BlockMeta)
    {
        if (this.BlockDropCount[BlockMeta] > 0)
        {
            ItemStack SpawnedItemStack = new ItemStack(this.BlockDropID[BlockMeta], this.BlockDropCount[BlockMeta], this.BlockDropMeta[BlockMeta]);
            EntityItem SpawnedItemEntity = new EntityItem(world,x,y,z,SpawnedItemStack);
            world.spawnEntityInWorld(SpawnedItemEntity);
        }
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
        return 0;
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
        for (int sub = 0; sub < this.block_variants; ++sub)
        {
            subBlocks.add(new ItemStack(par1, 1, sub));
        }
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void registerIcons(IconRegister par1IconRegister)
    {
        this.iconArray = new Icon[this.block_variants];

        for (int i = 0; i < this.iconArray.length; ++i)
        {
            this.iconArray[i] = par1IconRegister.registerIcon(this.textures[i]);
        }
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public Icon getIcon(int par1,int par2)
    {
        return this.iconArray[par2];
    }
    
}
