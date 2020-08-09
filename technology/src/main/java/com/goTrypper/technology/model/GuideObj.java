package com.goTrypper.technology.model;

import org.apache.poi.ss.usermodel.Row;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.util.StringUtils;
@Document(collection = "guide")
public class GuideObj {

	@Id
	private String s_num;

	private String name;

	private String license_num;

	private String phone_num;

	private String language;

	private String language2;

	private String language3;

	private String language4;

	private String city_id;

	private String active;

	public GuideObj(Row row) {
		super();

		if (null != row.getCell(0) && !StringUtils.isEmpty(row.getCell(0).toString())) {
			this.setS_num(row.getCell(0).toString());
		} //else {
			//throw new Exception("Given  S.Number is null.");
		//}
		if (null != row.getCell(1) && !StringUtils.isEmpty(row.getCell(1).toString())) {
			this.setName(row.getCell(1).toString());
		}
		if (null != row.getCell(2) && !StringUtils.isEmpty(row.getCell(2).toString())) {
			this.setLicense_num(row.getCell(2).toString());
		}
		if (null != row.getCell(3) && !StringUtils.isEmpty(row.getCell(3).toString())) {
			this.setPhone_num(row.getCell(3).toString());
		}
		if (null != row.getCell(4) && !StringUtils.isEmpty(row.getCell(4).toString())) {
			this.setLanguage(row.getCell(4).toString());
		}
		if (null != row.getCell(5) && !StringUtils.isEmpty(row.getCell(5).toString())) {
			this.setLanguage2(row.getCell(5).toString());
		}
		if (null != row.getCell(6) && !StringUtils.isEmpty(row.getCell(6).toString())) {
			this.setLanguage3(row.getCell(6).toString());
		}
		if (null != row.getCell(7) && !StringUtils.isEmpty(row.getCell(7).toString())) {
			this.setLanguage4(row.getCell(7).toString());
		}
		if (null != row.getCell(8) && !StringUtils.isEmpty(row.getCell(8).toString())) {
			this.setCity_id(row.getCell(8).toString());
		}
		if (null != row.getCell(9) && !StringUtils.isEmpty(row.getCell(9).toString())) {
			this.setActive(row.getCell(9).toString());
		}

	}

	public String getS_num() {
		return s_num;
	}

	public void setS_num(String s_num) {
		this.s_num = s_num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLicense_num() {
		return license_num;
	}

	public void setLicense_num(String license_num) {
		this.license_num = license_num;
	}

	public String getPhone_num() {
		return phone_num;
	}

	public void setPhone_num(String phone_num) {
		this.phone_num = phone_num;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getLanguage2() {
		return language2;
	}

	public void setLanguage2(String language2) {
		this.language2 = language2;
	}

	public String getLanguage3() {
		return language3;
	}

	public void setLanguage3(String language3) {
		this.language3 = language3;
	}

	public String getLanguage4() {
		return language4;
	}

	public void setLanguage4(String language4) {
		this.language4 = language4;
	}

	public String getCity_id() {
		return city_id;
	}

	public void setCity_id(String city_id) {
		this.city_id = city_id;
	}

	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	@Override
	public String toString() {
	    return "GuideObj{" +
	            "s_num='" + s_num + '\'' +
	            ", name='" + name + '\'' +
	            "license_num ='"+license_num+ '\''+
	            "phone_num ='" + phone_num+ '\''+
	            "language ='" + language + '\''+
	            "language2 ='" + language2 + '\''+
	            "language3 ='" + language3 + '\''+
	            "language4 ='" + language4 + '\''+
	            "city_id ='" + city_id + '\''+
	            "active ='" + active + 
	            '}';
	}
}
