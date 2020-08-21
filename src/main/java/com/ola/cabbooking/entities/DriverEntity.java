package com.ola.cabbooking.entities;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Data
public class DriverEntity extends BaseAbstractEntity {

    @Column(nullable=false)
    String name;
    String licenseNumber;
    String VehicleType;
    Boolean isAvailable;
}
