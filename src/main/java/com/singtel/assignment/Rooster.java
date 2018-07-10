package com.singtel.assignment;

public class Rooster extends Bird implements Singable, Flyable, Walkable {

	private String sound = "Cock-a-doodle-doo";
	public String sing() {
		System.out.println(sound);
		return sound;
	}

}
