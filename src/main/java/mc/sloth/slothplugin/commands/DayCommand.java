package mc.sloth.slothplugin.commands;

import mc.sloth.slothplugin.files.config.CustomConfig;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class DayCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            if (player.hasPermission("slothplugin.day")) {
                player.getWorld().setTime(1000);
                player.sendMessage(ChatColor.translateAlternateColorCodes('&', CustomConfig.get().getString("DayCommandMessage")));
            } else {
                player.sendMessage(ChatColor.RED + CustomConfig.get().getString("MissingPermissionsMessage"));
            }
        } else {
            System.out.println("Ta komende mozesz wywolac tylko w grze");
        }
        return true;
    }
}
