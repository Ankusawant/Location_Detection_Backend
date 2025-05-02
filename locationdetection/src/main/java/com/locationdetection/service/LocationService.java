package com.locationdetection.service;


import org.springframework.stereotype.Service;

@Service
public class LocationService {

    public String getLocation(double lat, double lon) {
        // Process the location, save it to a database, etc.
        return "Received location: Latitude = " + lat + ", Longitude = " + lon;
    }
}
