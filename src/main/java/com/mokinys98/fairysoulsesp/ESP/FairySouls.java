//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.mokinys98.fairysoulsesp.ESP;

import java.util.ArrayList;
import java.util.List;

public class FairySouls {
    public static boolean debug = false;
    public static boolean enabled = false;
    public static boolean showGUI = false;
    public static int currentSetting = 0;
    public static List<String> hub = new ArrayList();
    public static List<String> islands = new ArrayList();
    public static List<String> den = new ArrayList();
    public static List<String> fortress = new ArrayList();
    public static List<String> mine = new ArrayList();
    public static List<String> caverns = new ArrayList();
    public static List<String> barn = new ArrayList();
    public static List<String> desert = new ArrayList();
    public static List<String> end = new ArrayList();
    public static List<String> hubfound = new ArrayList();
    public static List<String> islandsfound = new ArrayList();
    public static List<String> denfound = new ArrayList();
    public static List<String> fortressfound = new ArrayList();
    public static List<String> minefound = new ArrayList();
    public static List<String> cavernsfound = new ArrayList();
    public static List<String> barnfound = new ArrayList();
    public static List<String> desertfound = new ArrayList();
    public static List<String> endfound = new ArrayList();

    public FairySouls() {
    }

    public static void setup() {
        hub();
        islands();
        den();
        fortress();
        mine();
        caverns();
        barn();
        desert();
        end();
    }

    public static void setCurrent(int i) {
        currentSetting = i;
    }

    private static void hub() {
        hub.add("-1,70,-108");
        hub.add("30,71,-62");
        hub.add("38,70,-96");
        hub.add("16,88,-42");
        hub.add("-43,79,-41");
        hub.add("-56,76,-65");
        hub.add("-58,69,-117");
        hub.add("-34,70,-30");
        hub.add("-71,78,-82");
        hub.add("20,81,-17");
        hub.add("-45,92,-13");
        hub.add("9,75,13");
        hub.add("10,179,22");
        hub.add("22,132,25");
        hub.add("2,181,31");
        hub.add("131,99,-77");
        hub.add("87,77,43");
        hub.add("110,67,58");
        hub.add("49,121,69");
        hub.add("86,89,66");
        hub.add("145,61,-42");
        hub.add("43,152,73");
        hub.add("43,120,70");
        hub.add("57,90,79");
        hub.add("155,62,28");
        hub.add("40,108,78");
        hub.add("48,78,81");
        hub.add("162,46,69");
        hub.add("148,112,88");
        hub.add("147,53,88");
        hub.add("169,73,-29");
        hub.add("176,64,42");
        hub.add("113,102,106");
        hub.add("132,144,114");
        hub.add("149,116,115");
        hub.add("96,106,121");
        hub.add("111,120,127");
        hub.add("138,66,129");
        hub.add("82,61,196");
        hub.add("-133,74,133");
        hub.add("-152,67,123");
        hub.add("-48,76,49");
        hub.add("-166,79,93");
        hub.add("-52,161,43");
        hub.add("-183,80,29");
        hub.add("-191,102,109");
        hub.add("-195,55,153");
        hub.add("-207,100,66");
        hub.add("-214,103,89");
        hub.add("-229,123,84");
        hub.add("-233,86,84");
        hub.add("-252,132,51");
        hub.add("-225,72,-21");
        hub.add("-142,77,-31");
        hub.add("-259,114,85");
        hub.add("-260,96,48");
        hub.add("-262,102,67");
        hub.add("-208,70,-80");
        hub.add("-187,92,-104");
        hub.add("10,65,-160");
        hub.add("-86,74,-117");
        hub.add("-13,79,-166");
        hub.add("-15,61,-166");
        hub.add("34,72,-162");
        hub.add("70,90,-149");
        hub.add("72,71,-190");
        hub.add("-3,193,32");
        hub.add("-32,71,21");
        hub.add("-39,191,34");
        hub.add("-50,132,32");
        hub.add("-56,115,28");
        hub.add("-60,108,3");
        hub.add("180,63,-15");
        hub.add("-245,75,149");
        hub.add("-261,56,115");
    }

