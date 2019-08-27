package com.osmanbelder.busticketsystem.service.impl;

import com.osmanbelder.busticketsystem.dto.RoleDTO;
import com.osmanbelder.busticketsystem.mapper.RoleMapper;
import com.osmanbelder.busticketsystem.model.Role;
import com.osmanbelder.busticketsystem.repository.RoleRepository;
import com.osmanbelder.busticketsystem.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleMapper roleMapper;

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public RoleDTO findById(Long id) {
        return roleMapper.toRoleDTO(roleRepository.getOne(id));
    }

    @Override
    public Boolean delete(Long id) {
        Role role=roleRepository.getOne(id);
        if (role==null)
            return false;
        else
            roleRepository.deleteById(id);
            return true;
    }

    @Override
    public RoleDTO save(RoleDTO roleDTO) {
        return roleMapper.toRoleDTO(roleRepository.save(roleMapper.toRole(roleDTO)));
    }

    @Override
    public List<RoleDTO> findByAllRoleName(String roleName) {
        return null;
    }

    @Override
    public RoleDTO update(Long id, RoleDTO roleDTO) {
        return roleMapper.toRoleDTO(roleRepository.save(roleMapper.toRole(roleDTO)));
    }
}
