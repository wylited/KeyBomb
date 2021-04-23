package com.dhaboi.keybomb;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class itemManager {
    ItemStack rare = new ItemStack(Material.TRIPWIRE_HOOK);

    private void createRare() { //rare keybomb
        List<String> lore = new ArrayList<>(); //since the lore is a string array I quickly make one here
        ItemMeta meta = rare.getItemMeta();//gets the ItemMeta
        lore.add("                                       ");
        lore.add("§6XXXX Ability:XXXX §e§lRIGHT CLICK    ");
        lore.add("                                       ");
        lore.add("§7XXXXX §aX §7XXXX                     ");
        lore.add("§8Cooldown:§3XXs                       ");
        lore.add("                                       ");
        lore.add("§6XXXX Ultimate:XX §e§lLEFT CLICK      ");
        lore.add("§7XXXX §axxxxx                         ");
        lore.add("§8Cooldown:§3xxs                       ");
        assert meta != null;
        meta.setDisplayName("§7§kX §r§7xxxx §kX");//display name of item
        meta.setLore(lore);//sets the lore of the item to the string array
        meta.addEnchant(Enchantment.DURABILITY, 10, false);//unbreaking 10
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS); //you cant see the unbreaking 10 value, hopefully? idk this hasnt worked very well before
        rare.setItemMeta(meta);
    }//creates and sets item meta for rare
}
