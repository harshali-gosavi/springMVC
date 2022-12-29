package com.velocity.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*
 * This is our model class and it corresponds to Country table in database
 */
@Entity
@Table(name="country")
public class Country{
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="countryName")
	private String countryName;	
	
	@Column(name="population")
	private long population;
	
	public Country() {
		super();
	}

	public Country(int id, String countryName, long population) {
		super();
		this.id = id;
		this.countryName = countryName;
		this.population = population;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public long getPopulation() {
		return population;
	}

	public void setPopulation(long population) {
		this.population = population;
	}

	@Override
	public String toString() {
		return "Country [id=" + id + ", countryName=" + countryName + ", population=" + population + "]";
	}
	
}