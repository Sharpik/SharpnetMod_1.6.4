package ModSharpnet;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class ShWorldGenFlowers extends WorldGenerator
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

    public boolean generate(World par1World, Random par2Random, int par3, int par4, int par5)
    {
        Block block = null;
        do 
        {
            block = Block.blocksList[par1World.getBlockId(par3,  par4, par5)];
            if (block != null && !block.isLeaves(par1World, par3, par4, par5))
            {
                break;
            }
            par4--;
        } while (par4 > 0);

        for (int i1 = 0; i1 < this.count; ++i1)
        {
            int j1 = par3 + par2Random.nextInt(8) - par2Random.nextInt(8);
            int k1 = par4 + par2Random.nextInt(4) - par2Random.nextInt(4);
            int l1 = par5 + par2Random.nextInt(8) - par2Random.nextInt(8);

            if (par1World.isAirBlock(j1, k1, l1) && Block.blocksList[this.BlockFlowerID].canBlockStay(par1World, j1, k1, l1))
            {
                par1World.setBlock(j1, k1, l1, this.BlockFlowerID, this.BlockFlowerMetadata, 2);
            }
        }

        return true;
    }
}
