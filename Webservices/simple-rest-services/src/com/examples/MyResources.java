package com.examples;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/resource")
public class MyResources {

	@Path("employee/{id}")
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@GET
	public Employee getEmployeeById1API(@PathParam("id") int id) {
		System.out.println("getEmployee through get");
		Employee emp = new Employee();
		emp.setId(id);
		emp.setName("Name"+id);
		emp.setSalary(5000 * id);
		return emp;
	}
	
	@Path("employee")
	@POST
	@Produces(MediaType.TEXT_PLAIN)
	@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public String createEmployee(Employee employee) {
		return "Created with an id "+employee.getId()+", Name : "+employee.getName()+", Salary: "+employee.getSalary();
	}	
}
