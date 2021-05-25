package mc.sloth.slothplugin.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class StatsCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            Inventory statsgui = Bukkit.createInventory(player, 9, ChatColor.GREEN + "Twoje statystyki");
            ItemStack playerHead = new ItemStack(Material.PLAYER_HEAD, 1);
            ItemMeta meta = playerHead.getItemMeta();
            ArrayList<String> lore = new ArrayList<>();
            lore.add(ChatColor.GOLD + "Twoje HP: " + player.getHealth());
            lore.add(ChatColor.LIGHT_PURPLE + "Twój ping: " + player.getPing());
            meta.setLore(lore);
            playerHead.setItemMeta(meta);
            statsgui.addItem(playerHead);

            player.openInventory(statsgui);
        } else {
            System.out.println("Ta komende mozesz wywolac tylko w grze");
        }
        return true;
    }
}
