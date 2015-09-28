package ModSharpnet.Events;

import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.player.BonemealEvent;
import static ModSharpnet.ModSharpnet.SharpnetPlantsBlocks1;
import net.minecraftforge.event.Event;
import ModSharpnet.Block.SharpnetPlantsBlocks2;
import ModSharpnet.Blocks;
import ModSharpnet.SharpnetPlantsBlocks1;

public class SharpnetBonemealEvent
{
    @ForgeSubscribe
    public void bonemealUsed(BonemealEvent event)
        {
            if(event.world.getBlockId(event.X, event.Y, event.Z)== SharpnetPlantsBlocks1.blockID)
            {
                ((SharpnetPlantsBlocks1)SharpnetPlantsBlocks1).fertilize(event.world, event.X, event.Y, event.Z);
                event.setResult(Event.Result.ALLOW);
            }
            if(event.world.getBlockId(event.X, event.Y, event.Z)== Blocks.SharpnetPlantsBlocks2.blockID)
            {
                ((SharpnetPlantsBlocks2)Blocks.SharpnetPlantsBlocks2).fertilize(event.world, event.X, event.Y, event.Z);
                event.setResult(Event.Result.ALLOW);
            }
        }
}
