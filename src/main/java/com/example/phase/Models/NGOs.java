package com.example.phase.Models;

import java.util.Map;

public class NGOs extends Services {

    public NGOs(String name) {
        super(name);
    }

    public boolean handling(Map<String, ?> stringMap) {
        if (stringMap.get("money") == null) {
            return false;
        }

        return true;
    }
}
