package com.osmanbelder.busticketsystem.service;

import com.osmanbelder.busticketsystem.dto.UserDTO;
import com.osmanbelder.busticketsystem.model.User;
import com.osmanbelder.busticketsystem.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
public interface UserService {
    UserDTO save(UserDTO userDto);

    Boolean delete(Long id);

    UserDTO findById(Long id);

    UserDTO update(Long id,UserDTO userDto);

    List<UserDTO> findByAllFirstName(String firstName);

    List<UserDTO> findByAllLastName(String lastName);

    UserDTO findByUserName(String userName);
}
