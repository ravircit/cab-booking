package com.ola.cabbooking.service.Impl;

import com.ola.cabbooking.dto.DriverDto;
import com.ola.cabbooking.dto.RiderDto;
import com.ola.cabbooking.entities.DriverEntity;
import com.ola.cabbooking.entities.RiderEntity;
import com.ola.cabbooking.repository.DriverRepository;
import com.ola.cabbooking.repository.RiderRepository;
import com.ola.cabbooking.service.DriverService;
import com.ola.cabbooking.service.RiderService;
import com.ola.cabbooking.shared.Utils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class DriverServiceImpl implements DriverService {

    @Autowired
    DriverRepository driverRepository;
    @Autowired
    Utils utils;
    @Autowired
    BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public DriverDto createDriver(DriverDto driverDto) {
        DriverEntity driverEntity=new DriverEntity();
        BeanUtils.copyProperties(driverDto,driverEntity);
        driverEntity=driverRepository.save(driverEntity);
        BeanUtils.copyProperties(driverEntity,driverDto);
        return driverDto;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return null;
    }
}
