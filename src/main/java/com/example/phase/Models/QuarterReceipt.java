package com.example.phase.Models;

import java.util.Map;

public class QuarterReceipt extends Services {

    public QuarterReceipt(String name) {
        super(name);
    }

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
