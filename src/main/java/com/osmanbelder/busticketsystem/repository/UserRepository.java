package com.osmanbelder.busticketsystem.repository;

import com.osmanbelder.busticketsystem.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    User findById(long id);

    List<User> findAllByFirstName(String firstName);

    List<User> findAllByLastName(String lastName);

    User findByEmail(String mail);

    User findByUserName(String userName);


}
