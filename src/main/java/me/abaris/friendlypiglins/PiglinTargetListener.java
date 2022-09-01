package me.abaris.friendlypiglins;

import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityTargetEvent;

public class PiglinTargetListener implements Listener {
    @EventHandler
    public void onPiglinTarget(EntityTargetEvent e) {
        if(e.getEntityType() == EntityType.PIGLIN || e.getEntityType() == EntityType.PIGLIN_BRUTE) {
            if(e.getTarget() == null) {
                return;
            }
            if(e.getTarget().getType() == EntityType.PLAYER && e.getTarget().hasPermission("friendlypiglins.friend")) {
                e.setCancelled(true);
            }
        }
    }
}
