package com.examples;

import org.springframework.stereotype.Component;

@Component("d2")
public class Dao2 implements Dao {

	@Override
	public void store() {
		System.out.println("store() inside Dao2");
	}

}
