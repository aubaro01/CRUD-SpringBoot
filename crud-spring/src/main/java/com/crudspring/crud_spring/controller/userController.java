package com.crudspring.crud_spring.controller;

import org.springframework.web.bind.annotation.RestController;
import com.crudspring.crud_spring.service.userService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import com.crudspring.crud_spring.entity.user;


@RestController
@RequestMapping(value = "/api/v1")
@RequiredArgsConstructor

public class userController {

    private final userService userService;

    @GetMapping
    public ResponseEntity<List<user>> findAllUser(){
        return ResponseEntity.ok().body(userService.findAll());

    }
    
    

}
