package buildcraft.builders.schematics;

import buildcraft.api.blueprints.IBuilderContext;
import buildcraft.api.blueprints.SchematicBlock;
import java.util.LinkedList;
import net.minecraft.item.ItemStack;

public class SchematicAir extends SchematicBlock {
    @Override
    public void getRequirementsForPlacement(IBuilderContext context, LinkedList<ItemStack> requirements) {}
}
