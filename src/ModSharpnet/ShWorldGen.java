package ModSharpnet;

import static ModSharpnet.ModSharpnet.*;
import cpw.mods.fml.common.IWorldGenerator;
import java.util.Random;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.*;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;

public class ShWorldGen implements IWorldGenerator
{
    
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
    {
        if(ModSharpnet.WorldGen)
        {
            switch(world.provider.dimensionId)
            {
                case 0: OverworldGen(world, chunkX, chunkZ, random, world.getWorldChunkManager().getBiomeGenAt(chunkX*16, chunkZ*16) ); break;
                default: break;
            }
        }
    }
    
    private void OverworldGen(World world, int chunkX, int chunkZ, Random random, BiomeGenBase biome)
    {
        String biome_type = biome.biomeName;
        
        //debug
        //System.out.println("ShDebug: biome: " + biome_type);
        
        //Návod jak použít funkci pro spawnování rostlin:
        //FlowerSpawner(world, chunkX, chunkZ, random, <ZDE NÁZEV PROMĚNNÉ S ID BLOKU>, <Sem se dává meta ID (to je to druhé v eShopu za dvojtečkou)>, <minimální výška, kde se bude rostlina spawnovat>, <maximální výška, kde se bude rostlina spawnovat>, <šance kolikrát se rostlinka naspawnuje (klasicky 1)>, <zde se nastavuje zda je toto nastavená aktivní (true) nebo neaktivní (false)>);
        
        if (biome_type != null)
        {
            
            /* Seznam všech biotopů i s typama:
            registerBiomeType(ocean,               WATER          );
            registerBiomeType(plains,              PLAINS         );
            registerBiomeType(desert,              DESERT         );
            registerBiomeType(extremeHills,        MOUNTAIN       );
            registerBiomeType(forest,              FOREST         );
            registerBiomeType(taiga,               FOREST,  FROZEN);
            registerBiomeType(taigaHills,          FOREST,  FROZEN);
            registerBiomeType(swampland,           SWAMP          );
            registerBiomeType(river,               WATER          );
            registerBiomeType(frozenOcean,         WATER,   FROZEN);
            registerBiomeType(frozenRiver,         WATER,   FROZEN);
            registerBiomeType(icePlains,           FROZEN         );
            registerBiomeType(iceMountains,        FROZEN         );
            registerBiomeType(beach,               BEACH          );
            registerBiomeType(desertHills,         DESERT         );
            registerBiomeType(jungle,              JUNGLE         );
            registerBiomeType(jungleHills,         JUNGLE         );
            registerBiomeType(forestHills,         FOREST         );
            registerBiomeType(sky,                 END            );
            registerBiomeType(hell,                NETHER         );
            registerBiomeType(mushroomIsland,      MUSHROOM       );
            registerBiomeType(extremeHillsEdge,    MOUNTAIN       );
            registerBiomeType(mushroomIslandShore, MUSHROOM, BEACH);
            */
            
            //Zde je popsáno v jakém biotopu se bude rostlinka spawnovat (zahrnuty šechny lesní typy biotopů)
            //if(BiomeDictionary.isBiomeOfType(biome, Type.FOREST))
            if( (biome_type == "Forest") || (biome_type == "ForestHills") )
            {
                
                //Zde se kontroluje zda je v konfiguračním souboru povoleno spawnování Sharpneťáckých rostlinek do mapy
                if(ModSharpnet.WorldGenFlowers)
                {
                    //Sem příjdou funkce pro spawnování rostlin do lesa
                    
                    //Daffodil Flower
                        FlowerSpawner(world, chunkX, chunkZ, random, SharpnetFlowerBlocks1ID, 0, 58, 186, 1, false);
                    //Flora Cactus
                        FlowerSpawner(world, chunkX, chunkZ, random, SharpnetFlowerBlocks1ID, 1, 58, 186, 1, false);
                    //Fuchsia
                        FlowerSpawner(world, chunkX, chunkZ, random, SharpnetFlowerBlocks1ID, 2, 58, 186, 1, false);
                    //Sunflower
                        FlowerSpawner(world, chunkX, chunkZ, random, SharpnetFlowerBlocks1ID, 3, 58, 186, 1, false);
                    //Bonsai
                        FlowerSpawner(world, chunkX, chunkZ, random, SharpnetFlowerBlocks1ID, 4, 58, 186, 2, true);
                    //Snap Dragon
                        FlowerSpawner(world, chunkX, chunkZ, random, SharpnetFlowerBlocks1ID, 5, 58, 186, 1, false);
                    //Reddicot Flower
                        FlowerSpawner(world, chunkX, chunkZ, random, SharpnetFlowerBlocks1ID, 6, 58, 186, 1, false);
                    //Tulips
                        FlowerSpawner(world, chunkX, chunkZ, random, SharpnetFlowerBlocks1ID, 7, 58, 186, 1, false);
                    //African Daisy
                        FlowerSpawner(world, chunkX, chunkZ, random, SharpnetFlowerBlocks1ID, 8, 58, 186, 1, false);
                    //Dahilia Flower
                        FlowerSpawner(world, chunkX, chunkZ, random, SharpnetFlowerBlocks1ID, 9, 58, 186, 1, false);
                    //Lacustrine
                        FlowerSpawner(world, chunkX, chunkZ, random, SharpnetFlowerBlocks1ID, 10, 58, 186, 1, false);
                    //Yellow Dicot
                        FlowerSpawner(world, chunkX, chunkZ, random, SharpnetFlowerBlocks1ID, 11, 58, 186, 1, false);
                    //Bird of Paradise
                        FlowerSpawner(world, chunkX, chunkZ, random, SharpnetFlowerBlocks1ID, 12, 58, 186, 1, false);
                    //Okee Giant
                        FlowerSpawner(world, chunkX, chunkZ, random, SharpnetFlowerBlocks1ID, 13, 58, 186, 2, true);
                    //Mantis Shrimp
                        FlowerSpawner(world, chunkX, chunkZ, random, SharpnetFlowerBlocks1ID, 14, 58, 186, 1, false);
                    //Hedgehog Cactus
                        FlowerSpawner(world, chunkX, chunkZ, random, SharpnetFlowerBlocks1ID, 15, 58, 186, 1, false);
                        
                    //Mechus 1
                        FlowerSpawner(world, chunkX, chunkZ, random, SharpnetFlowerBlocks2ID, 0, 58, 186, 8, true);
                    //Sukulentus 1
                        FlowerSpawner(world, chunkX, chunkZ, random, SharpnetFlowerBlocks2ID, 1, 58, 186, 1, false);
                    //Sukulentus 2
                        FlowerSpawner(world, chunkX, chunkZ, random, SharpnetFlowerBlocks2ID, 2, 58, 186, 2, true);
                    //Sukulentus 3
                        FlowerSpawner(world, chunkX, chunkZ, random, SharpnetFlowerBlocks2ID, 3, 58, 186, 2, false);
                }
                
                return;
            }
            
            if(biome_type == "Plains")
            {
                
                if(ModSharpnet.WorldGenFlowers)
                {
                    //Sem příjdou rostlinky, které se mají spawnovat na pláních
                    
                    //Daffodil Flower
                        FlowerSpawner(world, chunkX, chunkZ, random, SharpnetFlowerBlocks1ID, 0, 58, 186, 1, false);
                    //Flora Cactus
                        FlowerSpawner(world, chunkX, chunkZ, random, SharpnetFlowerBlocks1ID, 1, 58, 186, 1, false);
                    //Fuchsia
                        FlowerSpawner(world, chunkX, chunkZ, random, SharpnetFlowerBlocks1ID, 2, 58, 186, 2, true);
                    //Sunflower
                        FlowerSpawner(world, chunkX, chunkZ, random, SharpnetFlowerBlocks1ID, 3, 58, 186, 9, true);
                    //Bonsai
                        FlowerSpawner(world, chunkX, chunkZ, random, SharpnetFlowerBlocks1ID, 4, 58, 186, 1, false);
                    //Snap Dragon
                        FlowerSpawner(world, chunkX, chunkZ, random, SharpnetFlowerBlocks1ID, 5, 58, 186, 2, true);
                    //Reddicot Flower
                        FlowerSpawner(world, chunkX, chunkZ, random, SharpnetFlowerBlocks1ID, 6, 58, 186, 2, true);
                    //Tulips
                        FlowerSpawner(world, chunkX, chunkZ, random, SharpnetFlowerBlocks1ID, 7, 58, 186, 2, true);
                    //African Daisy
                        FlowerSpawner(world, chunkX, chunkZ, random, SharpnetFlowerBlocks1ID, 8, 58, 186, 2, true);
                    //Dahilia Flower
                        FlowerSpawner(world, chunkX, chunkZ, random, SharpnetFlowerBlocks1ID, 9, 58, 186, 2, true);
                    //Lacustrine
                        FlowerSpawner(world, chunkX, chunkZ, random, SharpnetFlowerBlocks1ID, 10, 58, 186, 11, true);
                    //Yellow Dicot
                        FlowerSpawner(world, chunkX, chunkZ, random, SharpnetFlowerBlocks1ID, 11, 58, 186, 2, true);
                    //Bird of Paradise
                        FlowerSpawner(world, chunkX, chunkZ, random, SharpnetFlowerBlocks1ID, 12, 58, 186, 1, false);
                    //Okee Giant
                        FlowerSpawner(world, chunkX, chunkZ, random, SharpnetFlowerBlocks1ID, 13, 58, 186, 1, false);
                    //Mantis Shrimp
                        FlowerSpawner(world, chunkX, chunkZ, random, SharpnetFlowerBlocks1ID, 14, 58, 186, 1, false);
                    //Hedgehog Cactus
                        FlowerSpawner(world, chunkX, chunkZ, random, SharpnetFlowerBlocks1ID, 15, 58, 186, 1, false);
                }
                
                return;
            }
            
            if( (biome_type == "Jungle") || (biome_type == "JungleHills") )
            {
                
                if(ModSharpnet.WorldGenFlowers)
                {
                    //Daffodil Flower
                        FlowerSpawner(world, chunkX, chunkZ, random, SharpnetFlowerBlocks1ID, 0, 58, 186, 2, true);
                    //Flora Cactus
                        FlowerSpawner(world, chunkX, chunkZ, random, SharpnetFlowerBlocks1ID, 1, 58, 186, 1, false);
                    //Fuchsia
                        FlowerSpawner(world, chunkX, chunkZ, random, SharpnetFlowerBlocks1ID, 2, 58, 186, 1, false);
                    //Sunflower
                        FlowerSpawner(world, chunkX, chunkZ, random, SharpnetFlowerBlocks1ID, 3, 58, 186, 1, false);
                    //Bonsai
                        FlowerSpawner(world, chunkX, chunkZ, random, SharpnetFlowerBlocks1ID, 4, 58, 186, 1, false);
                    //Snap Dragon
                        FlowerSpawner(world, chunkX, chunkZ, random, SharpnetFlowerBlocks1ID, 5, 58, 186, 1, false);
                    //Reddicot Flower
                        FlowerSpawner(world, chunkX, chunkZ, random, SharpnetFlowerBlocks1ID, 6, 58, 186, 1, false);
                    //Tulips
                        FlowerSpawner(world, chunkX, chunkZ, random, SharpnetFlowerBlocks1ID, 7, 58, 186, 1, false);
                    //African Daisy
                        FlowerSpawner(world, chunkX, chunkZ, random, SharpnetFlowerBlocks1ID, 8, 58, 186, 2, true);
                    //Dahilia Flower
                        FlowerSpawner(world, chunkX, chunkZ, random, SharpnetFlowerBlocks1ID, 9, 58, 186, 2, true);
                    //Lacustrine
                        FlowerSpawner(world, chunkX, chunkZ, random, SharpnetFlowerBlocks1ID, 10, 58, 186, 2, true);
                    //Yellow Dicot
                        FlowerSpawner(world, chunkX, chunkZ, random, SharpnetFlowerBlocks1ID, 11, 58, 186, 1, false);
                    //Bird of Paradise
                        FlowerSpawner(world, chunkX, chunkZ, random, SharpnetFlowerBlocks1ID, 12, 58, 186, 2, true);
                    //Okee Giant
                        FlowerSpawner(world, chunkX, chunkZ, random, SharpnetFlowerBlocks1ID, 13, 58, 186, 1, false);
                    //Mantis Shrimp
                        FlowerSpawner(world, chunkX, chunkZ, random, SharpnetFlowerBlocks1ID, 14, 58, 186, 1, false);
                    //Hedgehog Cactus
                        FlowerSpawner(world, chunkX, chunkZ, random, SharpnetFlowerBlocks1ID, 15, 58, 186, 1, false);
                        
                    //Mechus 1
                        FlowerSpawner(world, chunkX, chunkZ, random, SharpnetFlowerBlocks2ID, 0, 58, 186, 1, false);
                    //Sukulentus 1
                        FlowerSpawner(world, chunkX, chunkZ, random, SharpnetFlowerBlocks2ID, 1, 58, 186, 1, false);
                    //Sukulentus 2
                        FlowerSpawner(world, chunkX, chunkZ, random, SharpnetFlowerBlocks2ID, 2, 58, 186, 1, false);
                    //Sukulentus 3
                        FlowerSpawner(world, chunkX, chunkZ, random, SharpnetFlowerBlocks2ID, 3, 58, 186, 1, false);
                }
                
                return;
            }
            
            if( (biome_type == "Desert") || (biome_type == "DesertHills") )
            {
                
                if(ModSharpnet.WorldGenFlowers)
                {
                    //Sem příjdou rostlinky, které se mají spawnovat na poušti
                    
                    //Flora Cactus
                        FlowerSpawner(world, chunkX, chunkZ, random, SharpnetFlowerBlocks1ID, 1, 58, 186, 3, true);                    
                    //Okee Giant
                        FlowerSpawner(world, chunkX, chunkZ, random, SharpnetFlowerBlocks1ID, 13, 58, 186, 2, true);                    
                    //Mantis Shrimp
                        FlowerSpawner(world, chunkX, chunkZ, random, SharpnetFlowerBlocks1ID, 14, 58, 186, 2, true);
                    //Hedgehog Cactus
                        FlowerSpawner(world, chunkX, chunkZ, random, SharpnetFlowerBlocks1ID, 15, 58, 186, 2, true);
                        
                    //Sukulentus 1
                        FlowerSpawner(world, chunkX, chunkZ, random, SharpnetFlowerBlocks2ID, 1, 58, 186, 2, true);
                    //Sukulentus 3
                        FlowerSpawner(world, chunkX, chunkZ, random, SharpnetFlowerBlocks2ID, 3, 58, 186, 2, true);
                }  
                
                //Zde se kontroluje zda je v konfiguračním souboru povoleno spawnování Sharpneťáckých rud
                if(ModSharpnet.WorldGenOres)
                {
                    //Toto je příklad spawnování Glowstonu (89) do Stonu(1) ve výšce od 48 do 64 s šancí na naspawnování až 8 Glowstonů
                    OreSpawner(world, chunkX, chunkZ, random, 1, 89, 0, 48, 64, 8, 10, true);
                }
                
                return;
            }
            
            if(biome_type == "Extreme Hills")
            {
                
                if(ModSharpnet.WorldGenFlowers)
                {
                    //Sem příjdou rostlinky, které se mají spawnovat v kopcích
                    
                    //Bonsai
                        FlowerSpawner(world, chunkX, chunkZ, random, SharpnetFlowerBlocks1ID, 4, 58, 186, 2, true);
                }
                
                return;
            }
            
            if( (biome_type == "Taiga") || (biome_type == "TaigaHills") )
            {
                
                if(ModSharpnet.WorldGenFlowers)
                {
                    //Sem příjdou rostlinky, které se mají spawnovat v Taize
                    
                    //Mechus 1
                        FlowerSpawner(world, chunkX, chunkZ, random, SharpnetFlowerBlocks2ID, 0, 58, 186, 8, true);
                }
                
                return;
            }
            
            if(biome_type == "Swampland")
            {
                
                if(ModSharpnet.WorldGenFlowers)
                {
                    //Sem příjdou rostlinky, které se mají spawnovat v kopcích
                    
                    //Mantis Shrimp
                        FlowerSpawner(world, chunkX, chunkZ, random, SharpnetFlowerBlocks1ID, 14, 58, 186, 5, true);
                }
                
                return;
            }
            
        }
            
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
    private void FlowerSpawner(World world, int chunkX, int chunkZ, Random random, int blockID, int blockMeta, int minY, int maxY, int maxCount, boolean turnedOn)
    {
        if(turnedOn)
        {
            int posX = (chunkX * 16);
            int posZ = (chunkZ * 16);
            int count = random.nextInt(maxCount);
            if (count >= 1)
            {
                new ShWorldGenFlowers().generate(world, random, blockID, blockMeta, posX, maxY, posZ, minY, count);
            }
            //System.out.println("ShDebug - spawnerG: flower: id:" + blockID + " Meta:" + blockMeta + " PosX:" + posX + " PosZ:" + posZ + " count:" + count);
            
        }
    }
}
