package com.goTrypper.technology.model;

import org.apache.poi.ss.usermodel.Row;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.util.StringUtils;

@Document(collection = "nationality")

public class NationalityObj {
	@Id
	private String id;
	
    private String nationality;
	
	private String country_id;
	
	private String active;
	
	public NationalityObj(Row row)  {
		super();
		
		if (null != row.getCell(0) && !StringUtils.isEmpty(row.getCell(0).toString())) {			
			this.setId(row.getCell(0).toString());
		} 
		//else {
			//throw new Exception("Given ID is null.");
		//}
		
		if (null != row.getCell(1) && !StringUtils.isEmpty(row.getCell(1).toString())) {
			this.setNationality(row.getCell(1).toString());
		}
		
		if (null != row.getCell(2) && !StringUtils.isEmpty(row.getCell(2).toString())) {
			this.setCountry_id(row.getCell(2).toString());
		}
		
		if (null != row.getCell(3) && !StringUtils.isEmpty(row.getCell(3).toString())) {
			this.setActive(row.getCell(3).toString());
		}

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String natinalty) {
		this.nationality = nationality;
	}

	public String getCountry_id() {
		return country_id;
	}

	public void setCountry_id(String country_id) {
		this.country_id = country_id;
	}

	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
	}
	
	@Override
	public String toString() {
	    return "NationalityObj{" +
	            "id='" + id + '\'' +
	            ", nationality='" + nationality + '\'' +
	            "countryId = "+country_id+ '\''+
	            "activeStatus = "+active+
	            '}';
	}
}
