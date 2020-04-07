package com.org;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.glassfish.jersey.client.authentication.HttpAuthenticationFeature;

public class TestPostClient {

	public static void main(String[] args) {
		Client client = ClientBuilder.newClient();
		HttpAuthenticationFeature feature = HttpAuthenticationFeature.basic("admin", "12345");
		client.register(feature);
		WebTarget target = client.target("http://localhost:8080/rest-curd-examples/webapi/userResource/1");
		Builder builder =  target.request(MediaType.APPLICATION_JSON);
		Response response = builder.get();
		System.out.println("Status: "+response.getStatus());
		System.out.println("Body: "+response.readEntity(String.class));
	}
}
