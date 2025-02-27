/**
 * Copyright (c) 2011-2017, SpaceToad and the BuildCraft Team http://www.mod-buildcraft.com
 * <p/>
 * BuildCraft is distributed under the terms of the Minecraft Mod Public License 1.0, or MMPL. Please check the contents
 * of the license located in http://www.mod-buildcraft.com/MMPL-1.0.txt
 */
package buildcraft.transport.gui;

import net.minecraft.inventory.IInventory;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import buildcraft.BuildCraftCore;
import buildcraft.core.lib.gui.GuiBuildCraft;
import buildcraft.core.lib.utils.StringUtils;
import buildcraft.transport.IDiamondPipe;

public class GuiDiamondPipe extends GuiBuildCraft {

    private static final ResourceLocation TEXTURE;
    IInventory playerInventory;
    IInventory filterInventory;

    static {
        if (!BuildCraftCore.colorBlindMode) {
            TEXTURE = new ResourceLocation("buildcrafttransport:textures/gui/filter.png");
        } else {
            TEXTURE = new ResourceLocation("buildcrafttransport:textures/gui/filter_cb.png");
        }
    }

    public GuiDiamondPipe(IInventory playerInventory, IDiamondPipe pipe) {
        super(new ContainerDiamondPipe(playerInventory, pipe), pipe.getFilters(), TEXTURE);
        this.playerInventory = playerInventory;
        this.filterInventory = pipe.getFilters();
        xSize = 175;
        ySize = 225;
    }

    @Override
    protected void drawGuiContainerForegroundLayer(int par1, int par2) {
        fontRendererObj.drawString(
                filterInventory.getInventoryName(),
                getCenteredOffset(filterInventory.getInventoryName()),
                6,
                0x404040);
        fontRendererObj.drawString(StringUtils.localize("gui.inventory"), 8, ySize - 97, 0x404040);
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float f, int x, int y) {
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        mc.renderEngine.bindTexture(TEXTURE);
        drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
    }
}
