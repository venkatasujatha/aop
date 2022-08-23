package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class City implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	private int id;
	private String name;
	private String zipcode;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public City(int id, String name, String zipcode) {
		super();
		this.id = id;
		this.name = name;
		this.zipcode = zipcode;
	}
	public City() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "City [id=" + id + ", name=" + name + ", zipcode=" + zipcode + "]";
	}
	
	

}
