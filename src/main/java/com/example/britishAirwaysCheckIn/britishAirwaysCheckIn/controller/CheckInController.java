package com.example.britishAirwaysCheckIn.britishAirwaysCheckIn.controller;

import com.example.britishAirwaysCheckIn.britishAirwaysCheckIn.model.BritishCheckIn;
import com.example.britishAirwaysCheckIn.britishAirwaysCheckIn.model.CheckInRequest;
import com.example.britishAirwaysCheckIn.britishAirwaysCheckIn.model.CheckInResponse;
import com.example.britishAirwaysCheckIn.britishAirwaysCheckIn.service.CheckInService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/britishairways/checkin")
public class CheckInController {

    @Autowired
    CheckInService checkinService;

    @PostMapping("/")
    public CheckInResponse findCheckIn(@RequestBody CheckInRequest checkinRequest) {
        BritishCheckIn britishcheckin =  checkinService.findCheckIn(checkinRequest.getPassengerName(), checkinRequest.getBookReference());
        CheckInResponse response = new CheckInResponse();

        response.setFlightDistance(britishcheckin.getFlightDistance());
        response.setFlightNumber(britishcheckin.getFlightNumber());
        response.setFromWhere(britishcheckin.getFromWhere());
        response.setWhereTo(britishcheckin.getWhereTo());
        response.setPassengerName(britishcheckin.getPassengerName());
        response.setCustomerId(britishcheckin.getCustomerId());
        response.setSeatNumber(britishcheckin.getSeatNumber());

        System.out.println(response.getFromWhere());

        return response;
    }
}
