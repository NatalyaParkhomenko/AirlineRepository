package com.example.airlinerepository.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalcController {
    @GetMapping("/calc")
    public void calc(@RequestParam int num1, @RequestParam int num2, @RequestParam String operation) {
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(operation);
        switch (operation) {
            case "+":
                System.out.println(num1 + num2);
                break;
            case "-":
                System.out.println(num1 - num2);
                break;
            case "*":
                System.out.println(num1 * num2);
                break;
            case "/":
                System.out.println(num1 / num2);
                break;
            default:
                break;
        }
    }
}


