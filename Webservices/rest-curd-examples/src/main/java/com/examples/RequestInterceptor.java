package com.examples;

import java.io.IOException;
import java.util.List;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.Provider;

import org.glassfish.jersey.internal.util.Base64;

@Provider
public class RequestInterceptor implements ContainerRequestFilter {

	@Override
	public void filter(ContainerRequestContext requestContext) throws IOException {
		System.out.println("***** Intercepted ******");
		System.out.println("Requested Resource: "+requestContext.getUriInfo().getPath());
		List<String> headerList =  requestContext.getHeaders().get("Authorization");
		if(headerList != null && headerList.size() > 0) {
			String encrypedData = headerList.get(0);
			System.out.println("Data is: "+encrypedData);
			String encyptedUnPw = encrypedData.replaceAll("Basic ", "");
			System.out.println("Encrypted UN & PW: "+encyptedUnPw);
			String decryptString = Base64.decodeAsString(encyptedUnPw);
			System.out.println("Decryped String: "+decryptString);
			String[] unpw = decryptString.split(":");
			if(unpw[0].equals("admin") && unpw[1].equals("1234")) {
				return;
			}
		}
		Response response = 
				Response.status(Status.UNAUTHORIZED).entity("Access Denied!").build();
		requestContext.abortWith(response);
	}

}
