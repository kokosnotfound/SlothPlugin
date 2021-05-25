package mc.sloth.slothplugin.commands;

import mc.sloth.slothplugin.files.config.CustomConfig;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CraftingCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            if (player.hasPermission("slothplugin.crafting")) {
                player.openWorkbench(null, true);
                player.sendMessage(ChatColor.translateAlternateColorCodes('&', CustomConfig.get().getString("CraftingCommandMessage")));
            } else {
                player.sendMessage(ChatColor.RED + CustomConfig.get().getString("MissingPermissionsMessage"));
            }
        } else {
            System.out.println("Ta komende mozesz wywolac tylko w grze");
        }
        return true;
    }
}
