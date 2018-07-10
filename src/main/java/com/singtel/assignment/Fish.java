package com.singtel.assignment;

public class Fish extends Animal implements Swimmable {
	
	private Color color;
	private Size size;
	private boolean canEatFishes;
	private boolean canJoke;
	
	
	/*public void swim(){
		System.out.println("I am fish. so i can swim");
	}
*/

	public Color getColor() {
		return color;
	}


	public void setColor(Color color) {
		this.color = color;
	}


	public Size getSize() {
		return size;
	}


	public void setSize(Size size) {
		this.size = size;
	}


	public boolean isCanEatFishes() {
		return canEatFishes;
	}


	public void setCanEatFishes(boolean canEatFishes) {
		this.canEatFishes = canEatFishes;
	}


	public boolean isCanJoke() {
		return canJoke;
	}


	public void setCanJoke(boolean canJoke) {
		this.canJoke = canJoke;
	}
	
	
}
