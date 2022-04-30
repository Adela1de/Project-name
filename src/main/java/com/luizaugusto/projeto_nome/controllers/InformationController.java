package com.luizaugusto.projeto_nome.controllers;

import com.luizaugusto.projeto_nome.dtos.InformationDTO;
import com.luizaugusto.projeto_nome.dtos.InformationGetDTO;
import com.luizaugusto.projeto_nome.mapper.InformationMapper;
import com.luizaugusto.projeto_nome.requests.InformationPostRequestBody;
import com.luizaugusto.projeto_nome.requests.InformationPutRequestBody;
import com.luizaugusto.projeto_nome.services.InformationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

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
    public ResponseEntity<InformationGetDTO> findById(@PathVariable Long id)
    {
        var info = informationService.findByIdOrElseThrowResponseStatusException(id);
        var infoDTO = InformationMapper.INSTANCE.toInformationGetDTO(info);
        return ResponseEntity.ok().body(infoDTO);
    }


    @PostMapping
    public ResponseEntity<InformationDTO> createInformation
            (@RequestBody InformationPostRequestBody informationPostRequestBody)
    {
        var info = InformationMapper.INSTANCE.toInformation(informationPostRequestBody);
        var createdInfo = informationService.create(info);
        var infoDTO = InformationMapper.INSTANCE.toInformationDTO(createdInfo);
        var uri =
                ServletUriComponentsBuilder.
                fromCurrentRequest().
                path("/{id}").
                buildAndExpand(infoDTO.getId()).toUri();

        return ResponseEntity.created(uri).body(null);
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<InformationDTO> updateInformation
            (@PathVariable Long id, @RequestBody InformationPutRequestBody informationPutRequestBody)
    {
        var info = InformationMapper.INSTANCE.toInformation(informationPutRequestBody);
        var updatedInfo = informationService.update(id, info);
        var infoDTO = InformationMapper.INSTANCE.toInformationDTO(updatedInfo);
        return ResponseEntity.ok().body(infoDTO);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Void> deleteInformation(@PathVariable Long id)
    {
        informationService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
