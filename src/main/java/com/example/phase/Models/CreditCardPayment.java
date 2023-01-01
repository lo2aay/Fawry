package com.example.phase.Models;

public class CreditCardPayment implements PaymentMethods {
    @Override
    public String fee(double amount) {
        return "payment done with credit card and " + amount + " is your transaction's amount";
    }
}
