package com.luizaugusto.projeto_nome.requests.informationrequests;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class InformationPutRequestBody extends InformationRequest{
    @JsonIgnore
    private Long id;
}
