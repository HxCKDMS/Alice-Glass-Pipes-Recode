package mods.alice.gp;
// This is in no way the work of Mandrake and Dr.Zed and the original author is free to use what I contributed.
import buildcraft.core.BCCreativeTab;
import buildcraft.transport.BlockGenericPipe;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.ModMetadata;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import mods.alice.gp.transport.pipe.PipeItemsGlass;
import net.minecraft.item.Item;

@Mod(modid="bc_glasspipe", name="Glass Pipes Mod", version="0.1a", dependencies="required-after:Forge@[10.13.2.1230,);required-after:BuildCraft|Transport")
public final class GlassPipe {
    
    @Mod.Instance("bc_glasspipe")
    public static GlassPipe INSTANCE;
    
    // Not certain what this does (if anyone knows please do say)
    @Mod.Metadata("bc_glasspipe")
    private ModMetadata meta;
    //
    @SidedProxy(clientSide="mods.alice.gp.ClientProxy", serverSide="mods.alice.gp.ServerProxy")
    public static ServerProxy PROXY;
    public Item pipeItemGlass;

    @Mod.EventHandler
    public void forgePreInitialization(FMLPreInitializationEvent event) {
        meta.description = "Adds frictionless item transport pipes for BuildCraft.";
        meta.url = "http://a1lic.net/";
        meta.authorList.add("alice");
        meta.credits = "alice";
        meta.autogenerated = false;
        pipeItemGlass = BlockGenericPipe.registerPipe(PipeItemsGlass.class, BCCreativeTab.get("pipes"));
        pipeItemGlass.setUnlocalizedName("PipeItemsGlass");
        PROXY.forgePreInitialization(event);
    }

    @Mod.EventHandler
    public void forgeInitialization(FMLInitializationEvent event) {
        PROXY.forgeInitialization(event);
    }
}
