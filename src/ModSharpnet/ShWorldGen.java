package ModSharpnet;

import static ModSharpnet.ModSharpnet.*;
import cpw.mods.fml.common.IWorldGenerator;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.*;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;

public class ShWorldGen implements IWorldGenerator
{
    private BiomeGenBase biome;
    private String biome_type;
    
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
    {
        if(ModSharpnet.WorldGen)
        {
            this.biome = world.getWorldChunkManager().getBiomeGenAt(chunkX*16, chunkZ*16);
            switch(world.provider.dimensionId)
            {
                case 0: OverworldGen(world, chunkX, chunkZ, random); break;
                default: break;
            }
        }
    }
    
    private void OverworldGen(World world, int chunkX, int chunkZ, Random random)
    {
        //Návod jak použít funkci pro spawnování rostlin:
        //FlowerSpawner(world, chunkX, chunkZ, random, <ZDE NÁZEV PROMĚNNÉ S ID BLOKU>, <Sem se dává meta ID (to je to druhé v eshopu za dvojtečkou)>, <minimální výška, kde se bude rostlina spawnovat>, <maximální výška, kde se bude rostlina spawnovat>, <šance že se rostlinka naspawnuje (klasicky 1)>, <zde se nastavuje zda je toto nastavená aktivní (true) nebo neaktivní (false)>);
        
            //Zde je popsáno v jakém biotopu se bude rostlinka spawnovat (Forest)
            if(BiomeDictionary.isBiomeOfType(this.biome, Type.FOREST))
            {
                this.biome_type = "FOREST";
                
                //Zde se kontroluje zda je v konfiguračním souboru povoleno spawnování Sharpneťáckých rostlinek do mapy
                if(ModSharpnet.WorldGenFlowers)
                {
                    //Sem příjdou funkce pro spawnování rostlin do lesa
                    
                    //Daffodil Flower
                        FlowerSpawner(world, chunkX, chunkZ, random, SharpnetFlowerBlocks1ID, 0, 64, 128, 1, true);
                    //Lacustrine
                        FlowerSpawner(world, chunkX, chunkZ, random, SharpnetFlowerBlocks1ID, 10, 64, 128, 1, true);
                    //Bonsai
                        FlowerSpawner(world, chunkX, chunkZ, random, SharpnetFlowerBlocks1ID, 4, 64, 128, 1, true);
                    //mech1
                        FlowerSpawner(world, chunkX, chunkZ, random, SharpnetFlowerBlocks2ID, 0, 64, 128, 1, true);
                }
            }
            if(BiomeDictionary.isBiomeOfType(this.biome, Type.PLAINS))
            {
                this.biome_type = "PLAINS";
                
                if(ModSharpnet.WorldGenFlowers)
                {
                    //Sem příjdou rostlinky, které se mají spawnovat na pláních
                    
                }          
            }
            if(BiomeDictionary.isBiomeOfType(this.biome, Type.JUNGLE))
            {
                this.biome_type = "JUNGLE";
                
                if(ModSharpnet.WorldGenFlowers)
                {
                    //Daffodil Flower
                        FlowerSpawner(world, chunkX, chunkZ, random, SharpnetFlowerBlocks1ID, 0, 64, 128, 1, true);
                    //Lacustrine
                        FlowerSpawner(world, chunkX, chunkZ, random, SharpnetFlowerBlocks1ID, 10, 64, 128, 1, true);
                    //Bonsai
                        FlowerSpawner(world, chunkX, chunkZ, random, SharpnetFlowerBlocks1ID, 4, 64, 128, 1, true);
                    //mech1
                        FlowerSpawner(world, chunkX, chunkZ, random, SharpnetFlowerBlocks2ID, 0, 64, 128, 1, true);
                }
            }
            if(BiomeDictionary.isBiomeOfType(this.biome, Type.DESERT))
            {
                this.biome_type = "DESERT";
                
                if(ModSharpnet.WorldGenFlowers)
                {
                    //Sem příjdou rostlinky, které se mají spawnovat na poušti
                    
                }  
                
                //Zde se kontroluje zda je v konfiguračním souboru povoleno spawnování Sharpneťáckých rud
                if(ModSharpnet.WorldGenOres)
                {
                    //Toto je příklad spawnování Glowstonu (89) do Stonu(1) ve výšce od 48 do 64 s šancí na naspawnování až 8 Glowstonů
                    OreSpawner(world, chunkX, chunkZ, random, 1, 89, 0, 48, 64, 8, 10, true);
                }
            }
            if(BiomeDictionary.isBiomeOfType(this.biome, Type.HILLS))
            {
                this.biome_type = "HILLS";
                
                if(ModSharpnet.WorldGenFlowers)
                {
                    //Sem příjdou rostlinky, které se mají spawnovat v kopcích
                    
                }  
            }
            //debug
            //System.out.println("ShDebug: biome: " + biome_type);
            
    }
    
    //Funkce pro spawnování rud
    private void OreSpawner(World world, int chunkX, int chunkZ, Random random, int targetBlockID, int blockID, int blockMeta, int minY, int maxY, int veinSize, int chanceToSpawn, boolean turnedOn)
    {
        if(turnedOn)
        {
            for(int i = 0; i < chanceToSpawn; i++)
            {
                int posX = (chunkX * 16) + random.nextInt(16);
                int posY = minY + random.nextInt(maxY - minY);
                int posZ = (chunkZ * 16) + random.nextInt(16);

                new WorldGenMinable(blockID, blockMeta, veinSize, targetBlockID).generate(world, random, posX, posY, posZ);
            }
        }
    }
    
    //Funkce pro spawnování rostlin
    private void FlowerSpawner(World world, int chunkX, int chunkZ, Random random, int blockID, int blockMeta, int minY, int maxY, int chanceToSpawn, boolean turnedOn)
    {
        if(turnedOn)
        {
            for(int i = 0; i < chanceToSpawn; i++)
            {
                int posX = (chunkX * 16) + random.nextInt(16);
                int posY = minY + random.nextInt(maxY - minY);
                int posZ = (chunkZ * 16) + random.nextInt(16);

                new WorldGenTallGrass(blockID, blockMeta).generate(world, random, posX, posY, posZ);
            }
        }
    }
}
