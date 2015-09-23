package ModSharpnet;

import net.minecraftforge.common.MinecraftForge;

  public class ClientProxy extends CommonProxy
  {
    public void registerRenderInformation()
    {
        MinecraftForge.EVENT_BUS.register(new Sound());
    }
  }
