package udemy.SpringSecurityBasic.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactController {
    @Bean
    @GetMapping("/contact")
    public String getMyContact(){
        return "Here are the contact details from DB";
    }
}

