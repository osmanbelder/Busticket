package com.osmanbelder.busticketsystem.controller;

import com.osmanbelder.busticketsystem.dto.TicketDTO;
import com.osmanbelder.busticketsystem.model.Ticket;
import com.osmanbelder.busticketsystem.service.TicketService;
import com.osmanbelder.busticketsystem.service.impl.TicketServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ticket")
public class TicketController {
    @Autowired
    private TicketServiceImpl ticketService;

    @PostMapping("/save")
    private TicketDTO save(@RequestBody TicketDTO ticketDTO) {

        return ticketService.save(ticketDTO);
    }

    @DeleteMapping("/{id}")
    private Boolean delete(@PathVariable("id") Long id) {
        return ticketService.delete(id);
    }

    @GetMapping("/{id}")
    private TicketDTO findById(@PathVariable("id") Long id) {
        return ticketService.findById(id);
    }

    @GetMapping
    private List<TicketDTO> getAll() {
        return ticketService.findAll();
    }

    @PutMapping("/update/{id}")
    private TicketDTO update(@PathVariable("id") Long id, @RequestBody TicketDTO ticketDTO) {
        return ticketService.update(id, ticketDTO);
    }


}
