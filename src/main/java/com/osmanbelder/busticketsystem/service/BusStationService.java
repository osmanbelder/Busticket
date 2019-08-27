package com.osmanbelder.busticketsystem.service;

import com.osmanbelder.busticketsystem.dto.BusStationDTO;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface BusStationService {
    BusStationDTO findById(Long busStationId);

    List<BusStationDTO> findAll();

    BusStationDTO save(BusStationDTO busStationDTO);

    Boolean delete(Long id);

    BusStationDTO update(Long id, BusStationDTO busStationDTO);


}
