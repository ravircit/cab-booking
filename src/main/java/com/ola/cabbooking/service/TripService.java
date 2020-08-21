package com.ola.cabbooking.service;

import com.ola.cabbooking.model.DriverContext;
import com.ola.cabbooking.model.Location;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class TripService {
    HashMap<Integer, Location> cabLocation = new HashMap<>();

    public void updateLocation(DriverContext driverContext) {
        cabLocation.put(driverContext.getDriverId(), driverContext.getLocation());
    }
}
