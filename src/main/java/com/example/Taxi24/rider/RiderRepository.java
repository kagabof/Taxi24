package com.example.Taxi24.rider;

import com.example.Taxi24.driver.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RiderRepository extends JpaRepository<Rider, Long> {
    Optional<Driver> findRiderByEmail(String email);

}
