package com.springBootRestAPIwithWorldDB.WorldDB.Entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;
import com.sun.istack.Nullable;

import ch.qos.logback.core.subst.Token.Type;

@Entity
@Table(name="country")
public class Country implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="code")
	private String code;
	
	@Column(name="name")
	private String name;
	
	@Enumerated(EnumType.STRING)
	private Continent continent;
	
	@Column(name="region")
	private String region;
	
	@Column(name="surfacearea")
	private int surfaceArea;
	
	@Column(name="indepYear")
	private int indepYear;
	
	@Column(name="population")
	private int population;
	
	@Column(name="lifeexprectancy")
	private int lifeExpectancy;
	
	@Column(name="gnp")
	private int gnp;
	
	@Column(name="gnpold")
	private int gnpOld;
	
	@Column(name="localname")
	private String localName;
	
	@Column(name="governmentform")
	private String governmentForm;
	
	@Column(name="headofstate")
	private String headOfState;
	
	@Column(name="capital")
	private int capital;
	
	@Column(name="code2")
	private String code2;

	public Country(String code, String name, Continent continent, String region, int surfaceArea, int indepYear,
			int population, int lifeExpectancy, int gnp, int gnpOld, String localName, String governmentForm,
			String headOfState, int capital, String code2) {
		this.code = code;
		this.name = name;
		this.continent = continent;
		this.region = region;
		this.surfaceArea = surfaceArea;
		this.indepYear = indepYear;
		this.population = population;
		this.lifeExpectancy = lifeExpectancy;
		this.gnp = gnp;
		this.gnpOld = gnpOld;
		this.localName = localName;
		this.governmentForm = governmentForm;
		this.headOfState = headOfState;
		this.capital = capital;
		this.code2 = code2;
	}

	public Country() {
	}
	
	public  static String valueOfOrDefault(String myValue) {
		//replace space with underscore so it matches enum name
		        String value=myValue.toUpperCase().replaceAll("\\s", "_");
		        for(Continent type : Continent.class.getEnumConstants()) {
		          if(type.name().equalsIgnoreCase(value)) {
		            return type.toString();
		          }
		        }
		        return myValue;
		      }
	

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Continent getContinent() {
		return continent;
	}

	public void setContinent(Continent continent) {
		this.continent = continent;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public int getSurfaceArea() {
		return surfaceArea;
	}

	public void setSurfaceArea(int surfaceArea) {
		this.surfaceArea = surfaceArea;
	}

	public int getIndepYear() {
		return indepYear;
	}

	public void setIndepYear(int indepYear) {
		this.indepYear = indepYear;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	public int getLifeExpectancy() {
		return lifeExpectancy;
	}

	public void setLifeExpectancy(int lifeExpectancy) {
		this.lifeExpectancy = lifeExpectancy;
	}

	public int getGnp() {
		return gnp;
	}

	public void setGnp(int gnp) {
		this.gnp = gnp;
	}

	public int getGnpOld() {
		return gnpOld;
	}

	public void setGnpOld(int gnpOld) {
		this.gnpOld = gnpOld;
	}

	public String getLocalName() {
		return localName;
	}

	public void setLocalName(String localName) {
		this.localName = localName;
	}

	public String getGovernmentForm() {
		return governmentForm;
	}

	public void setGovernmentForm(String governmentForm) {
		this.governmentForm = governmentForm;
	}

	public String getHeadOfState() {
		return headOfState;
	}

	public void setHeadOfState(String headOfState) {
		this.headOfState = headOfState;
	}

	public int getCapital() {
		return capital;
	}

	public void setCapital(int capital) {
		this.capital = capital;
	}

	public String getCode2() {
		return code2;
	}

	public void setCode2(String code2) {
		this.code2 = code2;
	}
}
