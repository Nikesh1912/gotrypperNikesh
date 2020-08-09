package com.goTrypper.technology.repository;

import com.goTrypper.technology.model.LanguageObj;
import com.goTrypper.technology.model.NationalityObj;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

public interface NationalityRepo extends MongoRepository<NationalityObj,String> {
}
