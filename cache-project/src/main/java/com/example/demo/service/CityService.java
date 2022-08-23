package com.example.demo.service;

import java.util.List;

import com.example.demo.model.City;

public interface CityService {

	City save(City city);

	City getCityByName(String name);

 
	String updateCityByName(Integer id, City city);

	

	City deleteById(int id);

}
