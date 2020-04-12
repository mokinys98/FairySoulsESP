//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.mokinys98.fairysoulsesp.ESP;

import java.awt.Color;
import java.util.List;
import net.minecraft.util.BlockPos;
import net.minecraftforge.client.event.ClientChatReceivedEvent;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.ClientTickEvent;

public class FairyEvents {
    private static List<String> loopList;
    private static List<String> loopListfound;

    public FairyEvents() {
    }

    @SubscribeEvent
    public void onTick(ClientTickEvent e) {
        if (FairySouls.enabled) {
            fixLists();
        }

        if (FairySouls.showGUI) {
            FairySouls.showGUI = false;
            Utils.mc.displayGuiScreen(new FairyGUI());
        }

    }

    @SubscribeEvent
    public void onRender(RenderWorldLastEvent e) {
        if (Utils.nullCheck() && FairySouls.enabled) {
            for(int i = 0; i < loopList.size(); ++i) {
                String loc = (String)loopList.get(i);
                String[] args = loc.split(",");
                double x = (double)Integer.parseInt(args[0]);
                double y = (double)Integer.parseInt(args[1]);
                double z = (double)Integer.parseInt(args[2]);
                BlockPos pos = new BlockPos(x, y, z);
                if (pos != null) {
                    ESP.re(pos, loopListfound.contains(loc) ? Color.red.getRGB() : Color.GREEN.getRGB());
                }
            }
        }

    }

    @SubscribeEvent
    public void onChat(ClientChatReceivedEvent e) {
        if (Utils.nullCheck() && FairySouls.enabled) {
            String msg = e.message.getUnformattedText().replaceAll("§", "");
            if (msg.startsWith("dlSOUL! fYou found a dFairy Soulf!") || msg.startsWith("You have already found that Fairy Soul!")) {
                for(int i = 0; i < loopList.size(); ++i) {
                    String loc = (String)loopList.get(i);
                    String[] args = loc.split(",");
                    double x = (double)Integer.parseInt(args[0]);
                    double y = (double)Integer.parseInt(args[1]);
                    double z = (double)Integer.parseInt(args[2]);
                    int dist = (int)Math.sqrt(Utils.mc.thePlayer.getPosition().distanceSq(x, y, z));
                    if (dist < 4) {
                        Utils.debugMsg("&eChat message recieved; closest fairy soul is at &3" + loc + "&e, it is &3" + dist + " &eblocks away.");
                        addToFound(loc);
                    }
                }
            }
        }

    }

    private static void fixLists() {
        if (FairySouls.currentSetting == 0) {
            loopList = FairySouls.hub;
            loopListfound = FairySouls.hubfound;
        } else if (FairySouls.currentSetting == 1) {
            loopList = FairySouls.mine;
            loopListfound = FairySouls.minefound;
        } else if (FairySouls.currentSetting == 2) {
            loopList = FairySouls.caverns;
            loopListfound = FairySouls.cavernsfound;
        } else if (FairySouls.currentSetting == 3) {
            loopList = FairySouls.islands;
            loopListfound = FairySouls.islandsfound;
        } else if (FairySouls.currentSetting == 4) {
            loopList = FairySouls.barn;
            loopListfound = FairySouls.barnfound;
        } else if (FairySouls.currentSetting == 5) {
            loopList = FairySouls.desert;
            loopListfound = FairySouls.desertfound;
        } else if (FairySouls.currentSetting == 6) {
            loopList = FairySouls.den;
            loopListfound = FairySouls.denfound;
        } else if (FairySouls.currentSetting == 7) {
            loopList = FairySouls.fortress;
            loopListfound = FairySouls.fortressfound;
        } else if (FairySouls.currentSetting == 8) {
            loopList = FairySouls.end;
            loopListfound = FairySouls.endfound;
        }

    }

    private static void addToFound(String loc) {
        if (FairySouls.currentSetting == 0) {
            FairySouls.hubfound.add(loc);
        } else if (FairySouls.currentSetting == 1) {
            FairySouls.minefound.add(loc);
        } else if (FairySouls.currentSetting == 2) {
            FairySouls.cavernsfound.add(loc);
        } else if (FairySouls.currentSetting == 3) {
            FairySouls.islandsfound.add(loc);
        } else if (FairySouls.currentSetting == 4) {
            FairySouls.barnfound.add(loc);
        } else if (FairySouls.currentSetting == 5) {
            FairySouls.desertfound.add(loc);
        } else if (FairySouls.currentSetting == 6) {
            FairySouls.denfound.add(loc);
        } else if (FairySouls.currentSetting == 7) {
            FairySouls.fortressfound.add(loc);
        } else if (FairySouls.currentSetting == 8) {
            FairySouls.endfound.add(loc);
        }

    }
}
