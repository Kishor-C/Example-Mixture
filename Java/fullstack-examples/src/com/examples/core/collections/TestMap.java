package com.examples.core.collections;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class TestMap {
	public static void main(String[] args) {
		Map<String, String> map1 = new LinkedHashMap<>();
		map1.put("username", "admin@org");
		map1.put("password", "admin1234");
		map1.put("url", "www.abc.com");
		
		String value = map1.get("username");
		System.out.println("Username: "+value);
		value = map1.get("password");
		System.out.println("Password: "+value);
		
		// print complete map
		System.out.println("Before Removing URL: "+map1);
		// remove a url
		map1.remove("url");
		System.out.println("After Removing URL: "+map1);
		// to retrieve all the keys you can use keySet() -> Set []
		Set<String> keys = map1.keySet();
		System.out.println("Keys: "+keys);
		for(String key : keys) {
			System.out.println("Value: "+map1.get(key));
		}
	}
}
