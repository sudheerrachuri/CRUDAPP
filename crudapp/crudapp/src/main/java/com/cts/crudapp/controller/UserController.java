package com.cts.crudapp.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @GetMapping
    public ResponseEntity<?> getAllInfo(){
        return null;
    }
    @PostMapping
    public ResponseEntity<?> saveInfo(){
        return null;
    }
    @PutMapping
    public ResponseEntity<?> updateInfo(){
        return null;
    }
    @DeleteMapping
    public ResponseEntity<?> deleteInfo(){
        return null;
    }
}
