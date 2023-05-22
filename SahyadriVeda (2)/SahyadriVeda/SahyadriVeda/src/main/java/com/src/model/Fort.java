package com.src.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Fort 
{
	
	@Id
	private int id;
	private String fortName;
	private String Location;
	private int distance;
	private int height;
	private String year;
	private String description;
	
	private Fort(int id, String fortName, String location, int distance, int height, String year, String description) {
		super();
		this.id = id;
		this.fortName = fortName;
		Location = location;
		this.distance = distance;
		this.height = height;
		this.year = year;
		this.description = description;
	}

	private Fort() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFortName() {
		return fortName;
	}

	public void setFortName(String fortName) {
		this.fortName = fortName;
	}

	public String getLocation() {
		return Location;
	}

	public void setLocation(String location) {
		Location = location;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Fort [id=" + id + ", fortName=" + fortName + ", Location=" + Location + ", distance=" + distance
				+ ", height=" + height + ", year=" + year + ", description=" + description + "]";
	}
	

	
	
	
	
	
}
