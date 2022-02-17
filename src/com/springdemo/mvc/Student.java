package com.springdemo.mvc;

import java.util.LinkedHashMap;

public class Student {
	
	private String firstName;
	private String lastName;
	private String country;
	private String language;
	private String[] operatingSystem;
	
	private LinkedHashMap<String, String> countryOption;
	
	public Student() {
		countryOption = new LinkedHashMap<>();
		countryOption.put("IN", "India");
		countryOption.put("KR", "Korea");
		countryOption.put("JP", "Japan");
		countryOption.put("TH", "Thailand");
		countryOption.put("TW", "Taiwan");
		
	}
	
	public LinkedHashMap<String, String> getCountryOption() {
		return countryOption;
	}

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String[] getOperatingSystem() {
		return operatingSystem;
	}

	public void setOperatingSystem(String[] operatingSystem) {
		this.operatingSystem = operatingSystem;
	}

	
	
	
}
