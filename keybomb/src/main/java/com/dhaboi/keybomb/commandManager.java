package com.dhaboi.keybomb;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class commandManager implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String alias, String[] args) {
        if (cmd.getName().equals("bomb")) {
            if(args[0].equalsIgnoreCase("give")){
                if (Bukkit.getServer().getPlayerExact(args[1])!=null) {
                    Player p = Bukkit.getServer().getPlayerExact(args[1]);
                    assert p != null;
                    if(args[2].equalsIgnoreCase("rare")){
                        p.getInventory().addItem(itemManager.rareBomb);
                    }
                }
            }
        }
        if (cmd.getName().equals("rarekey")) {
            if (Bukkit.getServer().getPlayerExact(args[1]) != null) {
                Player p = Bukkit.getServer().getPlayerExact(args[1]);
                assert p != null;
                p.getInventory().addItem(itemManager.rare);
                p.sendMessage("You have received a rare key, use it at /warp crates!");
                return true;
            }
        }
        if (cmd.getName().equals("mythicalkey")) {
            if (Bukkit.getServer().getPlayerExact(args[1]) != null) {
                Player p = Bukkit.getServer().getPlayerExact(args[1]);
                assert p != null;
                p.getInventory().addItem(itemManager.mythical);
                p.sendMessage("You have received a mythical key, use it at /warp crates!");
                return true;
            }
        }
        if (cmd.getName().equals("tavernkey")) {
            if (Bukkit.getServer().getPlayerExact(args[1]) != null) {
                Player p = Bukkit.getServer().getPlayerExact(args[1]);
                assert p != null;
                p.getInventory().addItem(itemManager.tavern);
                p.sendMessage("You have received a tavern key, use it at /warp crates!");
                return true;
            }
        }
        return false;
    }
}
