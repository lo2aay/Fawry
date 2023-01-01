package com.example.phase.Models;

import java.util.Map;

public class Etisalat extends Services {
    public Etisalat(String name) {
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
        // API call
    }
}