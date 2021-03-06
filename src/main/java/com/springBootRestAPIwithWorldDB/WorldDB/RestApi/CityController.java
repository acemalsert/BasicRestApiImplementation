package com.springBootRestAPIwithWorldDB.WorldDB.RestApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springBootRestAPIwithWorldDB.WorldDB.Business.ICityService;
import com.springBootRestAPIwithWorldDB.WorldDB.Entities.City;

@RestController
@RequestMapping("/api")
public class CityController {
	
	private ICityService cityService;

	@Autowired
	public CityController(ICityService cityService) {
		this.cityService = cityService;
	}
	
	@GetMapping("/cities")
	public List<City> get(){
		return cityService.getAll();
	}
	
	
	@PostMapping("/addC")
	public void add(@RequestBody City city) {
		cityService.add(city);
	}
	
	@PostMapping("/updateC")
	public void update(@RequestBody City city) {
		cityService.update(city);
	}
	
	@PostMapping("/deleteC")
	public void delete(@RequestBody City city) {
		cityService.delete(city);
	}
	
	@GetMapping("/cities/{id}")
	public City getById(@PathVariable int id){
		return cityService.getById(id);
	}
}

