package com.ola.cabbooking.model.response;

import com.ola.cabbooking.model.Location;
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
    Location location;
}
