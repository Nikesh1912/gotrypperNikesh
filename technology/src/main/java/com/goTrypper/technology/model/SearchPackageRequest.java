package com.goTrypper.technology.model;

import java.time.LocalDateTime;

public class SearchPackageRequest {
    private String latitude;
    private String longitude;
    private String destinationName;
    private LocalDateTime currentSearchDate;
    private LocalDateTime packageSearchDate;

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getDestinationName() {
        return destinationName;
    }

    public void setDestinationName(String destinationName) {
        this.destinationName = destinationName;
    }

    public LocalDateTime getCurrentSearchDate() {
        return currentSearchDate;
    }

    public void setCurrentSearchDate(LocalDateTime currentSearchDate) {
        this.currentSearchDate = currentSearchDate;
    }

    public LocalDateTime getPackageSearchDate() {
        return packageSearchDate;
    }

    public void setPackageSearchDate(LocalDateTime packageSearchDate) {
        this.packageSearchDate = packageSearchDate;
    }
}
