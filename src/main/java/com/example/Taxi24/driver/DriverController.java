package com.example.Taxi24.driver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/driver")
public class DriverController {
    private final DriverService driverService;

    @Autowired
    public  DriverController(DriverService driverService) {
        this.driverService = driverService;
    }

    @GetMapping
    public List<Driver> getDriver() {
        return driverService.getDriver();
    }

    @PostMapping
    public void registerDriver(@RequestBody  Driver driver) {
        driverService.addNewDriver(driver);
    }

    @GetMapping(path = "{driverId}")
    public Optional<Driver> getByIdDriver(@PathVariable("driverId") Long driverId) {
        return driverService.getDriverById(driverId);
    }
}
