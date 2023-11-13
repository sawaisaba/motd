package com.sawai.motd_;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.server.ServerListPingEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Motd_ extends JavaPlugin implements Listener {

    private static Motd_ instance;

    public static Motd_ getInstance() {
        return instance;
    }

    @Override
    public void onEnable() {
        instance = this;
        getLogger().info("Plugin enabled!");

        getServer().getPluginManager().registerEvents(this, this);
    }

    @Override
    public void onDisable() {
        getLogger().info("Plugin disabled!");
    }

    @EventHandler
    public void onServerListPing(ServerListPingEvent event) {
        boolean isRunning = true; // ここでサーバーステータスを取得するロジックを追加

        if (isRunning) {
            event.setMotd("サワイ鯖は...[稼働中]");
        } else {
            event.setMotd("サワイ鯖は...[閉鎖中]");
        }
    }
}