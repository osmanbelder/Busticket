package com.osmanbelder.busticketsystem.service;

import com.osmanbelder.busticketsystem.dto.BusSchedulesDTO;
import com.osmanbelder.busticketsystem.model.BusSchedules;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface BusSchedulesService {

    BusSchedulesDTO findById(Long id);

    List<BusSchedulesDTO> findAll();

    BusSchedulesDTO save(BusSchedulesDTO busSchedulesDTO);

    Boolean delete(Long id);

    BusSchedulesDTO update(Long id, BusSchedulesDTO busSchedulesDTO);
}
