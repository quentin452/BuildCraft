/**
 * Copyright (c) 2011-2017, SpaceToad and the BuildCraft Team http://www.mod-buildcraft.com
 * <p/>
 * BuildCraft is distributed under the terms of the Minecraft Mod Public License 1.0, or MMPL. Please check the contents
 * of the license located in http://www.mod-buildcraft.com/MMPL-1.0.txt
 */
package buildcraft.robotics.boards;

import net.minecraft.item.ItemShears;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import buildcraft.api.boards.RedstoneBoardRobotNBT;
import buildcraft.api.core.BuildCraftAPI;
import buildcraft.api.robots.EntityRobotBase;

public class BoardRobotLeaveCutter extends BoardRobotGenericBreakBlock {

    public BoardRobotLeaveCutter(EntityRobotBase iRobot) {
        super(iRobot);
    }

    @Override
    public RedstoneBoardRobotNBT getNBTHandler() {
        return BCBoardNBT.REGISTRY.get("leaveCutter");
    }

    @Override
    public boolean isExpectedTool(ItemStack stack) {
        return stack != null && stack.getItem() instanceof ItemShears;
    }

    @Override
    public boolean isExpectedBlock(World world, int x, int y, int z) {
        return BuildCraftAPI.getWorldProperty("leaves").get(world, x, y, z);
    }
}
