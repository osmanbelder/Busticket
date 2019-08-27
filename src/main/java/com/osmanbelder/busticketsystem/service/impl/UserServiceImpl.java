package com.osmanbelder.busticketsystem.service.impl;

import com.osmanbelder.busticketsystem.dto.RegistrationRequest;
import com.osmanbelder.busticketsystem.dto.UserDTO;
import com.osmanbelder.busticketsystem.mapper.UserMapper;
import com.osmanbelder.busticketsystem.model.User;
import com.osmanbelder.busticketsystem.repository.UserRepository;
import com.osmanbelder.busticketsystem.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    public UserServiceImpl(UserRepository userRepository, UserMapper userMapper, BCryptPasswordEncoder bCryptPasswordEncoder){
        this.userRepository=userRepository;
        this.userMapper=userMapper;
        this.bCryptPasswordEncoder=bCryptPasswordEncoder;
    }

    @Override
    public UserDTO save(UserDTO userDto) {
        return userMapper.toUserDTO(userRepository.save(userMapper.toUser(userDto)));
    }

    @Override
    public Boolean delete(Long id) {
        User user=userRepository.getOne(id);
        if (user==null)
            return false;
        else
            userRepository.deleteById(id);
            return true;
    }

    @Override
    public UserDTO findById(Long id) {
        return userMapper.toUserDTO(userRepository.getOne(id));
    }

    @Override
    public UserDTO update(Long id, UserDTO userDto) {
        return userMapper.toUserDTO(userRepository.save(userMapper.toUser(userDto)));
    }

    @Override
    public List<UserDTO> findByAllFirstName(String firstName) {
        return null;
    }

    @Override
    public List<UserDTO> findByAllLastName(String lastName) {
        return null;
    }

    @Override
    public UserDTO findByUserName(String userName) {
        return userMapper.toUserDTO(userRepository.findByUserName(userName));
    }

    public Boolean register(RegistrationRequest registrationRequest) {
        try {
            User user= new User();
            user.setEmail(registrationRequest.getEmail());
            user.setFirstName(registrationRequest.getFirstName());
            user.setLastName(registrationRequest.getLastName());
            user.setPassword(bCryptPasswordEncoder.encode(registrationRequest.getPassword()));
            user.setUserName(registrationRequest.getUsername());
            userRepository.save(user);
            return Boolean.TRUE;

        }catch (Exception e){
            log.error("REGISTRATION",e);
            return Boolean.FALSE;
        }


    }
}
