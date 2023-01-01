package com.example.phase.Controllers;

import com.example.phase.Models.Wallet;
import com.example.phase.Database.TransactionDatabase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Wallet")
public class WalletController {
    private Wallet w;
    private TransactionDatabase tb;

    @Autowired
    public WalletController(Wallet w, TransactionDatabase tb) {
        this.w = w;
        this.tb = tb;
    }


    @PostMapping("/Add/{funds}")
    public String addMoneyToWallet(@PathVariable("funds") double funds) {
        w.addToWallet(funds);
        int id = tb.viewAllTransactions().size() + 1;
        tb.addAddition(id, funds);
        return funds + " is added successfully";


    }

    @GetMapping("/View")
    public String viewAmountOfWallet() {
        return "Wallet's amount is : " + w.getAmount();

    }


}
