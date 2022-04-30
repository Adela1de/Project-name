package com.luizaugusto.projeto_nome.requests;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class InformationPostRequestBody extends InformationRequest {

    @JsonIgnore
    private Long id;
}
