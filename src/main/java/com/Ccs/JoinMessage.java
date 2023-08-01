package com.Ccs;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class JoinMessage extends JavaPlugin {

    static JoinMessage main;

    @Override
    public void onEnable() {
        System.out.println("§a[JoinMessage] 插件加载成功！");

        getCommand("JoinMessage").setExecutor(new JoinMessageCommand());
        Bukkit.getPluginManager().registerEvents(new JoinMessageListener(),this);

        saveDefaultConfig();
        main = this;
    }
    @Override
    public void onDisable() {
        System.out.println("§a[JoinMessage] 插件卸载成功！");
    }

}
