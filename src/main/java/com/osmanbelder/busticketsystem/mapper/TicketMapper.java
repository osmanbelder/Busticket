package com.osmanbelder.busticketsystem.mapper;

import com.osmanbelder.busticketsystem.dto.TicketDTO;
import com.osmanbelder.busticketsystem.model.Ticket;
import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Named;

import java.util.List;

@Mapper(componentModel = "spring",uses ={CustomerMapper.class,BusSchedulesMapper.class})
public interface TicketMapper {

    @Named("toTicket")
    Ticket toTicket(TicketDTO ticketDTO);

    @Named("toTicketDTO")
    TicketDTO toTicketDTO(Ticket ticket);

    @IterableMapping(qualifiedByName = "toTicket")
    List<Ticket> toTicketList(List<TicketDTO> ticketDTOList);

    @IterableMapping(qualifiedByName = "toTicketDTO")
    List<TicketDTO> toTicketDTOList(List<Ticket> ticketList);
}
