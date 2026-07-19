package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;



/**
 * EmployeeController
 */
@RestController
@RequestMapping("/api/v1")
public class EmployeeController {
    
    @GetMapping("/all-employees")
    public String getEmployee(){
        return "I'm a EMployee";
    }

    
}