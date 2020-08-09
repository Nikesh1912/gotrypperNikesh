package com.goTrypper.technology.domain.response;

import com.goTrypper.technology.model.DestinationObj;
import com.goTrypper.technology.model.PackageObj;

import java.util.List;
import java.util.Map;

public class SearchPackageResponse {
    private String destinationName;
    private Map<String, List<PackageObj>> packageInfo;
    private Map<String, List<DestinationObj>> destinationInfo;

    public String getDestinationName() {
        return destinationName;
    }

    public void setDestinationName(String destinationName) {
        this.destinationName = destinationName;
    }

    public Map<String, List<PackageObj>> getPackageInfo() {
        return packageInfo;
    }

    public void setPackageInfo(Map<String, List<PackageObj>> packageInfo) {
        this.packageInfo = packageInfo;
    }

    public Map<String, List<DestinationObj>> getDestinationInfo() {
        return destinationInfo;
    }

    public void setDestinationInfo(Map<String, List<DestinationObj>> destinationInfo) {
        this.destinationInfo = destinationInfo;
    }
}
