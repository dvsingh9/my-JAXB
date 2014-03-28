package com.jaxb.applicant;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name="APPLICANT")
@XmlAccessorType(XmlAccessType.FIELD)
public class Applicant {
	
	
	@XmlElement(name="REGN-NO")
	private String regnNo;
	
	@XmlElement(name="NAME")
	private String name;
	@XmlElement(name="FATHER-NAME")
	private String fatherName;
	@XmlAttribute
	private String email;
	@XmlElement(name="PERMANENT-ADDRESS")
	private Address perAddress;
	@XmlElement(name="CORRESPODENCE-ADDRESS")
	private Address comAddress;
	
	
	@XmlElement(name="CHOICE-ONE")
	private String centerChoiceOne;
	@XmlElement(name="CHOICE-TWO")
	private String centerChoiceTwo;
	@XmlElement(name="CHOICE-THREE")
	private String centerChoiceThree;
	
	
	public String getRegnNo() {
		return regnNo;
	}
	public void setRegnNo(String regnNo) {
		this.regnNo = regnNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Address getPerAddress() {
		return perAddress;
	}
	public void setPerAddress(Address perAddress) {
		this.perAddress = perAddress;
	}
	public Address getComAddress() {
		return comAddress;
	}
	public void setComAddress(Address comAddress) {
		this.comAddress = comAddress;
	}
	public String getCenterChoiceOne() {
		return centerChoiceOne;
	}
	public void setCenterChoiceOne(String centerChoiceOne) {
		this.centerChoiceOne = centerChoiceOne;
	}
	public String getCenterChoiceTwo() {
		return centerChoiceTwo;
	}
	public void setCenterChoiceTwo(String centerChoiceTwo) {
		this.centerChoiceTwo = centerChoiceTwo;
	}
	public String getCenterChoiceThree() {
		return centerChoiceThree;
	}
	public void setCenterChoiceThree(String centerChoiceThree) {
		this.centerChoiceThree = centerChoiceThree;
	}
	
	

}
