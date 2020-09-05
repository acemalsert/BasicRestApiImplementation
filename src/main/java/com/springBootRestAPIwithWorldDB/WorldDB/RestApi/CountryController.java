package com.springBootRestAPIwithWorldDB.WorldDB.RestApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springBootRestAPIwithWorldDB.WorldDB.Business.ICountryService;
import com.springBootRestAPIwithWorldDB.WorldDB.Entities.Country;


@RestController
@RequestMapping("/api")
public class CountryController {
	
	private ICountryService countryService;

	@Autowired
	public CountryController(ICountryService countryService) {
		this.countryService = countryService;
	}
	
	@GetMapping("/countries")
	public List<Country> get(){
		return countryService.getAll();
	}
	
	
	@PostMapping("/addCo")
	public void add(@RequestBody Country country) {
		countryService.add(country);
	}
	
	@PostMapping("/updateCo")
	public void update(@RequestBody Country country) {
		countryService.update(country);
	}
	
	@PostMapping("/deleteCo")
	public void delete(@RequestBody Country country) {
		countryService.delete(country);
	}
}
	
