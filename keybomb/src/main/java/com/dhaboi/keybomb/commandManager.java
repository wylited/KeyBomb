package com.dhaboi.keybomb;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class commandManager implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String alias, String[] args) {
        if (cmd.getName().equals("bomb")) {
            if (args.length == 0) { //Sender only typed '/bomb' and nothing else
                sender.sendMessage("Usage is:");
                return true;

            }
            if (args.length == 1) { //Sender only typed '/bomb' and another argument
                if (args[0].equalsIgnoreCase("help")) {
                    sender.sendMessage(ChatColor.YELLOW + "Key Bomb plugin");
                    sender.sendMessage(ChatColor.RED + "/bomb" + ChatColor.GREEN + "<player> <type>");
                    sender.sendMessage(ChatColor.GRAY + "<player> = any online player");
                    sender.sendMessage(ChatColor.GRAY + "<key> = rare, mythical, tavern");
                    sender.sendMessage("*&c/rarekey &r&7cannot be used by players.\n" +
                            "                     *&c/mythicalkey &r&7cannot be used by players.\n" +
                            "                     *&c/tavernkey &r&7cannot be used by players.");
                    sender.sendMessage("made by: dhaboi");
                    return true;
                }
            }
            if (args[0].equalsIgnoreCase("give")) {
                sender.sendMessage(ChatColor.YELLOW + "Key Bomb plugin");
                sender.sendMessage(ChatColor.RED + "/bomb" + ChatColor.GREEN + "<player> <type>");
                sender.sendMessage(ChatColor.GRAY + "<player> = any online player");
                sender.sendMessage(ChatColor.GRAY + "<key> = rare, mythical, tavern");
                sender.sendMessage("*&c/rarekey &r&7cannot be used by players.\n" +
                        "                     *&c/mythicalkey &r&7cannot be used by players.\n" +
                        "                     *&c/tavernkey &r&7cannot be used by players.");
                sender.sendMessage("made by: dhaboi");
                return true;
            }
            return true;
        }
        if (args.length == 2) { //Sender only typed '/bomb' and another 2 argument
            if (Bukkit.getServer().getPlayerExact(args[1]) != null) {
                if (args[1].equalsIgnoreCase("rare")) {
                    Player p = Bukkit.getServer().getPlayerExact(args[0]);
                    assert p != null;
                    p.getInventory().addItem(itemManager.rareBomb);
                    p.sendMessage("&7:O, Congrats you have received a &9&oRare key bomb.");
                    p.sendMessage("&aRight click to use it.");
                    sender.sendMessage(args[1] + "has received a key bomb");
                    return true;
                }
                if (args[1].equalsIgnoreCase("mythical")) {
                    Player p = Bukkit.getServer().getPlayerExact(args[0]);
                    assert p != null;
                    p.getInventory().addItem(itemManager.mythicalBomb);
                    p.sendMessage(":O, Congrats you have received a Mythical KeyBomb! Have fun.");
                    sender.sendMessage(args[1] + "has received a Mythical key bomb");
                    return true;
                }
                if (args[1].equalsIgnoreCase("tavern")) {
                    Player p = Bukkit.getServer().getPlayerExact(args[0]);
                    assert p != null;
                    p.getInventory().addItem(itemManager.tavernBomb);
                    p.sendMessage(":O, Congrats you have received a Tavern KeyBomb! Have fun.");
                    sender.sendMessage(args[1] + "has received a Tavern key bomb");
                    return true;
                }
            } else {
                sender.sendMessage("that player is not online right now, either try again later or make sure you typed in the name right :)");
                return true;
            }
        }
        if(cmd.getName().equals("rarekey")){
                if (Bukkit.getServer().getPlayerExact(args[0]) != null) {
                    Player p = Bukkit.getServer().getPlayerExact(args[0]);
                    assert p != null;
                    p.getInventory().addItem(itemManager.rare);
                    p.sendMessage("You have received a rare key, use it at /warp crates!");
                    return true;
            }
        }
        if(cmd.getName().equals("mythicalkey")){
            if (Bukkit.getServer().getPlayerExact(args[0]) != null) {
                Player p = Bukkit.getServer().getPlayerExact(args[0]);
                assert p != null;
                p.getInventory().addItem(itemManager.mythical);
                p.sendMessage("You have received a mythical key, use it at /warp crates!");
                return true;
            }
        }
        if(cmd.getName().equals("tavernkey")){
            if (Bukkit.getServer().getPlayerExact(args[0]) != null) {
                Player p = Bukkit.getServer().getPlayerExact(args[0]);
                assert p != null;
                p.getInventory().addItem(itemManager.tavern);
                p.sendMessage("You have received a tavern key, use it at /warp crates!");
                return true;
            }
        }
        return false;
    }
}
