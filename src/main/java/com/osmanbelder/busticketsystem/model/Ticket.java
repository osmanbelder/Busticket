package com.osmanbelder.busticketsystem.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "ticket")
@Data
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private BusSchedules busSchedules;

    @ManyToOne
    private Customer customer;

    private Double ticketPrice;
}
