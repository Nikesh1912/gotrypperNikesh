package com.goTrypper.technology.model;

import org.apache.poi.ss.usermodel.Row;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.util.StringUtils;


@Document(collection = "package")

public class PackageObj {

	@Id
	private String package_id;

	private String package_name;

	private String city_id;

	private String destination;

	private String packageShortDescription;

	private String packageFullDescription;

	private String packageActivities;

	private String packageDuration;

	private String packageDurationPerDay;

	private String packageLanguage;

	private String packagehighlights;

	private String packageInclusion;

	private String packageExclusion;

	private String packageSuitablety;

	private String packageDoseDonot;

	private String packageTipeTrick;

	private String packageExtraInfo;

	private String cancellation;

	private String cancellationCharges;



	public PackageObj(Row row) {
		super();

		if (null != row.getCell(0) && !StringUtils.isEmpty(row.getCell(0).toString())) {
			this.setPackage_id(row.getCell(0).toString());
		} //else {
			//throw new Exception("Given Package ID is null.");

		//}
		if (null != row.getCell(1) && !StringUtils.isEmpty(row.getCell(1).toString())) {
			this.setPackage_name(row.getCell(1).toString());
		}

		if (null != row.getCell(2) && !StringUtils.isEmpty(row.getCell(2).toString())) {
			this.setCity_id(row.getCell(2).toString());
		}

		if (null != row.getCell(3) && !StringUtils.isEmpty(row.getCell(3).toString())) {
			this.setDestination(row.getCell(3).toString());
		}

		if (null != row.getCell(4) && !StringUtils.isEmpty(row.getCell(4).toString())) {
			this.setPackageShortDescription(row.getCell(4).toString());
		}

		if (null != row.getCell(5) && !StringUtils.isEmpty(row.getCell(5).toString())) {
			this.setPackageFullDescription(row.getCell(5).toString());
		}

		if (null != row.getCell(6) && !StringUtils.isEmpty(row.getCell(6).toString())) {
			this.setPackageActivities(row.getCell(6).toString());
		}

		if (null != row.getCell(7) && !StringUtils.isEmpty(row.getCell(7).toString())) {
			this.setPackageDuration(row.getCell(7).toString());
		}

		if (null != row.getCell(8) && !StringUtils.isEmpty(row.getCell(8).toString())) {
			this.setPackageDurationPerDay(row.getCell(8).toString());
		}

		if (null != row.getCell(9) && !StringUtils.isEmpty(row.getCell(9).toString())) {
			this.setPackageLanguage(row.getCell(9).toString());
		}

		if (null != row.getCell(10) && !StringUtils.isEmpty(row.getCell(10).toString())) {
			this.setPackagehighlights(row.getCell(10).toString());
		}

		if (null != row.getCell(11) && !StringUtils.isEmpty(row.getCell(11).toString())) {
			this.setPackageInclusion(row.getCell(11).toString());
		}

		if (null != row.getCell(12) && !StringUtils.isEmpty(row.getCell(12).toString())) {
			this.setPackageExclusion(row.getCell(12).toString());
		}

		if (null != row.getCell(13) && !StringUtils.isEmpty(row.getCell(13).toString())) {
			this.setPackageSuitablety(row.getCell(13).toString());
		}

		if (null != row.getCell(14) && !StringUtils.isEmpty(row.getCell(14).toString())) {
			this.setPackageDoseDonot(row.getCell(14).toString());
		}

		if (null != row.getCell(15) && !StringUtils.isEmpty(row.getCell(15).toString())) {
			this.setPackageTipeTrick(row.getCell(15).toString());
		}

		if (null != row.getCell(16) && !StringUtils.isEmpty(row.getCell(16).toString())) {
			this.setPackageExtraInfo(row.getCell(16).toString());
		}

		if (null != row.getCell(17) && !StringUtils.isEmpty(row.getCell(17).toString())) {
			this.setCancellation(row.getCell(17).toString());
		}

		if (null != row.getCell(19) && !StringUtils.isEmpty(row.getCell(19).toString())) {
			this.setCancellationCharges(row.getCell(19).toString());
		}
	}

    public PackageObj() {

    }

    public String getPackage_id() {
		return package_id;
	}

	public void setPackage_id(String package_id) {
		this.package_id = package_id;
	}

	public String getPackage_name() {
		return package_name;
	}

	public void setPackage_name(String package_name) {
		this.package_name = package_name;
	}

	public String getCity_id() {
		return city_id;
	}

	public void setCity_id(String city_id) {
		this.city_id = city_id;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getPackageShortDescription() {
		return packageShortDescription;
	}

	public void setPackageShortDescription(String packageShortDescription) {
		this.packageShortDescription = packageShortDescription;
	}

	public String getPackageFullDescription() {
		return packageFullDescription;
	}

	public void setPackageFullDescription(String packageFullDescription) {
		this.packageFullDescription = packageFullDescription;
	}

	public String getPackageActivities() {
		return packageActivities;
	}

	public void setPackageActivities(String packageActivities) {
		this.packageActivities = packageActivities;
	}

	public String getPackageDuration() {
		return packageDuration;
	}

	public void setPackageDuration(String packageDuration) {
		this.packageDuration = packageDuration;
	}

	public String getPackageDurationPerDay() {
		return packageDurationPerDay;
	}

	public void setPackageDurationPerDay(String packageDurationPerDay) {
		this.packageDurationPerDay = packageDurationPerDay;
	}

	public String getPackageLanguage() {
		return packageLanguage;
	}

	public void setPackageLanguage(String packageLanguage) {
		this.packageLanguage = packageLanguage;
	}

	public String getPackagehighlights() {
		return packagehighlights;
	}

	public void setPackagehighlights(String packagehighlights) {
		this.packagehighlights = packagehighlights;
	}

	public String getPackageInclusion() {
		return packageInclusion;
	}

	public void setPackageInclusion(String packageInclusion) {
		this.packageInclusion = packageInclusion;
	}

	public String getPackageExclusion() {
		return packageExclusion;
	}

	public void setPackageExclusion(String packageExclusion) {
		this.packageExclusion = packageExclusion;
	}

	public String getPackageSuitablety() {
		return packageSuitablety;
	}

	public void setPackageSuitablety(String packageSuitablety) {
		this.packageSuitablety = packageSuitablety;
	}

	public String getPackageDoseDonot() {
		return packageDoseDonot;
	}

	public void setPackageDoseDonot(String packageDoseDonot) {
		this.packageDoseDonot = packageDoseDonot;
	}

	public String getPackageTipeTrick() {
		return packageTipeTrick;
	}

	public void setPackageTipeTrick(String packageTipeTrick) {
		this.packageTipeTrick = packageTipeTrick;
	}

	public String getPackageExtraInfo() {
		return packageExtraInfo;
	}

	public void setPackageExtraInfo(String packageExtraInfo) {
		this.packageExtraInfo = packageExtraInfo;
	}

	public String getCancellation() {
		return cancellation;
	}

	public void setCancellation(String cancellation) {
		this.cancellation = cancellation;
	}

	public String getCancellationCharges() {
		return cancellationCharges;
	}

	public void setCancellationCharges(String cancellationCharges) {
		this.cancellationCharges = cancellationCharges;
	}


}
