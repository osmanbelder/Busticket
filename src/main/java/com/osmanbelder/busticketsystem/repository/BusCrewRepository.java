package com.osmanbelder.busticketsystem.repository;

import com.osmanbelder.busticketsystem.model.BusCrew;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BusCrewRepository extends JpaRepository<BusCrew, Long> {
    BusCrew findById(long id);

    BusCrew findByBusCrewDriverName(String driverName);

    BusCrew findByBusCrewDriverAssistantName(String assistantNAme);

}
