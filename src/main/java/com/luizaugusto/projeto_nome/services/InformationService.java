package com.luizaugusto.projeto_nome.services;

import com.luizaugusto.projeto_nome.entities.Information;
import com.luizaugusto.projeto_nome.repositories.InformationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

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

    public Information findByIdOrElseThrowResponseStatusException(Long id)
    {
        return informationRepository.findById(id).orElseThrow(
                () -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    public Information create(Information information)
    {
        return informationRepository.save(information);
    }

    public Information update(Long id, Information information)
    {
        information.setId(id);
        findByIdOrElseThrowResponseStatusException(information.getId());
        return informationRepository.save(information);
    }

}
