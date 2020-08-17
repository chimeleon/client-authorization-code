package com.packt.example.clientauthorizationcode.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserDashboard {
    @Autowired
    private OAuth2RestTemplate restTemplate;
    @GetMapping("/")
    public String home() {
        return "index";
    }

}
