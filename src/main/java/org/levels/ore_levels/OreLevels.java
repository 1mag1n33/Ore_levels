package org.levels.ore_levels;

import org.bukkit.plugin.java.JavaPlugin;
import org.levels.ore_levels.commands.BaseCommand;

public final class OreLevels extends JavaPlugin {

    public static String Alias = "ore";

    @Override
    public void onEnable() {

        getCommand(Alias).setExecutor(new BaseCommand());
        getLogger().info("Loading Command ancient_debris");
        getLogger().info("Loading Command coal");
        getLogger().info("Loading Command copper");
        getLogger().info("Loading Command diamond");
        getLogger().info("Loading Command emerald");
        getLogger().info("Loading Command gold");
        getLogger().info("Loading Command iron");
        getLogger().info("Loading Command lapis");
        getLogger().info("Loading Command nether_gold");
        getLogger().info("Loading Command nether_quartz");
        getLogger().info("Loading Command redstone");

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
