package com.osmanbelder.busticketsystem.service.impl;

import com.osmanbelder.busticketsystem.dto.BusCrewDTO;
import com.osmanbelder.busticketsystem.mapper.BusCrewMapper;
import com.osmanbelder.busticketsystem.model.BusCrew;
import com.osmanbelder.busticketsystem.repository.BusCrewRepository;
import com.osmanbelder.busticketsystem.service.BusCrewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BusCrewServiceImpl implements BusCrewService {
    @Autowired
    private BusCrewRepository busCrewRepository;

    @Autowired
    private BusCrewMapper busCrewMapper;

    @Override
    public BusCrewDTO findById(Long id) {
        return busCrewMapper.toBusCrewDTO(busCrewRepository.getOne(id));
    }

    @Override
    public BusCrewDTO save(BusCrewDTO busCrewDTO) {
        return busCrewMapper.toBusCrewDTO(busCrewRepository.save(busCrewMapper.toBusCrew(busCrewDTO)));
    }

    @Override
    public BusCrewDTO update(Long id, BusCrewDTO busCrewDTO) {
        BusCrew busCrew = busCrewRepository.getOne(id);
        if (busCrew == null)
            return null;
        else {
            busCrew = busCrewMapper.toBusCrew(busCrewDTO);
            busCrew.setId(busCrew.getId());
            busCrew.setBusCrewDriverName(busCrew.getBusCrewDriverName());
            busCrew.setBusCrewDriverAssistantName(busCrew.getBusCrewDriverAssistantName());

            return busCrewMapper.toBusCrewDTO(busCrewRepository.save(busCrewMapper.toBusCrew(busCrewDTO)));
        }
    }

    @Override
    public Boolean delete(Long id) {
        BusCrew busCrew = busCrewRepository.getOne(id);
        if (busCrew == null)
            return false;
        else {
            busCrewRepository.deleteById(id);
            return true;
        }

    }

    @Override
    public List<BusCrewDTO> findAll() {
        return busCrewMapper.toBusCrewDTOList(busCrewRepository.findAll());

    }
}
