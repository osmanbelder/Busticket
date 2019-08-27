package com.osmanbelder.busticketsystem.dto;

import lombok.Data;

import java.util.List;


@Data
public class BusDTO {

    private Long id;

    private String busBrand;

    private String busProperties;

    private String busPlate;

    private List<BusSchedulesDTO> busSchedules;

    private CompanyDTO company;

    private String busMenu;
}
