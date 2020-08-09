package com.goTrypper.technology.domain.request;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 *
 */
public class CouponRequest implements Serializable {
    private static final long serialVersionUID = 54985854930954L;
    private String couponCode;
    private String packageId;
    private String destinationId;
    private int groupSize;
    private double bookingAmount;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm")
    private Date tourFromDate;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm")
    private Date tourToDate;

    public CouponRequest() {
    }

    public int getGroupSize() {
        return groupSize;
    }

    public void setGroupSize(int groupSize) {
        this.groupSize = groupSize;
    }

    public Date getTourFromDate() {
        return tourFromDate;
    }

    public void setTourFromDate(Date tourFromDate) {
        this.tourFromDate = tourFromDate;
    }

    public Date getTourToDate() {
        return tourToDate;
    }

    public void setTourToDate(Date tourToDate) {
        this.tourToDate = tourToDate;
    }

    public String getPackageId() {
        return packageId;
    }

    public void setPackageId(String packageId) {
        this.packageId = packageId;
    }

    public String getDestinationId() {
        return destinationId;
    }

    public void setDestinationId(String destinationId) {
        this.destinationId = destinationId;
    }

    public String getCouponCode() {
        return couponCode;
    }

    public void setCouponCode(String couponCode) {
        this.couponCode = couponCode;
    }

    public double getBookingAmount() {
        return bookingAmount;
    }

    public void setBookingAmount(double bookingAmount) {
        this.bookingAmount = bookingAmount;
    }
}
//staring date in between to and from validaty;
//throw custom exceptions;
//package id should match else throw exception;