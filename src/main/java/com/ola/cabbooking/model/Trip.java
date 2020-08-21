package com.ola.cabbooking.model;

import com.ola.cabbooking.entities.RiderEntity;
import com.ola.cabbooking.enums.TripStatus;
import lombok.NonNull;
import lombok.ToString;

import static com.ola.cabbooking.enums.TripStatus.FINISHED;
import static com.ola.cabbooking.enums.TripStatus.IN_PROGRESS;

@ToString
public class Trip {
    private RiderEntity riderEntity;
    //private Cab cab;
    private TripStatus status;
    private Double price;
    private Location fromPoint;
    private Location toPoint;

    public Trip(
            @NonNull final RiderEntity riderEntity,
            //@NonNull final Cab cab,
            @NonNull final Double price,
            @NonNull final Location fromPoint,
            @NonNull final Location toPoint) {
        this.riderEntity = riderEntity;
        //this.cab = cab;
        this.price = price;
        this.fromPoint = fromPoint;
        this.toPoint = toPoint;
        this.status = IN_PROGRESS;
    }

    public void endTrip() {
        this.status = FINISHED;
    }
}
