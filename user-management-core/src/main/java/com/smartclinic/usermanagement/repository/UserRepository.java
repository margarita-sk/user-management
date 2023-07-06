package com.smartclinic.usermanagement.repository;

import com.smartclinic.usermanagement.domain.Address;
import com.smartclinic.usermanagement.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User, Long> {
    List<User> findUserByAddress(Address address);
    @Query(value = "SELECT * FROM USER u WHERE u.status = 1", nativeQuery = true)
    List<User>  findAllActive();
}
