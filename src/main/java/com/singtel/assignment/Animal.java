package com.singtel.assignment;

public class Animal {	
	
	private String sound;
	
	public String walk(){
		if(!(this instanceof Walkable)){
			System.out.println("I can not walk");
			return null;
		} else {
			System.out.println("I can walk");
			return "CAN";
		}
	}
	
	public String fly(){
		if(!(this instanceof Flyable)){
			System.out.println("I can not fly");
			return null;
		} else {
			System.out.println("I can fly");
			return "CAN";
		}
	}
	
	public String swim(){
		if(!(this instanceof Swimmable)){
			System.out.println("I can not swim");
			return null;
		} else {
			System.out.println("I can swim");
			return "CANT";
		}
	}
	
	public String sing(){
		if(!(this instanceof Singable)){
			System.out.println("I can not sing");
			return sound;
		} else {
			System.out.println("I can sing");
			return sound;
		}
	}
}
