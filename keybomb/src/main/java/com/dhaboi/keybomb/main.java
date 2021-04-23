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
        itemManager.createRare();
        itemManager.init();
        this.getCommand("bomb").setExecutor(new commandManager());
        getServer().getPluginManager().registerEvents(new eventManager(), this);
    }

    @Override
    public void onDisable() {
        System.out.println("KeyBomb is turning off, bye bye! :)");
    }
}
