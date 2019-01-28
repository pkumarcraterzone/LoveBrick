package com.crater.model;

public class Flag {
	
	private User user;
	private String flagMessage;

	public Flag(User user, String flagMessage) {
		
		this.user = user;
		this.flagMessage = flagMessage;
	}
	
	public User getUser() {
		return user;
	}

	public String getFlagMessage() {
		return flagMessage;
	}
	public void setFlagMessage(String flagMessage) {
		this.flagMessage = flagMessage;
	}

	@Override
	public String toString() {
		return "Flag [user=" + user + ", flagMessage=" + flagMessage + "]";
	}     
	
}