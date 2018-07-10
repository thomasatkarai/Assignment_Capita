package com.singtel.assignment;

public class Duck extends Bird implements Swimmable, Singable, Walkable{

	private String sound = "Quake,Quake";
	
	public String sing() {
		System.out.println(sound);
		return sound;
	}
	

}
