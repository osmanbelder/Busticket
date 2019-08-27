package com.osmanbelder.busticketsystem.controller;

import com.osmanbelder.busticketsystem.dto.BusStationDTO;
import com.osmanbelder.busticketsystem.service.impl.BusStationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/busStation")
public class BusStationController {
    @Autowired
    private BusStationServiceImpl busStationService;

    @PostMapping("/save")
    private BusStationDTO save(@RequestBody BusStationDTO busStationDTO) {
        return busStationService.save(busStationDTO);
    }

    @GetMapping("/{id}")
    private BusStationDTO findById(@PathVariable("id") Long id) {
        return busStationService.findById(id);
    }

    @DeleteMapping("/{id}")
    private Boolean delete(@PathVariable("id") Long id) {
        return busStationService.delete(id);
    }

    @PutMapping("/update/{id}")
    private BusStationDTO update(@PathVariable("id") Long id, @RequestBody BusStationDTO busStationDTO) {
        return busStationService.update(id, busStationDTO);
    }

}
