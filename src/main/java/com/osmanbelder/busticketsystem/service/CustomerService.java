package com.osmanbelder.busticketsystem.service;

import com.osmanbelder.busticketsystem.dto.CustomerDTO;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface CustomerService {

    CustomerDTO findById(Long id);

    CustomerDTO save(CustomerDTO customerDTO);

    CustomerDTO update(Long id, CustomerDTO customerDTO);

    Boolean delete(Long id);

    List<CustomerDTO> findAll();
}
