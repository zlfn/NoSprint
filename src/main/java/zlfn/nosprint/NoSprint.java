package zlfn.nosprint;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class NoSprint extends JavaPlugin {

    EvListener myEvetHnd = new EvListener(this);

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(myEvetHnd,this);
        Bukkit.getConsoleSender().sendMessage("Plugin Enabled");
        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
