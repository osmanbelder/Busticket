package com.osmanbelder.busticketsystem.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "bus")
@Data
public class Bus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    private Company company;

    @OneToMany(fetch = FetchType.LAZY)
    private List<BusSchedules> busSchedules;

    private String busBrand;

    private String busProperties;

    private String busPlate;

    private String busMenu;

}
