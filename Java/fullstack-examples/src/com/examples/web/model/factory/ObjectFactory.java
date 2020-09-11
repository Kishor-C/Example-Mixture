package com.examples.web.model.factory;

import com.examples.web.model.dao.ProfileDaoImpl;
import com.examples.web.model.service.ProfileServiceImpl;

public class ObjectFactory {
	public static Object getInstace(String name) {
		Object object = null;
		if(name.equals("dao"))
			object = new ProfileDaoImpl();
		if(name.equals("service"))
			object = new ProfileServiceImpl();
		return object;
	}
}
