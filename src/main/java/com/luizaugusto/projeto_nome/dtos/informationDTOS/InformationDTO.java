package com.luizaugusto.projeto_nome.dtos.informationDTOS;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.luizaugusto.projeto_nome.entities.User;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InformationDTO {

    private Long id;
    private String name;
    private Integer age;
    @JsonIgnore
    private User user;
}
