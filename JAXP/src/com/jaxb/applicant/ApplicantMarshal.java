package com.jaxb.applicant;

import java.io.File;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class ApplicantMarshal {


	public static void main(String[] args) {

		//prepare address objects
		Address address = new Address();
		address.setVillageTown("Pitampura");
		address.setHouseStreetNo("15D");
		address.setDistrict("Delhi");
		address.setState("New Delhi");
		address.setPin("110022");
		
		//prepare object to marshal
		Applicant applicant = new Applicant();
		applicant.setRegnNo("12345");
		applicant.setName("Hariom Shukla");
		applicant.setFatherName("Pramod Jackson");
		applicant.setEmail("hari@gmail.com");
		applicant.setPerAddress(address);
		applicant.setComAddress(address);
		applicant.setCenterChoiceOne("Ahemadabad");
		applicant.setCenterChoiceTwo("Thoice");
		applicant.setCenterChoiceThree("New Delhi");
		
		//CREATE ANOTHER APPLICANT OBJECT
		Applicant applicant2 = new Applicant();
		applicant2.setRegnNo("6789");
		applicant2.setName("Pramod Nayak");
		applicant2.setFatherName("Jai Singh");
		applicant2.setEmail("45pramod@gmail.com");
		applicant2.setPerAddress(address);
		applicant2.setComAddress(address);
		applicant2.setCenterChoiceOne("15");
		applicant2.setCenterChoiceTwo("14");
		applicant2.setCenterChoiceThree("12");
		
		//create a list of applicants
		//List<Applicant> applicants = (List<Applicant>) new Applicant() ;
		//applicants.add(applicant);
		//applicants.add(applicant2);
		// create a file
		File file = new File("./Resources/applicant-marshal.xml");
		// get JAXB context
		JAXBContext context;
		try {
			context = JAXBContext.newInstance(Applicant.class);
			Marshaller marshaller = context.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			marshaller.marshal(applicant, file);
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
