package com.redblock6.flytoggle;

import org.bukkit.ChatColor;   
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import com.redblock6.flytoggle.commands.FlyCommand;
import com.redblock6.flytoggle.commands.HelpCommand;

@SuppressWarnings("unused")
public class FlyTogglePlugin extends JavaPlugin{
	@Override
	public void onEnable() {
		saveDefaultConfig();
		new FlyCommand(this);
		getLogger().info("STATUS: Disabled -> Enabled - By Redblock6");
		this.getCommand("flytoggle").setExecutor(new HelpCommand());
	}


	@Override
	public void onDisable() {
		getLogger().info("STATUS: Enabled -> Disabled - See you soon! - By Redblock6");
		
	}
		
		
	}
