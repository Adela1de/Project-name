package com.luizaugusto.projeto_nome.dtos.userDTOS;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.luizaugusto.projeto_nome.entities.User;

public class UserGetDTO extends User {

    @JsonIgnore
    private Long id;
}
