package com.clientbase.module;

public enum Category {
    MOVEMENT("Movement"),
    VISUAL("Visual");

    public final String name;

    Category(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
