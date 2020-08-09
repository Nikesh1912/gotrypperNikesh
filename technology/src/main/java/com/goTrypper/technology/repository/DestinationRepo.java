package com.goTrypper.technology.repository;

import com.goTrypper.technology.model.DestinationObj;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.jmx.export.annotation.ManagedOperation;

public interface DestinationRepo extends MongoRepository<DestinationObj, String> {
}
