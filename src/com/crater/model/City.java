package com.crater.model;

import java.util.ArrayList;
import java.util.List;

public class City {
	
	private List<Wall> walls;
	private String cityName;
	
	public City(String cityName) {
		this.cityName = cityName;
		walls = new ArrayList<>();
		this.walls.add(new Wall());
		System.out.println(walls.toString());
	}
	
	public void addNewWall() {
			walls.add(new Wall());
	}
	
	public int sizeOfWall(List<Wall> walls){
		return walls.size();
	}
	
	public List<Wall> getWalls() {
		return walls;
	}
	public void setWalls(List<Wall> walls) {
		this.walls = walls;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	@Override
	public String toString() {
		return "City [walls=" + walls + ", cityName=" + cityName + "]";
	}
	
	
}
