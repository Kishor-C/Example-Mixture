package com.examples.core.collections;

import java.util.Comparator;

public class Book implements Comparable<Book> {
	private int bookId;
	private String bookName;
	private String author;
	
	
	public static class SortBookByAuthor implements Comparator<Book> {

		@Override
		public int compare(Book o1, Book o2) {
			// TODO Auto-generated method stub
			return o1.getAuthor().compareTo(o2.getAuthor()) ;
		}
		
	}
	
	public Book() {
		super();
	}
	public Book(int bookId, String bookName, String author) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.author = author;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", author=" + author + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + bookId;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (bookId != other.bookId)
			return false;
		return true;
	}
	@Override
	public int compareTo(Book o) {
		
		return this.getBookId() - o.getBookId();
	}
	
	
}
