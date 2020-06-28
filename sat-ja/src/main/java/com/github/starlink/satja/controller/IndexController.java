package com.github.starlink.satja.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("http://localhost:9007")
@RestController
public class IndexController {

    @GetMapping("/")
    public ResponseEntity<String> index(){
        return new ResponseEntity<>("Affirmative!", HttpStatus.OK);
    }
}
