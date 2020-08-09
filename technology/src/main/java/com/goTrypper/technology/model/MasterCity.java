package com.goTrypper.technology.model;

import org.apache.poi.ss.usermodel.Row;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.util.StringUtils;

@Document(collection = "master_city")
public class MasterCity {
    @Id
    private String cityId;
    private String cityName;
    private String stateId;
    public MasterCity() {

    }
    public MasterCity(Row row){
        super();

        if (null != row.getCell(0) && !StringUtils.isEmpty(row.getCell(0).toString())) {
            this.setCityId(row.getCell(0).toString());
        }// else {
        //throw new Exception("Given ID is null.");
        //}
        if (null != row.getCell(1) && !StringUtils.isEmpty(row.getCell(1).toString())) {
            this.setCityName(row.getCell(1).toString());
        }
        if (null != row.getCell(2) && !StringUtils.isEmpty(row.getCell(2).toString())) {
            this.setStateId(row.getCell(2).toString());
        }
    }


    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getStateId() {
        return stateId;
    }

    public void setStateId(String stateId) {
        this.stateId = stateId;
    }
}
