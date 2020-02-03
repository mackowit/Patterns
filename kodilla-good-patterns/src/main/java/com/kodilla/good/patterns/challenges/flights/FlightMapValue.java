package com.kodilla.good.patterns.challenges.flights;

public class FlightMapValue {
    final String departure;
    final String arrival;

    public FlightMapValue(String departure, String arrival) {
        this.departure = departure;
        this.arrival = arrival;
    }

    public String getDeparture() {
        return departure;
    }

    public String getArrival() {
        return arrival;
    }

    @Override
    public String toString() {
        return departure + " - " + arrival;
    }
}
