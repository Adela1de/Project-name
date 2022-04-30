package com.luizaugusto.projeto_nome.mapper;

import com.luizaugusto.projeto_nome.dtos.InformationDTO;
import com.luizaugusto.projeto_nome.entities.Information;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public abstract class InformationMapper {

    public static final InformationMapper INSTANCE = Mappers.getMapper(InformationMapper.class);

    public abstract InformationDTO toInformationDTO(Information information);
}
