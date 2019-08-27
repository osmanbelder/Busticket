package com.osmanbelder.busticketsystem.repository;

import com.osmanbelder.busticketsystem.dto.RoleDTO;
import com.osmanbelder.busticketsystem.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoleRepository extends JpaRepository<Role,Long> {
    Role findById(long id);
    List<Role> findAllByRoleName(String role);


}
