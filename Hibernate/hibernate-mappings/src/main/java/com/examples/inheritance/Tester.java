package com.examples.inheritance;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@DiscriminatorValue(value = "t")
public class Tester extends Employee{

	@Column(length = 15)
	private String testerType;

	public String getTesterType() {
		return testerType;
	}

	public void setTesterType(String testerType) {
		this.testerType = testerType;
	}

	@Override
	public String toString() {
		return "Tester [testerType=" + testerType + ", toString()=" + super.toString() + "]";
	}
	
	
}
