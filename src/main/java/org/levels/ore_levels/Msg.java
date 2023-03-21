package org.levels.ore_levels;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;



public class Msg {
    public static void send(CommandSender sender, String message) {
        send(sender, message, "&a");
    }

    public static void send(CommandSender sender, String messsage, String prefix){
        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix + messsage));
    }

}
