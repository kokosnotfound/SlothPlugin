package mc.sloth.slothplugin.commands.Player;

import mc.sloth.slothplugin.files.config.CustomConfig;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GodCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            if (player.hasPermission("slothplugin.god")) {
                if (player.isInvulnerable()) {
                    player.setInvulnerable(false);
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', CustomConfig.get().getString("GodOffCommandMessage")));
                } else {
                    player.setInvulnerable(true);
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', CustomConfig.get().getString("GodOnCommandMessage")));
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
