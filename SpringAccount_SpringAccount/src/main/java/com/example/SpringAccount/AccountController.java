package com.example.SpringAccount;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    @GetMapping("/")
    public String home() {
        return "Welcome to Spring Account Application";
    }

    @GetMapping("/main")
    public String getMainOutputs() {
        StringBuilder output = new StringBuilder();

        // Create ChequeAccount and perform operations
        ChequeAccount ca1 = new ChequeAccount(1000);
        ca1.setOdl(200);
        ca1.credit(500);

        output.append("Cheque Account ca1 object's data:\n")
              .append(ca1.toString()).append("\n\n");

        output.append("Attempting to debit 800 from ChequeAccount ca1:\n");
        if (ca1.debit(800)) {
            output.append("Debit of 800 Successful\n");
        } else {
            output.append("Debit of 800 Failed\n");
        }

        output.append("\nUpdated balance:\n")
              .append(ca1.toString()).append("\n\n");

        // Create InterestAccount and perform operations
        InterestAccount myacc = new InterestAccount(10000, 0.25);
        myacc.addMonthlyInterest();

        output.append("Interest Account myacc object's data:\n")
              .append(myacc.toString()).append("\n\n");

        myacc.setRate(0.1);
        myacc.addMonthlyInterest();

        output.append("Updated interest calculations:\n")
              .append(myacc.toString());

        return output.toString();
    }
}
