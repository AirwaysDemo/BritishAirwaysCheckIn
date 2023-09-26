package com.example.britishAirwaysCheckIn.britishAirwaysCheckIn.model;

import jakarta.persistence.*;


public class CheckInResponse {
    private  String customerId;

    public String getFromWhere() {
        return FromWhere;
    }

    public void setFromWhere(String fromWhere) {
        FromWhere = fromWhere;
    }

    public String getWhereTo() {
        return WhereTo;
    }

    public void setWhereTo(String whereTo) {
        WhereTo = whereTo;
    }

    private String FromWhere;

    private String WhereTo;
    private float flightDistance;
    private String flightNumber;
    private String seatNumber;
    private String passengerName;

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }


    public float getFlightDistance() {
        return flightDistance;
    }

    public void setFlightDistance(float flightDistance) {
        this.flightDistance = flightDistance;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }
}
