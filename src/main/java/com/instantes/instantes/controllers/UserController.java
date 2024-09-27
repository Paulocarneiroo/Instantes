package com.instantes.instantes.controllers;

import com.instantes.instantes.dto.UserDto;
import com.instantes.instantes.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping(value = "/{name}")
    public ResponseEntity<UserDto> findByName(@PathVariable String name) {
        return ResponseEntity.ok(service.findByName(name));
    }

    @GetMapping
    public ResponseEntity<Page<UserDto>> findAll(Pageable pageable){
        return ResponseEntity
                .ok(service.findAll(pageable));
    }
}
