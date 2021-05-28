package mc.sloth.slothplugin;

import mc.sloth.slothplugin.commands.*;
import mc.sloth.slothplugin.events.PlayerJoin;
import mc.sloth.slothplugin.events.PlayerLeave;
import mc.sloth.slothplugin.files.config.CustomConfig;
import org.bukkit.plugin.java.JavaPlugin;

public final class SlothPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("Plugin Sloth Zaladowany");

        //Config files
        getConfig().options().copyDefaults();
        saveDefaultConfig();

        CustomConfig.setup();
        CustomConfig.get().addDefault("JoinMessage", "Witaj na serwerze ");
        CustomConfig.get().addDefault("LeaveMessage", " Wyszedl z serwera");
        CustomConfig.get().addDefault("MissingPermissionsMessage", "Nie posiadasz permisji do tej komendy!");
        CustomConfig.get().addDefault("CraftingCommandMessage", "Otworzono crafting table ");
        CustomConfig.get().addDefault("FeedCommandMessage", "Zostałeś pomyślnie nakarmiony ");
        CustomConfig.get().addDefault("FlyOnCommandMessage", "Opcja fly została włączona ");
        CustomConfig.get().addDefault("FlyOffCommandMessage", "Opcja fly została wyłączona ");
        CustomConfig.get().addDefault("GodOnCommandMessage", "Tryb god został włączony ");
        CustomConfig.get().addDefault("GodOffCommandMessage", "Tryb god został wyłączony ");
        CustomConfig.get().addDefault("HealCommandMessage", "Zostałeś uzdrowiony ");
        CustomConfig.get().addDefault("StrikeCommandMessage", "Zespawnowano błyskawicę ");
        CustomConfig.get().addDefault("TntCommandMessage", "Zespawnowano tnt ");
        CustomConfig.get().addDefault("DayCommandMessage", "Ustawiono dzień ");
        CustomConfig.get().addDefault("NightCommandMessage", "Ustawiono noc ");
        CustomConfig.get().options().copyDefaults(true);
        CustomConfig.save();

        //Join/Leave Event
        getServer().getPluginManager().registerEvents(new PlayerJoin(), this);
        getServer().getPluginManager().registerEvents(new PlayerLeave(), this);

        //Commands
        getCommand("heal").setExecutor(new HealCommand());
        getCommand( "feed").setExecutor(new FeedCommand());
        getCommand( "god").setExecutor(new GodCommand());
        getCommand( "fly").setExecutor(new FlyCommand());
        getCommand( "crafting").setExecutor(new CraftingCommand());
        getCommand("strike").setExecutor(new StrikeCommand());
        getCommand("reloadconfig").setExecutor(new ReloadConfigCommand());
        getCommand("tnt").setExecutor(new TntCommand());
        getCommand("floatingtext").setExecutor(new FloatingText());
        getCommand("day").setExecutor(new DayCommand());
        getCommand("night").setExecutor(new NightCommand());
    }

    @Override
    public void onDisable() {
        System.out.println("Plugin Sloth Zatrzymal Dzialanie Pomyslnie");
    }
}
