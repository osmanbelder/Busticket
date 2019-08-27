package com.osmanbelder.busticketsystem.service.impl;

import com.osmanbelder.busticketsystem.dto.BusSchedulesDTO;
import com.osmanbelder.busticketsystem.mapper.BusSchedulesMapper;
import com.osmanbelder.busticketsystem.model.BusSchedules;
import com.osmanbelder.busticketsystem.repository.BusSchedulesRepository;
import com.osmanbelder.busticketsystem.service.BusSchedulesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BusSchedulesServiceImpl implements BusSchedulesService {
    @Autowired
    private BusSchedulesRepository busSchedulesRepository;

    @Autowired
    private BusSchedulesMapper busSchedulesMapper;

    @Override
    public BusSchedulesDTO findById(Long id) {
        return busSchedulesMapper.toBusSchedulesDTO(busSchedulesRepository.getOne(id));
    }

    @Override
    public List<BusSchedulesDTO> findAll() {
        return busSchedulesMapper.toBusSchedulesDTOList(busSchedulesRepository.findAll());
    }

    @Override
    public BusSchedulesDTO save(BusSchedulesDTO busSchedulesDTO) {
        return busSchedulesMapper.toBusSchedulesDTO(busSchedulesRepository.save(busSchedulesMapper.toBusSchedules(busSchedulesDTO)));
    }

    @Override
    public Boolean delete(Long id) {
        BusSchedules busSchedules = busSchedulesRepository.getOne(id);
        if (busSchedules == null)
            return false;
        else {
            busSchedulesRepository.deleteById(id);
            return true;
        }
    }

    @Override
    public BusSchedulesDTO update(Long id, BusSchedulesDTO busSchedulesDTO) {
        BusSchedules busSchedules = busSchedulesRepository.getOne(id);
        if (busSchedules == null)
            return null;
        else {
       /*     busSchedules = busSchedulesMapper.toBusSchedules(busSchedulesDTO);

            busSchedules.setBusSchedulesDate(busSchedules.getBusSchedulesDate());

            busSchedules.setId(busSchedules.getId());

            busSchedules.setBusSchedulesTime(busSchedules.getBusSchedulesTime());

            busSchedules.setBuscrew(busSchedules.getBuscrew());

            busSchedules.setTicket(busSchedules.getTicket());*/

            return busSchedulesMapper.toBusSchedulesDTO(busSchedulesRepository.save(busSchedulesMapper.toBusSchedules(busSchedulesDTO)));
        }
    }
}
