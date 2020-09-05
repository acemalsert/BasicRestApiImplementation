package com.springBootRestAPIwithWorldDB.WorldDB.Entities;



public enum Continent {
	Asia("Asia"),
	Europe("Europe"),
	North_America("North America"),
	Africa("Africa"),
	Oceania("Ocenia"),
	Antarctica("Antartica"),
	South_America("South America");
	
	 public final String input;


	  Continent(String input) { this.input = input; }

	  public String getInput() { return this.input; }
	
}


