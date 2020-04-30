package Personnages;

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

	public String getName() {
		return this.name+" the SocialJusticeWarrior";
	}

	public String toString() {
		return ("I'm " + this.getName()+"\ni can use " + weapon.getName() + " and a " + this.shield
				+ "\nhere's my BIG attributes...\nLIFE : " + this.getLife() + "\nSTRENGTH : " + this.getStrength());
	}

}