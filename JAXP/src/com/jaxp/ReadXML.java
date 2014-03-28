package com.jaxp;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;


public class ReadXML {
	private static final String bookName = "./Resources/books.xml"; 
	
	public static void main(String[] args) throws JAXBException, IOException {
	
		JAXBContext context = JAXBContext.newInstance(Books.class);
		 
		Unmarshaller um = context.createUnmarshaller();
	    Books books = (Books) um.unmarshal(new FileReader(bookName));
	    
	    	ArrayList<Book> book = books.getBook();
	    	
	    	for(Book book2 : book){
	    	//System.out.println("Book name :"+book.);
	    	//System.out.println("Book Author :"+books.getAuthor());
	    	//System.out.println("Book publisher :"+books.getPublisher());
	    	}
	   
	}

}
