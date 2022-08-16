package com.useful.utils.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author admin
 */
@RestController
public class TestController {
    @GetMapping("/hello")
    public String hello(){
        return "hello good job!!";
    }
}
