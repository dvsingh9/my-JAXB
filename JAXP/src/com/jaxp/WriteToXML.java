package com.jaxp;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class WriteToXML {

	public static void main(String[] args) throws JAXBException{

		//prepare an object
		Book book = new Book();
		book.setName("Effective Java");
		book.setAuthor("Bloch");
		book.setPublisher("Pearson");
		
		
		//create a file
		File file = new File("./Resources/book-from-Java.xml");
		//get JAXB context
		JAXBContext  context = JAXBContext.newInstance(Book.class);
		// get the marshaler
		Marshaller marshaller = context.createMarshaller();
		
		// set property for marshler
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		
		marshaller.marshal(book, file);
		
	}

}
