package com.example.phase.Models;

public class Payment {
    private final String service;
    private final String method;
    private final int amount;

    public Payment(String service, String method, int amount) {
        this.service = service;
        this.method = method;
        this.amount = amount;
    }

    public String getService() {
        return service;
    }

    public int getAmount() {
        return amount;
    }

    public String getMethod() {
        return method;
    }
}
