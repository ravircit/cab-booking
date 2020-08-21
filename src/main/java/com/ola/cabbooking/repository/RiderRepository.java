package com.ola.cabbooking.repository;

import com.ola.cabbooking.entities.RiderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RiderRepository extends CrudRepository<RiderEntity, Integer> {
 RiderEntity findByEmail(String email);
}
