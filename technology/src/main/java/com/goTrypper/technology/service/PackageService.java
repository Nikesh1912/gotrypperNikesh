package com.goTrypper.technology.service;

import com.goTrypper.technology.domain.response.SearchPackageResponse;
import com.goTrypper.technology.model.PackageObj;
import com.goTrypper.technology.repository.PackageRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PackageService {
    @Autowired
    PackageRepo packageRepo;
    public PackageObj getPackageDetail(String packageId) {
        return packageRepo.findById(packageId).get();
    }

    public void deletePackage(String packageId) {
        packageRepo.deleteById(packageId);
    }

    public SearchPackageResponse getDesinationPackage (String destinationName) {
        return null;
    }
}
