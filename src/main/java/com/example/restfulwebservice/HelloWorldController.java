package com.example.restfulwebservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    //GET
    // /Hello-world (endpoint)
    @GetMapping("/hello-world")
    public String helloWorld() {
        return "Hello World";
    }

}
