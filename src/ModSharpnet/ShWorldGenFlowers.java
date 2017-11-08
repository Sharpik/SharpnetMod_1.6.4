package ModSharpnet;

import java.util.Arrays;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.world.World;

public class ShWorldGenFlowers
{

    public ShWorldGenFlowers(){}

    public boolean generate(World par1World, Random par2Random,int BlockFlowerID, int BlockFlowerMetadata, int posX, int maxY, int posZ, int minY, int count)
    {
        if(maxY > 250 ) maxY = 250;
        if(maxY < 1 ) maxY = 2;
        if(minY > 250 ) minY = 250;
        if(minY < 1 ) minY = 1;
        
        boolean spawned = false;
        int posY;
        Integer[] allowedReplacemants = {18, 31, 32, 78, 106};
        
        for (int i1 = 0; i1 < count; ++i1)
        {
            posY = 255;
            posX = posX + par2Random.nextInt(8) - par2Random.nextInt(8);
            posZ = posZ + par2Random.nextInt(8) - par2Random.nextInt(8);
            
            Block block = null;
            
            //System.out.println("ShDebug - spawner: flower: id:" + BlockFlowerID + " Meta:" + BlockFlowerMetadata + " PosX:" + posX + " PosYmax:" + maxY + " PosZ:" + posZ + " count:" + count);

            do 
            {
                block = Block.blocksList[par1World.getBlockId(posX, posY, posZ)];
                if (block != null && !(block.isLeaves(par1World, posX, posY, posZ) || (par1World.getBlockId(posX, posY, posZ) == (Block.wood.blockID))) )
                {
                    break;
                }
                posY--;
            } while (posY > minY);
            
            int orginID = par1World.getBlockId(posX, posY, posZ);
            
            if (!Arrays.asList(allowedReplacemants).contains(orginID))
            {
                posY++;
                orginID = par1World.getBlockId(posX, posY, posZ);
            }
            
            int orginMeta = par1World.getBlockMetadata(posX, posY, posZ);

            if ((posY >= minY) && (posY <= maxY))
            {
                
                //System.out.println("ShDebug - spawner: posY-"+posY+" ID-"+orginID);
                
                if ( par1World.isAirBlock(posX, posY, posZ) || Arrays.asList(allowedReplacemants).contains(orginID) )
                {

                    par1World.setBlock(posX, posY, posZ, BlockFlowerID, BlockFlowerMetadata, 2);
                    
                    //System.out.println("ShDebug - spawner: Flower spawned: x:" + par3 +" y:"+ posY +" z:"+ par5);
                    
                    if(!Block.blocksList[BlockFlowerID].canBlockStay(par1World, posX, posY, posZ))
                    {
                        par1World.setBlock(posX, posY, posZ, orginID, orginMeta, 2);
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
