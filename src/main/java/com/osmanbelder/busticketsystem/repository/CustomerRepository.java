package com.osmanbelder.busticketsystem.repository;

import com.osmanbelder.busticketsystem.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

    Customer findById(long id);

    Customer findByFirstName(String firstName);

    Customer findByLastName(String lastName);

    Customer findByEmail(String Email);

    Customer findByCustomerGender(String gender);


}
