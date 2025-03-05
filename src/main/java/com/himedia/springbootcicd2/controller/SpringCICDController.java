package com.himedia.springbootcicd2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringCICDController {
    @GetMapping("/")
    public String index() {
        return "Hello World Hello World Hello World Hello World Hello World !!!!";
    }
}
