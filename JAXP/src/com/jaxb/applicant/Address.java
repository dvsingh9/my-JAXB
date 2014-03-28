package com.jaxb.applicant;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
public class Address {    

	@XmlElement(name="HOUSE-STREET-NO")
	private String houseStreetNo;
	@XmlElement(name="VILLAGE-TOWN")
	private String villageTown;
	@XmlElement(name="DISTRICT")
	private String district;
	@XmlElement(name="STATE")
	private String state;
	@XmlElement(name="PIN-NO")
	private String pin;
	
	
	public String getHouseStreetNo() {
		return houseStreetNo;
	}
	public void setHouseStreetNo(String houseStreetNo) {
		this.houseStreetNo = houseStreetNo;
	}
	public String getVillageTown() {
		return villageTown;
	}
	public void setVillageTown(String villageTown) {
		this.villageTown = villageTown;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	
	
	
}
