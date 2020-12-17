package com.redblock6.flytoggle.commands;

import org.bukkit.command.Command;      
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import com.redblock6.flytoggle.FlyTogglePlugin;
import com.redblock6.flytoggle.utils.Utils;

public class FlyCommand implements CommandExecutor {
	private FlyTogglePlugin plugin;

public FlyCommand(FlyTogglePlugin main) {
	this.plugin = main;
	
	main.getCommand("fly").setExecutor(this);
	
   }
@Override
public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
	
	if (!(sender instanceof Player)) {
		sender.sendMessage(Utils.chat(plugin.getConfig().getString("console_error_message")));
		
		return true;
		
	}
	
	Player p = (Player) sender;
	if (p.hasPermission("flytoggle.fly")) {
		    if (p.getAllowFlight()) {
			p.setFlying(false);
			p.setAllowFlight(false);
			p.sendMessage(Utils.chat(plugin.getConfig().getString("flying_disabled")));
			return true;
		} else {
			p.setAllowFlight(true);
			p.sendMessage(Utils.chat(plugin.getConfig().getString("flying_enabled")));
			return true;
		}
	}
	
	return false;
	
}


}
