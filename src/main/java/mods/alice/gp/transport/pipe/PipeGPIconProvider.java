package mods.alice.gp.transport.pipe;

import buildcraft.api.core.IIconProvider;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

public final class PipeGPIconProvider implements IIconProvider {
    public static final PipeGPIconProvider INSTANCE = new PipeGPIconProvider();

    private IIcon glassPipe;


    public IIcon getIcon(int iconIndex) {
        return this.glassPipe;
    }


    public void registerIcons(IIconRegister iconRegister) {
        this.glassPipe = iconRegister.registerIcon("bc_glasspipe:pipeItemsGlass");
    }
}