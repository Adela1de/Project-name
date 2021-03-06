package com.luizaugusto.projeto_nome.controllers;

import com.luizaugusto.projeto_nome.dtos.userDTOS.UserDTO;
import com.luizaugusto.projeto_nome.dtos.userDTOS.UserGetDTO;
import com.luizaugusto.projeto_nome.entities.User;
import com.luizaugusto.projeto_nome.mapper.UserMapper;
import com.luizaugusto.projeto_nome.requests.userrequests.UserPutRequestBody;
import com.luizaugusto.projeto_nome.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.util.stream.Collectors;

@CrossOrigin("*")
@RestController
@RequiredArgsConstructor
@RequestMapping(path = "users")
public class UserController {

    private final UserService userService;

    @GetMapping
    public ResponseEntity<Iterable<UserDTO>> findAll()
    {
        var users = userService.findAll();
        var usersDTO = users.stream().map(UserMapper.INSTANCE::toUserDTO).collect(Collectors.toList());

        return ResponseEntity.ok().body(usersDTO);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<UserGetDTO> findById(@PathVariable Long id)
    {
        var user = userService.findByIdOrElseThrowResponseStatusException(id);
        var userDTO = UserMapper.INSTANCE.toUserGetDTO(user);
        return ResponseEntity.ok().body(userDTO);
    }

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody UserPutRequestBody userPutRequestBody)
    {
        var user = UserMapper.INSTANCE.toUser(userPutRequestBody);
        var userCreated = userService.createUser(user);
        var userDTO = UserMapper.INSTANCE.toUserDTO(user);
        var uri =
            ServletUriComponentsBuilder.
            fromCurrentRequest().
            path("/{id}").
            buildAndExpand(user.getId()).toUri();

        return ResponseEntity.created(uri).body(null);
    }


}

