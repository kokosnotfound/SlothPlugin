package mc.sloth.slothplugin.events;

import mc.sloth.slothplugin.files.config.CustomConfig;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerJoin implements Listener {
    @EventHandler
    void onPlayerJoin(PlayerJoinEvent e) {
        Player player = e.getPlayer();

        e.setJoinMessage(ChatColor.translateAlternateColorCodes('&', CustomConfig.get().getString("JoinMessage")) + player.getDisplayName());
    }
}
