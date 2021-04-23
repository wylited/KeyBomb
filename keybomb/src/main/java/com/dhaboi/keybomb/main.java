package com.dhaboi.keybomb;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public final class main extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("KeyBomb plugin has started up successfully (I hope)");

    }

    @Override
    public void onDisable() {
        System.out.println("KeyBomb is turning off, bye bye! :)");
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(command.getName().equals("bomb")){
            sender.sendMessage(args[2]+ "has received a key bomb");
            if (Bukkit.getServer().getPlayerExact(args[2]) != null){
                Player p = Bukkit.getServer().getPlayerExact(args[2]);

            }
        }
        return false;
    }
}
