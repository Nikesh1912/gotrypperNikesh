package com.goTrypper.technology.admin.controller;

import com.goTrypper.technology.admin.model.AdminGuideObj;
import com.goTrypper.technology.admin.service.AdminGuideService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/v1")
public class AdminGuideController {
    @Autowired
    AdminGuideService adminGuideService;

    @PostMapping(value = "/save_guide",produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public AdminGuideObj fetchData(@RequestBody AdminGuideObj guideInformation)  {
        System.out.println("api called for fetching");

        return adminGuideService.saveGuideInfo(guideInformation);

    }
}
