package com.springBootRestAPIwithWorldDB.WorldDB.Entities;

import java.io.Serializable;

public class CountryCode implements Serializable{

	private String countryCode;
	
	public CountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	
	public CountryCode() {
	
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
}
