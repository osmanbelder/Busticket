package com.osmanbelder.busticketsystem.repository;

import com.osmanbelder.busticketsystem.model.BusStation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BusStationRepository extends JpaRepository<BusStation, Long> {

    BusStation findById(long id);

    BusStation findByCity_CityName(String cityName);
}