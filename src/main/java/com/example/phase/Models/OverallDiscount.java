package com.example.phase.Models;

import org.springframework.stereotype.Service;

@Service
public class OverallDiscount extends Discount {
    private double discountPercentage;

    @Override
    public double discountPercentage(double amount, String serviceApplied) {
        amount -= (amount * discountPercentage / 100);

        return amount;

    }

    public void setDiscountPercentage(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }


}
