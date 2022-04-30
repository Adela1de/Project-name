package com.luizaugusto.projeto_nome.services;

import com.luizaugusto.projeto_nome.entities.User;
import com.luizaugusto.projeto_nome.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public Iterable<User> saveAll(Iterable<User> users) { return userRepository.saveAll(users); };

    public List<User> findAll(){ return userRepository.findAll(); }
}
