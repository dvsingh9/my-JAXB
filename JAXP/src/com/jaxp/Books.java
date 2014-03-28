package com.jaxp;
import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Books {

	
	private ArrayList<Book> book;
	
	@XmlElement(name="book")
	public ArrayList<Book> getBook() {
		return book;
	}

	public void setBook(ArrayList<Book> book) {
		this.book = book;
	}
	
	
}
