package com.ola.cabbooking.model.response;

import com.ola.cabbooking.dto.AddressDto;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class RiderResponse {

    private String userId;
    private String firstName;
    private String lastName;
    private String email;
    List<AddressDto>addresses;
}
