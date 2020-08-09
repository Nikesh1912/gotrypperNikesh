package com.goTrypper.technology.repository;

import com.goTrypper.technology.model.MasterCity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MasterCityRepository extends MongoRepository<MasterCity,String> {

    @Query("{'cityName':{$regex: ?0, '$options':i}}")
    List<MasterCity> findByCityName(String destination);
}
