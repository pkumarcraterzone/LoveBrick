package com.crater.model;

import java.util.ArrayList;
import java.util.List;

public class Country {
	
	private String name;
	private List<City> cities;
	
	public Country(String name) {
		super();
		this.name = name;
		this.cities = new ArrayList<City>();
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<City> getCities() {
		return cities;
	}

	@Override
	public String toString() {
		return "Country [name=" + name + ", cities=" + cities + "]";
	}
	
	
	
}
