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
				player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&a-------------------&e&lFLY TOGGLE&a-------------------"));
				player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&b- &c/fly &eThis will toggle your fly &aON &eor &cOFF&e!"));
				player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&b- &c/flytoggle &eThis will display this very message!"));
				player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&a----------------------------------------------------"));
				return true;
			}
			
				
	    }
		return false;	
		
		
	}

}
