package org.levels.ore_levels.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.levels.ore_levels.commands.ores.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BaseCommand implements CommandExecutor, TabCompleter {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (args.length == 0) {
            sender.sendMessage("Ore levels main command");
            sender.sendMessage("Usage: /ore <subcommand> [args]");
            sender.sendMessage("Type /ore help for a list of subcommands.");
            return true;
        }

        switch (args[0]) {
            case "help":
                return new help().onCommand(sender, command, label, Arrays.copyOfRange(args, 1, args.length));
            case "iron":
                return new iron().onCommand(sender, command, label, Arrays.copyOfRange(args, 1, args.length));
            case "coal":
                return new coal().onCommand(sender, command, label, Arrays.copyOfRange(args, 1, args.length));
            case "copper":
                return new copper().onCommand(sender, command, label, Arrays.copyOfRange(args, 1, args.length));
            case "lapis":
                return new lapis().onCommand(sender, command, label, Arrays.copyOfRange(args, 1, args.length));
            case "gold":
                return new gold().onCommand(sender, command, label, Arrays.copyOfRange(args, 1, args.length));
            case "redstone":
                return new redstone().onCommand(sender, command, label, Arrays.copyOfRange(args, 1, args.length));
            case "diamond":
                return new diamond().onCommand(sender, command, label, Arrays.copyOfRange(args, 1, args.length));
            case "emerald":
                return new emerald().onCommand(sender, command, label, Arrays.copyOfRange(args, 1, args.length));
            case "nether_quartz":
                return new nether_quartz().onCommand(sender, command, label, Arrays.copyOfRange(args, 1, args.length));
            case "nether_gold":
                return new nether_gold().onCommand(sender, command, label, Arrays.copyOfRange(args, 1, args.length));
            case "ancient_debris":
                return new ancient_debris().onCommand(sender, command, label, Arrays.copyOfRange(args, 1, args.length));
            default:
                sender.sendMessage("Unknown subcommand: " + args[0]);
                sender.sendMessage("Type /ore help for a list of subcommands.");
                return true;
        }
    }

    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String alias, String[] args) {
        if (args.length == 1) {
            return Arrays.asList("help","iron","coal","copper","gold","lapis","redstone","emerald","diamond","nether_gold","nether_quartz","ancient_debris");
        }
        return Collections.emptyList();
    }
}