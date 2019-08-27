package com.osmanbelder.busticketsystem.repository;

import com.osmanbelder.busticketsystem.model.Bus;
import com.osmanbelder.busticketsystem.model.BusSchedules;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface BusSchedulesRepository extends JpaRepository<BusSchedules, Long> {

    BusSchedules findById(long id);

    BusSchedules findByBusSchedulesDate(Date date);

    BusSchedules findByDepartureBusStation_busStationName(String busStationDepartureName);

    BusSchedules findByArrivalBusStation_busStationName(String busStationArrivalName);

}


