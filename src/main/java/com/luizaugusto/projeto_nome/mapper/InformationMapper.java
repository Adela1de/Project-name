package com.luizaugusto.projeto_nome.mapper;

import com.luizaugusto.projeto_nome.dtos.informationDTOS.InformationDTO;
import com.luizaugusto.projeto_nome.dtos.informationDTOS.InformationGetDTO;
import com.luizaugusto.projeto_nome.entities.Information;
import com.luizaugusto.projeto_nome.requests.informationrequests.InformationPostRequestBody;
import com.luizaugusto.projeto_nome.requests.informationrequests.InformationPutRequestBody;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public abstract class InformationMapper {

    public static final InformationMapper INSTANCE = Mappers.getMapper(InformationMapper.class);

    public abstract InformationDTO toInformationDTO(Information information);

    public abstract InformationGetDTO toInformationGetDTO(Information information);

    public abstract Information toInformation(InformationPostRequestBody informationPostRequestBody);

    public abstract Information toInformation(InformationPutRequestBody informationPutRequestBody);
}
