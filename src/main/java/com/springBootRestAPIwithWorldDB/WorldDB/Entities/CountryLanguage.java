package com.springBootRestAPIwithWorldDB.WorldDB.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name="countrylanguage")
@IdClass(CountryCode.class)
public class CountryLanguage {
	
	@Id
	@Column(name="countrycode")
	private String countryCode;
	
	@Id
	@Column(name="language")
	private String language;
	
	
	@Enumerated(EnumType.STRING)
	private IsOfficial isOfficial; 
	
	
	@Column(name="percentage")
	private String percentage;


	public CountryLanguage(String countryCode, String language, IsOfficial isOfficial, String percentage) {
		this.countryCode = countryCode;
		this.language = language;
		this.isOfficial = isOfficial;
		this.percentage = percentage;
	}

	public CountryLanguage() {
		
	}
	
	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public IsOfficial getIsOfficial() {
		return isOfficial;
	}

	public void setIsOfficial(IsOfficial isOfficial) {
		this.isOfficial = isOfficial;
	}

	public String getPercentage() {
		return percentage;
	}

	public void setPercentage(String percentage) {
		this.percentage = percentage;
	}
}
