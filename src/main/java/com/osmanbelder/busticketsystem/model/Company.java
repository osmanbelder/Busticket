package com.osmanbelder.busticketsystem.model;


import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "company")
@Data

public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(fetch = FetchType.LAZY)
    private List<Bus> bus;

    @ManyToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE}, mappedBy = "companies")
    private Set<BusStation> busStations =  new HashSet<>();

    //@ManyToMany(mappedBy = "likedBusStations")
    //Set<Company> likes;

    private String companyName;

    @Temporal(TemporalType.DATE)
    private Date companyEstablishmentDate;

}
