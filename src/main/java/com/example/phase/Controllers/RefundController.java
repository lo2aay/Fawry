package com.example.phase.Controllers;

import com.example.phase.Models.Wallet;
import com.example.phase.Database.TransactionDatabase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.Objects;

@RestController
public class RefundController {

    TransactionDatabase tb;
    Wallet w;

    @Autowired
    public RefundController(TransactionDatabase tb, Wallet w) {
        this.tb = tb;
        this.w = w;
    }

    @PostMapping("/refund/{index}")
    public String addRequest(@PathVariable("index") int idIndex) {
        int id = tb.viewAllTransactions().size() + 1;
        double money = tb.viewAllTransactions().get(idIndex - 1).getAmount();
        tb.addRefund(id, money);
        return "Request of index: " + idIndex + " send to the admin";
    }


    @PostMapping("/requestStatus")
    public String status(@RequestBody Map<String, ?> stringMap) {
        int idIndex = Integer.parseInt(stringMap.get("TransactionIndex").toString());
        double money = tb.viewAllTransactions().get(idIndex - 1).getAmount();


        if (Objects.equals(stringMap.get("status").toString(), "Accept")) {
            w.addToWallet(money);
            return "Response accepted by admin and your wallet increased with " + money + " pounds";

        } else {
            return "Refund request refused";
        }

    }
}


