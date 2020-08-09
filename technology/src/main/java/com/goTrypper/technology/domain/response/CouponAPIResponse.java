package com.goTrypper.technology.domain.response;

import java.util.ArrayList;
import java.util.List;

public class CouponAPIResponse {
    private boolean valid;
    private double discountedAmount;
    private String couponCode;
    private List<CouponStatusErrorCode> statusCodes = new ArrayList<>();

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }

    public double getDiscountedAmount() {
        return discountedAmount;
    }

    public void setDiscountedAmount(double discountedAmount) {
        this.discountedAmount = discountedAmount;
    }

    public String getCouponCode() {
        return couponCode;
    }

    public void setCouponCode(String couponCode) {
        this.couponCode = couponCode;
    }

    public void addStatusCode(CouponStatusErrorCode statusCode) {
        this.statusCodes.add(statusCode);
    }

    public List<CouponStatusErrorCode> getStatusCodes() {
        return statusCodes;
    }
}
