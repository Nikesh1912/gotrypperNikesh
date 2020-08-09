package com.goTrypper.technology.repository;

import com.goTrypper.technology.model.GuideObj;
import com.goTrypper.technology.model.LanguageObj;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

public interface GuideRepo extends MongoRepository<GuideObj,String> {
}
