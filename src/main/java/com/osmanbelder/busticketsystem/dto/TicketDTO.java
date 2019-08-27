package com.osmanbelder.busticketsystem.dto;

import lombok.Data;
import java.util.List;

@Data
public class TicketDTO {

    private Long id;
    private BusSchedulesDTO busSchedules;

    private CustomerDTO customer;

    private Double ticketPrice;


}
