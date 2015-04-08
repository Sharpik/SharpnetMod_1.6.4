package ModSharpnet;

import net.minecraft.entity.passive.*;
import net.minecraft.item.Item;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.living.LivingDropsEvent;

public class SharpnetEvent_LivingDrops
{
   public static double rand;
   @ForgeSubscribe
   public void onEntityDrop(LivingDropsEvent event)
  {
    //Checks for Damage Type.
    if (event.source.getDamageType().equals("player"))
    {
        rand = Math.random();
        
        //Sheep
	if (event.entityLiving instanceof EntitySheep)
        {
            //Makes drop 100% drop chance. Example: (0.25D = 25%, 1D = 100%, etc.);
            if (rand < 1D)
            {
                event.entityLiving.dropItem(Item.bone.itemID, 2);
                event.entityLiving.dropItem(Item.leather.itemID, 2);
                event.entityLiving.dropItem(Items.mutton_raw.itemID, 1);
            }
            if (rand < 0.25D)
            {
                event.entityLiving.dropItem(Items.mutton_raw.itemID, 1);
            }
	}
        //Cow
	if (event.entityLiving instanceof EntityCow)
        {
            event.entityLiving.dropItem(Item.bone.itemID, 3);
            event.entityLiving.dropItem(Item.leather.itemID, 1);
	}
        //Pig
	if (event.entityLiving instanceof EntityPig)
        {
            event.entityLiving.dropItem(Item.bone.itemID, 2);
            event.entityLiving.dropItem(Item.leather.itemID, 2);
	}
        //Wolf
	if (event.entityLiving instanceof EntityWolf)
        {
            event.entityLiving.dropItem(Item.bone.itemID, 1);
            event.entityLiving.dropItem(Item.leather.itemID, 1);
	}
        //Ocelot
	if (event.entityLiving instanceof EntityOcelot)
        {
            event.entityLiving.dropItem(Item.bone.itemID, 1);
            event.entityLiving.dropItem(Item.leather.itemID, 1);
	}
        //Chicken
	if (event.entityLiving instanceof EntityChicken)
        {
            event.entityLiving.dropItem(Item.bone.itemID, 1);
	}
        //Horse
	if (event.entityLiving instanceof EntityHorse)
        {
            event.entityLiving.dropItem(Item.bone.itemID, 3);
            event.entityLiving.dropItem(Item.leather.itemID, 2);
	}
    }
  }
}
