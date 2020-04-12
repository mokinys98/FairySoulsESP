//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.mokinys98.fairysoulsesp.ESP;

import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;

public class FairyCommand extends CommandBase {
    public FairyCommand() {
    }

    public String getCommandName() {
        return "fairysouls";
    }

    public int getRequiredPermissionLevel() {
        return 0;
    }

    public boolean canSenderUseCommand(ICommandSender sender) {
        return true;
    }

    public void processCommand(ICommandSender sender, String[] args) {

        if (args.length == 0) {
            FairySouls.showGUI = true;
        } else if (args[0].equalsIgnoreCase("debug")) {
            if (FairySouls.debug) {
                FairySouls.debug = false;
                Utils.sendMessage("&7[&c-&7]");
            } else {
                FairySouls.debug = true;
                Utils.sendMessage("&7[&a+&7]");
            }
        } else {
            Utils.sendMessage("&cInvalid Syntax. Use &3/fairysouls");
        }
    }

        public String getCommandUsage(ICommandSender sender) {
        return "/fairysouls";
    }
}
