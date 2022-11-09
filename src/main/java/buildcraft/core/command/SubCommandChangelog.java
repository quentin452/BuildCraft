package buildcraft.core.command;

import buildcraft.core.Version;
import buildcraft.core.lib.commands.SubCommand;
import net.minecraft.command.ICommandSender;

public class SubCommandChangelog extends SubCommand {
    public SubCommandChangelog() {
        super("changelog");
    }

    @Override
    public void processSubCommand(ICommandSender sender, String[] args) {
        Version.displayChangelog(sender);
    }
}
