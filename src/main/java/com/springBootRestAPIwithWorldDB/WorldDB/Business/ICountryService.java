package com.springBootRestAPIwithWorldDB.WorldDB.Business;

import java.util.List;

import com.springBootRestAPIwithWorldDB.WorldDB.Entities.City;
import com.springBootRestAPIwithWorldDB.WorldDB.Entities.Country;

public interface ICountryService {

		List<Country> getAll();
		void add(Country country);
		void update(Country country);
		void delete(Country country);
		//Country getById(int id);
}
