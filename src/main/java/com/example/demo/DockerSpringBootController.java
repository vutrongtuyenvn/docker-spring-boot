package com.example.demo;


import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
@Scope("request")
public class DockerSpringBootController {
    @GetMapping
    public String test(){
        return "hello world";
    }
}
