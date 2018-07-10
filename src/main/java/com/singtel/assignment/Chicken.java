package com.singtel.assignment;

public class Chicken extends Bird implements Singable, Walkable {

	private String sound = "Cluck,Cluck";
	public String sing() {
		System.out.println(sound);
		return sound;
	}

}
