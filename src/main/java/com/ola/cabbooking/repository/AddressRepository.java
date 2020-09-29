package com.ola.cabbooking.repository;

import com.ola.cabbooking.entities.AddressEntity;
import com.ola.cabbooking.entities.RiderEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends CrudRepository<AddressEntity, Long> {
}
