package com.locationdetection.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.locationdetection.service.LocationService;

import com.locationdetection.service.LocationService;

@RestController
@RequestMapping("/api/location")
@CrossOrigin("*")  // Allow frontend to connect
public class LocationController {

    @Autowired
    private LocationService locationService;

    @GetMapping("/receive")
    public String getLocation(@RequestParam double lat, @RequestParam double lon) {
        // Logging the received location (can be saved to DB if needed)
        return locationService.getLocation(lat, lon);
    }
}
