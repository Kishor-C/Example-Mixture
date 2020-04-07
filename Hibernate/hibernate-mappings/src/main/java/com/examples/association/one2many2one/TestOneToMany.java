package com.examples.association.one2many2one;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.examples.component.HibernateUtility;

public class TestOneToMany {

	public static void main(String[] args) {
		SessionFactory factory = HibernateUtility.createSessionFactory();
		Session session = factory.openSession();
		
		State state = session.get(State.class, "KA");
		System.out.println("Selected state: "+state.getStateId()+", Name: "+state.getStateName());
		System.out.println("----- Cities belonging to "+state.getStateId()+" are -----------");
		List<City> cities = state.getCities();
		cities.forEach(city -> {
			System.out.println("City Id: "+city.getCityId()+", Name: "+city.getCityName());
		});
		Session session2 = factory.openSession();
		State state2 = session2.get(State.class, "KA");
		List<City> cities2 = state2.getCities();
		cities2.forEach(city -> {
			System.out.println("City Id: "+city.getCityId()+", Name: "+city.getCityName());
		});
		
		session2.close();
		session.close();
		factory.close();
	}

}
