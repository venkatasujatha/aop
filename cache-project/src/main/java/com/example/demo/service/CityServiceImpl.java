package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.example.demo.model.City;
import com.example.demo.repository.CityRepository;

@Service
public class CityServiceImpl implements CityService {

	@Autowired
	private CityRepository cityRepository;

	@Override
	public City save(City city) {

		return cityRepository.save(city);
	}

	@Override
	@Cacheable(cacheNames = "city",key = "#name")
	public City getCityByName(String name) {
		System.out.println("get city name from db");
		return cityRepository.findCityByName(name);
	}

	@Override
	@CachePut(cacheNames = "city",key = "#city.id")
	public String updateCityByName(Integer id,City city) {

		City city1 = cityRepository.findById(id).get();
 		city1.setName(city.getName());
 		cityRepository.save(city1);
 		System.out.println("updating the city name in db");
		return "updated";

	}

	
	@Override
	@CacheEvict(cacheNames = "city",key = "#id")
	public City deleteById(int id) {
		cityRepository.deleteById(id);
		System.out.println("delete the id in db");
		return null;
	}

	

}
