package com.crater.model;

import java.util.ArrayList;
import java.util.List;

public class Wall {
	
	private List<Brick> bricks;
	private boolean isFull;
	
	public Wall(){
		this.bricks = new ArrayList<>();
		isFull = false;
	}
	
	int sizeOfWall(List<Brick> brick){
		return brick.size();
	}
	
	public boolean isFull() {
		if(bricks.size()>=15){  // size of brick in wall is 15 instead of 90 to run the useCase
			isFull = true;
		}
		return isFull;
	}
	
	public void addNewBrick(Brick brick){
		bricks.add(brick);
	}

	public List<Brick> getBricks() {
		return bricks;
	}

	public void setBricks(List<Brick> bricks) {
		this.bricks = bricks;
	}
	
	@Override
	public String toString() {
		return "Wall [bricks=" + bricks + ", isFull=" + isFull + "]";
	}
	
	
}
