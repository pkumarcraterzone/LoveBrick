package com.crater.model;

import java.util.ArrayList;
import java.util.List;

public class TestClass {
	public static void main(String[] args){
		
		City city1 = new City("Delhi");
		City city2 = new City("Mumbai");
		City city3 = new City("chennai");
		City city4 = new City("Kanpur");
		City city5 = new City("Noida");
		City city6 = new City("Gurgaon");
		City city7 = new City("NewYork");
		City city8 = new City("Michigen");
		
		List<City> cities = new ArrayList<>();
		cities.add(city1);
		cities.add(city2);
		cities.add(city3);
		cities.add(city4);
		cities.add(city5);
		cities.add(city6);

		List<City> cities2 = new ArrayList<>();
		cities2.add(city7);
		cities2.add(city8);
		
		User user1 = new User("pramod", city1);
		User user2 = new User("sourav", city2);
		User user3 = new User("sawan", city3);
		User user4 = new User("akshay", city4);
		User user5 = new User("salman", city5);
		User user6 = new User("rohit", city6);
		User user7 = new User("hardik", city7);
		User user8 = new User("shahrukh", city8);
		User user9 = new User("rahul", city8);
		User user10 = new User("rajan", city1);
		User user11 = new Admin("naveen", city1);
		
		Country country1 = new Country("India");
		Country country2 = new Country("America");
		
		Brick brick1 = new Brick(user2, "ccccccc", "mmmmmmmm");
		Brick brick2 = new Brick(user3, "ccccccc", "mmmmmmmm");
		Brick brick3 = new Brick(user5, "ccccccc", "mmmmmmmm");
		Brick brick4 = new Brick(user6, "ccccccc", "mmmmmmmm");
		Brick brick5 = new Brick(user7, "ccccccc", "mmmmmmmm");
		Brick brick6 = new Brick(user3, "ccccccc", "mmmmmmmm");
		
		List<Brick> bricks = new ArrayList<>();
		bricks.add(brick1);
		bricks.add(brick2);
		bricks.add(brick3);
		bricks.add(brick4);
		bricks.add(brick5);
		bricks.add(brick6);
		
		System.out.println(city1);
		
		user2.addBrick(brick1);
		
		user1.addBrick(brick1);
		System.out.println("size of wall"+"  "+city1.getWalls().size());
		
		user1.addBrick(brick1);
		System.out.println("size of brick"+"  "+city1.getWalls().get(city1.getWalls().size()-1).getBricks().size());
		user1.addBrick(brick2);
		user1.addBrick(brick3);
		user1.addBrick(brick4);
		user1.addBrick(brick5);
		user1.addBrick(brick2);
		System.out.println("size of brick"+"  "+city1.getWalls().get(city1.getWalls().size()-1).getBricks().size());
		user1.addBrick(brick1);
		user1.addBrick(brick1);
		System.out.println("size of brick"+"  "+city1.getWalls().get(city1.getWalls().size()-1).getBricks().size());
		user1.addBrick(brick3);
		System.out.println("size of wall"+"  "+city1.getWalls().size());
		user1.addBrick(brick1);
		user1.addBrick(brick2);
		System.out.println("size of brick"+"  "+city1.getWalls().get(city1.getWalls().size()-1).getBricks().size());
		user1.addBrick(brick2);
		user1.addBrick(brick1);
		System.out.println("size of brick"+"  "+city1.getWalls().get(city1.getWalls().size()-1).getBricks().size());
		user1.addBrick(brick3);
		System.out.println("size of wall"+"  "+city1.getWalls().size());
		user1.addBrick(brick4);
		user1.addBrick(brick5);
		user1.addBrick(brick4);
		System.out.println("size of wall"+"  "+city1.getWalls().size());
		System.out.println("size of brick"+"  "+city1.getWalls().get(city1.getWalls().size()-1).getBricks().size());
		
	//	System.out.println(city1);
		List<Flag> flags = new ArrayList<>();
		
		brick1.addFlag(new Flag(user1, "hhhhhhhhhhh"));
		brick1.addFlag(new Flag(user1, "hhhhhhhhhhh"));
		brick1.addFlag(new Flag(user1, "hhhhhhhhhhh"));
		brick1.addFlag(new Flag(user1, "hhhhhhhhhhh"));
		brick1.addFlag(new Flag(user1, "hhhhhhhhhhh"));
		brick1.addFlag(new Flag(user1, "hhhhhhhhhhh"));
		brick1.addFlag(new Flag(user1, "hhhhhhhhhhh"));
		brick1.addFlag(new Flag(user1, "hhhhhhhhhhh"));
		brick1.addFlag(new Flag(user1, "hhhhhhhhhhh"));
		brick1.addFlag(new Flag(user1, "hhhhhhhhhhh"));
		brick1.addFlag(new Flag(user1, "hhhhhhhhhhh"));
		
		System.out.println("hello master ");
		System.out.println("hello master ");
		System.out.println("hello master ");
		System.out.println("hello master ");
		
		brick1.addFlag(new Flag(user1, "hhhhhhhhhhh"));
		brick1.addFlag(new Flag(user1, "hhhhhhhhhhh"));
		brick1.addFlag(new Flag(user1, "hhhhhhhhhhh"));
		brick1.addFlag(new Flag(user1, "hhhhhhhhhhh"));
	
		
		System.out.println("khgdjsfds");
		System.out.println("khgdjsfds");
		System.out.println("khgdjsfds");
		System.out.println("khgdjsfds");
		
		//flags usecase
		System.out.println(brick1.isVisible());
		
		//total no of walls and bricks
		System.out.println("size of wall"+" "+city1.getWalls().size());
		
		System.out.println("size of brick"+" "+ city1.getWalls().get(city1.getWalls().size()-1).getBricks().size());
		
		//checkEdit
		System.out.println(brick1.getCaption()+"  "+brick1.getMessage());
		
		user1.editBrick(brick1, "llllllll", "gjdshdgsj");
		System.out.println(brick1.getCaption()+"  "+brick1.getMessage());
		
		user11.editBrick(brick1, "bcvzxczc", "lklklk");
		System.out.println(brick1.getCaption()+"  "+brick1.getMessage());
		
		user3.editBrick(brick1, "added", "added");
		System.out.println(brick1.getCaption()+"  "+brick1.getMessage());
		
		
		
	}
}
