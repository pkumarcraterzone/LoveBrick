package com.crater.model;

import java.util.ArrayList;
import java.util.List;

public class Brick {

	private final User dedicatedTo;
	private String caption;
	private String message;
	private List<Comment> commments;
	private List<Flag> flags;
	private boolean isVisible = true;
	
	public Brick(User dedicatedTo, String caption, String message) {
		this.dedicatedTo = dedicatedTo;
		this.caption = caption;
		this.message = message;
		flags = new ArrayList<>();
		commments = new ArrayList<>();
	}
		
	private void containsMoreThanTenFlag(){
		if(flags.size()>=10){
			isVisible = false;
		}
	}
	
	public boolean isVisible() {
		containsMoreThanTenFlag();
		return isVisible;
	}

	boolean isAnimate(){
		//user is near about than return true
		return false;
	}

	public List<Flag> getFlags() {
		return flags;
	}
	
	public void addFlag(Flag flag){
		flags.add(flag);
	}
	
	public User getDedicatedTo() {
		return dedicatedTo;
	}

	public String getCaption() {
		return caption;
	}


	public void setCaption(String caption) {
		this.caption = caption;
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}
	
	public List<Comment> getCommment() {
		return commments;
	}

	public void addCommment(Comment commment) {
		commments.add(commment);
	}
	
	@Override
	public String toString() {
		return "Brick [dedicatedTo=" + dedicatedTo + ", caption=" + caption + ", message=" + message + ", commment="
				+ commments + ", flags=" + flags + ", isVisible=" + isVisible + "]";
	}

	
	

}
