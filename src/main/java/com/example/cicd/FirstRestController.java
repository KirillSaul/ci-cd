package com.example.cicd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstRestController {
    @GetMapping("/first")
    public Message getFirst()
    {
        return new Message("First page");
    }
}
