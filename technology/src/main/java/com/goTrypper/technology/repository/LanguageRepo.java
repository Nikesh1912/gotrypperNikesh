package com.goTrypper.technology.repository;

import com.goTrypper.technology.model.LanguageObj;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LanguageRepo extends MongoRepository<LanguageObj,String> {
}
