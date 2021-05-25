package mc.sloth.slothplugin.events;

import mc.sloth.slothplugin.files.config.CustomConfig;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class PlayerLeave implements Listener {
    @EventHandler
    void onPlayerJoin(PlayerQuitEvent e) {
        Player player = e.getPlayer();
        e.setQuitMessage(ChatColor.GOLD + player.getDisplayName() + ChatColor.translateAlternateColorCodes('&', CustomConfig.get().getString("LeaveMessage")));
    }
}
