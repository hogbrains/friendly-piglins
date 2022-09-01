package me.abaris.friendlypiglins;

import org.bukkit.plugin.java.JavaPlugin;

public final class Friendlypiglins extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new PiglinTargetListener(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
