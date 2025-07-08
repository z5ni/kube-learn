package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;

@RestController
public class AppController {
    @Value("${MY_ACCOUNT:default}")
    private String myAccount;

    @Value("${MY_PASSWORD:default}")
    private String myPassword;

    @GetMapping("/")
    public String home() {
        return "myAccount: " + myAccount + ", myPassword: " + myPassword;
    }
}