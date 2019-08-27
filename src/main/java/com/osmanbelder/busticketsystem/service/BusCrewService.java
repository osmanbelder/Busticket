package com.osmanbelder.busticketsystem.service;

import com.osmanbelder.busticketsystem.dto.BusCrewDTO;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface BusCrewService {
    BusCrewDTO findById(Long id);

    BusCrewDTO save(BusCrewDTO busCrewDTO);

    BusCrewDTO update(Long id, BusCrewDTO busCrewDTO);

    Boolean delete(Long id);

    List<BusCrewDTO> findAll();
}
