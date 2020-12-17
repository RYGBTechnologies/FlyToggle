package com.redblock6.flytoggle.commands;

import org.bukkit.ChatColor; 
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class HelpCommand implements CommandExecutor {
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (cmd.getName().equalsIgnoreCase("flytoggle")) {
			if (sender instanceof Player) {
				Player player = (Player) sender;
				player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&2&m--------------------------------------"));
				player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&2&lFLY TOGGLE"));
				player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7"));
				player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&2&lCOMMAND &a/fly &fto toggle your fly on or off."));
				player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&2&lCOMMAND &a/flytoggle &fdisplays the flytoggle help page."));
				player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&2&m--------------------------------------"));
				return true;
			}
			
				
	    }
		return false;	
		
		
	}

}
