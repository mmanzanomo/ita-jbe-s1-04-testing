package org.itacademy.n3exercici5;

import java.util.HashMap;
import java.util.Map;

public class Countries {

	private Map<String, String> countries = new HashMap<String, String>();

	
	public void add(String key, String value) {
		countries.put(key, value);
	}
	
	public Map<String, String> getCountries() {
		return countries;
	}

	public void setCountries(Map<String, String> countries) {
		this.countries = countries;
	}
	
	
}
