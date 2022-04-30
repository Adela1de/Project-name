package com.luizaugusto.projeto_nome.controllers;

import com.luizaugusto.projeto_nome.dtos.InformationDTO;
import com.luizaugusto.projeto_nome.mapper.InformationMapper;
import com.luizaugusto.projeto_nome.services.InformationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@CrossOrigin("*")
@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/informations")
public class InformationController {

    private final InformationService informationService;

    @GetMapping
    public ResponseEntity<List<InformationDTO>> findAll()
    {
        var info = informationService.findAll();
        var infoDTO =
                info.
                stream().
                map(InformationMapper.INSTANCE::toInformationDTO).
                collect(Collectors.toList());

        return ResponseEntity.ok().body(infoDTO);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<InformationDTO> findById(@PathVariable Long id)
    {
        var info = informationService.findById(id);
        var infoDTO = InformationMapper.INSTANCE.toInformationDTO(info);
        return ResponseEntity.ok().body(infoDTO);
    }

}
