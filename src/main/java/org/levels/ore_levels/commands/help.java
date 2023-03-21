package org.levels.ore_levels.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.levels.ore_levels.Msg;
import org.levels.ore_levels.OreLevels;

import java.util.Collections;
import java.util.List;




public class help implements CommandExecutor, TabCompleter {

    String alias = OreLevels.Alias;

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Msg.send(sender,"=== Help ===");
        sender.sendMessage("/"+alias+" iron - Responds with the y level to find iron");
        sender.sendMessage("/"+alias+" coal - Responds with the y level to find coal");
        sender.sendMessage("/"+alias+" gold - Responds with the y level to find gold");
        sender.sendMessage("/"+alias+" copper - Responds with the y level to find copper");
        sender.sendMessage("/"+alias+" lapis - Responds with the y level to find lapis");
        sender.sendMessage("/"+alias+" redstone - Responds with the y level to find redstone");
        sender.sendMessage("/"+alias+" diamond - Responds with the y level to find diamond");
        sender.sendMessage("/"+alias+" emerald - Responds with the y level to find emerald");
        sender.sendMessage("/"+alias+" nether_quartz - Responds with the y level to find nether_quartz");
        sender.sendMessage("/"+alias+" nether_gold - Responds with the y level to find nether_gold");
        sender.sendMessage("/"+alias+" ancient_debris - Responds with the y level to find ancient_debris");

        return true;
    }

    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String alias, String[] args) {
        return Collections.emptyList();
    }
}

