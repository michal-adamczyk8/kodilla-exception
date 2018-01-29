package com.kodilla.exception.test;

import java.util.HashMap;

public class FlightSearcher {
    public boolean findFlight(Flight flight) throws RouteNotFoundException {
        HashMap<String, Boolean> routeMap = new HashMap<>();

        routeMap.put("Warsaw", true);
        routeMap.put("Cracow", true);
        routeMap.put("Poznan", true);
        routeMap.put("Wroclaw", false);

        Boolean canFlyTo = routeMap.get(flight.getArrivalAirport());
        if (canFlyTo == null || !canFlyTo) {
            throw new RouteNotFoundException();
        }
        return canFlyTo;
    }
}
