package com.osmanbelder.busticketsystem.controller;

import com.osmanbelder.busticketsystem.dto.UserDTO;
import com.osmanbelder.busticketsystem.service.impl.UserServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {

    private final UserServiceImpl userService;


    public UserController(UserServiceImpl userService) {
        this.userService = userService;
    }

    @GetMapping("/{id}")
    public UserDTO findById(@PathVariable("id") Long id) {
        return userService.findById(id);
    }

    @PostMapping("/save")
    public UserDTO save(@RequestBody UserDTO userDTO) {
        return userService.save(userDTO);
    }

    @DeleteMapping("/delete/{id}")
    public Boolean delete(@PathVariable Long id) {
        return userService.delete(id);
    }

    @PutMapping("/update")
    public UserDTO update(@PathVariable("id") Long id, @RequestBody UserDTO userDTO) {
        return userService.update(id, userDTO);
    }
}
