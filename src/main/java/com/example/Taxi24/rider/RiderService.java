package com.example.Taxi24.rider;

import com.example.Taxi24.driver.Driver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RiderService {
    private final RiderRepository riderRepository;

    @Autowired
    public RiderService(RiderRepository riderRepository) {
        this.riderRepository = riderRepository;
    }

    public List<Rider> getRiders() {
        return riderRepository.findAll();
    }

    public Optional<Rider> getRiderById(Long riderId) {
        return riderRepository.findById(riderId);
    }

    public Rider addNewRider(Rider rider) {
        Optional<Driver> driverOptional = riderRepository.findRiderByEmail(rider.getEmail());
        if (driverOptional.isPresent()) {
            throw new IllegalStateException("Rider exist");
        }
        riderRepository.save(rider);

        return rider;
    }
}
