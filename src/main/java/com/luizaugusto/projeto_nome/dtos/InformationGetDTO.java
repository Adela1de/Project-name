package com.luizaugusto.projeto_nome.dtos;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class InformationGetDTO extends InformationDTO{

    @JsonIgnore
    private Long id;
}
