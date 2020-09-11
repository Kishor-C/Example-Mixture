package com.examples.core.collections;


import java.util.TreeSet;

public class TestSortingBook {
	public static void main(String[] args) {
		
		Book javaBook = new Book(2, "Java", "Balaguru");
		Book angularBook = new Book(3, "Angular", "Wrox");
		Book cBook = new Book(1, "C", "Robert");
		Book pythonBook = new Book(4, "Python", "Mark");
		
		TreeSet<Book> bookSet = new TreeSet<>(new Book.SortBookByAuthor());
		bookSet.add(javaBook);
		bookSet.add(angularBook);
		bookSet.add(cBook);
		bookSet.add(pythonBook);
		System.out.println(bookSet);
	}
}
