package com.springBootRestAPIwithWorldDB.WorldDB.DataAccess;

import java.util.List;

import com.springBootRestAPIwithWorldDB.WorldDB.Entities.City;
import com.springBootRestAPIwithWorldDB.WorldDB.Entities.CountryLanguage;

public interface ICountryLanguageDal {
	List<CountryLanguage> getAll();
	void add(CountryLanguage countryLanguage);
	void update(CountryLanguage countryLanguage);
	void delete(CountryLanguage countryLanguage);
}
