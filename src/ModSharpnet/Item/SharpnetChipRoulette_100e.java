package ModSharpnet.Item;

import ModSharpnet.Blocks;
import ModSharpnet.Items;
import static ModSharpnet.ModSharpnet.modid;
import java.util.Random;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatMessageComponent;
import net.minecraft.world.World;

public class SharpnetChipRoulette_100e extends Item
{
    
    private int blockType;
    private int blockMetaData;
    
    public SharpnetChipRoulette_100e(int par1)
    {
        super(par1);
        this.setCreativeTab(CreativeTabs.tabMisc);
        this.setTextureName(modid+":resources/chip_green");
    }
    
    // Par4,5,6 are X, Y, Z
    // Par7 is the side of the block that is hit (1 == topSide)
    // floats are hitx, hity and hitz, these are the cooridantes where exactly you hit the block from 1.0F to 0.F﻿
    @Override
    public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10)
    {   
        if(!par3World.isRemote)
        {
            blockType = par3World.getBlockId(par4, par5, par6);
            if (blockType == Blocks.deco1_block.blockID)
            {
                blockMetaData = par3World.getBlockMetadata(par4, par5, par6);
                if( (blockMetaData == 7) || (blockMetaData == 8) )
                {
                    Random rand = new Random();
                    boolean random = false;
                    String color = "Red";
                    random = rand.nextBoolean();
                    if (blockMetaData == 8) { color = "Black"; }
                    if (!par3World.isRemote)
                    {
                        par2EntityPlayer.sendChatToPlayer(ChatMessageComponent.createFromText("You clicked on " + color + "rand: " + random));
                        --par1ItemStack.stackSize;
                        if(random)
                        {
                            ItemStack Itemspawn1 = new ItemStack(Items.money100eu,2);
                            EntityItem Ispawn1 = new EntityItem(par3World,par4,par5,par6,Itemspawn1);
                            par3World.spawnEntityInWorld(Ispawn1);
                            par2EntityPlayer.sendChatToPlayer(ChatMessageComponent.createFromText("You won: 200 EU!"));
                        }
                        else { par2EntityPlayer.sendChatToPlayer(ChatMessageComponent.createFromText("You lose!")); }
                        return true;
                    }
                }
                return false;
            }
        }
        return false;
    }
    
}
