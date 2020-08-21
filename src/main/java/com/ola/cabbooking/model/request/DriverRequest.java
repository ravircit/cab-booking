package com.ola.cabbooking.model.request;

import lombok.*;

@AllArgsConstructor
@ToString
@NoArgsConstructor
@Getter
@Setter
public class DriverRequest {
    String name;
    String licenseNumber;
    String VehicleType;
    Boolean isAvailable;
}
