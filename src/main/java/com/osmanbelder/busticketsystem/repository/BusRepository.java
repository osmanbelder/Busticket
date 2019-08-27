package com.osmanbelder.busticketsystem.repository;

import com.osmanbelder.busticketsystem.model.Bus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BusRepository extends JpaRepository<Bus, Long> {
    Bus findById(long id);

    Bus findByBusBrand(String brand);

    Bus findByBusProperties(String properties);

    Bus findByBusPlate(String busPlate);

    List<Bus> findByBusSchedules(String busSchedules);

    Bus findByCompany(String company);

}
