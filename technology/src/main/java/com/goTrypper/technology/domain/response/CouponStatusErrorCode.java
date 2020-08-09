package com.goTrypper.technology.domain.response;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonValue;

public enum CouponStatusErrorCode {
    COUPON_DOESNOT_EXISTS,
    COUPON_DATE_INVALID,
    COUPON_NOT_APPLICABLE_DESTINATION,
    COUPON_NOT_APPLICABLE_PACKAGES,
    COUPON_NOT_ACTIVE,
    COUPON_INVALID_GROUP_SIZE,
    COUPON_VALID;

    @Override
    @JsonValue
    public String toString() {
        return this.name();
    }
}
