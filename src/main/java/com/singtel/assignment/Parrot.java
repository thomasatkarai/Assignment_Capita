package com.singtel.assignment;

public class Parrot extends Bird implements Singable,Flyable,Walkable {

	private Animal neighbour;
	
	public Parrot(Animal neighbour){
		this.neighbour = neighbour;
		
	}
	public String sing() {
		
		return neighbour.sing();
	}
	
	
}
