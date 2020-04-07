package com.examples;

import java.util.Comparator;

public class UserSorting implements Comparator<User>{

	@Override
	public int compare(User o1, User o2) {
		
		return o2.getUserId() - o1.getUserId();
	}
	
}
