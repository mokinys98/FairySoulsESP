//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.mokinys98.fairysoulsesp.ESP;

import net.minecraft.client.Minecraft;
import net.minecraft.util.ChatComponentText;

public class Utils {
    public static Minecraft mc = Minecraft.getMinecraft();

    public Utils() {
    }

    public static boolean nullCheck() {
        return mc.thePlayer != null && mc.thePlayer != null;
    }

    public static void sendMessage(String msg) {
        if (nullCheck()) {
            mc.thePlayer.addChatMessage(new ChatComponentText(replace(msg)));
        }

    }

    public static void debugMsg(String msg) {
        if (FairySouls.debug) {
            sendMessage("&7[&bDEBUG&7]&r " + msg);
        }

    }

    public static String replace(String text) {
        return text.replaceAll("&", "§");
    }
}
