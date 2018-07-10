package com.singtel.assignment;

public class Cat extends Animal implements Singable, Walkable {
	
	 private String sound = "Meow,Meow";
	 public String sing(){
	    	System.out.println(sound);
	    	return sound;
	    }
}
