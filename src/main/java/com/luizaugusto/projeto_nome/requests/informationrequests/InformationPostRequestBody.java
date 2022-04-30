package com.luizaugusto.projeto_nome.requests.informationrequests;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class InformationPostRequestBody extends InformationRequest {

    @JsonIgnore
    private Long id;
}
