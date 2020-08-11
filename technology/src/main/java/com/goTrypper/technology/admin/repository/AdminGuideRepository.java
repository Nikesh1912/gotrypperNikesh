package com.goTrypper.technology.admin.repository;

import com.goTrypper.technology.admin.model.AdminGuideObj;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminGuideRepository extends MongoRepository<AdminGuideObj, String> {

}
