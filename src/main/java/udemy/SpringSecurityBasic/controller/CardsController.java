package udemy.SpringSecurityBasic.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CardsController {
    @Bean
    @GetMapping("/myCards")
    public String getMyCards(){
        return "Here are the cards details from DB";
    }
}

