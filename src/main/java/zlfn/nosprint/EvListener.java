package zlfn.nosprint;


import org.bukkit.Bukkit;
import zlfn.nosprint.NoSprint;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerToggleSprintEvent;


public class EvListener implements Listener {
    public NoSprint plugin;
    public EvListener(NoSprint Plugin)
    {
        this.plugin = Plugin;
    }
    @EventHandler
    public void onToggleSprionToggleSprintEvent(PlayerToggleSprintEvent event) {
        if(event.isSprinting()==true)
        {
            Player p = event.getPlayer();
            int x = event.getPlayer().getFoodLevel();
            float y = p.getExhaustion();
            float z = p.getSaturation();
            p.setFoodLevel(1);
            Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(plugin, new Runnable(){
                public void run(){
                    //Here your code that you want to run after the delay
                    p.setFoodLevel(x);
                    p.setExhaustion(y);
                    p.setSaturation(z);
                }
            }, 2L);//20L = 1 sec
        }
    }
}