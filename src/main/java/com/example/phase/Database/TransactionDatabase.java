package com.example.phase.Database;

import com.example.phase.Models.Transaction;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class TransactionDatabase {
    private final List<Transaction> transactions = new ArrayList<>();

    public List<Transaction> viewAllTransactions() {

        return transactions;
    }

    public List<Transaction> viewRefundTransactions() {
        List<Transaction> results = new ArrayList<>();

        for (Transaction transaction : transactions) {
            if (Objects.equals(transaction.getType(), "Refund")) {
                results.add(transaction);
            }
        }

        return results;
    }

    public void addRefund(int id, double amount) {
        transactions.add(new Transaction(id, "Refund", amount));
    }

    public List<Transaction> viewPaymentTransactions() {
        List<Transaction> results = new ArrayList<>();

        for (Transaction transaction : transactions) {
            if (Objects.equals(transaction.getType(), "Payment")) {
                results.add(transaction);
            }
        }

        return results;
    }

    public void addPayment(int id, double amount) {
        transactions.add(new Transaction(id, "Payment", amount));
    }

    public List<Transaction> viewWalletTransacions() {
        List<Transaction> results = new ArrayList<>();

        for (Transaction transaction : transactions) {
            if (Objects.equals(transaction.getType(), "Addition")) {
                results.add(transaction);
            }
        }

        return results;
    }


    public void addAddition(int id, double amount) {
        transactions.add(new Transaction(id, "Addition", amount));
    }
}
