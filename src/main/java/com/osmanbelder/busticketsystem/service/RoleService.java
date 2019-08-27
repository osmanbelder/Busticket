package com.osmanbelder.busticketsystem.service;

import com.osmanbelder.busticketsystem.dto.RoleDTO;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface RoleService {
RoleDTO findById(Long id);
Boolean delete(Long id);
RoleDTO save(RoleDTO roleDTO);
List<RoleDTO> findByAllRoleName(String roleName);
RoleDTO update(Long id,RoleDTO roleDTO);

}
