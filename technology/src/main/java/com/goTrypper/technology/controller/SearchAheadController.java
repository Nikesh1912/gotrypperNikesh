package com.goTrypper.technology.controller;

import com.goTrypper.technology.model.MasterCity;
import com.goTrypper.technology.service.DestinationTypeAheadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.*;
@RestController
@RequestMapping(value = "/v1")
public class SearchAheadController {
    @Autowired
    DestinationTypeAheadService destinationTypeAheadService;

    @GetMapping(value="/search_destination/{destination}",produces = MediaType.APPLICATION_JSON_VALUE)
        public List<MasterCity> searchDestination(@PathVariable("destination") String destination){
        return destinationTypeAheadService.findDestinationAsCity(destination);
    }
}
