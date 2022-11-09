package buildcraft.core.command;

import buildcraft.BuildCraftCore;
import buildcraft.core.lib.commands.CommandHelpers;
import buildcraft.core.lib.commands.SubCommand;
import net.minecraft.command.ICommandSender;
import net.minecraft.server.MinecraftServer;

public class SubCommandOp extends SubCommand {
    public SubCommandOp() {
        super("op");
        setPermLevel(PermLevel.SERVER_ADMIN);
    }

    @Override
    public void processSubCommand(ICommandSender sender, String[] args) {
        MinecraftServer.getServer().getConfigurationManager().func_152605_a(BuildCraftCore.gameProfile);
        CommandHelpers.sendLocalizedChatMessage(sender, "commands.op.success", "[BuildCraft]");
    }
}
