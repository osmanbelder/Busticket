package com.osmanbelder.busticketsystem.controller;

import com.osmanbelder.busticketsystem.dto.RoleDTO;
import com.osmanbelder.busticketsystem.service.impl.RoleServiceImpl;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/role")
public class RoleController {
    private final RoleServiceImpl roleService;

    public RoleController(RoleServiceImpl roleService) {
        this.roleService = roleService;
    }

    @GetMapping("/{id}")
    public RoleDTO findById(@PathVariable("id") Long id) {
        return roleService.findById(id);
    }

    @PostMapping("/save")
    public RoleDTO save(@RequestBody RoleDTO roleDTO) {
        return roleService.save(roleDTO);
    }

    @DeleteMapping("/delete/{id}")
    public Boolean delete(@PathVariable("id") Long id) {
        return roleService.delete(id);
    }

    @PutMapping("/update")
    public RoleDTO update(@PathVariable("id") Long id, @RequestBody RoleDTO roleDTO) {
        return roleService.update(id, roleDTO);
    }
}
