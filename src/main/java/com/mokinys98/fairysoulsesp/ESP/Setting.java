package com.mokinys98.fairysoulsesp.ESP;

public enum Setting {
    HUB("Hub"),
    MINE("Gold Mine"),
    CAVERNS("Deep Caverns"),
    ISLANDS("Floating Islands"),
    BARN("The Barn"),
    DESERT("Mushroom Desert"),
    DEN("Spiders Den"),
    FORTRESS("Blazing Fortress"),
    END("The End");

    private String name;

    private Setting(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
