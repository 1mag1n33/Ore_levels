package org.levels.ore_levels;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BaseCommand implements CommandExecutor, TabCompleter {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (args.length == 0) {
            sender.sendMessage("KillMeiKillU main command");
            sender.sendMessage("Usage: /ore <subcommand> [args]");
            sender.sendMessage("Type /ore help for a list of subcommands.");
            return true;
        }

        switch (args[0]) {
            case "help":
                return new help().onCommand(sender, command, label, Arrays.copyOfRange(args, 1, args.length));
            case "iron":
                return new iron().onCommand(sender, command, label, Arrays.copyOfRange(args, 1, args.length));
            default:
                sender.sendMessage("Unknown subcommand: " + args[0]);
                sender.sendMessage("Type /ore help for a list of subcommands.");
                return true;
        }
    }

    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String alias, String[] args) {
        if (args.length == 1) {
            return Arrays.asList("help");
        }
        return Collections.emptyList();
    }
}