package buildcraft.api.transport.pluggable;

import buildcraft.api.core.render.ITextureStates;
import buildcraft.api.transport.IPipe;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraftforge.common.util.ForgeDirection;

public interface IPipePluggableRenderer {
    void renderPluggable(
            RenderBlocks renderblocks,
            IPipe pipe,
            ForgeDirection side,
            PipePluggable pipePluggable,
            ITextureStates blockStateMachine,
            int renderPass,
            int x,
            int y,
            int z);
}
