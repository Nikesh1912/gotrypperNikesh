package com.goTrypper.technology.service.api;

import com.goTrypper.technology.domain.request.CouponRequest;
import com.goTrypper.technology.domain.response.CouponAPIResponse;

public interface CouponService {
    CouponAPIResponse validateCoupon(CouponRequest couponRequest);
}
