package com.example.Taxi24.driver;
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DriverRepository extends JpaRepository<Driver, Long> {

    Optional<Driver> findDriverByEmail(String email);

//    @Query("SELECT s FROM DRIVER s WHERE s.email = ?1")
//    Driver findSingleDriverByEmail(String email);

}
