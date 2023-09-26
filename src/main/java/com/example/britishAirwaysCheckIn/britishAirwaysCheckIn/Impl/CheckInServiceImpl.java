package com.example.britishAirwaysCheckIn.britishAirwaysCheckIn.Impl;
import com.example.britishAirwaysCheckIn.britishAirwaysCheckIn.model.BritishCheckIn;
import com.example.britishAirwaysCheckIn.britishAirwaysCheckIn.repository.CheckInRepository;
import com.example.britishAirwaysCheckIn.britishAirwaysCheckIn.service.CheckInService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CheckInServiceImpl implements CheckInService {
    @Autowired
    CheckInRepository checkinRepository;


    @Override
    public BritishCheckIn findCheckIn(String passengerName, String bookReference) {
        BritishCheckIn checkIn = checkinRepository.findCheckIn(passengerName, bookReference);

        // Check if the result is null (no matching record found)
        if (checkIn == null) {
            // Customize the JSON return value for the case when no record is found
            checkIn = new BritishCheckIn();
            checkIn.setBookReference("null");
            checkIn.setCustomerId("null");
            checkIn.setFlightNumber("null");
            checkIn.setPassengerName("null");
            checkIn.setFlightDistance(0);
            checkIn.setSeatNumber("null");
            checkIn.setWhereTo("null");
            checkIn.setFromWhere("null");

        }

        return checkIn;
    }
}
