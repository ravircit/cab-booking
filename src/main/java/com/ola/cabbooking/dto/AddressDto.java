package com.ola.cabbooking.dto;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class AddressDto implements Serializable {
    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private static final long serialVersionUID = 1L;
    private long id;
    //private String addressId;
    private String city;
    private String country;
    private String streetName;
    private String postalCode;
    private String type;
}
