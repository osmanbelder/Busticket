package com.osmanbelder.busticketsystem.service;

import com.osmanbelder.busticketsystem.dto.TicketDTO;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface TicketService {
    TicketDTO findById(Long id);

    TicketDTO save(TicketDTO ticketDTO);

    Boolean delete(Long id);

    List<TicketDTO> findAll();

    TicketDTO update(Long id, TicketDTO ticketDTO);

}
