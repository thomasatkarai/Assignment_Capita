package com.singtel.assignment;

public class Dog extends Animal implements Singable, Walkable {
	
	private String sound = "Woof,Woof";
    public String sing(){
    	System.out.println(sound);
    	return sound;
    }
}
