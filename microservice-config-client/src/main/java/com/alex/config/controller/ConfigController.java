package com.alex.config.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController
{
    @Value("${profile}")
    private String profile;

    @GetMapping("/info")
    public String hello()
    {
        System.out.println("Success");
        return profile;
    }
}
