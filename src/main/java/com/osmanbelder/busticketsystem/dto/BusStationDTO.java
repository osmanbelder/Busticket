package com.osmanbelder.busticketsystem.dto;

import com.osmanbelder.busticketsystem.model.BusSchedules;
import com.osmanbelder.busticketsystem.model.Company;
import lombok.Data;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
public class BusStationDTO {

    private Long id;

    private String busStationName;

    private CityDTO city;

    private Set<Company> companies = new HashSet<>();
}
