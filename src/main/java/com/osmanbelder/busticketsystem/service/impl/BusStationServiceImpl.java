package com.osmanbelder.busticketsystem.service.impl;

import com.osmanbelder.busticketsystem.dto.BusStationDTO;
import com.osmanbelder.busticketsystem.mapper.BusStationMapper;
import com.osmanbelder.busticketsystem.model.BusStation;
import com.osmanbelder.busticketsystem.repository.BusStationRepository;
import com.osmanbelder.busticketsystem.service.BusStationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BusStationServiceImpl implements BusStationService {
    @Autowired
    private BusStationRepository busStationRepository;

    @Autowired
    private BusStationMapper busStationMapper;

    @Override
    public BusStationDTO findById(Long busStationId) {
        return busStationMapper.toBusStationDTO(busStationRepository.getOne(busStationId));
    }

    @Override
    public List<BusStationDTO> findAll() {

        return busStationMapper.toBusStationDTOList(busStationRepository.findAll());
    }

    @Override
    public BusStationDTO save(BusStationDTO busStationDTO) {
        return busStationMapper.toBusStationDTO(busStationRepository.save(busStationMapper.toBusStation(busStationDTO)));
    }

    @Override
    public Boolean delete(Long id) {
        BusStation busStation = busStationRepository.getOne(id);
        if (busStation == null) {
            return false;
        } else {
            busStationRepository.deleteById(id);
            return true;
        }
    }

    @Override
    public BusStationDTO update(Long id, BusStationDTO busStationDTO) {
        BusStation busStation = busStationRepository.getOne(id);
        if (busStation == null) {
            return null;
        } else {
            busStation = busStationMapper.toBusStation(busStationDTO);
            busStation.setId(busStation.getId());
            return busStationMapper.toBusStationDTO(busStationRepository.save(busStationMapper.toBusStation(busStationDTO)));
        }
    }
}
