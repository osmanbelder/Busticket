package com.osmanbelder.busticketsystem.service.impl;

import com.osmanbelder.busticketsystem.dto.CustomerDTO;
import com.osmanbelder.busticketsystem.mapper.CustomerMapper;
import com.osmanbelder.busticketsystem.model.Customer;
import com.osmanbelder.busticketsystem.repository.CustomerRepository;
import com.osmanbelder.busticketsystem.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerMapper customerMapper;


    @Override
    public CustomerDTO findById(Long id) {
        return customerMapper.toCostumerDTO(customerRepository.getOne(id));
    }

    @Override
    public CustomerDTO save(CustomerDTO customerDTO) {
        return customerMapper.toCostumerDTO(customerRepository.save(customerMapper.toCustomer(customerDTO)));
    }

    @Override
    public CustomerDTO update(Long id, CustomerDTO customerDTO) {
        Customer customer = customerRepository.getOne(id);
        if (customer == null) return null;
        else {
            return  customerMapper.toCostumerDTO(customerRepository.save(customerMapper.toCustomer(customerDTO)));
        }
    }

    @Override
    public Boolean delete(Long id) {
        Customer customer = customerRepository.getOne(id);
        if (customer == null) return false;
        else {
            customerRepository.deleteById(id);
            return true;
        }
    }

    @Override
    public List<CustomerDTO> findAll() {
        return customerMapper.toCostumerDTOList(customerRepository.findAll());
    }
}
