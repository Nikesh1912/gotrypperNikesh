package com.goTrypper.technology.controller;

import com.goTrypper.technology.model.UserLocationObj;
import com.goTrypper.technology.service.UserLocationService;
import org.springframework.web.bind.annotation.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;


@RestController
@RequestMapping(value = "/v1")
public class UserLocationController {
    @Autowired
    UserLocationService userLocationService;

    @PostMapping(value = "/save_location",produces = MediaType.APPLICATION_JSON_VALUE,
    consumes = MediaType.APPLICATION_JSON_VALUE)
    public UserLocationObj fetchData(@RequestBody UserLocationObj userLocationRequest)  {
        System.out.println("api called for fetching User Latitude Longitude  detail");
        userLocationService.saveUserLocation(userLocationRequest);
        return userLocationRequest;
    }
}
