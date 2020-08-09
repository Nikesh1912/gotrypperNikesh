package com.goTrypper.technology.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


import com.goTrypper.technology.model.PackageObj;

@Repository
public interface PackageRepo extends MongoRepository<PackageObj,String>{
}
