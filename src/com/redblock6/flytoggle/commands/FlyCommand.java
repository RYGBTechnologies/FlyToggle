package com.redblock6.flytoggle.commands;

import net.minecraft.server.v1_8_R3.IChatBaseComponent;
import net.minecraft.server.v1_8_R3.PacketPlayOutTitle;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftPlayer;
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
	if (p.hasPermission("redblock.fly")) {
		    if (p.getAllowFlight()) {
			p.setFlying(false);
			p.setAllowFlight(false);
			p.sendMessage(Utils.chat(plugin.getConfig().getString("flying_disabled")));
			PacketPlayOutTitle title = new PacketPlayOutTitle(PacketPlayOutTitle.EnumTitleAction.TITLE, IChatBaseComponent.ChatSerializer.a("{\"text\":\"§4§lFLY DISABLED\"}"), 10, 0, 10);
			((CraftPlayer) p).getHandle().playerConnection.sendPacket(title);
			return true;
		} else {
			p.setAllowFlight(true);
			p.sendMessage(Utils.chat(plugin.getConfig().getString("flying_enabled")));
			PacketPlayOutTitle title = new PacketPlayOutTitle(PacketPlayOutTitle.EnumTitleAction.TITLE, IChatBaseComponent.ChatSerializer.a("{\"text\":\"§2§lFLY ENABLED\"}"), 10, 0, 10);
			((CraftPlayer) p).getHandle().playerConnection.sendPacket(title);
			return true;
		}
	}
	
	return false;
	
}


}
