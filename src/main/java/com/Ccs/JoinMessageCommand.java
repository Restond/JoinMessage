package com.Ccs;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class JoinMessageCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        String A = args[0];
        if (A.equals("help")) {
            sender.sendMessage("��a[JoinMessage] ��b�������");
            sender.sendMessage("��a/JoinMessage reload - �������");
            return true;
        }
        if (A.equals("reload")) {
            JoinMessage.main.reloadConfig();
            sender.sendMessage("��a[JoinMessage] ��c���������");
            return true;
        }
        return false;
    }
}
