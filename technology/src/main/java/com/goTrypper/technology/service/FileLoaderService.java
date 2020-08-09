package com.goTrypper.technology.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import com.goTrypper.technology.repository.LanguageRepo;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.goTrypper.technology.model.PackageObj;
import com.goTrypper.technology.repository.PackageRepo;

@Service
public class FileLoaderService {
	
	@Autowired
    GotryppperDBPopulator gotryppperDBPopulator;

	public void loadFile() throws IOException {
//		InputStream fis = getClass().getClassLoader().getResourceAsStream("GoTrypperDatabase.xlsx");
//
//		XSSFWorkbook gotrypperWorkbook = new XSSFWorkbook(fis);
//		int numberOfSheet = gotrypperWorkbook.getNumberOfSheets();
//		System.out.println("Number of sheet" + numberOfSheet);
//
//		for (int i = 0; i < numberOfSheet; i++) {
//			XSSFSheet sheet = gotrypperWorkbook.getSheetAt(i);
//			String sheetName = gotrypperWorkbook.getSheetName(i);
//			System.out.println("SheetName" + sheetName + "sheet" + sheet);
//			if (sheetName.equalsIgnoreCase("Nationality")) {
//				gotryppperDBPopulator.populateNationality(sheet, sheetName);
//			} else if (sheetName.equalsIgnoreCase("Destination")) {
//				gotryppperDBPopulator.populateDestination(sheet, sheetName);
//			} else if (sheetName.equalsIgnoreCase("Guides")) {
//				gotryppperDBPopulator.populateGuide(sheet, sheetName);
//			} else if (sheetName.equalsIgnoreCase("Packages")) {
//				gotryppperDBPopulator.populatePackages(sheet, sheetName);
//			} else if (sheetName.equalsIgnoreCase("Language")) {
//				gotryppperDBPopulator.populateLanguage(sheet, sheetName);
//			}else if (sheetName.equalsIgnoreCase("MasterCity")) {
//				gotryppperDBPopulator.populateMasterCity(sheet, sheetName);
//			}
//			else if (sheetName.equalsIgnoreCase("gty_coupon")) {
			gotryppperDBPopulator.populateValidateCoupon(null, null);

		}
	}

