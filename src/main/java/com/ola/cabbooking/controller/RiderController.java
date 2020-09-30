package com.ola.cabbooking.controller;

import com.ola.cabbooking.dto.RiderDto;
import com.ola.cabbooking.entities.RiderEntity;
import com.ola.cabbooking.model.request.RiderDetailsRequestModel;
import com.ola.cabbooking.model.response.RiderResponse;
import com.ola.cabbooking.service.RiderService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

@RestController
@Component
public class RiderController {

    @Autowired
    RiderService riderService;

    @PostMapping("/rider")
    public RiderResponse registerRider(@RequestBody RiderDetailsRequestModel riderDetails) {

        RiderResponse riderResponse = new RiderResponse();

        //BeanUtils.copyProperties(rider, riderDto);
        ModelMapper mapper = new ModelMapper();
        RiderDto riderDto = mapper.map(riderDetails, RiderDto.class);
        RiderDto createdRider = riderService.createRider(riderDto);

        BeanUtils.copyProperties(createdRider, riderResponse);

        return riderResponse;
    }

    @GetMapping("/rider/{id}")
    public RiderResponse user(@PathVariable String id) {
        RiderResponse riderResponse = new RiderResponse();

        RiderDto createdRider = riderService.getUserByUserId(id);

        BeanUtils.copyProperties(createdRider, riderResponse);
        return riderResponse;
    }
}
