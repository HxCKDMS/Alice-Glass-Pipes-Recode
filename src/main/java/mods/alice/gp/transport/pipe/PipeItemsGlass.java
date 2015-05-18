package mods.alice.gp.transport.pipe;

import buildcraft.api.core.IIconProvider;
import buildcraft.transport.Pipe;
import buildcraft.transport.PipeTransportItems;
import buildcraft.transport.pipes.events.PipeEventItem;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.ForgeDirection;

public final class PipeItemsGlass extends Pipe<PipeTransportItems>{
    public PipeItemsGlass(Item item) {
        super(new PipeTransportItems(), item);
    }


    @SideOnly(Side.CLIENT)
    public IIconProvider getIconProvider() {
        return PipeGPIconProvider.INSTANCE;
    }


    public int getIconIndex(ForgeDirection direction) {
        return 0;
    }

    public void eventHandler(PipeEventItem.AdjustSpeed event) {
        event.handled = true;
    }
}
