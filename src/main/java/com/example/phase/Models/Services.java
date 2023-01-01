package com.example.phase.Models;

import java.util.Map;

public abstract class Services {
    private final String name;


    protected Services(String name) {
        this.name = name;
    }

    public abstract boolean handling(Map<String, ?> stringMap);

    public String getName() {
        return name;
    }
}
