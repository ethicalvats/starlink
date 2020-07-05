package com.github.starlink.satja.controller;

import com.github.starlink.satja.service.BufferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("http://localhost:9007")
@RestController
public class IndexController {

    BufferService bufferService;

    @Autowired
    public IndexController(BufferService bufferService){
        this.bufferService = bufferService;
    }

    @GetMapping("/")
    public ResponseEntity<String> index(){
        this.bufferService.init();
        return new ResponseEntity<>("Affirmative!", HttpStatus.OK);
    }
}
