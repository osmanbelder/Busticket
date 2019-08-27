package com.osmanbelder.busticketsystem.controller;

import com.osmanbelder.busticketsystem.dto.LoginRequest;
import com.osmanbelder.busticketsystem.dto.RegistrationRequest;
import com.osmanbelder.busticketsystem.dto.TokenResponse;
import com.osmanbelder.busticketsystem.model.User;
import com.osmanbelder.busticketsystem.repository.UserRepository;
import com.osmanbelder.busticketsystem.security.JwtTokenUtil;
import com.osmanbelder.busticketsystem.service.impl.UserServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.web.bind.annotation.*;


@CrossOrigin(origins = "+", maxAge = 3600)
@RestController
@RequestMapping("/token")

public class AccountController {

    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private JwtTokenUtil jwtTokenUtil;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserServiceImpl userService;


    @RequestMapping(method = RequestMethod.POST)//Client give username and password
    public ResponseEntity<TokenResponse> login(@RequestBody LoginRequest request) throws AuthenticationException {
        authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(request.getUsername(), request.getPassword()));
        final User user = userRepository.findByUserName(request.getUsername());
        final String token = jwtTokenUtil.generateToken(user);
        //System gives the token and username
        return ResponseEntity.ok(new TokenResponse(user.getUserName(), token));
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public ResponseEntity<Boolean> register(@RequestBody RegistrationRequest registrationRequest) throws AuthenticationException {
        Boolean response = userService.register(registrationRequest);
        return ResponseEntity.ok(response);
    }

}
