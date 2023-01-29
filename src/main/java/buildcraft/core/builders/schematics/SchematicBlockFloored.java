package buildcraft.core.builders.schematics;

import java.util.Set;

import net.minecraftforge.common.util.ForgeDirection;

import buildcraft.api.blueprints.IBuilderContext;
import buildcraft.api.blueprints.SchematicBlock;
import buildcraft.api.core.BlockIndex;

import com.google.common.collect.Sets;

public class SchematicBlockFloored extends SchematicBlock {

    @Override
    public Set<BlockIndex> getPrerequisiteBlocks(IBuilderContext context) {
        return Sets.newHashSet(RELATIVE_INDEXES[ForgeDirection.DOWN.ordinal()]);
    }
}
