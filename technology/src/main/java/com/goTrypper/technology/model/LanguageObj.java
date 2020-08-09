package com.goTrypper.technology.model;

import org.apache.poi.ss.usermodel.Row;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.util.StringUtils;
@Document(collection = "language")
public class LanguageObj {

	@Id
	private String id;

	private String language;

	private String iso_code;

	private String active;

	public LanguageObj(Row row){
		super();

		if (null != row.getCell(0) && !StringUtils.isEmpty(row.getCell(0).toString())) {
			this.setId(row.getCell(0).toString());
		}// else {
			//throw new Exception("Given ID is null.");
		//}
		if (null != row.getCell(1) && !StringUtils.isEmpty(row.getCell(1).toString())) {
			this.setLanguage(row.getCell(1).toString());
		}
		if (null != row.getCell(2) && !StringUtils.isEmpty(row.getCell(2).toString())) {
			this.setIso_code(row.getCell(2).toString());
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

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getIso_code() {
		return iso_code;
	}

	public void setIso_code(String iso_code) {
		this.iso_code = iso_code;
	}

	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
	}
	
	@Override
	public String toString() {
	    return "LanguageObj{" +
	            "id='" + id + '\'' +
	            ", language='" + language + '\'' +
	            "iso_code = "+iso_code+ '\''+
	            "active = "+active+
	            '}';
	}

}
