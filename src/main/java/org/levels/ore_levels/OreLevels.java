package org.levels.ore_levels;

import org.bukkit.plugin.java.JavaPlugin;
import org.levels.ore_levels.commands.BaseCommand;

public final class OreLevels extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("ore").setExecutor(new BaseCommand());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
