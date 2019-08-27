package com.osmanbelder.busticketsystem.dto;

import lombok.Data;

import java.util.List;

@Data
public class CustomerDTO {
    private Long id;

    private String firstName;

    private String lastName;

    private String email;

    private Long identificationNumber;

    private String address;

    private String customerGender;

    private List<TicketDTO> ticketList;

}
