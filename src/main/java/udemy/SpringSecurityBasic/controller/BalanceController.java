package udemy.SpringSecurityBasic.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BalanceController {
    @Bean
    @GetMapping("/myBalance")
    public String getMyBalance(){
        return "Here are the balance details from DB";
    }
}
