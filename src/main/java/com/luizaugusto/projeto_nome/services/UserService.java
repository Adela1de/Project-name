package com.luizaugusto.projeto_nome.services;

import com.luizaugusto.projeto_nome.entities.User;
import com.luizaugusto.projeto_nome.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public Iterable<User> saveAll(Iterable<User> users) { return userRepository.saveAll(users); };

    public Iterable<User> findAll(){ return userRepository.findAll(); }
}
