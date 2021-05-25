package mc.sloth.slothplugin.commands;

import mc.sloth.slothplugin.files.config.CustomConfig;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ReloadConfigCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            CustomConfig.reload();
            System.out.println("Pliki konfiguracji zostaly przeladowane.");
        } else {
            System.out.println(ChatColor.RED + "Tą komendę możesz wywołać tylko przez konsolę");
        }
        return true;
    }
}
