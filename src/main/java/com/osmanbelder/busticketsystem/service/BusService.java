package com.osmanbelder.busticketsystem.service;

import com.osmanbelder.busticketsystem.dto.BusDTO;
import com.osmanbelder.busticketsystem.model.Bus;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface BusService {
    BusDTO findById(Long id);

    BusDTO save(BusDTO busDTO);

    Boolean delete(Long id);

    List<BusDTO> findAll();

    BusDTO update(Long id, BusDTO busDTO);

}
