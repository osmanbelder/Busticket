package com.osmanbelder.busticketsystem.service.impl;

import com.osmanbelder.busticketsystem.dto.BusDTO;
import com.osmanbelder.busticketsystem.mapper.BusMapper;
import com.osmanbelder.busticketsystem.model.Bus;
import com.osmanbelder.busticketsystem.repository.BusRepository;
import com.osmanbelder.busticketsystem.service.BusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BusServiceImpl implements BusService {
    @Autowired
    private BusRepository busRepository;

    @Autowired
    private BusMapper busMapper;

    @Override
    public BusDTO findById(Long id) {

        return busMapper.toBusDTO(busRepository.getOne(id));
    }

    @Override
    public BusDTO save(BusDTO busDTO) {

        return busMapper.toBusDTO(busRepository.save(busMapper.toBus(busDTO)));
    }

    @Override
    public Boolean delete(Long id) {
        Bus bus = busRepository.getOne(id);
        if (bus == null)
            return false;
        else {
            busRepository.deleteById(id);
            return true;
        }
    }

    @Override
    public List<BusDTO> findAll() {
        return busMapper.toBusDTOList(busRepository.findAll());
    }


    @Override
    public BusDTO update(Long id, BusDTO busDTO) {
        Bus bus = busRepository.getOne(id);
        if (bus == null)
            return null;
        else {
            bus = busMapper.toBus(busDTO);
            bus.setBusBrand(bus.getBusBrand());
            bus.setBusPlate(bus.getBusPlate());
            bus.setId(bus.getId());
            return busMapper.toBusDTO(busRepository.save(busMapper.toBus(busDTO)));

        }
    }
}
