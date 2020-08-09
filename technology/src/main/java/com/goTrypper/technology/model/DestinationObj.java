package com.goTrypper.technology.model;

import org.apache.poi.ss.usermodel.Row;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.util.StringUtils;
@Document(collection ="destination")
public class DestinationObj {

	@Id
	private String destination_id;

	private String destination;

	private String address1;

	private String address2;

	private String city_id;

	private String pinCode;

	private String opening;

	private String closing;

	private String allNearBy;

	private String distanceOfNearBy;

	private String distanceUnit;

	private String description;

	private String ticketCharges;

	private String ticketPolicy;

	private String imageLink;

	private String weeklyHolydays;

	private String allowedFor;

	private String otherActivity;

	private String placeLanguageSheet;

	private String latitude;

	private String longitude;

	private String amount;

	public DestinationObj(Row row) {
		super();

		if (null != row.getCell(0) && !StringUtils.isEmpty(row.getCell(0).toString())) {
			this.setDestination_id(row.getCell(0).toString());
		} //else {
			//throw new Exception("Given Destination ID is null.");
		//}
		if (null != row.getCell(1) && !StringUtils.isEmpty(row.getCell(1).toString())) {
			this.setDestination(row.getCell(1).toString());
		}
		if (null != row.getCell(2) && !StringUtils.isEmpty(row.getCell(2).toString())) {
			this.setAddress1(row.getCell(2).toString());
		}
		if (null != row.getCell(3) && !StringUtils.isEmpty(row.getCell(3).toString())) {
			this.setAddress2(row.getCell(3).toString());
		}
		if (null != row.getCell(4) && !StringUtils.isEmpty(row.getCell(4).toString())) {
			this.setCity_id(row.getCell(4).toString());
		}
		if (null != row.getCell(5) && !StringUtils.isEmpty(row.getCell(5).toString())) {
			this.setPinCode(row.getCell(5).toString());
		}
		if (null != row.getCell(6) && !StringUtils.isEmpty(row.getCell(6).toString())) {
			this.setOpening(row.getCell(6).toString());
		}
		if (null != row.getCell(7) && !StringUtils.isEmpty(row.getCell(7).toString())) {
			this.setClosing(row.getCell(7).toString());
		}
		if (null != row.getCell(8) && !StringUtils.isEmpty(row.getCell(8).toString())) {
			this.setAllNearBy(row.getCell(8).toString());
		}
		if (null != row.getCell(9) && !StringUtils.isEmpty(row.getCell(9).toString())) {
			this.setDistanceOfNearBy(row.getCell(9).toString());
		}
		if (null != row.getCell(10) && !StringUtils.isEmpty(row.getCell(10).toString())) {
			this.setDistanceUnit(row.getCell(10).toString());
		}
		if (null != row.getCell(11) && !StringUtils.isEmpty(row.getCell(11).toString())) {
			this.setDescription(row.getCell(11).toString());
		}
		if (null != row.getCell(12) && !StringUtils.isEmpty(row.getCell(12).toString())) {
			this.setTicketCharges(row.getCell(12).toString());
		}
		if (null != row.getCell(13) && !StringUtils.isEmpty(row.getCell(13).toString())) {
			this.setTicketPolicy(row.getCell(13).toString());
		}
		if (null != row.getCell(14) && !StringUtils.isEmpty(row.getCell(14).toString())) {
			this.setImageLink(row.getCell(14).toString());
		}
		if (null != row.getCell(15) && !StringUtils.isEmpty(row.getCell(15).toString())) {
			this.setWeeklyHolydays(row.getCell(15).toString());
		}
		if (null != row.getCell(16) && !StringUtils.isEmpty(row.getCell(16).toString())) {
			this.setAllowedFor(row.getCell(16).toString());
		}
		if (null != row.getCell(17) && !StringUtils.isEmpty(row.getCell(17).toString())) {
			this.setOtherActivity(row.getCell(17).toString());
		}
		if (null != row.getCell(18) && !StringUtils.isEmpty(row.getCell(18).toString())) {
			this.setPlaceLanguageSheet(row.getCell(18).toString());
		}
		if (null != row.getCell(19) && !StringUtils.isEmpty(row.getCell(19).toString())) {
			this.setLatitude(row.getCell(19).toString());
		}
		if (null != row.getCell(20) && !StringUtils.isEmpty(row.getCell(20).toString())) {
			this.setLongitude(row.getCell(20).toString());
		}
	}

