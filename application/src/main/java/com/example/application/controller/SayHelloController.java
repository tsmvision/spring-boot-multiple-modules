package com.example.application.controller;

import com.example.library.service.HelloService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/hello")
public class SayHelloController {

    private final HelloService helloService;

    @GetMapping
    public ResponseEntity<String> sayHello() {
        return new ResponseEntity<>(helloService.sayHello(), HttpStatus.OK);
    }
}
