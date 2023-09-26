package com.example.britishAirwaysCheckIn.britishAirwaysCheckIn.service;
import com.example.britishAirwaysCheckIn.britishAirwaysCheckIn.model.BritishCheckIn;
import org.springframework.stereotype.Service;

@Service
public interface CheckInService {

    public BritishCheckIn findCheckIn(String passengerName, String bookReference);
}
