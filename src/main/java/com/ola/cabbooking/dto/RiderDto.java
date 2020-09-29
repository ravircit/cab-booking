package com.ola.cabbooking.dto;

import lombok.*;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
public class RiderDto implements Serializable {
    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private static final long serialVersionUID = 1L;
    private long id;
    private String userId;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String encryptedPassword;
    private String emailVerificationToken;
    private Boolean emailVerificationStatus = false;
    private List<AddressDto>addresses;
}
