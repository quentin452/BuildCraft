package buildcraft.api.transport.pluggable;

import buildcraft.api.transport.IPipe;
import net.minecraftforge.common.util.ForgeDirection;

public interface IPipePluggableDynamicRenderer {
    void renderPluggable(IPipe pipe, ForgeDirection side, PipePluggable pipePluggable, double x, double y, double z);
}
