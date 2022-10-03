package com.sinaukoding.tokosinau.entity.mapping;

import com.sinaukoding.tokosinau.entity.User;
import com.sinaukoding.tokosinau.entity.dto.ResponseAuthDTO;
import com.sinaukoding.tokosinau.entity.dto.UserDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface UserMapping {
    UserMapping instance = Mappers.getMapper(UserMapping.class);

    User toEntity(UserDTO dto);

    UserDTO toDto(User param);

    List<UserDTO> toListDto(List<User> data);

    ResponseAuthDTO fromEntityToResponseDto(User data);

    ResponseAuthDTO fromDtoToResponseDto(UserDTO data);


}
