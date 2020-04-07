package com.examples;

import java.util.List;
import java.util.Map;

public class Location {
	
	private List<String> names;
	private Map<String, String> uri;
	
	public Map<String, String> getUri() {
		return uri;
	}

	public void setUri(Map<String, String> uri) {
		this.uri = uri;
	}

	public List<String> getNames() {
		return names;
	}

	public void setNames(List<String> names) {
		this.names = names;
	}
	
}
