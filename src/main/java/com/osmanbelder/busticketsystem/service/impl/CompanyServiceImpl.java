package com.osmanbelder.busticketsystem.service.impl;

import com.osmanbelder.busticketsystem.dto.CompanyDTO;
import com.osmanbelder.busticketsystem.mapper.CompanyMapper;
import com.osmanbelder.busticketsystem.model.Company;
import com.osmanbelder.busticketsystem.repository.CompanyRepository;
import com.osmanbelder.busticketsystem.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyServiceImpl implements CompanyService {

    @Autowired
    private CompanyRepository companyRepository;

    @Autowired
    private CompanyMapper companyMapper;

    @Override
    public CompanyDTO findById(Long id) {
        return companyMapper.toCompanyDTO(companyRepository.getOne(id));
    }

    @Override
    public CompanyDTO save(CompanyDTO companyDTO) {
        return companyMapper.toCompanyDTO(companyRepository.save(companyMapper.toCompany(companyDTO)));
    }

    @Override
    public Boolean delete(Long id) {
        Company company = companyRepository.getOne(id);
        if (company == null)
            return false;
        else {
            companyRepository.deleteById(id);
            return true;
        }
    }

    @Override
    public List<CompanyDTO> findAll() {
        return companyMapper.toCompanyDTOList(companyRepository.findAll());
    }

    @Override
    public CompanyDTO update(Long id, CompanyDTO companyDTO) {
        Company company = companyRepository.getOne(id);
        if (company == null)
            return null;
        else {
            return  companyMapper.toCompanyDTO(companyRepository.save(companyMapper.toCompany(companyDTO)));
        }
    }
}
