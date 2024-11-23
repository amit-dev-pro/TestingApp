package com.amit.TestingApp.controllers;


import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {

    public ResponseEntity<String> healthCheckController(){
        return ResponseEntity.ok("ok");
    }
}
