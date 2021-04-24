package com.dhaboi.keybomb;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class itemManager {
    static ItemStack rareBomb = new ItemStack(Material.TRIPWIRE_HOOK);
    static ItemStack mythicalBomb = new ItemStack(Material.TRIPWIRE_HOOK);
    static ItemStack tavernBomb = new ItemStack(Material.TRIPWIRE_HOOK);
    static ItemStack rare = new ItemStack(Material.TRIPWIRE_HOOK);
    static ItemStack mythical = new ItemStack(Material.TRIPWIRE_HOOK);
    static ItemStack tavern = new ItemStack(Material.TRIPWIRE_HOOK);

    public static void createRareBomb() { //rare keybomb
        List<String> lore = new ArrayList<>(); //since the lore is a string array I quickly make one here
        ItemMeta meta = rareBomb.getItemMeta();//gets the ItemMeta
        lore.add("Right click to throw a key bomb!");
        lore.add("Throwing this Key bomb will allow");
        lore.add("everyone in chat to gain a rare key bomb. :D");
        lore.add("Thanks for sharing!");
        assert meta != null;
        meta.setDisplayName("§9§kX §r§9Rare Key Bomb §kX");//display name of item
        meta.setLore(lore);//sets the lore of the item to the string array
        meta.addEnchant(Enchantment.DURABILITY, 10, false);//unbreaking 10
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS); //you cant see the unbreaking 10 value, hopefully? idk this hasnt worked very well before
        rareBomb.setItemMeta(meta);
    }//creates and sets item meta for rare

    public static void createMythicalBomb() { //mythical keybomb
        List<String> lore = new ArrayList<>(); //since the lore is a string array I quickly make one here
        ItemMeta meta = mythicalBomb.getItemMeta();//gets the ItemMeta
        lore.add("Right click to throw a key bomb!");
        lore.add("Throwing this Key bomb will allow");
        lore.add("everyone in chat to gain a mythical key bomb. :D");
        lore.add("Thanks for sharing!");
        assert meta != null;
        meta.setDisplayName("§9§kX §r§5Mythical Key Bomb §kX");//display name of item
        meta.setLore(lore);//sets the lore of the item to the string array
        meta.addEnchant(Enchantment.DURABILITY, 10, false);//unbreaking 10
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS); //you cant see the unbreaking 10 value, hopefully? idk this hasnt worked very well before
        mythicalBomb.setItemMeta(meta);
    }//creates and sets item meta for mythical

    public static void createTavernBomb() { //tavern keybomb
        List<String> lore = new ArrayList<>(); //since the lore is a string array I quickly make one here
        ItemMeta meta = tavernBomb.getItemMeta();//gets the ItemMeta
        lore.add("Right click to throw a key bomb!");
        lore.add("Throwing this Key bomb will allow");
        lore.add("everyone in chat to gain a tavern key bomb. :D");
        lore.add("Thanks for sharing!");
        assert meta != null;
        meta.setDisplayName("§9§kX §r§6Tavern Key Bomb §kX");//display name of item
        meta.setLore(lore);//sets the lore of the item to the string array
        meta.addEnchant(Enchantment.DURABILITY, 10, false);//unbreaking 10
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS); //you cant see the unbreaking 10 value, hopefully? idk this hasnt worked very well before
        tavernBomb.setItemMeta(meta);
    }//creates and sets item meta for tavern

    public static void createRare() { //rare key
        List<String> lore = new ArrayList<>(); //since the lore is a string array I quickly make one here
        ItemMeta meta = rare.getItemMeta();//gets the ItemMeta
        lore.add("Right click on the rare crate");
        lore.add("to gain prizes!");
        assert meta != null;
        meta.setDisplayName("§9§kX §r§9Rare Key §kX");//display name of item
        meta.setLore(lore);//sets the lore of the item to the string array
        meta.addEnchant(Enchantment.DURABILITY, 10, false);//unbreaking 10
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS); //you cant see the unbreaking 10 value, hopefully? idk this hasnt worked very well before
        rare.setItemMeta(meta);
    }//creates and sets item meta for rare

    public static void createMythical() { //mythical key
        List<String> lore = new ArrayList<>(); //since the lore is a string array I quickly make one here
        ItemMeta meta = mythical.getItemMeta();//gets the ItemMeta
        lore.add("Right click on the mythical crate");
        lore.add("to gain prizes!");
        assert meta != null;
        meta.setDisplayName("§9§kX §r§5Mythical Key §kX");//display name of item
        meta.setLore(lore);//sets the lore of the item to the string array
        meta.addEnchant(Enchantment.DURABILITY, 10, false);//unbreaking 10
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS); //you cant see the unbreaking 10 value, hopefully? idk this hasnt worked very well before
        mythical.setItemMeta(meta);
    }//creates and sets item meta for mythical

    public static void createTavern() { //tavern key
        List<String> lore = new ArrayList<>(); //since the lore is a string array I quickly make one here
        ItemMeta meta = tavern.getItemMeta();//gets the ItemMeta
        lore.add("Right click on the tavern crate");
        lore.add("to gain prizes!");
        assert meta != null;
        meta.setDisplayName("§9§kX §r§6Tavern Key §kX");//display name of item
        meta.setLore(lore);//sets the lore of the item to the string array
        meta.addEnchant(Enchantment.DURABILITY, 10, false);//unbreaking 10
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS); //you cant see the unbreaking 10 value, hopefully? idk this hasnt worked very well before
        tavern.setItemMeta(meta);
    }//creates and sets item meta for tavern

    public static void init() {
        createRareBomb();
        createTavernBomb();
        createMythicalBomb();
        createRare();
        createTavern();
        createMythical();
    }
}
