package com.RestApi.restController;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class  WelcomeRestController {

    @GetMapping("/welcome")
    public ResponseEntity<String> getWelcomeMsg(){
        String respayload = "Welcome for Nirbhay";
         return new ResponseEntity<>(respayload , HttpStatus.OK);
    }

    @GetMapping("/greet")
    public String getgreetMsg(){
        String respayload = "Good Morning";
        return respayload;
    }
}
