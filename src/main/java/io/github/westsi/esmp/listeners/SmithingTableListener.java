package io.github.westsi.esmp.listeners;

import org.bukkit.ChatColor;
import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.SmithItemEvent;

public class SmithingTableListener implements Listener {
    @EventHandler
    public void SmithingTableUse(SmithItemEvent e){
        e.setCancelled(true);
        for(HumanEntity he:e.getViewers()) {
            if(he instanceof Player) {
                ((Player)he).sendMessage(ChatColor.RED+"You cannot use a smithing table! To make netherite armour/tools, use a crafting recipe like normal armour/tools");
            }
        }

    }
}
