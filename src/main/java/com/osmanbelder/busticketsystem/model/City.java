package com.osmanbelder.busticketsystem.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "city")
@Data
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(fetch = FetchType.LAZY)
    private List<BusStation> busStations;

    private String cityName;




}