    private static void islands() {
        islands.add("-257,50,-19");
        islands.add("-318,90,2");
        islands.add("-286,119,-93");
        islands.add("-261,151,-85");
        islands.add("-345,141,-94");
        islands.add("-382,131,-25");
        islands.add("-388,107,-61");
    }

    private static void den() {
        den.add("-245,71,-210");
        den.add("-254,183,-265");
        den.add("-256,161,-278");
        den.add("-254,215,-277");
        den.add("-269,152,-252");
        den.add("-284,89,-178");
        den.add("-291,97,-277");
        den.add("-317,87,-217");
        den.add("-342,121,-199");
        den.add("-335,81,-277");
        den.add("-244,88,-314");
        den.add("-225,73,-362");
        den.add("-215,95,-339");
        den.add("-202,113,-305");
        den.add("-177,95,-338");
        den.add("-152,79,-343");
    }

    private static void fortress() {
        fortress.add("-314,96,-402");
        fortress.add("-309,146,-427");
        fortress.add("-373,136,-398");
        fortress.add("-336,91,-447");
        fortress.add("-323,139,-443");
        fortress.add("-389,105,-462");
        fortress.add("-379,119,-478");
        fortress.add("-216,62,-481");
        fortress.add("-320,77,-503");
        fortress.add("-300,75,-545");
        fortress.add("-431,79,-564");
        fortress.add("-433,208,-579");
        fortress.add("-431,79,-564");
        fortress.add("-236,84,-592");
        fortress.add("-313,39,-677");
        fortress.add("-374,172,-683");
        fortress.add("-306,107,-691");
        fortress.add("-347,133,-694");
        fortress.add("-181,90,-608");
        fortress.add("-317,203,-739");
    }

    private static void mine() {
        mine.add("-47,75,-298");
        mine.add("-62,104,-289");
        mine.add("-37,78,-308");
        mine.add("17,86,-312");
        mine.add("21,36,-320");
        mine.add("-44,100,-344");
        mine.add("-26,94,-340");
        mine.add("-1,80,-337");
        mine.add("19,57,-341");
        mine.add("-19,142,-364");
        mine.add("-23,113,-353");
        mine.add("-11,76,-395");
    }

    private static void caverns() {
        caverns.add("3,152,85");
        caverns.add("18,74,74");
        caverns.add("-21,25,72");
        caverns.add("3,182,50");
        caverns.add("0,65,57");
        caverns.add("3,14,51");
        caverns.add("9,170,44");
        caverns.add("-60,37,52");
        caverns.add("-35,127,28");
        caverns.add("-18,163,26");
        caverns.add("44,98,23");
        caverns.add("57,161,19");
        caverns.add("29,149,14");
        caverns.add("-2,255,-1");
        caverns.add("-40,72,0");
        caverns.add("-11,102,-16");
        caverns.add("-71,13,5");
        caverns.add("-76,13,24");
        caverns.add("-8,74,-44");
        caverns.add("71,167,-12");
    }

    private static void barn() {
        barn.add("155,23,-204");
        barn.add("143,90,-243");
        barn.add("182,99,-235");
        barn.add("96,96,-287");
        barn.add("99,112,-275");
        barn.add("126,91,-304");
        barn.add("183,99,-305");
    }

    private static void desert() {
        desert.add("136,63,-382");
        desert.add("150,82,-371");
        desert.add("169,73,-383");
        desert.add("198,61,-342");
        desert.add("215,85,-409");
        desert.add("217,94,-366");
        desert.add("221,91,-422");
        desert.add("228,115,-400");
    }

    private static void end() {
        end.add("-518,100,-294");
        end.add("-547,91,-259");
        end.add("-490,80,-275");
        end.add("-588,122,-275");
        end.add("-699,116,-256");
        end.add("-748,105,-282");
        end.add("-587,48,-291");
        end.add("-721,76,-221");
        end.add("-659,36,-200");
        end.add("-611,85,-237");
        end.add("-582,208,-274");
        end.add("-490,23,-174");
    }
}
