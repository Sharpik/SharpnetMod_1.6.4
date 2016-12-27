package ModSharpnet;

import java.util.Arrays;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class ShWorldGenFlowers
{
    private int BlockFlowerID;
    private int BlockFlowerMetadata;
    private int count;

    public ShWorldGenFlowers(int par1, int par2, int count)
    {
        this.BlockFlowerID = par1;
        this.BlockFlowerMetadata = par2;
        this.count = count;
    }

    public boolean generate(World par1World, Random par2Random, int par3, int maxY, int par5, int minY)
    {
        if(maxY > 250 ) maxY = 250;
        if(maxY < 1 ) maxY = 2;
        if(minY > 250 ) minY = 250;
        if(minY < 1 ) minY = 1;
        
        boolean spawned = false;
        int posY;
        int[] allowedReplacemants = {18, 31, 78};
        
        for (int i1 = 0; i1 < this.count; ++i1)
        {
            posY = minY + par2Random.nextInt(maxY - minY);
            par3 = par3 + par2Random.nextInt(8) - par2Random.nextInt(8);
            par5 = par5 + par2Random.nextInt(8) - par2Random.nextInt(8);
            
            Block block = null;

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
                int orginID = par1World.getBlockId(par3, posY, par5);
                
                if ( par1World.isAirBlock(par3, posY, par5) || Arrays.asList(allowedReplacemants).contains(orginID) )
                {
                    int orginMeta = par1World.getBlockMetadata(par3, posY, par5);
                    
                    par1World.setBlock(par3, posY, par5, this.BlockFlowerID, this.BlockFlowerMetadata, 2);
                    
                    if(!Block.blocksList[this.BlockFlowerID].canBlockStay(par1World, par3, posY, par5))
                    {
                        par1World.setBlock(par3, posY, par5, orginID, orginMeta, 2);
                    }
                    else spawned = true;
                }
            }

        }
        if (spawned) return true;
        return false;
    }
}
