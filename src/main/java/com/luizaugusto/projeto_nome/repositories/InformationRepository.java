package com.luizaugusto.projeto_nome.repositories;

import com.luizaugusto.projeto_nome.entities.Information;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InformationRepository extends JpaRepository<Information, Long> {
}
