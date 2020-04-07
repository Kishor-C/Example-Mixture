package com.examples;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ServiceImpl {

	@Autowired
	@Qualifier("d2")
	private Dao dao;
	
	public void storeService() {
		System.out.println("storeService() in service layer");
		dao.store();
	}
}
