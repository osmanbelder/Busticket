package com.osmanbelder.busticketsystem.controller;

import com.osmanbelder.busticketsystem.dto.BusCrewDTO;
import com.osmanbelder.busticketsystem.model.BusCrew;
import com.osmanbelder.busticketsystem.service.impl.BusCrewServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/busCrew")
public class BusCrewController {
    @Autowired
    private BusCrewServiceImpl busCrewService;

    @PostMapping("/save")
    private BusCrewDTO save(@RequestBody BusCrewDTO busCrewDTO) {
        return busCrewService.save(busCrewDTO);
    }

    @DeleteMapping("/{id}")
    private Boolean delete(@PathVariable("id") Long id) {
        return busCrewService.delete(id);
    }

    @GetMapping("/{id}")
    private BusCrewDTO findById(@PathVariable("id") Long id) {
        return busCrewService.findById(id);
    }

    @GetMapping
    private List<BusCrewDTO> getAll() {
        return busCrewService.findAll();
    }

    @PutMapping("/update/{id}")
    private BusCrewDTO update(@PathVariable("id") Long id, @RequestBody BusCrewDTO busCrewDTO) {
        return busCrewService.update(id, busCrewDTO);
    }

}
