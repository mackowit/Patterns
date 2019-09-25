package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {
    public void findFlight (Flight flight) throws RouteNotFoundException {
        HashMap<String, Boolean> flightMap = new HashMap<String, Boolean>();
        flightMap.put("Okęcie", true);
        flightMap.put("Balice", true);
        flightMap.put("Radom", false);
        flightMap.put("Moskwa", false);

        boolean result = false;

        for(Map.Entry<String, Boolean> entry : flightMap.entrySet()) {
            if(flight.arrivalAirport == entry.getKey() || flight.departureAirport == entry.getKey()) result = entry.getValue();
        }

        if(result) System.out.println("Choosen airport is on our flight map!!");
        else throw new RouteNotFoundException();
    }

    public static void main(String[] args) {
        Flight flight = new Flight("Gdańsk", "Wrocław");
        FlightFinder flightFinder = new FlightFinder();

        try {
            flightFinder.findFlight(flight);
        } catch (RouteNotFoundException e) {
            System.out.println("Sorry! Choosen airport is not on our flight map!!");
        } finally {
            System.out.println("End of using flightFinder");
        }
    }
}
