package com.goTrypper.technology.service;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import java.util.*;
import java.util.concurrent.TimeUnit;

import com.goTrypper.technology.model.*;
import com.goTrypper.technology.repository.*;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

@Component
public class GoTrypperDatabasePopulatorImpl implements GotryppperDBPopulator {
	@Autowired
	PackageRepo packageRepo;
	@Autowired
	DestinationRepo destinationRepo;
	@Autowired
	GuideRepo guideRepo;
	@Autowired
	NationalityRepo nationalityRepo;
	@Autowired
	LanguageRepo languageRepo;
	@Autowired
	MasterCityRepository masterCityRepository;
	@Autowired
	UserLocationRepositiory userLocationRepositiory;
	@Autowired
    CouponRepository couponRepository;



	@Override
	public List<NationalityObj> populateNationality(XSSFSheet sheet, String sheetName) {
		System.out.println("sheetName" + sheetName);
		Iterator<Row> itr = sheet.iterator();
		List<NationalityObj> nationalityObjList = new ArrayList<>();
		while (itr.hasNext()) {
			Row row = itr.next();
			if (null != row.getCell(0) && !StringUtils.isEmpty(row.getCell(0).toString())) {
				NationalityObj nationalityObj = new NationalityObj(row);
				nationalityObjList.add(nationalityObj);
			}
		}
		if (!CollectionUtils.isEmpty(nationalityObjList)) {
			nationalityRepo.saveAll(nationalityObjList);
		}
		System.out.println(nationalityObjList.toString());
		return nationalityObjList;
	}

	@Override 
	public List<PackageObj> populatePackages(XSSFSheet sheet, String sheetName) {
		Iterator<Row> itr = sheet.iterator();
		List<PackageObj> packageObjList = new ArrayList<>();
		while (itr.hasNext()) {
			Row row = itr.next();
			if (null != row.getCell(0) && !StringUtils.isEmpty(row.getCell(0).toString())) {
				PackageObj packageObj = new PackageObj(row);
				packageObjList.add(packageObj);
			}
		}
		if (!CollectionUtils.isEmpty(packageObjList)) {
			packageRepo.saveAll(packageObjList);
		}
		System.out.println(packageObjList.toString());
		return packageObjList;
	}

	@Override
	public List<DestinationObj> populateDestination(XSSFSheet sheet, String sheetName) {
		Iterator<Row> itr = sheet.iterator();
		List<DestinationObj> destinationObjList = new ArrayList<>();
		while (itr.hasNext()) {
			Row row = itr.next();
			if (null != row.getCell(0) && !StringUtils.isEmpty(row.getCell(0).toString())) {
				DestinationObj destinationObj = new DestinationObj(row);
				destinationRepo.save(destinationObj);
				destinationObjList.add(destinationObj);
			}
		}
        if (!CollectionUtils.isEmpty(destinationObjList)) {
        	destinationRepo.saveAll(destinationObjList);
		}
		System.out.println(destinationObjList.toString());
        return destinationObjList;
	}

	@Override
	public List<GuideObj> populateGuide(XSSFSheet sheet, String sheetName) {
		Iterator<Row> itr = sheet.iterator();
		List<GuideObj> guideObjList = new ArrayList<>();
		while (itr.hasNext()) {
			Row row = itr.next();
			if (null != row.getCell(0) && !StringUtils.isEmpty(row.getCell(0).toString())) {
				GuideObj guideObj = new GuideObj(row);
				guideObjList.add(guideObj);
			}
		}
		if (!CollectionUtils.isEmpty(guideObjList)) {
			guideRepo.saveAll(guideObjList);
		}
		System.out.println(guideObjList.toString());
		return guideObjList;
	}

	@Override
	public List<LanguageObj> populateLanguage(XSSFSheet sheet, String sheetName) {
		Iterator<Row> itr = sheet.iterator();
		List<LanguageObj> languageObjList = new ArrayList<>();
		while (itr.hasNext()) {
			Row row = itr.next();
			if (null != row.getCell(0) && !StringUtils.isEmpty(row.getCell(0).toString())) {
				LanguageObj languageObj = new LanguageObj(row);
				languageObjList.add(languageObj);
			}
		}
		if (!CollectionUtils.isEmpty(languageObjList)) {
			languageRepo.saveAll(languageObjList);
		}
		System.out.println(languageObjList.toString());
		return languageObjList;
	}

	@Override
	public List<MasterCity> populateMasterCity(XSSFSheet sheet, String sheetName) {
		Iterator<Row> itr = sheet.iterator();
		List<MasterCity> masterCityList = new ArrayList<>();
		while (itr.hasNext()) {
			Row row = itr.next();
			if (null != row.getCell(0) && !StringUtils.isEmpty(row.getCell(0).toString())) {
				MasterCity masterCity = new MasterCity(row);
				masterCityList.add(masterCity);
			}
		}
		if (!CollectionUtils.isEmpty(masterCityList)) {
			masterCityRepository.saveAll(masterCityList);
		}
		System.out.println(masterCityList.toString());
		return masterCityList;
	}

	@Deprecated
	@Override
	public List<Coupon> populateValidateCoupon(XSSFSheet sheet, String sheetName) {

		List<Coupon> couponsListDao = new ArrayList<>();
		Coupon coupon = new Coupon();
		coupon.setId("12");
		coupon.setCode("GTY_MOB");
		coupon.setActive(true);
		coupon.setApplicableDestinations(Arrays.asList("1"));
		coupon.setApplicablePackages(Arrays.asList("1"));
		coupon.setCreatedBy("user");
		coupon.setDiscountPercent(0.0);
		coupon.setDiscountPrice(200.0);
		coupon.setMaxDiscount(0.0);
		coupon.setCreatedDate(new Date());
		coupon.setValidateFrom(Date.from(LocalDateTime.now().minus(10, ChronoUnit.DAYS).toInstant(ZoneOffset.UTC)));
		coupon.setValidateTo(Date.from(LocalDateTime.now().plus(10, ChronoUnit.DAYS).toInstant(ZoneOffset.UTC)));
		couponsListDao.add(coupon);
		if (!CollectionUtils.isEmpty(couponsListDao)) {
			couponRepository.saveAll(couponsListDao);
		}
		System.out.println(couponsListDao.toString());
		return couponsListDao;
	}

}
