package com.osmanbelder.busticketsystem.service;

import com.osmanbelder.busticketsystem.dto.CompanyDTO;
import com.osmanbelder.busticketsystem.model.Company;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface CompanyService {
    CompanyDTO findById(Long id);

    CompanyDTO save(CompanyDTO companyDTO);

    Boolean delete(Long id);

    List<CompanyDTO> findAll();

    CompanyDTO update(Long id, CompanyDTO companyDTO);

}
