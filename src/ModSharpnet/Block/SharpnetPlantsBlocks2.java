package ModSharpnet.Block;

import ModSharpnet.Items;
import static ModSharpnet.ModSharpnet.modid;
import static ModSharpnet.ModSharpnet.SHdebug;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import java.util.Random;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;

import net.minecraft.block.Block;
import static net.minecraft.block.Block.blocksList;
import net.minecraft.block.BlockFlower;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeDirection;


public class SharpnetPlantsBlocks2 extends BlockFlower
{
    // TADY ZMENIT POCET VARIANT 1 - 16
    public static int pocet = 9;
    
    public SharpnetPlantsBlocks2(int par1, Material par2Material)
    {
        super(par1, par2Material);
        this.setTickRandomly(true);
        float f = 0.5F;
        this.setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, 0.25F, 0.5F + f);
        this.setCreativeTab((CreativeTabs)null);
        //this.setCreativeTab(CreativeTabs.tabFood);
        this.setUnlocalizedName("SharpnetPlantsBlocks2");
        this.setHardness(0.0F).setStepSound(Block.soundGrassFootstep);
        this.setResistance(0.0F);
        this.disableStats();
    }
    
    public int dropID = this.blockID;
    public int dropMeta = 0;
    public int blockMetaData = 0;
    private int itemInHandID = 0;
    private int itemInHandMeta = 0;
    private boolean secondaryDrop = true;
    
    @Override
    protected boolean canThisPlantGrowOnThisBlockID(int par1)
    {
        return par1 == Block.tilledField.blockID;
    }
    
    @Override
    public void updateTick(World par1World, int par2, int par3, int par4, Random par5Random)
    {
        super.updateTick(par1World, par2, par3, par4, par5Random);

        if (par1World.getBlockLightValue(par2, par3 + 1, par4) >= 9)
        {
            int meta = par1World.getBlockMetadata(par2, par3, par4);
            float f = this.getGrowthRate(par1World, par2, par3, par4);
             // f = modifikace růstu rostlin
            double maxgrowing = 50.F;
            
            // First plant Tea
            if (meta < 2)
            {
                maxgrowing = 60.F;
                if (par5Random.nextInt((int)(maxgrowing / f) + 1) == 0)
                {
                    ++meta;
                    par1World.setBlockMetadataWithNotify(par2, par3, par4, meta, 2);
                }
            }
            
            // Secound plant Cofee
            if ((meta > 2) && (meta < 5))
            {
                maxgrowing = 70.F;
                if (par5Random.nextInt((int)(maxgrowing / f) + 1) == 0)
                {
                    ++meta;
                    par1World.setBlockMetadataWithNotify(par2, par3, par4, meta, 2);
                }
            }
            // Third plant Vine
            if ((meta > 5) && (meta < 8))
            {
                maxgrowing = 75.0F;
                if (par5Random.nextInt((int)(maxgrowing / f) + 1) == 0)
                {
                    ++meta;
                    par1World.setBlockMetadataWithNotify(par2, par3, par4, meta, 2);
                }
            }
            /*
            // Fourth plant Flax
            if ((meta > 8) && (meta < 11))
            {
                maxgrowing = 40.0F;
                if (par5Random.nextInt((int)(maxgrowing / f) + 1) == 0)
                {
                    ++meta;
                    par1World.setBlockMetadataWithNotify(par2, par3, par4, meta, 2);
                }
            }
            // Fifth plant
            if ((meta > 11) && (meta < 14))
            {

                if (par5Random.nextInt((int)(maxgrowing / f) + 1) == 0)
                {
                    ++meta;
                    par1World.setBlockMetadataWithNotify(par2, par3, par4, meta, 2);
                }
            }
            */
        }
    }
    
    // Tato funkce hledá přívětivé věci pro růst rostlin (místo, světlo, sousední rostliny).
    private float getGrowthRate(World par1World, int par2, int par3, int par4)
    {
        float f = 1.0F;
        int l = par1World.getBlockId(par2, par3, par4 - 1);
        int i1 = par1World.getBlockId(par2, par3, par4 + 1);
        int j1 = par1World.getBlockId(par2 - 1, par3, par4);
        int k1 = par1World.getBlockId(par2 + 1, par3, par4);
        int l1 = par1World.getBlockId(par2 - 1, par3, par4 - 1);
        int i2 = par1World.getBlockId(par2 + 1, par3, par4 - 1);
        int j2 = par1World.getBlockId(par2 + 1, par3, par4 + 1);
        int k2 = par1World.getBlockId(par2 - 1, par3, par4 + 1);
        boolean flag = j1 == this.blockID || k1 == this.blockID;
        boolean flag1 = l == this.blockID || i1 == this.blockID;
        boolean flag2 = l1 == this.blockID || i2 == this.blockID || j2 == this.blockID || k2 == this.blockID;

        for (int l2 = par2 - 1; l2 <= par2 + 1; ++l2)
        {
            for (int i3 = par4 - 1; i3 <= par4 + 1; ++i3)
            {
                int j3 = par1World.getBlockId(l2, par3 - 1, i3);
                float f1 = 0.0F;

                if (blocksList[j3] != null && blocksList[j3].canSustainPlant(par1World, l2, par3 - 1, i3, ForgeDirection.UP, this))
                {
                    f1 = 1.0F;

                    if (blocksList[j3].isFertile(par1World, l2, par3 - 1, i3))
                    {
                        f1 = 3.0F;
                    }
                }

                if (l2 != par2 || i3 != par4)
                {
                    f1 /= 4.0F;
                }

                f += f1;
            }
        }

        if (flag2 || flag && flag1)
        {
            f /= 2.0F;
        }

        return f;
    }
    
    public void fertilize(World par1World, int par2, int par3, int par4)
    {
        int meta = par1World.getBlockMetadata(par2, par3, par4);

        if ((meta < 2))
        {
            meta = 2;
        }
        if ((meta > 2) && (meta < 5))
        {
            meta = 5;
        }
        if ((meta > 5) && (meta < 8))
        {
            meta = 8;
        }
        if ((meta > 8) && (meta < 11))
        {
            meta = 11;
        }
        if ((meta > 11) && (meta < 14))
        {
            meta = 14;
        }

        par1World.setBlockMetadataWithNotify(par2, par3, par4, meta, 2);
    }
    
    @Override
    public int getRenderType()
    {
        return 1;
    }

    /**
    * ejects contained items into the world, and notifies neighbours of an update, as appropriate
    */
    @Override
    public void breakBlock(World world, int x, int y, int z, int par5, int par6)
    {
        blockMetaData = world.getBlockMetadata(x, y, z);
        
        //Náhradní item spawn pro Tea - 2 itemy
        if (blockMetaData == 2)
        {
            Random rand = new Random();
            int randomNum = rand.nextInt((3 - 1) + 1) + 1;
        
            ItemStack Itemspawn1 = new ItemStack(Items.tea_seeds,2);
            ItemStack Itemspawn2 = new ItemStack(Items.tea_leaves,randomNum);
            EntityItem Ispawn1 = new EntityItem(world,x,y,z,Itemspawn1);
            EntityItem Ispawn2 = new EntityItem(world,x,y,z,Itemspawn2);
            if (!world.isRemote)
            {
                if (secondaryDrop) {world.spawnEntityInWorld(Ispawn1);}
                secondaryDrop = true;
                world.spawnEntityInWorld(Ispawn2);
            }
        }
    }
        
    public int getDroping(int ID,int metadata)
    {
        if(ID != 0){dropID = ID;}
        if(metadata == 0){metadata = blockMetaData;}
        switch(metadata)
        {
            //Tea 0 - 2 meta
            case 0: dropID = Items.tea_seeds.itemID; break;
            case 1: dropID = Items.tea_seeds.itemID; break;
            //case 2: dropID = Items.tea_leaves.itemID; break;
            case 2: dropID = 0; break;
                
            //Cofee 3 - 5 meta
            case 3: dropID = Items.cofee_beans_raw.itemID; break;
            case 4: dropID = Items.cofee_beans_raw.itemID; break;
            case 5: dropID = Items.cofee_beans_raw.itemID; break;
            
            //Corn 6 - 8 meta
            case 6: dropID = Items.grape_white_seeds.itemID; break;
            case 7: dropID = Items.grape_white_seeds.itemID; break;
            case 8: dropID = Items.grape_white.itemID; break;
            /*            
            //Flax 9 - 11 meta
            case 9: dropID = SharpnetFlaxSeeds.itemID; break;
            case 10: dropID = SharpnetFlaxSeeds.itemID; break;
            case 11: dropID = SharpnetFlaxSeeds.itemID; break;
            */
            //Tea 12 - 14 meta
            /*
            case 12: dropID = SharpnetFlaxSeeds.itemID; break;
            case 13: dropID = SharpnetFlaxSeeds.itemID; break;
            case 14: dropID = SharpnetFlaxSeeds.itemID; break;*/
        }
        return dropMeta;
    }
    
    @Override
    public boolean onBlockActivated(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9)
    {
        blockMetaData = par1World.getBlockMetadata(par2, par3, par4);
        //System.out.println("SHdebug: Player " + par5EntityPlayer.getDisplayName() +" clicked on block with META: " + blockMetaData);
        Random rand = new Random();
        itemInHandID = 0;
        
        if ((par5EntityPlayer.getCurrentEquippedItem()) != null)
        { itemInHandID = par5EntityPlayer.getCurrentEquippedItem().itemID; itemInHandMeta = par5EntityPlayer.getCurrentEquippedItem().getItemDamage(); }
        
            if ( (itemInHandID == 351) && (itemInHandMeta == 15) )
                {
                    switch (blockMetaData)
                    {
                        case 2: par5EntityPlayer.inventory.getCurrentItem().stackSize++; break;
                        case 5: par5EntityPlayer.inventory.getCurrentItem().stackSize++; break;
                        case 8: par5EntityPlayer.inventory.getCurrentItem().stackSize++; break;
                    }
                    return false;
                }

            //Tea drop
            if( blockMetaData == 2)
            {
                if (!par1World.isRemote)
                {
                    secondaryDrop = false;
                    par1World.setBlock(par2, par3 , par4, this.blockID, 1, 2);
                    return true;
                }
            }

            //Coffee drop
            if( blockMetaData == 5)
            {
                ItemStack Itemspawn1 = new ItemStack(Items.cofee_beans_raw,quantityDropped(rand));
                EntityItem Ispawn1 = new EntityItem(par1World,par2,par3,par4,Itemspawn1);
                if (!par1World.isRemote)
                {
                    par1World.spawnEntityInWorld(Ispawn1);
                    par1World.setBlock(par2, par3 , par4, this.blockID, 4, 2);
                    return true;
                }
            }
            
            //Vine drop
            if( blockMetaData == 8)
            {
                ItemStack Itemspawn1 = new ItemStack(Items.grape_white,quantityDropped(rand));
                EntityItem Ispawn1 = new EntityItem(par1World,par2,par3,par4,Itemspawn1);
                if (!par1World.isRemote)
                {
                    par1World.spawnEntityInWorld(Ispawn1);
                    par1World.setBlock(par2, par3 , par4, this.blockID, 7, 2);
                    return true;
                }
            }

        //if (itemInHandID == blackPainterID){par1World.setBlock(par2, par3 , par4, SharpnetRoadsBlocks1.blockID, 2, 2); damageItemInHands(par5EntityPlayer,painterID);}
        return false;
    }
    
    protected int getSeedItem()
    {
        getDroping(0,0);
        return dropID;
    }
    
    protected int getCropItem()
    {
        getDroping(0,0);
        return dropID;
    }
    
    @Override
    public int idPicked(World par1World, int par2, int par3, int par4)
    {
        getDroping(0,0);
        return dropID;
    }
    
    
    @Override
    public int idDropped (int par1, Random par2Random, int par3)
    {
        getDroping(0,0);
        return dropID;
    }
    
    @Override
    public int damageDropped (int metadata)
    {
        getDroping(0,metadata);   
        return dropMeta;
    }
    
    @Override
    public int quantityDropped(Random par1Random)
    {
        int min = 1;
        int max = 1;
        
        if(blockMetaData == 2){min = 0; max = 0;}
        if(blockMetaData == 5){min = 2; max = 4;}
        if(blockMetaData == 8){max = 3;}
        /*
        if(blockMetaData == 11){min = 0; max = 0;}
        if(blockMetaData == 14){max = 3;}
        */
        
        Random rand = new Random();
        int randomNum = rand.nextInt((max - min) + 1) + min;
        //randomNum = Math.floor(randomNum);
        return randomNum;
    }
    
    @SideOnly(Side.CLIENT)
    private Icon[] icons;
    
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister par1)
    {
        icons = new Icon[pocet];
        
        for (int i = 0; i < icons.length; i++)
        {
            switch(i)
            {
                //Registrace textur
                case 0:{icons[i] = par1.registerIcon(modid+":plants/tea_1");break;}
                case 1:{icons[i] = par1.registerIcon(modid+":plants/tea_2");break;}
                case 2:{icons[i] = par1.registerIcon(modid+":plants/tea_3");break;}
                case 3:{icons[i] = par1.registerIcon(modid+":plants/cofee_1");break;}
                case 4:{icons[i] = par1.registerIcon(modid+":plants/cofee_2");break;}
                case 5:{icons[i] = par1.registerIcon(modid+":plants/cofee_3");break;}
                case 6:{icons[i] = par1.registerIcon(modid+":plants/vine_white_fence_1");break;}
                case 7:{icons[i] = par1.registerIcon(modid+":plants/vine_white_fence_2");break;}
                case 8:{icons[i] = par1.registerIcon(modid+":plants/vine_white_fence_3");break;}
                /*
                case 9:{icons[i] = par1.registerIcon(modid+":plants/flax_1");break;}
                case 10:{icons[i] = par1.registerIcon(modid+":plants/flax_4");break;}
                case 11:{icons[i] = par1.registerIcon(modid+":plants/flax_5.2");break;}
                case 12:{icons[i] = par1.registerIcon(modid+":tiles_wood/DP9");break;}
                case 13:{icons[i] = par1.registerIcon(modid+":tiles_wood/tile14");break;}
                case 14:{icons[i] = par1.registerIcon(modid+":tiles_wood/tile15");break;}
                case 15:{icons[i] = par1.registerIcon(modid+":tiles_wood/tile16");break;}*/
                default:{icons[i] = par1.registerIcon(modid+":error");break;}
            }
        }
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public Icon getIcon(int side,int metadata)
    {
        if (metadata < pocet)
        {
            //debug
            if (SHdebug == true) System.out.println("SharpnetMod Plant Block 2: Icon Reg Meta:" + metadata);
            return icons[metadata];
        }
        return null;
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public void getSubBlocks(int par1, CreativeTabs par2CreativeTabs, List par3List)
    {
        
        for(int i = 0; i < pocet; i++)
        {
            par3List.add(new ItemStack(par1, 1, i));
        }
        
        /*
        //Registrace Bloků do creative tabu
        par3List.add(new ItemStack(par1, 1, 0));
        par3List.add(new ItemStack(par1, 1, 3));
        par3List.add(new ItemStack(par1, 1, 6));
        */
    }
    
}
