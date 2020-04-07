package com.examples.inheritance;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@DiscriminatorValue(value = "m")
public class Manager extends Employee {

	private int employeeCount;

	public int getEmployeeCount() {
		return employeeCount;
	}

	public void setEmployeeCount(int employeeCount) {
		this.employeeCount = employeeCount;
	}

	@Override
	public String toString() {
		return "Manager [employeeCount=" + employeeCount + ", toString()=" + super.toString() + "]";
	}
}
