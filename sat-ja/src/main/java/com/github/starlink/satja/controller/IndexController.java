package com.github.starlink.satja.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @CrossOrigin(origins = "http://localhost:9000")
    @GetMapping("/")
    public ResponseEntity<String> index(){
        return new ResponseEntity<>("Affirmative!", HttpStatus.OK);
    }
}
