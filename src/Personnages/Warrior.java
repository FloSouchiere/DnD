package Personnages;

public class Warrior extends Character {

	// Arme
		
		private Weapon weapon;
		private String shield;

	// Constructor

	public Warrior(String name, String url, int life, int strength, Weapon weapon, String shield) {

		this.name = name;
		this.url = url;
		this.life = life;
		this.strength = strength;
		this.weapon = weapon;
		this.shield = shield;
	}
	
	public String toString() {
		return ("I'm "+this.name+" have a look at my "+weapon.get_name());
	}
}