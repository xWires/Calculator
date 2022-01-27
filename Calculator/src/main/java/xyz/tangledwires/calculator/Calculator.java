package xyz.tangledwires.calculator;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public final class Calculator extends JavaPlugin {
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (cmd.getName().equalsIgnoreCase("add")) { 
			if (args.length < 2) {
				sender.sendMessage("Not enough arguments!");
				return false;
			}
			else {
				float num1 = Float.parseFloat(args[0]);
				float num2 = Float.parseFloat(args[1]);
				float sum = num1 + num2;
				String sumStr = Float.toString(sum);
				sender.sendMessage(sumStr);
			}
			return true;
		} 
		else if (cmd.getName().equalsIgnoreCase("subtract")) {
			if (args.length < 2) {
				sender.sendMessage("Not enough arguments!");
				return false;
			}
			else {
				float num1 = Float.parseFloat(args[0]);
				float num2 = Float.parseFloat(args[1]);
				float sub = num1 - num2;
				String subStr = Float.toString(sub);
				sender.sendMessage(subStr);
			}
			return true;
		}
		else if (cmd.getName().equalsIgnoreCase("multiply")) {
			if (args.length < 2) {
				sender.sendMessage("Not enough arguments!");
				return false;
			}
			else {
				float num1 = Float.parseFloat(args[0]);
				float num2 = Float.parseFloat(args[1]);
				float multi = num1 * num2;
				String multiStr = Float.toString(multi);
				sender.sendMessage(multiStr);
			}
			return true;
		}
		else if (cmd.getName().equalsIgnoreCase("divide")) {
			if (args.length < 2) {
				sender.sendMessage("Not enough arguments!");
				return false;
			}
			else {
				float num1 = Float.parseFloat(args[0]);
				float num2 = Float.parseFloat(args[1]);
				float divide = num1 / num2;
				String divideStr = Float.toString(divide);
				sender.sendMessage(divideStr);
			}
			return true;
		}
		return false; 
	}
}