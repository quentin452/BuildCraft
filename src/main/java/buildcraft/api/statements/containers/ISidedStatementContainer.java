package buildcraft.api.statements.containers;

import buildcraft.api.statements.IStatementContainer;
import net.minecraftforge.common.util.ForgeDirection;

/**
 * Created by asie on 3/14/15.
 */
public interface ISidedStatementContainer extends IStatementContainer {
    ForgeDirection getSide();
}
