package com.dhaboi.keybomb;

import net.md_5.bungee.api.chat.ClickEvent;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public final class main extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("KeyBomb Initialization");
        itemManager.init();
        this.getCommand("bomb").setExecutor(new commandManager());
        this.getCommand("rarekey").setExecutor(new commandManager());
        this.getCommand("mythicalkey").setExecutor(new commandManager());
        this.getCommand("tavernkey").setExecutor(new commandManager());
        getServer().getPluginManager().registerEvents(new eventManager(), this);
        System.out.println("KeyBomb has started successfully!");
    }

    @Override
    public void onDisable() {
        System.out.println("KeyBomb is turning off, bye bye! :)");
    }
}
