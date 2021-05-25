package mc.sloth.slothplugin.commands;

import mc.sloth.slothplugin.files.config.CustomConfig;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;

public class FloatingText implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;

            if (player.hasPermission("slothplugin.floatingtext")) {
                if (args.length == 0) {
                    player.sendMessage(ChatColor.RED + "Podaj argumenty do tej komendy!");
                } else {
                    ArmorStand floatingtext = (ArmorStand) player.getWorld().spawnEntity(player.getLocation(), EntityType.ARMOR_STAND);
                    floatingtext.setVisible(false);
                    floatingtext.setGravity(false);
                    floatingtext.setCustomNameVisible(true);
                    floatingtext.setCustomName(ChatColor.translateAlternateColorCodes('&', args[0]));
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
