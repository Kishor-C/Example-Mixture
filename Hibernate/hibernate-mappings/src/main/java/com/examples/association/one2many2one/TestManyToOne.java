package com.examples.association.one2many2one;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.examples.component.HibernateUtility;

public class TestManyToOne {
	public static void main(String[] args) {
		SessionFactory factory = HibernateUtility.createSessionFactory();
		Session session = factory.openSession();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter city name ex: CHN, BLR, PUN, ...");
		City city = session.get(City.class, sc.next());
		State state = city.getState();
		System.out.println("City id: "+city.getCityId()+", name: "+city.getCityName());
		System.out.println("Belongs to the state: "+state.getStateName());
		sc.close();
		session.close();
		factory.close();
	}
}
