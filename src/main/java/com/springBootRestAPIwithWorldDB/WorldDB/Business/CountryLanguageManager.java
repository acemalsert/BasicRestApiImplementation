package com.springBootRestAPIwithWorldDB.WorldDB.Business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.springBootRestAPIwithWorldDB.WorldDB.DataAccess.ICountryLanguageDal;
import com.springBootRestAPIwithWorldDB.WorldDB.Entities.City;
import com.springBootRestAPIwithWorldDB.WorldDB.Entities.CountryLanguage;

@Service
public class CountryLanguageManager implements ICountryLanguageService  {
	
	private ICountryLanguageDal countryLanguageDal;

	@Autowired
	public CountryLanguageManager(ICountryLanguageDal countryLanguageDal) {
		this.countryLanguageDal = countryLanguageDal;
	}
	
	@Override
	@Transactional
	public List<CountryLanguage> getAll() {
		return this.countryLanguageDal.getAll();
	}

	
	@Override
	@Transactional
	public void add(CountryLanguage countryLanguage) {
		//business
		this.countryLanguageDal.add(countryLanguage);
	}

	
	@Override
	@Transactional
	public void update(CountryLanguage countryLanguage) {
		this.countryLanguageDal.update(countryLanguage);
	}

	
	@Override
	@Transactional
	public void delete(CountryLanguage countryLanguage) {
		this.countryLanguageDal.delete(countryLanguage);
	}	
}
