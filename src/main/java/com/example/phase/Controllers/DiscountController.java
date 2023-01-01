package com.example.phase.Controllers;

import com.example.phase.Models.OverallDiscount;
import com.example.phase.Models.SpecificDiscount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class DiscountController {

    private SpecificDiscount specD;
    private OverallDiscount overD;

    @Autowired
    public DiscountController(SpecificDiscount specD, OverallDiscount overD) {
        this.specD = specD;
        this.overD = overD;
    }

    // one to many
    @PostMapping("/overallDiscount")
    public String setOverallDisc(@RequestBody Map<String, ?> stringMap) {
        double amount = Double.parseDouble(stringMap.get("amount").toString());
        overD.setDiscountPercentage(amount);

        return amount + "% " + "is now applied for all services";
    }

    //many to many
    @PostMapping("/specificDiscount")
    public String setSpecificDisc(@RequestBody Map<String, ?> body) {
        double amount = Double.parseDouble(body.get("amount").toString());
        String service = body.get("service").toString();
        specD.setService(service, amount);
        return amount + "% " + "is now applied for " + service;

    }


}
