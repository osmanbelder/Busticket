package com.osmanbelder.busticketsystem.service;

import com.osmanbelder.busticketsystem.dto.CityDTO;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface CityService {

    CityDTO findById(Long cityId);

    CityDTO save(CityDTO cityDTO);

    Boolean delete(Long id);

    List<CityDTO> findAll();

    CityDTO update(Long id, CityDTO cityDTO);


}
