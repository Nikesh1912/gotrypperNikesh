package com.goTrypper.technology.admin.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Document(collection = "guide_admin")
public class AdminGuideObj {

    @Id
    private UUID guideId;
    private String firstName;
    private String lastName;
    private String languageList;
    private String guideEmail;
    private String mobileNumber;
    private String alterNumber;

    public UUID getGuideId() {
        return guideId;
    }

    public void setGuideId(UUID guideId) {
        this.guideId = guideId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLanguageList() {
        return languageList;
    }

    public void setLanguageList(String languageList) {
        this.languageList = languageList;
    }

    public String getGuideEmail() {
        return guideEmail;
    }

    public void setGuideEmail(String guideEmail) {
        this.guideEmail = guideEmail;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getAlterNumber() {
        return alterNumber;
    }

    public void setAlterNumber(String alterNumber) {
        this.alterNumber = alterNumber;
    }

}
