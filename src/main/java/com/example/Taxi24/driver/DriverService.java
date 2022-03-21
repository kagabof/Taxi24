package com.example.Taxi24.driver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DriverService {

    private final  DriverRepository driverRepository;

    @Autowired
    public DriverService(DriverRepository driverRepository) {
        this.driverRepository = driverRepository;
    }

    public List<Driver> getDriver() {
        return driverRepository.findAll();
    }

    public Optional<Driver> getDriverById(Long driverId) {
        return driverRepository.findById(driverId);
    }

    public Driver addNewDriver(Driver driver) {
        Optional<Driver> driverOptional = driverRepository.findDriverByEmail(driver.getEmail());
        if (driverOptional.isPresent()) {
            throw new IllegalStateException("Driver exist");
        }
        driverRepository.save(driver);

        return driver;
    }


}
