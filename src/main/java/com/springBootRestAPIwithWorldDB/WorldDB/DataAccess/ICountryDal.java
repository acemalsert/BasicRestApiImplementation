package com.springBootRestAPIwithWorldDB.WorldDB.DataAccess;

import java.util.List;

import com.springBootRestAPIwithWorldDB.WorldDB.Entities.City;
import com.springBootRestAPIwithWorldDB.WorldDB.Entities.Country;

public interface ICountryDal {
	List<Country> getAll();
	void add(Country country);
	void update(Country country);
	void delete(Country country);
	//Country getById(int id);
}
