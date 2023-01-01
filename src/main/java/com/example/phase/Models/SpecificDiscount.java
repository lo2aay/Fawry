package com.example.phase.Models;

import java.util.HashMap;

@org.springframework.stereotype.Service
public class SpecificDiscount extends Discount {

    HashMap<String, Double> hash_map;

    public SpecificDiscount() {
        this.hash_map = new HashMap<String, Double>();
    }

    public HashMap<String, Double> getHash_map() {
        return hash_map;
    }

    public void setService(String service, Double amount) {
        hash_map.put(service, amount);
    }

    @Override
    public double discountPercentage(double amount, String serviceApplied) {
        if (hash_map.get(serviceApplied) != null) {
            double disc = hash_map.get(serviceApplied);
            amount -= (amount * disc / 100);
        }


        return amount;

    }

}
