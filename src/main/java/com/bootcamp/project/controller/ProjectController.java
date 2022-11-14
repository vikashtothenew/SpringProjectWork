package com.bootcamp.project.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProjectController {
    @GetMapping("/home")
    public String homepage(){
        return "This is home page";
    }
}
