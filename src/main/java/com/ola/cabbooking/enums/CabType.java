package com.ola.cabbooking.enums;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
public enum CabType {
    MINI_CAR("Mini"),SUV("SUV");
    String type;
}
