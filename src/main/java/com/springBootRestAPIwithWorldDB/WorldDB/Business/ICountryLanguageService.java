package com.springBootRestAPIwithWorldDB.WorldDB.Business;

import java.util.List;

import com.springBootRestAPIwithWorldDB.WorldDB.Entities.CountryLanguage;

public interface ICountryLanguageService {

		List<CountryLanguage> getAll();
		void add(CountryLanguage countryLanguage);
		void update(CountryLanguage countryLanguage);
		void delete(CountryLanguage countryLanguage);
}
