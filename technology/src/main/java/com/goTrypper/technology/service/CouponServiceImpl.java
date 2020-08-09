package com.goTrypper.technology.service;

import com.goTrypper.technology.domain.request.CouponRequest;
import com.goTrypper.technology.domain.response.CouponAPIResponse;
import com.goTrypper.technology.domain.response.CouponStatusErrorCode;
import com.goTrypper.technology.model.Coupon;
import com.goTrypper.technology.repository.CouponRepository;
import com.goTrypper.technology.repository.PackageRepo;
import com.goTrypper.technology.service.api.CouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import java.util.Date;

@Service
public class CouponServiceImpl implements CouponService {
    @Autowired
    private CouponRepository couponRepository;

    @Autowired
    private PackageRepo packageRepo;

    public CouponAPIResponse validateCoupon(CouponRequest couponRequest) {
        CouponAPIResponse response = new CouponAPIResponse();
        Coupon coupon = couponRepository.findByCode(couponRequest.getCouponCode());
        if(coupon  == null){
            response.setValid(false);
            response.addStatusCode(CouponStatusErrorCode.COUPON_DOESNOT_EXISTS);
            return response;
        }

        if(!coupon.isActive()){
            response.setValid(false);
            response.addStatusCode(CouponStatusErrorCode.COUPON_NOT_ACTIVE);
            return response;
        }

        // check destination validation
        if(!CollectionUtils.isEmpty(coupon.getApplicableDestinations())){
            if(! coupon.getApplicableDestinations().contains(couponRequest.getDestinationId())){
                response.setValid(false);
                response.addStatusCode(CouponStatusErrorCode.COUPON_NOT_APPLICABLE_DESTINATION);
                return response;
            }
        }

        // check packages validation
        if(!CollectionUtils.isEmpty(coupon.getApplicablePackages())){
            if(! coupon.getApplicablePackages().contains(couponRequest.getPackageId())){
                response.setValid(false);
                response.addStatusCode(CouponStatusErrorCode.COUPON_NOT_APPLICABLE_PACKAGES);
                return response;
            }
        }

        // check coupon date validation
        Date requestFromDate = couponRequest.getTourFromDate();
        Date requestToDate = couponRequest.getTourToDate();

        if(coupon.getValidateFrom().after(requestFromDate)  || coupon.getValidateTo().before(requestToDate)){
            response.setValid(false);
            response.addStatusCode(CouponStatusErrorCode.COUPON_DATE_INVALID);
            return response;
        }

        // check coupon group size
        if( couponRequest.getGroupSize() < coupon.getMinGroupSize() || couponRequest.getGroupSize() > coupon.getMaxGroupSize() ){
            response.setValid(false);
            response.addStatusCode(CouponStatusErrorCode.COUPON_INVALID_GROUP_SIZE);
            return response;
        }

        response.setValid(true);
        response.addStatusCode(CouponStatusErrorCode.COUPON_VALID);
        double finalDiscount = 0.0;
        if(coupon.getDiscountPrice() != -1){
            finalDiscount =coupon.getDiscountPrice();
        } else {
            finalDiscount = Math.min(coupon.getMaxDiscount(),couponRequest.getBookingAmount() % coupon.getDiscountPercent() / 100 );
        }

        response.setDiscountedAmount(finalDiscount);
        response.setCouponCode(coupon.getCode());
        return response;
    }
}