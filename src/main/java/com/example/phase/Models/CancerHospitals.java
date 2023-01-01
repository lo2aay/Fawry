package com.example.phase.Models;

import java.util.Map;

public class CancerHospitals extends Services {


    public CancerHospitals(String name) {
        super(name);
    }

    public boolean handling(Map<String, ?> stringMap) {

        if (stringMap.get("amount") == null) {
            return false;
        }
        return true;
    }

}
