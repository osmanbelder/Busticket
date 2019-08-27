package com.osmanbelder.busticketsystem.mapper;

import com.osmanbelder.busticketsystem.dto.UserDTO;
import com.osmanbelder.busticketsystem.model.User;
import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Named;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {
    @Named("toUser")
    User toUser(UserDTO userDTO);

    @Named("toUserDTO")
    UserDTO toUserDTO(User user);

    @IterableMapping(qualifiedByName = "toUser")
    List<User> toUserList(List<UserDTO> userDTOList);

    @IterableMapping(qualifiedByName = "toUserDTO")
    List<UserDTO> toUserDTOList(List<User> userList);

}
