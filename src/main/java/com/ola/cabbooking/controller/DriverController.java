package com.ola.cabbooking.controller;

import com.ola.cabbooking.dto.DriverDto;
import com.ola.cabbooking.model.DriverContext;
import com.ola.cabbooking.model.Location;
import com.ola.cabbooking.model.request.DriverRequest;
import com.ola.cabbooking.model.response.DriverResponse;
import com.ola.cabbooking.service.Impl.DriverServiceImpl;
import com.ola.cabbooking.service.TripService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.criteria.CriteriaBuilder;

@RestController
@RequestMapping(path = "/driver")
public class DriverController {
    @Autowired
    DriverServiceImpl driverService;

    @Autowired
    TripService tripService;

    @PostMapping
    public DriverResponse registerCab(@RequestBody DriverRequest driverRequest, Location location) {
        DriverResponse driverResponse = new DriverResponse();
        DriverDto driverDto = new DriverDto();
        BeanUtils.copyProperties(driverRequest, driverDto);
        driverDto = driverService.createDriver(driverDto);
        BeanUtils.copyProperties(driverDto, driverResponse);
        return driverResponse;
    }

    @PostMapping(path="location")
    public ResponseEntity<Object> updateLocation(@RequestBody DriverContext driverContext)
    {
        tripService.updateLocation(driverContext);
        return new ResponseEntity<>("Updated",new HttpHeaders(), HttpStatus.CREATED);
    }

    @PostMapping(path="status")
    public ResponseEntity<Object> updateStatus(@PathVariable Integer driverId,@PathVariable Boolean status)
    {

        return new ResponseEntity<>("Updated",new HttpHeaders(), HttpStatus.CREATED);
    }
}
