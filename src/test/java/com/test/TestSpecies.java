package com.test;

import org.junit.Test;

import com.singtel.assignment.*;

import junit.framework.Assert;


public class TestSpecies {

	@Test
	public void testChickenSings() {

		Animal chicken = new Chicken();
		// verify chicken able to sing
		Assert.assertEquals(chicken.sing(), "Cluck,Cluck");

	}

	@Test
	public void catNotSwim() {
		Animal cat = new Cat();
		// test that cat can't swim
		Assert.assertEquals(cat.swim(), null);
	}

	@Test
	public void parrotSinging() {

		Animal chicken = new Chicken();
		Animal cat = new Cat();

		Animal parrot_cat = new Parrot(cat);
		Animal parrot_chick = new Parrot(chicken);

		// verify parrot able to sing as neighboring animal
		Assert.assertEquals(parrot_cat.sing(), cat.sing());
		Assert.assertEquals(parrot_chick.sing(), chicken.sing());
	}

	@Test
	public void countAbilities() {
		Animal chicken = new Chicken();
		
		Animal[] animals = new Animal[] { new Duck(), new Chicken(), new Rooster(), new Parrot(chicken), new Fish(),
				new Shark(), new ClownFish(), new Dolphin(), new Dog(), new ButterFly(ButterFlyStates.CATARPILLAR),
				new Cat() };

		// swimmable Duck, Fish, ClownFish,Dolphin, shark 5
		// walkable Duck, Chicken, Rooster, Parrot, Dog, ButterFly 6
		// flyable Rooster, Parrot, Butterfly 3
		// singable Durck, Chicken, Rooster, Parrot, Dog, Cat 6

		int walkableCount = 0;
		int swimmableCount = 0;
		int flyableCount = 0;
		int singableCount = 0;

		for (Animal animal : animals) {
			if (animal instanceof Walkable) {
				walkableCount++;
			} 
			if (animal instanceof Swimmable) {
				swimmableCount++;
			} 
			if (animal instanceof Flyable) {
				flyableCount++;
			} 
			if (animal instanceof Singable) {
				singableCount++;
			}
		}

		Assert.assertEquals(walkableCount, 6);
		Assert.assertEquals(swimmableCount, 5);
		Assert.assertEquals(flyableCount, 3);
		Assert.assertEquals(singableCount, 6);
	}
}