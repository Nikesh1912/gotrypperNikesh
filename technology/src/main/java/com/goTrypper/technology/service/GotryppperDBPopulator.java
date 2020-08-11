package com.goTrypper.technology.service;

import java.util.List;

import com.goTrypper.technology.model.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;

public interface GotryppperDBPopulator {
	List<DestinationObj> populateDestination(XSSFSheet sheet, String sheetName);

	List<GuideObj> populateGuide(XSSFSheet sheet, String sheetName);

	List<LanguageObj> populateLanguage(XSSFSheet sheet, String sheetName);

	List<PackageObj>  populatePackages(XSSFSheet sheet, String sheetName);

	List<NationalityObj> populateNationality(XSSFSheet sheet, String sheetName);

	List<MasterCity> populateMasterCity(XSSFSheet sheet, String sheetName);

	List<Coupon> populateValidateCoupon(XSSFSheet sheet, String sheetName);
}
