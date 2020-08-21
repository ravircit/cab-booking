package com.ola.cabbooking.service.Impl;

import com.ola.cabbooking.dto.RiderDto;
import com.ola.cabbooking.entities.RiderEntity;
import com.ola.cabbooking.repository.RiderRepository;
import com.ola.cabbooking.service.RiderService;
import com.ola.cabbooking.shared.Utils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class RiderServiceImpl implements RiderService {

    @Autowired
    RiderRepository riderRepository;
    @Autowired
    Utils utils;
    @Autowired
    BCryptPasswordEncoder bCryptPasswordEncoder;

    public RiderDto createRider(RiderDto riderDto) {
        RiderEntity riderEntity = new RiderEntity();
        BeanUtils.copyProperties(riderDto, riderEntity);

        String publicUserID = utils.generateUserId(10);
        riderEntity.setEncryptedPassword(bCryptPasswordEncoder.encode(riderDto.getPassword()));
        riderEntity.setUserId(publicUserID);

        RiderEntity riderEntityStored = riderRepository.save(riderEntity);

        RiderDto riderDtoStored = new RiderDto();
        BeanUtils.copyProperties(riderEntityStored, riderDtoStored);
        return riderDtoStored;
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        RiderEntity riderEntity=riderRepository.findByEmail(email);
        if(riderEntity.getEmail().isEmpty()) throw new UsernameNotFoundException(email);
        return new User(riderEntity.getEmail(),riderEntity.getEncryptedPassword(),new ArrayList<>());
    }
}
