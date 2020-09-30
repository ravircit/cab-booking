package com.ola.cabbooking.service;

import com.ola.cabbooking.dto.RiderDto;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

@Service
public interface RiderService extends UserDetailsService {
    RiderDto createRider(RiderDto riderDto);
    RiderDto getUser(String email);
    RiderDto getUserByUserId(String Id);
}
