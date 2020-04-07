package com.examples;

import javax.jws.WebService;

@WebService
public interface Calculator {
	public int add(int x, int y);
	public int sub(int x, int y);
}
