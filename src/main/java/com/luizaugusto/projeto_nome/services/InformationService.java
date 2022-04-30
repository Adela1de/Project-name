package com.luizaugusto.projeto_nome.services;

import com.luizaugusto.projeto_nome.entities.Information;
import com.luizaugusto.projeto_nome.repositories.InformationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class InformationService {

    private final InformationRepository informationRepository;

    private List<Information> saveAll(List<Information> information)
    {
        return informationRepository.saveAll(information);
    }

    public List<Information> findAll()
    {
        return informationRepository.findAll();
    }

    public Information findById(Long id)
    {
        var info = informationRepository.findById(id).get();
        return info;
    }

    public Information create(Information information)
    {
        return informationRepository.save(information);
    }

}
