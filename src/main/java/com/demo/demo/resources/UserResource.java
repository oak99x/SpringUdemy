package com.demo.demo.resources;

import com.demo.demo.entities.User;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/abc")
public class UserResource {
    
    @GetMapping
    public ResponseEntity<User> fillALl(){
        User u = new User(1L, "Bob", "bob@gmail.com", "999999999", "123456");

        return ResponseEntity.ok().body(u);
    }
}
