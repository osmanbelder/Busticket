package com.osmanbelder.busticketsystem.service.impl;

import com.osmanbelder.busticketsystem.dto.TicketDTO;
import com.osmanbelder.busticketsystem.mapper.TicketMapper;
import com.osmanbelder.busticketsystem.model.Ticket;
import com.osmanbelder.busticketsystem.repository.TicketRepository;
import com.osmanbelder.busticketsystem.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class TicketServiceImpl implements TicketService {
    @Autowired
    private TicketRepository ticketRepository;

    @Autowired
    private TicketMapper ticketMapper;

    @Override
    public TicketDTO findById(Long id) {
        return ticketMapper.toTicketDTO(ticketRepository.getOne(id));
    }

    @Override
    public TicketDTO save(TicketDTO ticketDTO) {
        return ticketMapper.toTicketDTO(ticketRepository.save(ticketMapper.toTicket(ticketDTO)));

    }

    @Override
    public Boolean delete(Long id) {
        Ticket ticket = ticketRepository.getOne(id);
        if (ticket == null)
            return false;
        else {
            ticketRepository.deleteById(id);
            return true;

        }
    }

    @Override
    public List<TicketDTO> findAll() {
        return ticketMapper.toTicketDTOList(ticketRepository.findAll());
    }

    @Override
    public TicketDTO update(Long id, TicketDTO ticketDTO) {
        Ticket ticket = ticketRepository.getOne(id);
        if (ticket == null)
            return null;
        else {
            ticket = ticketMapper.toTicket(ticketDTO);
            ticket.setId(ticket.getId());
            return ticketMapper.toTicketDTO(ticketRepository.save(ticketMapper.toTicket(ticketDTO)));

        }
    }
}
