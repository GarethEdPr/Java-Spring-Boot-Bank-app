package com.example.SpringAccount;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringAccountApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringAccountApplication.class, args);
    }

    @Bean
    public ChequeAccount createChequeAccount() {
        ChequeAccount ca1 = new ChequeAccount(1000);
        ca1.setOdl(200);
        ca1.credit(500);

        return ca1;
    }

    @Bean
    public InterestAccount createInterestAccount() {
        InterestAccount myacc = new InterestAccount(10000, 0.25);
        myacc.addMonthlyInterest();

        return myacc;
    }
}
