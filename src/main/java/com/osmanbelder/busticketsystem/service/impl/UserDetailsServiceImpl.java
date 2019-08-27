package com.osmanbelder.busticketsystem.service.impl;

import com.osmanbelder.busticketsystem.model.User;
import com.osmanbelder.busticketsystem.repository.UserRepository;
import net.bytebuddy.implementation.bytecode.Throw;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Arrays;
@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUserName(username);
        if (user == null) {
            throw new UsernameNotFoundException("Invalid UserName or Password");
        }
        return new org.springframework.security.core.userdetails.User(user.getUserName(),user.getPassword(), Arrays.asList(new SimpleGrantedAuthority("USER")));
    }
}
