package com.crater.model;

import java.util.ArrayList;
import java.util.List;

public class User {

	protected String userName;
	protected List<Brick> bricks;
	protected City city;


	public User(String userName, City city) {
		this.userName = userName;
		this.city = city;
		bricks = new ArrayList<Brick>();
	}

	public boolean addBrick(Brick brick){
		if(city.getWalls().get(city.getWalls().size()-1).isFull()){
			city.addNewWall();
			city.getWalls().get(city.getWalls().size()-1).addNewBrick(brick);
			bricks.add(brick);
		}
		else{
			city.getWalls().get(city.getWalls().size()-1).addNewBrick(brick);
			bricks.add(brick);
		}
		return true;
	}

	public void editBrick(Brick brick, String message,String caption){
		for(Brick brick1:bricks){
			if(brick1.equals(brick)){
				brick.setMessage(message);
				brick.setCaption(caption);
				return;
			}
		}
			System.out.println("You are not authorize!");
		
	}

	public String getUserName() {
		return userName;
	}

	public List<Brick> getBricks() {
		return bricks;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "User [userName=" + userName + ", bricks=" + bricks + ", city=" + city  + "]";
	}




}
