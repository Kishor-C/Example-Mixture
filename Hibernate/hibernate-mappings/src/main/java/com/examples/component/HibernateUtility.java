package com.examples.component;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtility {
	public static SessionFactory createSessionFactory() {
		Configuration configuration = new Configuration();
		configuration.configure(); // by default hibernate.cfg.xml for other files you can pass the name
		SessionFactory sf = configuration.buildSessionFactory();
		
		return sf;
	}
}
