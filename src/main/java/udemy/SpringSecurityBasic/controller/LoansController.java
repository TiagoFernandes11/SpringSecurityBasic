package udemy.SpringSecurityBasic.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoansController {
    @Bean
    @GetMapping("/myLoans")
    public String getMyLoans(){
        return "Here are the loans details from DB";
    }
}
