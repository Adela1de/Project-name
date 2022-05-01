package com.luizaugusto.projeto_nome.requests.userrequests;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserPutRequestBody extends UserRequest {

    @JsonIgnore
    private Long id;

}
