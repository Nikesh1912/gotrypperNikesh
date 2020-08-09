package com.goTrypper.technology.service;

import com.goTrypper.technology.model.MasterCity;
import com.goTrypper.technology.repository.MasterCityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DestinationTypeAheadService {
    @Autowired
    MasterCityRepository masterCityRepository;

   public List<MasterCity> findDestinationAsCity(String destinationName) {
       return masterCityRepository.findByCityName(".*"+destinationName+".*");
   }
}
