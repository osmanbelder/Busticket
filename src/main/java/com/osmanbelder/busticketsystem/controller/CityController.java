package com.osmanbelder.busticketsystem.controller;

import com.osmanbelder.busticketsystem.dto.CityDTO;
import com.osmanbelder.busticketsystem.service.impl.CityServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/city")
public class CityController {
    @Autowired
    private CityServiceImpl cityService;

    @PostMapping("/save")
    private CityDTO save(@RequestBody CityDTO cityDTO) {

        return cityService.save(cityDTO);
    }

    @GetMapping("/{id}")
    private CityDTO findById(@PathVariable("id") Long id) {
        return cityService.findById(id);
    }

    @DeleteMapping("/{id}")
    private Boolean delete(@PathVariable("id") Long id) {
        return cityService.delete(id);
    }

    @PutMapping("/update/{id}")
    private CityDTO update(@PathVariable("id") Long id, @RequestBody CityDTO cityDTO) {
        return cityService.update(id, cityDTO);
    }

    @GetMapping
    private List<CityDTO> getAll() {
        return cityService.findAll();
    }

}
