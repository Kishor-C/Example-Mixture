package com.examples.component;

import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Person {

	private int id;
	private String name;
	
	@Embedded
	@EmbeddedId
	private Contact contact;

	public Person(int id, String name, Contact contact) {
		super();
		this.id = id;
		this.name = name;
		this.contact = contact;
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", contact=" + contact + "]";
	}
	
	
}
