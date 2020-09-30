package com.ola.cabbooking.model.request;

import com.ola.cabbooking.model.Location;
import lombok.*;

@AllArgsConstructor
@ToString
@NoArgsConstructor
@Getter
@Setter
public class DriverRequestModel {
    String name;
    String licenseNumber;
    String VehicleType;
    Boolean isAvailable;
    Location location;
}
