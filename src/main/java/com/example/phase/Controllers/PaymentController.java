package com.example.phase.Controllers;

import com.example.phase.Models.*;
import com.example.phase.Database.TransactionDatabase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;
import java.util.Objects;

@RestController
public class PaymentController {
    List<Services> services = List.of(
            new WE("WE"), new Orange("Orange"), new Vodafone("Vodafone"),
            new Etisalat("Etisalat"), new NGOs("NGO"), new QuarterReceipt("QuarterReceipt"),
            new MonthlyReceipt("MonthlyReceipt"), new CancerHospitals("Cancer"), new Schools("Schools"));

    TransactionDatabase transD;
    Wallet wal;

    SpecificDiscount specD;
    OverallDiscount overD;


    @Autowired
    public PaymentController(TransactionDatabase transD, Wallet wal, SpecificDiscount specD, OverallDiscount overD) {
        this.transD = transD;
        this.wal = wal;
        this.specD = specD;
        this.overD = overD;


    }


    public List<Services> getServices() {

        return services;
    }


    @PostMapping("/payment")
    public String fee(@RequestBody Map<String, ?> stringMap) {
        String paymentMethod = stringMap.get("method").toString();
        double money = Double.parseDouble(stringMap.get("money").toString());
        String serviceName = stringMap.get("service").toString();
        money = overD.discountPercentage(money, serviceName);
        money = specD.discountPercentage(money, serviceName);
        for (Services service : services) {
            if (service.getName().equals(serviceName)) {
                if (service.handling(stringMap)) {
                    int id = transD.viewAllTransactions().size() + 1;
                    transD.addPayment(id, money);

                    if (Objects.equals(paymentMethod, "wallet")) {
                        if (wal.getAmount() >= money) {

                            PaymentMethods p = new WalletPayment(wal);
                            return p.fee(money);
                        }
                        return "You don't have enough money";
                    } else if (Objects.equals(paymentMethod, "credit")) {
                        PaymentMethods p = new CreditCardPayment();
                        return p.fee(money);
                    } else {
                        PaymentMethods p = new CashPayment();
                        return p.fee(money);
                    }


                }
            }
        }


        return "Payment Transaction Failed";
    }


}
