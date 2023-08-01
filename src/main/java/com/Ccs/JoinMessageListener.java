package com.Ccs;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.entity.Player;

public class JoinMessageListener implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        Player p = event.getPlayer();
        String name = p.getName();

        String Join = JoinMessage.main.getConfig().getString("JoinMessage");
        event.setJoinMessage(Join.replace("%player%",name));
    }
    @EventHandler
    public void onPlayQuit(PlayerQuitEvent event) {
        Player p = event.getPlayer();
        String name = p.getName();

        String Quit = JoinMessage.main.getConfig().getString("QuitMessage");
        event.setQuitMessage(Quit.replace("%player%",name));
    }
}
