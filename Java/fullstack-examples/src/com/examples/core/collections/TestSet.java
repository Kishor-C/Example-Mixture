package com.examples.core.collections;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestSet {
	public static void main(String[] args) {
		Set<String> stringsSet = new HashSet<>();
		stringsSet.add("Alex");
		stringsSet.add("Bob");
		stringsSet.add("Charles");
		stringsSet.add("Bravo");
		stringsSet.add("Bravo");
		stringsSet.add("Ajay");
		System.out.println("Set of Names: "+stringsSet);
		// remove the name which is Bob and Charles
		Iterator<String> it = stringsSet.iterator();
		while(it.hasNext()) {
			String name = it.next();
			if(name.equals("Bob") || name.equals("Charles")) {
				it.remove();
			}
		}
		System.out.println("Set of Names after remove: "+stringsSet);
	}
}
