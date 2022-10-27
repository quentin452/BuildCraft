package buildcraft.core.builders.schematics;

import buildcraft.api.blueprints.IBuilderContext;
import buildcraft.api.core.BlockIndex;
import com.google.common.collect.Sets;
import java.util.Set;
import net.minecraftforge.common.util.ForgeDirection;

public class SchematicRotateMetaSupported extends SchematicRotateMeta {
    public SchematicRotateMetaSupported(int[] rotations, boolean rotateForward) {
        super(rotations, rotateForward);
    }

    @Override
    public Set<BlockIndex> getPrerequisiteBlocks(IBuilderContext context) {
        int pos = meta & infoMask;
        if (pos == rot[0]) {
            return Sets.newHashSet(RELATIVE_INDEXES[ForgeDirection.NORTH.ordinal()]);
        } else if (pos == rot[1]) {
            return Sets.newHashSet(RELATIVE_INDEXES[ForgeDirection.EAST.ordinal()]);
        } else if (pos == rot[2]) {
            return Sets.newHashSet(RELATIVE_INDEXES[ForgeDirection.SOUTH.ordinal()]);
        } else if (pos == rot[3]) {
            return Sets.newHashSet(RELATIVE_INDEXES[ForgeDirection.WEST.ordinal()]);
        } else {
            return null;
        }
    }
}
