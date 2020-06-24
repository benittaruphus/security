package com.ben.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/ben")
    public ResponseEntity home() {
        System.out.println("Hello, World !!!");
        return new ResponseEntity(HttpStatus.OK);
    }

    @PostMapping("/beni")
    public ResponseEntity home1() {
        System.out.println("Hello, World !!!");
        return new ResponseEntity(HttpStatus.OK);
    }
}