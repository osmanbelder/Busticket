package com.osmanbelder.busticketsystem.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "busSchedules")
@Data
public class BusSchedules {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    private BusCrew buscrew;


    @OneToMany(fetch = FetchType.LAZY)
    private List<Ticket> ticketList;


    @Temporal(TemporalType.TIMESTAMP)
    private Date busSchedulesDate;

    @ManyToOne(fetch = FetchType.LAZY)
    private BusStation departureBusStation;

    @ManyToOne(fetch = FetchType.LAZY)
    private BusStation arrivalBusStation;
}
