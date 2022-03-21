package com.example.Taxi24.rider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/rider")
public class RiderController {

    private final RiderService riderService;

    @Autowired
    public  RiderController(RiderService riderService) {
        this.riderService = riderService;
    }

    @GetMapping
    public List<Rider> getRider() {
        return riderService.getRiders();
    }

    @PostMapping
    public void registerRider(@RequestBody Rider rider) {
        riderService.addNewRider(rider);
    }

    @GetMapping(path = "{riderId}")
    public Optional<Rider> getByIdRider(@PathVariable("riderId") Long riderId) {
        return riderService.getRiderById(riderId);
    }
}
