package com.example.phase.Controllers;

import com.example.phase.Models.Transaction;
import com.example.phase.Database.TransactionDatabase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/transaction")
public class TransactionController {
    private final TransactionDatabase transD;

    @Autowired
    public TransactionController(TransactionDatabase transD) {
        this.transD = transD;
    }

    @GetMapping("/ViewRefund")
    public List<Transaction> viewRefundTransactions() {
        return transD.viewRefundTransactions();
    }

    @GetMapping("/ViewPayment")
    public List<Transaction> viewPaymentTransaction() {
        return transD.viewPaymentTransactions();
    }

    @GetMapping("/ViewAdd")
    public List<Transaction> viewWalletTransaction() {
        return transD.viewWalletTransacions();
    }
}
