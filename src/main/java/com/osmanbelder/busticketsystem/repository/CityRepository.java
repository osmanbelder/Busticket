package com.osmanbelder.busticketsystem.repository;

import com.osmanbelder.busticketsystem.model.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CityRepository extends JpaRepository<City, Long> {
    City findById(long id);

    City findByCityName(String name);

    List<City> findAllByBusStations(String busStation);
}
