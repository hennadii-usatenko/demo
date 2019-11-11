package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class ProjectEulerController {
    @GetMapping("/projecteuler/problem/1")
    public int problem1(@RequestParam(required = false, defaultValue = "3") int multiples1,
                        @RequestParam(required = false, defaultValue = "5") int multiples2,
                        @RequestParam(required = false, defaultValue = "1000") int below) {
        int sum = 0;
        for (int i = 1; i < below; i++) {
            if (i % multiples1 == 0 || i % multiples2 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
