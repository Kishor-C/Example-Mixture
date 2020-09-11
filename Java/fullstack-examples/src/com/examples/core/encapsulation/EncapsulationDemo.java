package com.examples.core.encapsulation;

public class EncapsulationDemo {

	public static void main(String[] args) {
		Profile profile = new Profile();
		profile.setUserId(5001);
		profile.setName("Alex");
		profile.setPassword("alex1234");
		profile.setPhone(9900293302L);
		System.out.println("UserId: "+profile.getUserId());
		System.out.println("Name: "+profile.getName());
		System.out.println("Password: "+profile.getPassword());
		System.out.println("Phone: "+profile.getPhone());
	}

}
