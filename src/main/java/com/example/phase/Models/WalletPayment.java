package com.example.phase.Models;


public class WalletPayment implements PaymentMethods {
    private Wallet w;

    public WalletPayment(Wallet w){
        this.w=w;

    }
    @Override
    public String fee(double amount) {
        w.consumeFromWallet(amount);
        return "payment done with wallet and " + amount + " is your transaction's amount";
    }



}
