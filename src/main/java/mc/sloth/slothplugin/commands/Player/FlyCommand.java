package mc.sloth.slothplugin.commands.Player;

import mc.sloth.slothplugin.files.config.CustomConfig;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class FlyCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            if (player.hasPermission("slothplugin.fly")) {
                if (player.getAllowFlight()) {
                    player.setAllowFlight(false);
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', CustomConfig.get().getString("FlyOffCommandMessage")));
                } else {
                    player.setAllowFlight(true);
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', CustomConfig.get().getString("FlyOnCommandMessage")));
                }
            } else {
                player.sendMessage(ChatColor.RED + CustomConfig.get().getString("MissingPermissionsMessage"));
            }
        } else {
            System.out.println("Ta komende mozesz wywolac tylko w grze");
        }
        return true;
    }
}
