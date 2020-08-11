package com.goTrypper.technology.admin.service;

import com.goTrypper.technology.admin.model.AdminGuideObj;
import com.goTrypper.technology.admin.repository.AdminGuideRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class AdminGuideService {

    @Autowired
    AdminGuideRepository adminGuideRepository;

    public AdminGuideObj saveGuideInfo(AdminGuideObj adminGuideObj){
        adminGuideObj.setGuideId(UUID.randomUUID());
       return adminGuideRepository.save(adminGuideObj);

    }
}
