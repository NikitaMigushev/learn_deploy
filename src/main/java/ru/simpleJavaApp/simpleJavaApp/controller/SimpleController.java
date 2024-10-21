package ru.simpleJavaApp.simpleJavaApp.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping({"/api/test"})
public class SimpleController {
    @GetMapping("/hello")
    ResponseEntity<String> test() {
        return ResponseEntity.ok("Hello from backend!");
    }
}
