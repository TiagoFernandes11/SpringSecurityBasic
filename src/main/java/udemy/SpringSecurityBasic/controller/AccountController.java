package udemy.SpringSecurityBasic.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {
    @Bean
    @GetMapping("/myAccount")
    public String getAccountDetails(){
        return "Here are the account details from DB";
    }
}
