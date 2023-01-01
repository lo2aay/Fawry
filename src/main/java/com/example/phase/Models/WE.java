package com.example.phase.Models;

import java.util.Map;

public class WE extends Services {
    public WE(String name) {
        super(name);
    }

    @Override
    public boolean handling(Map<String, ?> stringMap) {
        if (stringMap.get("phone") == null) {
            return false;
        }
        if (stringMap.get("money") == null) {
            return false;
        }
        return true;
    }
}