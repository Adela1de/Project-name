package com.luizaugusto.projeto_nome.dtos.userDTOS;

import com.luizaugusto.projeto_nome.entities.Information;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDTO {

    private Long id;
    private boolean isPremium;
    private Information information;
}
