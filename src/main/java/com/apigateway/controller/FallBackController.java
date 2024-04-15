package com.apigateway.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackController {
    @GetMapping("/accountServiceFallBack")
    public String getAccountFallBack(){
        return "Account Method Not Working";
    }
    @GetMapping("/contactServiceFallBack")
    public String getContactFallBack(){
        return "Contact Method Not Working";
    }

    @GetMapping("/customerServiceFallBack")
    public String getCustomerFallBack(){
        return "Customer Method Not Working";
    }
}
