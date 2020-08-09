package com.goTrypper.technology.controller;

import com.goTrypper.technology.domain.request.CouponRequest;
import com.goTrypper.technology.domain.response.CouponAPIResponse;
import com.goTrypper.technology.service.api.CouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/v1")
public class CouponController {
    @Autowired
    private CouponService couponService;

    @PostMapping(value = "/validateCoupon", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public CouponAPIResponse searchCoupon(@RequestBody CouponRequest couponRequest)  {
        return couponService.validateCoupon(couponRequest);
    }
}
