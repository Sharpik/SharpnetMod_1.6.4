package ModSharpnet;

import cpw.mods.fml.common.IWorldGenerator;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.*;

public class ShWorldGen implements IWorldGenerator
{

    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
    {
        if(ModSharpnet.WorldGen)
        {
            switch(world.provider.dimensionId)
            {
                case 0: OverworldGen(world, chunkX, chunkZ, random); break;
                default: break;
            }
        }
    }

    private void OverworldGen(World world, int chunkX, int chunkZ, Random random)
    {
        if(ModSharpnet.WorldGenOres)
        {
            OreSpawner(world, chunkX, chunkZ, random, 1, 89, 0, 48, 64, 8, 10, true);
        }
    }
    
    private void OreSpawner(World world, int chunkX, int chunkZ, Random random, int targetBlockID, int blockID, int blockMeta, int minY, int maxY, int veinSize, int chanceToSpawn, boolean turnedOn)
    {
        if(turnedOn)
        {
            String biome = (world.getBiomeGenForCoords(chunkX*16, chunkZ*16)).toString();
            //debug
            //System.out.println("ShDebug: biome: " + biome);

            for(int i = 0; i < chanceToSpawn; i++)
            {
                int posX = (chunkX * 16) + random.nextInt(16);
                int posY = minY + random.nextInt(maxY - minY);
                int posZ = (chunkZ * 16) + random.nextInt(16);

                new WorldGenMinable(blockID, blockMeta, veinSize, targetBlockID).generate(world, random, posX, posY, posZ);
            }
        }
    }
}
