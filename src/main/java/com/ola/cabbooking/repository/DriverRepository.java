package com.ola.cabbooking.repository;

import com.ola.cabbooking.entities.DriverEntity;
import com.ola.cabbooking.entities.RiderEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DriverRepository extends CrudRepository<DriverEntity, Integer> {
 DriverEntity findByName(String name);
}
