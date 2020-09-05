package com.springBootRestAPIwithWorldDB.WorldDB.RestApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springBootRestAPIwithWorldDB.WorldDB.Business.ICountryLanguageService;
import com.springBootRestAPIwithWorldDB.WorldDB.Entities.City;
import com.springBootRestAPIwithWorldDB.WorldDB.Entities.CountryLanguage;

@RestController
@RequestMapping("/api")
public class CountryLanguageController {
	
	private ICountryLanguageService countryLanguageService;
	
	@Autowired
	public CountryLanguageController(ICountryLanguageService countryLanguageService) {
		this.countryLanguageService = countryLanguageService;
	}
	
	@GetMapping("/languages")
	public List<CountryLanguage> get(){
		return countryLanguageService.getAll();
	}
	
	
	@PostMapping("/addL")
	public void add(@RequestBody CountryLanguage countryLanguage) {
		countryLanguageService.add(countryLanguage);
	}
	
	@PostMapping("/updateL")
	public void update(@RequestBody CountryLanguage countryLanguage) {
		countryLanguageService.update(countryLanguage);
	}
	
	@PostMapping("/deleteL")
	public void delete(@RequestBody CountryLanguage countryLanguage) {
		countryLanguageService.delete(countryLanguage);
	}
}

	
	
	

