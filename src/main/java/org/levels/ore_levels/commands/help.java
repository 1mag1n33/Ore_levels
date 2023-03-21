package org.levels.ore_levels.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.levels.ore_levels.Msg;

import java.util.Collections;
import java.util.List;

public class help implements CommandExecutor, TabCompleter {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Msg.send(sender,"=== Help ===");
        sender.sendMessage("/ore iron - Responds with the y level to find iron");
        sender.sendMessage("/ore coal - Responds with the y level to find coal");
        sender.sendMessage("/ore gold - Responds with the y level to find gold");
        sender.sendMessage("/ore copper - Responds with the y level to find copper");
        sender.sendMessage("/ore lapis - Responds with the y level to find lapis");
        sender.sendMessage("/ore redstone - Responds with the y level to find redstone");
        sender.sendMessage("/ore diamond - Responds with the y level to find diamond");
        sender.sendMessage("/ore emerald - Responds with the y level to find emerald");
        sender.sendMessage("/ore nether_quartz - Responds with the y level to find nether_quartz");
        sender.sendMessage("/ore nether_gold - Responds with the y level to find nether_gold");
        sender.sendMessage("/ore ancient_debris - Responds with the y level to find ancient_debris");

        return true;
    }

    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String alias, String[] args) {
        return Collections.emptyList();
    }
}

