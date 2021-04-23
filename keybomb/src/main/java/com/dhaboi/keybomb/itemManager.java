package com.dhaboi.keybomb;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class itemManager {
    static ItemStack rare = new ItemStack(Material.TRIPWIRE_HOOK);
    static ItemStack mythical = new ItemStack(Material.TRIPWIRE_HOOK);
    static ItemStack tavern = new ItemStack(Material.TRIPWIRE_HOOK);

    public static void createRare() { //rare keybomb
        List<String> lore = new ArrayList<>(); //since the lore is a string array I quickly make one here
        ItemMeta meta = rare.getItemMeta();//gets the ItemMeta
        lore.add("Right click to throw a key bomb!");
        lore.add("Throwing this Key bomb will allow");
        lore.add("everyone in chat to gain a rare key bomb. :D");
        lore.add("Thanks for sharing!");
        assert meta != null;
        meta.setDisplayName("§9§kX §r§9Rare Key Bomb §kX");//display name of item
        meta.setLore(lore);//sets the lore of the item to the string array
        meta.addEnchant(Enchantment.DURABILITY, 10, false);//unbreaking 10
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS); //you cant see the unbreaking 10 value, hopefully? idk this hasnt worked very well before
        rare.setItemMeta(meta);
    }//creates and sets item meta for rare

    public static void createMythical() { //mythical keybomb
        List<String> lore = new ArrayList<>(); //since the lore is a string array I quickly make one here
        ItemMeta meta = mythical.getItemMeta();//gets the ItemMeta
        lore.add("Right click to throw a key bomb!");
        lore.add("Throwing this Key bomb will allow");
        lore.add("everyone in chat to gain a rare key bomb. :D");
        lore.add("Thanks for sharing!");
        assert meta != null;
        meta.setDisplayName("§9§kX §r§5Mythical Key Bomb §kX");//display name of item
        meta.setLore(lore);//sets the lore of the item to the string array
        meta.addEnchant(Enchantment.DURABILITY, 10, false);//unbreaking 10
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS); //you cant see the unbreaking 10 value, hopefully? idk this hasnt worked very well before
        mythical.setItemMeta(meta);
    }//creates and sets item meta for mythical

    public static void createTavern() { //tavern keybomb
        List<String> lore = new ArrayList<>(); //since the lore is a string array I quickly make one here
        ItemMeta meta = tavern.getItemMeta();//gets the ItemMeta
        lore.add("Right click to throw a key bomb!");
        lore.add("Throwing this Key bomb will allow");
        lore.add("everyone in chat to gain a rare key bomb. :D");
        lore.add("Thanks for sharing!");
        assert meta != null;
        meta.setDisplayName("§9§kX §r§6Tavern Key Bomb §kX");//display name of item
        meta.setLore(lore);//sets the lore of the item to the string array
        meta.addEnchant(Enchantment.DURABILITY, 10, false);//unbreaking 10
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS); //you cant see the unbreaking 10 value, hopefully? idk this hasnt worked very well before
        tavern.setItemMeta(meta);
    }//creates and sets item meta for tavern

    public static void init() {
        createRare();
        createTavern();
        createMythical();
    }
}
