package com.example.britishAirwaysCheckIn.britishAirwaysCheckIn.repository;

import com.example.britishAirwaysCheckIn.britishAirwaysCheckIn.model.BritishCheckIn;
import org.hibernate.type.descriptor.converter.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CheckInRepository extends JpaRepository<BritishCheckIn,Integer> {
    @Query(value = "SELECT c FROM BritishCheckIn c WHERE passengerName = :passengerName AND bookReference = :bookReference")
    public BritishCheckIn findCheckIn(@Param("passengerName") String passengerName, @Param("bookReference") String bookReference);
}
