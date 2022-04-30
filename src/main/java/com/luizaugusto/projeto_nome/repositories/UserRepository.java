package com.luizaugusto.projeto_nome.repositories;

import com.luizaugusto.projeto_nome.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
