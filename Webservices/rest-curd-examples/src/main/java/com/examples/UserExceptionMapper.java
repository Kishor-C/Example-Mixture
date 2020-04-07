package com.examples;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class UserExceptionMapper implements ExceptionMapper<UserNotFoundException> {

	@Override
	public Response toResponse(UserNotFoundException exception) {
		String msg = exception.getMessage();
		ErrorMessage error = new ErrorMessage(msg);
		Response response = Response.status(404).entity(error).build();
		return response;
	}

}
