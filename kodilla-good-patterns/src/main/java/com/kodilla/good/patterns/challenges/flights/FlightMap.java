package com.kodilla.good.patterns.challenges.flights;

import java.util.HashMap;
import java.util.Map;

public class FlightMap {
    Map<FlightMapKey, FlightMapValue> getFlightMap() {

        FlightMapKey WARWROKey = new FlightMapKey("WAR", "WRO");
        FlightMapKey WARGDAKey = new FlightMapKey("WAR", "GDA");
        FlightMapKey WARKRKKey = new FlightMapKey("WAR", "KRK");
        FlightMapKey KRKWROKey = new FlightMapKey("KRK", "WRO");
        FlightMapKey KRKGDAKey = new FlightMapKey("KRK", "GDA");
        FlightMapKey WROWARKey = new FlightMapKey("WRO", "WAR");
        FlightMapKey WROKRKKey = new FlightMapKey("WRO", "KRK");

        FlightMapValue WARWRO = new FlightMapValue("Warszawa", "Wrocław");
        FlightMapValue WARGDA = new FlightMapValue("Warszawa", "Gdańsk");
        FlightMapValue WARKRK = new FlightMapValue("Warszawa", "Kraków");
        FlightMapValue KRKWRO = new FlightMapValue("Kraków", "Wrocław");
        FlightMapValue KRKGDA = new FlightMapValue("Kraków", "Gdańsk");
        FlightMapValue WROWAR = new FlightMapValue("Wrocław", "Warszawa");
        FlightMapValue WROKRK = new FlightMapValue("Wrocław", "Kraków");

        HashMap<FlightMapKey, FlightMapValue> flightMap = new HashMap<>();

        flightMap.put(WARWROKey, WARWRO);
        flightMap.put(WARGDAKey, WARGDA);
        flightMap.put(WARKRKKey, WARKRK);
        flightMap.put(KRKWROKey, KRKWRO);
        flightMap.put(KRKGDAKey, KRKGDA);
        flightMap.put(WROWARKey, WROWAR);
        flightMap.put(WROKRKKey, WROKRK);

        return flightMap;
    }
}
