package com.crater.model;

public class Admin extends User{

	public Admin(String userName, City city) {
		super(userName, city);
	
	}
	public void editBrick(Brick brick, String message,String caption){
		
			brick.setMessage(message);
			brick.setCaption(caption);
	}
	
}
