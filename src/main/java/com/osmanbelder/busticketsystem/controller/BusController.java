package com.osmanbelder.busticketsystem.controller;

import com.osmanbelder.busticketsystem.dto.BusDTO;
import com.osmanbelder.busticketsystem.model.Bus;
import com.osmanbelder.busticketsystem.service.impl.BusServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bus")
public class BusController {
    @Autowired
    private BusServiceImpl busService;

    @PostMapping("/save")
    private BusDTO save(@RequestBody BusDTO busDTO) {
        return busService.save(busDTO);
    }

    @DeleteMapping("/{id}")
    private Boolean delete(@PathVariable("id") Long id) {
        return busService.delete(id);
    }

    @GetMapping("{id}")
    private BusDTO findById(@PathVariable("id") Long id) {
        return busService.findById(id);
    }

    @PutMapping("{id}")
    private BusDTO update(@PathVariable("id") Long id, @RequestBody BusDTO busDTO) {
        return busService.update(id, busDTO);
    }

    @GetMapping
    private List<BusDTO> getAll() {
        return busService.findAll();
    }
}