	public String getDestination_id() { return destination_id;}

	public void setDestination_id(String destination_id) {
		this.destination_id = destination_id;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getCity_id() {
		return city_id;
	}

	public void setCity_id(String city_id) {
		this.city_id = city_id;
	}

	public String getPinCode() {
		return pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}

	public String getOpening() {
		return opening;
	}

	public void setOpening(String opening) {
		this.opening = opening;
	}

	public String getClosing() {
		return closing;
	}

	public void setClosing(String closing) {
		this.closing = closing;
	}

	public String getAllNearBy() {
		return allNearBy;
	}

	public void setAllNearBy(String allNearBy) {
		this.allNearBy = allNearBy;
	}

	public String getDistanceOfNearBy() {
		return distanceOfNearBy;
	}

	public void setDistanceOfNearBy(String distanceOfNearBy) {
		this.distanceOfNearBy = distanceOfNearBy;
	}

	public String getDistanceUnit() {
		return distanceUnit;
	}

	public void setDistanceUnit(String distanceUnit) {
		this.distanceUnit = distanceUnit;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTicketCharges() {
		return ticketCharges;
	}

	public void setTicketCharges(String ticketCharges) {
		this.ticketCharges = ticketCharges;
	}

	public String getTicketPolicy() {
		return ticketPolicy;
	}

	public void setTicketPolicy(String ticketPolicy) {
		this.ticketPolicy = ticketPolicy;
	}

	public String getImageLink() {
		return imageLink;
	}

	public void setImageLink(String imageLink) {
		this.imageLink = imageLink;
	}

	public String getWeeklyHolydays() {
		return weeklyHolydays;
	}

	public void setWeeklyHolydays(String weeklyHolydays) {
		this.weeklyHolydays = weeklyHolydays;
	}

	public String getAllowedFor() {
		return allowedFor;
	}

	public void setAllowedFor(String allowedFor) {
		this.allowedFor = allowedFor;
	}

	public String getOtherActivity() {
		return otherActivity;
	}

	public void setOtherActivity(String otherActivity) {
		this.otherActivity = otherActivity;
	}

	public String getPlaceLanguageSheet() {
		return placeLanguageSheet;
	}

	public void setPlaceLanguageSheet(String placeLanguageSheet) {
		this.placeLanguageSheet = placeLanguageSheet;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
	    return "DestinationObj{" +
          	    " Destination_id='" + destination_id + '\''+
	            ",destination='" + destination + '\'' +
	            ",address1='" + address1 + '\'' +
	            ",address2 ='"+ address2 + '\''+
	            ",city_id ='" + city_id + '\''+
	            ",pinCode ='" + pinCode + '\''+
	            ",opening ='" + opening + '\''+
	            ",closing ='" + closing + '\''+
	            ",allNearBy ='" + allNearBy + '\''+
	            ",distanceOfNearBy ='" + distanceOfNearBy + '\''+
	            ",distanceUnit ='" + distanceUnit + '\''+
	            ",description ='" + description +'\''+
	            ",ticketCharges ='" + ticketCharges +'\''+
	            ",ticketPolicy ='" + ticketPolicy +'\''+
	            ",imageLink ='" + imageLink +'\''+
	            ",weeklyHolydays ='" + weeklyHolydays +'\''+
	            ",allowedFor ='" + allowedFor +'\''+ '\''+
	            ",otherActivity ='" + otherActivity + '\''+
	            ",placeLanguageSheet ='" + placeLanguageSheet +'\''+
	            ",latitude ='" + latitude +'\''+
	            ",longitude ='" + longitude + 
	          
	            '}';
	}
}
