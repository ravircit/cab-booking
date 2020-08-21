package com.ola.cabbooking.controller;

import com.ola.cabbooking.dto.RiderDto;
import com.ola.cabbooking.entities.RiderEntity;
import com.ola.cabbooking.model.request.RiderDetailsRequestModel;
import com.ola.cabbooking.model.response.RiderResponse;
import com.ola.cabbooking.service.RiderService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Component
public class RiderController {

    @Autowired
    RiderService riderService;

    @PostMapping("/rider")
    public RiderResponse registerRider(@RequestBody RiderDetailsRequestModel rider) {
        RiderDto riderDto = new RiderDto();
        RiderResponse riderResponse = new RiderResponse();

        BeanUtils.copyProperties(rider, riderDto);
        RiderDto createdRider = riderService.createRider(riderDto);

        BeanUtils.copyProperties(createdRider, riderResponse);
        return riderResponse;
    }

    @GetMapping("/rider")
    public RiderEntity user() {
        return new RiderEntity();
    }
}
