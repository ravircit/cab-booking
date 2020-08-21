package com.ola.cabbooking.model.response;

import lombok.*;

@AllArgsConstructor
@ToString
@NoArgsConstructor
@Getter
@Setter
public class DriverResponse {
    long id;
    String name;
    String licenseNumber;
    String VehicleType;
    Boolean isAvailable;
}
