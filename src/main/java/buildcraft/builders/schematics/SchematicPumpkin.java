/**
 * Copyright (c) 2011-2017, SpaceToad and the BuildCraft Team http://www.mod-buildcraft.com
 * <p/>
 * BuildCraft is distributed under the terms of the Minecraft Mod Public License 1.0, or MMPL. Please check the contents
 * of the license located in http://www.mod-buildcraft.com/MMPL-1.0.txt
 */
package buildcraft.builders.schematics;

import java.util.LinkedList;

import net.minecraft.item.ItemStack;

import buildcraft.api.blueprints.IBuilderContext;
import buildcraft.api.blueprints.SchematicBlock;

public class SchematicPumpkin extends SchematicBlock {

    @Override
    public void getRequirementsForPlacement(IBuilderContext context, LinkedList<ItemStack> requirements) {
        requirements.add(new ItemStack(block, 1, 0));
    }

    @Override
    public void storeRequirements(IBuilderContext context, int x, int y, int z) {
        // cancel requirements reading
    }

    @Override
    public boolean isAlreadyBuilt(IBuilderContext context, int x, int y, int z) {
        return block == context.world().getBlock(x, y, z);
    }

    @Override
    public void rotateLeft(IBuilderContext context) {
        switch (meta) {
            case 0:
                meta = 1;
                break;
            case 1:
                meta = 2;
                break;
            case 2:
                meta = 3;
                break;
            case 3:
                meta = 0;
                break;
        }
    }
}
