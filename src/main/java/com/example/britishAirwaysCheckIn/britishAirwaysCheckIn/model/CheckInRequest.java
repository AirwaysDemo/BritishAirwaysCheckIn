package com.example.britishAirwaysCheckIn.britishAirwaysCheckIn.model;

public class CheckInRequest {
    private String passengerName;
    private String bookReference;

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public String getBookReference() {
        return bookReference;
    }

    public void setBookReference(String bookReference) {
        this.bookReference = bookReference;
    }
}
