package com.osmanbelder.busticketsystem.service.impl;

import com.osmanbelder.busticketsystem.dto.CityDTO;
import com.osmanbelder.busticketsystem.mapper.CityMapper;
import com.osmanbelder.busticketsystem.model.City;
import com.osmanbelder.busticketsystem.repository.CityRepository;
import com.osmanbelder.busticketsystem.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityServiceImpl implements CityService {
    @Autowired
    private CityRepository cityRepository;

    @Autowired
    private CityMapper cityMapper;

    @Override
    public CityDTO findById(Long cityId) {
        City city = cityRepository.getOne(cityId);
        if (city == null) {
            throw new IllegalArgumentException("This id can not find a city");
        } else {
            return cityMapper.toCityDTO(cityRepository.getOne(cityId));
        }

    }

    @Override
    public CityDTO save(CityDTO cityDTO) {
        return cityMapper.toCityDTO(cityRepository.save(cityMapper.toCity(cityDTO)));
    }

    @Override
    public Boolean delete(Long id) {
        City city = cityRepository.getOne(id);
        if (city == null) {
            return false;
        } else {
            cityRepository.deleteById(id);
            return true;
        }

    }

    @Override
    public List<CityDTO> findAll() {
        return cityMapper.toCityDTOList(cityRepository.findAll());
    }

     @Override
     public CityDTO update(Long id, CityDTO cityDTO) {
         City city = cityRepository.getOne(id);
         if (city == null) {
             return null;
         } else
             return cityMapper.toCityDTO(cityRepository.save(cityMapper.toCity(cityDTO)));

     }



}
