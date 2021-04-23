package com.dhaboi.keybomb;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class commandManager implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String alias, String[] args) {
        if(cmd.getName().equals("bomb")){
            if (args.length == 0) { //Sender only typed '/bomb' and nothing else
                sender.sendMessage("Usage is:");

            }if (args.length == 1) { //Sender only typed '/bomb' and another argument
               if (args[0] == "help"){

               }
                if (args[0] == "give"){
                    sender.sendMessage("You need 2 more arguments of the player and key type");
                    sender.sendMessage("/bomb give <player> <key>");
                    sender.sendMessage("keys can be rare, epic, ultimate?");
                }
            }if (args.length == 2) { //Sender only typed '/bomb' and another 2 argument
                if (Bukkit.getServer().getPlayerExact(args[1]) != null){
                    if(args[2] == "rare") {
                        Player p = Bukkit.getServer().getPlayerExact(args[1]);
                        assert p != null;
                        p.getInventory().addItem(itemManager.rare);
                        p.sendMessage(":O, Congrats you have received a Rare KeyBomb! Have fun.");
                        sender.sendMessage(args[2] + "has received a key bomb");
                    }
                    if(args[2] == "mythical") {
                        Player p = Bukkit.getServer().getPlayerExact(args[1]);
                        assert p != null;
                        p.getInventory().addItem(itemManager.rare);
                        p.sendMessage(":O, Congrats you have received a Mythical KeyBomb! Have fun.");
                        sender.sendMessage(args[2] + "has received a Mythical key bomb");
                    }
                    if(args[2] == "tavern") {
                        Player p = Bukkit.getServer().getPlayerExact(args[1]);
                        assert p != null;
                        p.getInventory().addItem(itemManager.rare);
                        p.sendMessage(":O, Congrats you have received a Tavern KeyBomb! Have fun.");
                        sender.sendMessage(args[2] + "has received a Tavern key bomb");
                    }
                }

            }if (args.length == 3) { //Sender only typed '/bomb' and another 3 argument
                sender.sendMessage("You only typed hello!");

            }if (args.length == 4) { //Sender only typed '/bomb' and another 4 argument
                sender.sendMessage("You only typed hello!");

            }
        }
        return false;
    }
}
