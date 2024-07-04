package com.example.SpringAccount;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringAccountApplicationController {

    @GetMapping("/SpringAccountApplication")
    public String springAccountApplication() {
        return "This is the Spring Account Application page";
    }
}
