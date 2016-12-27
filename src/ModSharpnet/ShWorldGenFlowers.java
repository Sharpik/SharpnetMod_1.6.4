package ModSharpnet;

import java.util.Arrays;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.world.World;

public class ShWorldGenFlowers
{

    public ShWorldGenFlowers(){}

    public boolean generate(World par1World, Random par2Random,int BlockFlowerID, int BlockFlowerMetadata, int par3, int maxY, int par5, int minY, int count)
    {
        if(maxY > 250 ) maxY = 250;
        if(maxY < 1 ) maxY = 2;
        if(minY > 250 ) minY = 250;
        if(minY < 1 ) minY = 1;
        
        boolean spawned = false;
        int posY;
        Integer[] allowedReplacemants = {18, 31, 78};
        
        for (int i1 = 0; i1 < count; ++i1)
        {
            posY = maxY;
            par3 = par3 + par2Random.nextInt(8) - par2Random.nextInt(8);
            par5 = par5 + par2Random.nextInt(8) - par2Random.nextInt(8);
            
            Block block = null;
            
            //System.out.println("ShDebug - spawner: flower: id:" + BlockFlowerID + " Meta:" + BlockFlowerMetadata + " PosX:" + par3 + " PosYmax:" + maxY + " PosZ:" + par5 + " count:" + count);

            do 
            {
                block = Block.blocksList[par1World.getBlockId(par3, posY, par5)];
                if (block != null && !block.isLeaves(par1World, par3, posY, par5))
                {
                    break;
                }
                posY--;
            } while (posY > minY);

            if (posY >= minY)
            {
                //System.out.println("ShDebug - spawner: posY >= minY");
                
                int orginID = par1World.getBlockId(par3, posY, par5);
                
                if ( par1World.isAirBlock(par3, posY, par5) || Arrays.asList(allowedReplacemants).contains(orginID) )
                {
                    int orginMeta = par1World.getBlockMetadata(par3, posY, par5);
                    
                    par1World.setBlock(par3, posY, par5, BlockFlowerID, BlockFlowerMetadata, 2);
                    
                    //System.out.println("ShDebug - spawner: Flower spawned: x:" + par3 +" y:"+ posY +" z:"+ par5);
                    
                    if(!Block.blocksList[BlockFlowerID].canBlockStay(par1World, par3, posY, par5))
                    {
                        par1World.setBlock(par3, posY, par5, orginID, orginMeta, 2);
                    }
                    else
                    {
                        spawned = true;
                    }
                    //System.out.println("ShDebug - spawner: count: " + i1);
                }
            }

        }
        if (spawned)
        {
            //System.out.println("ShDebug - spawner: TRUE");
            return true;
        }
        //System.out.println("ShDebug - spawner: FALSE");
        return false;
    }
}
