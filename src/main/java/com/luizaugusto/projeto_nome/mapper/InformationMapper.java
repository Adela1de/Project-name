package com.luizaugusto.projeto_nome.mapper;

import com.luizaugusto.projeto_nome.dtos.InformationDTO;
import com.luizaugusto.projeto_nome.dtos.InformationGetDTO;
import com.luizaugusto.projeto_nome.entities.Information;
import com.luizaugusto.projeto_nome.requests.InformationPostRequestBody;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public abstract class InformationMapper {

    public static final InformationMapper INSTANCE = Mappers.getMapper(InformationMapper.class);

    public abstract InformationDTO toInformationDTO(Information information);

    public abstract InformationGetDTO toInformationGetDTO(Information information);

    public abstract Information toInformation(InformationPostRequestBody informationPostRequestBody);
}
