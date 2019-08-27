package com.osmanbelder.busticketsystem.controller;

import com.osmanbelder.busticketsystem.dto.CompanyDTO;
import com.osmanbelder.busticketsystem.service.impl.CompanyServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/company")
public class CompanyController {
    @Autowired
    private CompanyServiceImpl companyService;

    @PostMapping("/save")
    private CompanyDTO save(@RequestBody CompanyDTO companyDTO) {

        return companyService.save(companyDTO);
    }

    @DeleteMapping("/{id}")
    private Boolean delete(@PathVariable("id") Long id) {

        return companyService.delete(id);
    }

    @GetMapping("/{id}")
    private CompanyDTO findById(@PathVariable("id") Long id) {

        return companyService.findById(id);
    }

    @PutMapping("/update/{id}")
    private CompanyDTO update(@PathVariable("id") Long id, @RequestBody CompanyDTO companyDTO) {
        return companyService.update(id, companyDTO);
    }

    @GetMapping
    private List<CompanyDTO> getAll() {
        return companyService.findAll();
    }
}
