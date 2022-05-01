package com.luizaugusto.projeto_nome.mapper;

import com.luizaugusto.projeto_nome.dtos.userDTOS.UserDTO;
import com.luizaugusto.projeto_nome.dtos.userDTOS.UserGetDTO;
import com.luizaugusto.projeto_nome.entities.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public abstract class UserMapper {

    public static final UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    public abstract UserDTO toUserDTO(User user);

    public abstract UserGetDTO toUserGetDTO(User user);
}
