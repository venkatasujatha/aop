package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.City;
import com.example.demo.service.CityService;

@RestController
public class CityController {
	
	@Autowired
	private CityService cityService;
	
	@PostMapping("/save")
	public City saveCity(@RequestBody City city)
	{
		return cityService.save(city);
	}
	
	@GetMapping("/find/{name}")
	public City getCityByName(@PathVariable String name)
	{
		return cityService.getCityByName(name);
	}
	
	@PutMapping("/update/{id}")
	public String updateCityByName(@PathVariable Integer id,@RequestBody City city )
	{
		 cityService.updateCityByName(id, city);
		return "updated";
	}
	
	@DeleteMapping("/delete/{id}")
	public City deleteById(@PathVariable int id)
	{
		return cityService.deleteById(id);
	}
}
