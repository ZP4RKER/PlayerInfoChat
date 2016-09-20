package com.zp4rker.pic;

import net.md_5.bungee.api.chat.ComponentBuilder;
import net.md_5.bungee.api.chat.HoverEvent;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class PIC extends JavaPlugin implements Listener {

    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void onPLayerJoin(PlayerJoinEvent event) {

        Player player = event.getPlayer();

        player.spigot().sendMessage(new ComponentBuilder("Hover text!")
                .event(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("The hover text!").create()))
                .create());

        player.spigot().sendMessage(new ComponentBuilder("Entity hover text!")
        .event(new HoverEvent(HoverEvent.Action.SHOW_ENTITY,
                new ComponentBuilder("{name:\"" + player.getName() + "\", type:\"Player\", id:\"" + player.getUniqueId() + "\"}")
                        .create())).create());

    }

}
