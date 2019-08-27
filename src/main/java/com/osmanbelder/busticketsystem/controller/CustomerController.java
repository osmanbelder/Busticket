package com.osmanbelder.busticketsystem.controller;

import com.osmanbelder.busticketsystem.dto.CustomerDTO;
import com.osmanbelder.busticketsystem.model.Customer;
import com.osmanbelder.busticketsystem.service.CustomerService;
import com.osmanbelder.busticketsystem.service.impl.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private CustomerServiceImpl customerService;

    @PostMapping("/save")
    private CustomerDTO save(@RequestBody CustomerDTO customerDTO) {
        return customerService.save(customerDTO);
    }

    @DeleteMapping("/{id}")
    private Boolean delete(@PathVariable("id") Long id) {
        return customerService.delete(id);
    }

    @GetMapping("/{id}")
    private CustomerDTO findById(@PathVariable("id") Long id) {
        return customerService.findById(id);
    }

    @GetMapping
    private List<CustomerDTO> getAll() {
        return customerService.findAll();
    }

    @PutMapping("/update/{id}")
    private CustomerDTO update(@PathVariable("id") Long id, @RequestBody CustomerDTO customerDTO) {
        return customerService.update(id, customerDTO);
    }

}
