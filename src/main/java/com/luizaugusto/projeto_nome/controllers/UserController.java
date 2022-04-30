package com.luizaugusto.projeto_nome.controllers;

import com.luizaugusto.projeto_nome.entities.User;
import com.luizaugusto.projeto_nome.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
@RequiredArgsConstructor
@RequestMapping(path = "users")
public class UserController {

    private final UserService userService;

    @GetMapping
    public ResponseEntity<Iterable<User>> findAll()
    {
        var users = userService.findAll();
        return ResponseEntity.ok().body(users);
    }

}

