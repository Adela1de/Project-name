package com.luizaugusto.projeto_nome.requests.userrequests;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserRequest {

    private Long id;
    private String email;
    private String password;
    private boolean isPremium;
}
