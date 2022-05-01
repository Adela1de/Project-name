package com.luizaugusto.projeto_nome.services;

import com.luizaugusto.projeto_nome.entities.User;
import com.luizaugusto.projeto_nome.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public Iterable<User> saveAll(Iterable<User> users) { return userRepository.saveAll(users); };

    public List<User> findAll(){ return userRepository.findAll(); }

    public User findByIdOrElseThrowResponseStatusException(Long id)
    {
        return userRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    public User createUser(User user)
    {
        return userRepository.save(user);
    }
}
