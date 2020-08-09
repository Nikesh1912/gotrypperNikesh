package com.goTrypper.technology.controller;

import com.goTrypper.technology.domain.response.SearchPackageResponse;
import com.goTrypper.technology.model.PackageObj;
import com.goTrypper.technology.model.SearchPackageRequest;
import com.goTrypper.technology.service.PackageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping(value = "/v1")
public class PackageController {
    @Autowired
    PackageService packageService;

    @GetMapping(value = "/get_package/{package_id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public PackageObj fetchData(@PathVariable(value = "package_id") String packageId)  {
    System.out.println("api called for fetching package  detail");
    return packageService.getPackageDetail(packageId);
    }

    @DeleteMapping(value = "/delete_package/{package_id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public void deletePackage(@PathVariable (value = "package_id") String packageId)  {
        System.out.println("api called for fetching package  detail");
        packageService.deletePackage(packageId);
    }

    @PostMapping(value = "/get_package_info", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public SearchPackageResponse getPackags(@RequestBody SearchPackageRequest searchPackageRequest) throws IOException {
        System.out.println("request received to get package "+ searchPackageRequest.getDestinationName());
        SearchPackageResponse searchPackageResponse = new SearchPackageResponse();
        searchPackageResponse.setDestinationName("jaipur");
        List<PackageObj> packageObjList= new ArrayList<>();
        PackageObj packageObj = new PackageObj();
        packageObj.setPackage_id("1");
        packageObjList.add(packageObj);
        HashMap<String,List<PackageObj>> responseMap = new HashMap<>();
        responseMap.put("adventure",packageObjList);
        searchPackageResponse.setPackageInfo(responseMap);
        return searchPackageResponse;
    }
}
