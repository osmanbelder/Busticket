package com.osmanbelder.busticketsystem.mapper;

import com.osmanbelder.busticketsystem.dto.CustomerDTO;
import com.osmanbelder.busticketsystem.model.Customer;
import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Named;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CustomerMapper {
    @Named("toCustomer")
    Customer toCustomer(CustomerDTO customerDTO);

    @Named("toCustomerDTO")
    CustomerDTO toCostumerDTO(Customer customer);

    @IterableMapping(qualifiedByName = "toCustomer")
    List<Customer> toCostumerList(List<CustomerDTO> customerDTOSList);

    @IterableMapping(qualifiedByName = "toCustomerDTO")
    List<CustomerDTO> toCostumerDTOList(List<Customer> customerList);

}
