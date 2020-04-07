package com.examples.inheritance;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@DiscriminatorValue(value = "p")
public class Programmer extends Employee {
	@Column(length = 15)
	private String technology;

	public String getTechnology() {
		return technology;
	}

	public void setTechnology(String technology) {
		this.technology = technology;
	}

	@Override
	public String toString() {
		return "Programmer [technology=" + technology + ", toString()=" + super.toString() + "]";
	}
	
}
