package com.dhaboi.keybomb;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class eventManager implements Listener {
    public enum keyType {rare, mythical, tavern}
    @EventHandler
    public static void onRightClick(PlayerInteractEvent e) {
        if (e.getAction() == Action.RIGHT_CLICK_BLOCK || e.getAction() == Action.RIGHT_CLICK_AIR) {
            if (e.getItem() != null && e.getItem().getItemMeta() != null) {
                if (e.getItem().getItemMeta().equals(itemManager.rare.getItemMeta())) {
                    e.setCancelled(true);
                    Player p = e.getPlayer();
                    keyBomb(keyType.rare, p);
                }
                if (e.getItem().getItemMeta().equals(itemManager.mythical.getItemMeta())) {
                    e.setCancelled(true);
                    Player p = e.getPlayer();
                    keyBomb(keyType.mythical, p);
                }
                if (e.getItem().getItemMeta().equals(itemManager.tavern.getItemMeta())) {
                    e.setCancelled(true);
                    Player p = e.getPlayer();
                    keyBomb(keyType.tavern, p);
                }
            }
        }
    }
    @EventHandler
    public static void onLeftClick(PlayerInteractEvent e){
        if (e.getAction() == Action.LEFT_CLICK_BLOCK || e.getAction() == Action.LEFT_CLICK_AIR){
            if(e.getItem() != null && e.getItem().getItemMeta() != null){
                if (e.getItem().getItemMeta().equals(itemManager.rare.getItemMeta())) {
                    e.setCancelled(true);
                    Player p = e.getPlayer();
                    keyBomb(keyType.rare, p);
                }
                if (e.getItem().getItemMeta().equals(itemManager.mythical.getItemMeta())) {
                    e.setCancelled(true);
                    Player p = e.getPlayer();
                    keyBomb(keyType.mythical, p);
                }
                if (e.getItem().getItemMeta().equals(itemManager.tavern.getItemMeta())) {
                    e.setCancelled(true);
                    Player p = e.getPlayer();
                    keyBomb(keyType.tavern, p);
                }
            }
        }
    }
    public static void keyBomb(keyType key, Player thrower){

    }
}
