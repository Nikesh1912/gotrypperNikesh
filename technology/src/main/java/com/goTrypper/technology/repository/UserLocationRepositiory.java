package com.goTrypper.technology.repository;

import com.goTrypper.technology.model.DestinationObj;
import com.goTrypper.technology.model.UserLocationObj;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.jmx.export.annotation.ManagedOperation;
import org.springframework.stereotype.Repository;

@Repository
public interface UserLocationRepositiory extends MongoRepository<UserLocationObj, String>{
}
