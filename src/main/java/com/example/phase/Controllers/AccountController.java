package com.example.phase.Controllers;

import com.example.phase.Models.Account;
import com.example.phase.Database.AccountDatabase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/account")
public class AccountController {
    private final AccountDatabase AccD;

    @Autowired
    public AccountController(AccountDatabase AccD) {
        this.AccD = AccD;
    }

    @PostMapping("/signin")
    public ResponseEntity<?> signIn(@RequestBody Account account) {
        Account acc = AccD.findAccount(account.getUsername(), account.getPassword());
        if (acc == null) {
            return new ResponseEntity<>("Invalid username or password", HttpStatus.OK);
        }

        return new ResponseEntity<>(acc, HttpStatus.OK);
    }

    @PostMapping("/signup")
    public String signUp(@RequestBody Account account) {
        Account acc = AccD.findAccount(account.getUsername(), account.getPassword());
        if (acc != null) {
            return "This account is registered before";
        }
        AccD.createAccount(account.getUsername(), account.getPassword());
        return "Congratulations, You have an account right now";
    }

    @PostMapping("/search/{service}")
    public String searchService(@PathVariable("service") String service) {
        String mobile = "Mobile recharge services";
        String internet = "Internet payment services";
        String landline = "Landline services";
        String donation = "Donation services";
        ArrayList<String> services = new ArrayList<>();
        services.add(mobile);
        services.add(internet);
        services.add(landline);
        services.add(donation);
        String results = "";
        boolean found = false;
        for (String itr : services) {
            if (itr.toLowerCase().contains(service.toLowerCase())) {
                found = true;
                results += itr + "\n";
            }
        }
        if (found) {
            return results;
        } else {
            return "invalid search";
        }
    }
}
