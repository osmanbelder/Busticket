package com.osmanbelder.busticketsystem.controller;

import com.osmanbelder.busticketsystem.dto.BusSchedulesDTO;
import com.osmanbelder.busticketsystem.model.BusSchedules;
import com.osmanbelder.busticketsystem.service.BusSchedulesService;
import com.osmanbelder.busticketsystem.service.impl.BusSchedulesServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/BusSchedules")
public class BusSchedulesController {
    @Autowired
    private BusSchedulesServiceImpl busSchedulesService;

    @PostMapping("/save")
    private BusSchedulesDTO save(@RequestBody BusSchedulesDTO busSchedulesDTO) {
        return busSchedulesService.save(busSchedulesDTO);
    }

    @DeleteMapping("/{id}")
    private Boolean delete(@PathVariable("id") Long id) {
        return busSchedulesService.delete(id);
    }

    @GetMapping("/{id]")
    private BusSchedulesDTO findById(@PathVariable("id") Long id) {
        return busSchedulesService.findById(id);
    }

    @GetMapping
    private List<BusSchedulesDTO> getAll() {
        return busSchedulesService.findAll();
    }

    @PutMapping("/update/{id}")
    private BusSchedulesDTO update(@PathVariable("id") Long id, @RequestBody BusSchedulesDTO busSchedulesDTO) {
        return busSchedulesService.update(id, busSchedulesDTO);
    }
}
