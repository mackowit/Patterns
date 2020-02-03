package com.kodilla.good.patterns.challenges.flights;

public class FlightMapKey {

    final String departureCode;
    final String arrivalCode;

    public FlightMapKey(String departureCode, String arrivalCode) {
        this.departureCode = departureCode;
        this.arrivalCode = arrivalCode;
    }

    @Override
    public boolean equals(Object o) {
        final FlightMapKey e = (FlightMapKey) o;
        return  this.departureCode.equals(e.departureCode) && this.arrivalCode.equals(e.arrivalCode);
    }

    @Override
    public int hashCode() {
        if(this.departureCode.equals("GDA")) return 0;
        else if(this.departureCode.equals("KRK")) return 1;
        else if(this.departureCode.equals("WAR")) return 2;
        else if(this.departureCode.equals("WRO")) return 3;
        else return 4;
    }

    @Override
    public String toString() {
        return departureCode + "-" + arrivalCode;
    }

    public String getDepartureCode() {
        return departureCode;
    }

    public String getArrivalCode() {
        return arrivalCode;
    }
}
