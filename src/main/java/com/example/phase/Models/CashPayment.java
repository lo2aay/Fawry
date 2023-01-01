package com.example.phase.Models;

public class CashPayment implements PaymentMethods {
    @Override
    public String fee(double amount) {
        return "payment done with cash and " + amount + " is your transaction's amount";
    }
}
