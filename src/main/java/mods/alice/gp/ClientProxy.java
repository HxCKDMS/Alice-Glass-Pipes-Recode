package mods.alice.gp;

import buildcraft.transport.TransportProxyClient;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.client.MinecraftForgeClient;

public final class ClientProxy extends ServerProxy {
  public void forgeInitialization(FMLInitializationEvent event) {
    MinecraftForgeClient.registerItemRenderer(GlassPipe.INSTANCE.pipeItemGlass, TransportProxyClient.pipeItemRenderer);
  }
}
