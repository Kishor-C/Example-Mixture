package com.examples;

import org.springframework.stereotype.Component;

@Component
public class Dao1 implements Dao {

	@Override
	public void store() {
		System.out.println("store() inside Dao1");
	}

}
