package com.osmanbelder.busticketsystem.dto;

import com.osmanbelder.busticketsystem.model.Role;
import lombok.Data;

import java.util.List;

@Data
public class UserDTO {
    private Long id;

    private String firstName;

    private String lastName;

    private String phone;

    private String email;

    private String userName;

    private String password;

    private List<Role> roleList;

}
