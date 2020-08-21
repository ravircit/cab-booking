package com.ola.cabbooking.dto;

import com.ola.cabbooking.entities.BaseAbstractEntity;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class DriverDto implements Serializable {
    private static final long serialVersionUID = 1L;
    private long id;
    String name;
    String licenseNumber;
    String VehicleType;
    Boolean isAvailable;
}
