package com.dhaboi.keybomb;

import net.md_5.bungee.api.chat.ClickEvent;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class eventManager implements Listener {
    public enum keyType {rare, mythical, tavern}
    @EventHandler
    public void onRightClick(PlayerInteractEvent e) {
        if (e.getAction() == Action.RIGHT_CLICK_BLOCK || e.getAction() == Action.RIGHT_CLICK_AIR) {
            if (e.getItem() != null && e.getItem().getItemMeta() != null) {
                if (e.getItem().getItemMeta().equals(itemManager.rareBomb.getItemMeta())) {
                    e.setCancelled(true);
                    Player p = e.getPlayer();
                    keyBomb(keyType.rare, p);
                }
                if (e.getItem().getItemMeta().equals(itemManager.mythicalBomb.getItemMeta())) {
                    e.setCancelled(true);
                    Player p = e.getPlayer();
                    keyBomb(keyType.mythical, p);
                }
                if (e.getItem().getItemMeta().equals(itemManager.tavernBomb.getItemMeta())) {
                    e.setCancelled(true);
                    Player p = e.getPlayer();
                    keyBomb(keyType.tavern, p);
                }
            }
        }
    }
    @EventHandler
    public void onLeftClick(PlayerInteractEvent e){
        if (e.getAction() == Action.LEFT_CLICK_BLOCK || e.getAction() == Action.LEFT_CLICK_AIR){
            if(e.getItem() != null && e.getItem().getItemMeta() != null){
                if (e.getItem().getItemMeta().equals(itemManager.rareBomb.getItemMeta())) {
                    e.setCancelled(true);
                    Player p = e.getPlayer();
                    keyBomb(keyType.rare, p);
                }
                if (e.getItem().getItemMeta().equals(itemManager.mythicalBomb.getItemMeta())) {
                    e.setCancelled(true);
                    Player p = e.getPlayer();
                    keyBomb(keyType.mythical, p);
                }
                if (e.getItem().getItemMeta().equals(itemManager.tavernBomb.getItemMeta())) {
                    e.setCancelled(true);
                    Player p = e.getPlayer();
                    keyBomb(keyType.tavern, p);
                }
            }
        }
    }
    public void keyBomb(keyType key, Player thrower){
        for (Player p : Bukkit.getOnlinePlayers()) {
            p.sendMessage("Hey everyone," + thrower + "has thrown a key bomb, click on the message below to claim it!");
            sendClickableCommand(p, "Click here to receive a"+key, key+"key");
        }
    }

    /**
     * Sends a clickable message to a player that runs a command when clicked.
     * @param message The clickable message!
     * @param command The command without the slash to make the user perform.
     * @param player player to send to.
     */
    public void sendClickableCommand(Player player, String message, String command) {
        TextComponent component = new TextComponent(TextComponent.fromLegacyText(ChatColor.translateAlternateColorCodes('&', message)));
        component.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/" + command));
        player.spigot().sendMessage(component);
    }
}
