package com.osmanbelder.busticketsystem.dto;

import lombok.Data;

import java.util.List;

@Data
public class CityDTO {
    private Long id;

    private String cityName;

    private List<BusStationDTO> busStation;
}
