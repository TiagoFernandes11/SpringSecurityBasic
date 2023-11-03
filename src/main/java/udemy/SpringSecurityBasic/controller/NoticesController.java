package udemy.SpringSecurityBasic.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NoticesController {
    @Bean
    @GetMapping("/notices")
    public String getNotices(){
        return "Here are the notices details from DB";
    }
}
