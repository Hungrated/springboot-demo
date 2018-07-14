package com.zjuhungrated.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
    @RequestMapping("/test")
    String home() {
        System.out.println("Hello World!");
        return "Hello World!";
    }
}
