package Personnages;

/** As its equivalent Wizard Class, Warrior class is sub to Character to allow Characters to be stored in a list.
 * It polymorphes Character, adding its own weaponry and accessories.*/

public class Warrior extends Character {

	// Attributes

	private Weapon weapon;
	private String shield;

	// Constructor
	
	public Warrior(String name, String url, int life, int strength, Weapon weapon, String shield) {

		this.name = name;
		this.img_url = url;
		this.life = life;
		this.strength = strength;
		this.weapon = weapon;
		this.shield = shield;
	}

/** Intended to ease the console display of the characters' list elements and appear
 * as nice and complete as possible.*/
	
	public String toString() {
		return ("I'm " + this.getName()+"\ni can use " + weapon.getName() + " and a " + this.shield
				+ "\nhere's my BIG attributes...\nLIFE : " + this.getLife() + "\nSTRENGTH : " + this.getStrength());
	}

}