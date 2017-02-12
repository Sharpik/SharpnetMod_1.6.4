package ModSharpnet;

import static ModSharpnet.ModSharpnet.modid;
import static ModSharpnet.ModSharpnet.SharpnetCorn;
import static ModSharpnet.ModSharpnet.SharpnetCornSeeds;
import static ModSharpnet.ModSharpnet.SharpnetCucumber;
import static ModSharpnet.ModSharpnet.SharpnetCucumberSeeds;
import static ModSharpnet.ModSharpnet.SharpnetFlaxSeeds;
import static ModSharpnet.ModSharpnet.SharpnetTomato;
import static ModSharpnet.ModSharpnet.SharpnetTomatoSeeds;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import java.util.Random;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;

import net.minecraft.item.Item;
import net.minecraft.block.Block;
import static net.minecraft.block.Block.blocksList;
import net.minecraft.block.BlockFlower;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeDirection;


public class SharpnetPlantsBlocks1 extends BlockFlower
{

    public SharpnetPlantsBlocks1(int par1, Material par2Material)
    {
        super(par1, par2Material);
        this.setTickRandomly(true);
        float f = 0.5F;
        this.setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, 0.25F, 0.5F + f);
        this.setCreativeTab((CreativeTabs)null);
        //this.setCreativeTab(CreativeTabs.tabFood);
        this.setUnlocalizedName("SharpnetPlantsBlocks1");
        this.setHardness(0.0F).setStepSound(Block.soundGrassFootstep);
        this.setResistance(0.0F);
        this.disableStats();
    }
    
    // TADY ZMENIT POCET VARIANT 1 - 16
    public static int pocet = 15;
    public int dropID = this.blockID;
    public int dropMeta = 0;
    public int blockMetaData = 0;
    private int itemInHandMeta = 0;
    private int itemInHandID = 0;
    
    @Override
    protected boolean canThisPlantGrowOnThisBlockID(int par1)
    {
        if (par1 == Block.tilledField.blockID) {return true;}
        if ( (par1 == 2) && (blockMetaData == 12) ) {return true;}
        return false;
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
            
            // First plant Tomato
            if (meta < 2)
            {
                maxgrowing = 45.F;
                if (par5Random.nextInt((int)(maxgrowing / f) + 1) == 0)
                {
                    ++meta;
                    par1World.setBlockMetadataWithNotify(par2, par3, par4, meta, 2);
                }
            }
            // Secound plant Cucumber
            if ((meta > 2) && (meta < 5))
            {
                maxgrowing = 45.F;
                if (par5Random.nextInt((int)(maxgrowing / f) + 1) == 0)
                {
                    ++meta;
                    par1World.setBlockMetadataWithNotify(par2, par3, par4, meta, 2);
                }
            }
            // Third plant Corn
            if ((meta > 5) && (meta < 8))
            {
                maxgrowing = 55.0F;
                if (par5Random.nextInt((int)(maxgrowing / f) + 1) == 0)
                {
                    ++meta;
                    par1World.setBlockMetadataWithNotify(par2, par3, par4, meta, 2);
                }
            }
            // Fourth plant Flax
            if ((meta > 8) && (meta < 11))
            {
                maxgrowing = 55.0F;
                if (par5Random.nextInt((int)(maxgrowing / f) + 1) == 0)
                {
                    ++meta;
                    par1World.setBlockMetadataWithNotify(par2, par3, par4, meta, 2);
                }
            }
            // Fifth plant Vine
            if ((meta > 11) && (meta < 14))
            {
                maxgrowing = 75.0F;
                if (par5Random.nextInt((int)(maxgrowing / f) + 1) == 0)
                {
                    ++meta;
                    par1World.setBlockMetadataWithNotify(par2, par3, par4, meta, 2);
                }
            }
            
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
        return 6;
    }

    /**
    * ejects contained items into the world, and notifies neighbours of an update, as appropriate
    */
    @Override
    public void breakBlock(World world, int x, int y, int z, int par5, int par6)
    {
        blockMetaData = world.getBlockMetadata(x, y, z);
        
        //Náhradní item spawn pro Flax - 2 itemy
        if (blockMetaData == 11)
        {
            ItemStack Itemspawn1 = new ItemStack(SharpnetFlaxSeeds,2);
            ItemStack Itemspawn2 = new ItemStack(Item.silk,3);
            EntityItem Ispawn1 = new EntityItem(world,x,y,z,Itemspawn1);
            EntityItem Ispawn2 = new EntityItem(world,x,y,z,Itemspawn2);
            if (!world.isRemote)
            {
                world.spawnEntityInWorld(Ispawn1);
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
            //Tomato 0 - 2 meta
            case 0: dropID = SharpnetTomatoSeeds.itemID; break;
            case 1: dropID = SharpnetTomatoSeeds.itemID; break;
            case 2: dropID = SharpnetTomato.itemID; break;
            //Cucumber 3 - 5 meta
            case 3: dropID = SharpnetCucumberSeeds.itemID; break;
            case 4: dropID = SharpnetCucumberSeeds.itemID; break;
            case 5: dropID = SharpnetCucumber.itemID; break;
            //Corn 6 - 8 meta
            case 6: dropID = SharpnetCornSeeds.itemID; break;
            case 7: dropID = SharpnetCornSeeds.itemID; break;
            case 8: dropID = SharpnetCorn.itemID; break;
            //Flax 9 - 11 meta
            case 9: dropID = SharpnetFlaxSeeds.itemID; break;
            case 10: dropID = SharpnetFlaxSeeds.itemID; break;
            case 11: dropID = SharpnetFlaxSeeds.itemID; break;
            //Vine_red 12 - 14 meta
            case 12: dropID = Items.grape_red_seeds.itemID; break;
            case 13: dropID = Items.grape_red_seeds.itemID; break;
            case 14: dropID = Items.grape_red.itemID; break;
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
        { itemInHandID = par5EntityPlayer.getCurrentEquippedItem().itemID; }
        
            if ( (itemInHandID == 351) && (itemInHandMeta == 15) )
                {
                    switch (blockMetaData)
                    {
                        case 2: par5EntityPlayer.inventory.getCurrentItem().stackSize++; break;
                        case 5: par5EntityPlayer.inventory.getCurrentItem().stackSize++; break;
                        case 8: par5EntityPlayer.inventory.getCurrentItem().stackSize++; break;
                        case 11: par5EntityPlayer.inventory.getCurrentItem().stackSize++; break;
                        case 14: par5EntityPlayer.inventory.getCurrentItem().stackSize++; break;
                    }
                    return false;
                }
        
        //Tomato drop
        if( blockMetaData == 2)
        {
            ItemStack Itemspawn1 = new ItemStack(SharpnetTomato,quantityDropped(rand));
            EntityItem Ispawn1 = new EntityItem(par1World,par2,par3,par4,Itemspawn1);
            if (!par1World.isRemote)
            {
                par1World.spawnEntityInWorld(Ispawn1);
                par1World.setBlock(par2, par3 , par4, this.blockID, 1, 2);
                return true;
            }
        }
        
        //Vine drop
        if( blockMetaData == 14)
        {
            ItemStack Itemspawn1 = new ItemStack(Items.grape_red,quantityDropped(rand));
            EntityItem Ispawn1 = new EntityItem(par1World,par2,par3,par4,Itemspawn1);
            if (!par1World.isRemote)
            {
                par1World.spawnEntityInWorld(Ispawn1);
                par1World.setBlock(par2, par3 , par4, this.blockID, 13, 2);
                return true;
            }
        }
        
        //if (itemInHandID == blackPainterID){par1World.setBlock(par2, par3 , par4, SharpnetRoadsBlocks1.blockID, 2, 2); damageItemInHands(par5EntityPlayer,painterID);}
        return false;
    }
    
    protected int getSeedItem()
    {
        /*
        if(blockMetaData <= 2){getDroping(SharpnetTomato.itemID,0);}
        if((blockMetaData >= 3) && (blockMetaData <= 5)){getDroping(SharpnetCucumber.itemID,0);}
        if((blockMetaData >= 6) && (blockMetaData <= 8)){getDroping(SharpnetCorn.itemID,0);}
        if((blockMetaData >= 9) && (blockMetaData <= 1)){getDroping(SharpnetCorn.itemID,0);}
        */
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
        
        if(blockMetaData == 2){max = 3;}
        if(blockMetaData == 5){max = 3;}
        if(blockMetaData == 8){max = 3;}
        if(blockMetaData == 11){min = 0; max = 0;}
        if(blockMetaData == 14){max = 3;}
        
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
                case 0:{icons[i] = par1.registerIcon(modid+":plants/pla_tomato_1");break;}
                case 1:{icons[i] = par1.registerIcon(modid+":plants/pla_tomato_2");break;}
                case 2:{icons[i] = par1.registerIcon(modid+":plants/pla_tomato_3");break;}
                case 3:{icons[i] = par1.registerIcon(modid+":plants/pla_cucumber_1");break;}
                case 4:{icons[i] = par1.registerIcon(modid+":plants/pla_cucumber_2");break;}
                case 5:{icons[i] = par1.registerIcon(modid+":plants/pla_cucumber_3");break;}
                case 6:{icons[i] = par1.registerIcon(modid+":plants/pla_corn1");break;}
                case 7:{icons[i] = par1.registerIcon(modid+":plants/pla_corn2");break;}
                case 8:{icons[i] = par1.registerIcon(modid+":plants/pla_corn3");break;}
                case 9:{icons[i] = par1.registerIcon(modid+":plants/flax_1");break;}
                case 10:{icons[i] = par1.registerIcon(modid+":plants/flax_4");break;}
                case 11:{icons[i] = par1.registerIcon(modid+":plants/flax_5.2");break;}
                case 12:{icons[i] = par1.registerIcon(modid+":plants/vine_red_fence_1");break;}
                case 13:{icons[i] = par1.registerIcon(modid+":plants/vine_red_fence_2");break;}
                case 14:{icons[i] = par1.registerIcon(modid+":plants/vine_red_fence_3");break;}
                /*case 15:{icons[i] = par1.registerIcon(modid+":tiles_wood/tile16");break;}*/
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
            if (ModSharpnet.SHdebug == true) System.out.println("SharpnetMod Plant Block 1: Icon Reg Meta:" + metadata + " pocet: " + pocet);
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
