package com;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

public class TestJavaXML {

	public static void main(String[] args) throws Exception {
		JAXBContext context = JAXBContext.newInstance(User.class);
		User user = new User("Raj", 35);
		Marshaller marshaller = context.createMarshaller();
		marshaller.marshal(user, System.out);
		marshaller.marshal(user, new File("demo.xml"));
	}

}
