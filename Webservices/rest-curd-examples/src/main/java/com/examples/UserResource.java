package com.examples;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

@Path("userResource")
public class UserResource {
	private static UserService service = new UserService();
	
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response storeUserAPI(User user) {
		User u = service.storeUser(user);
		Response response = Response.status(Status.CREATED)
				.entity(u).build();
		return response;
	}
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<User> getAllUsersAPI() {
		return service.getUsers();
	}
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	@Path("{userId}")
	public User getUserAPI(@PathParam("userId") int id) {
		User user = service.getUserById(id);
		if(user == null) {
			String msg = "Sorry user "+id+" not found";
			throw new UserNotFoundException(msg);
		}
		return user;
	}
	@DELETE
	@Produces(MediaType.TEXT_PLAIN)
	@Path("{userId}")
	public String deleteUserAPI(@PathParam("userId") int id) {
		boolean status = service.deleteUser(id);
		if(status)
			return "User with an id "+id+" deleted";
		return "User with an id "+id+" not found";
	}
	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	@Path("{userId}/{password}")
	public User updatePasswordAPI(@PathParam("userId") int id, @PathParam("password") String password) {
		return service.updatePassword(id, password);
	}
}
