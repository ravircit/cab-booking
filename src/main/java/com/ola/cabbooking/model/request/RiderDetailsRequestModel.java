package com.ola.cabbooking.model.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RiderDetailsRequestModel {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
}
