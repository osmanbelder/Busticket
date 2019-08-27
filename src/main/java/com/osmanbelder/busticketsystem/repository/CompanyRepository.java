package com.osmanbelder.busticketsystem.repository;

import com.osmanbelder.busticketsystem.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Long> {
    Company findById(long id);

    Company findByCompanyEstablishmentDate(Date date);

    List<Company> findByBus(String bus);
}
