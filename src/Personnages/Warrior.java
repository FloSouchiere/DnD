package Personnages;

/**
 * As its equivalent Wizard Class, Warrior class is sub to Character to allow
 * Characters to be stored in a list. It polymorphes Character, adding its own
 * weaponry and accessories.
 */

public class Warrior extends Character {

	// Attributes

	private Weapon weapon;
	private String shield;

	// Constructor
	/**
	 * 
	 * @param name
	 * @param url
	 * @param life
	 * @param strength
	 * @param weapon
	 * @param shield
	 */
	public Warrior(String name, String url, int life, int strength, Weapon weapon, String shield) {
		super(name, url, life, strength);
		this.weapon = weapon;
		this.shield = shield;
	}
	
	public Warrior(String name, String url, int life, int strength) {
		super(name, url, life, strength);
	}

	public String getName() {
		String str = super.getSimpleName() + " the Social Justice Warrior";
		return str;
	}

	/**
	 * Intended to ease the console display of the characters' list elements and
	 * appear as nice and complete as possible.
	 */

	public String toString() {
		return ("I'm " + this.getName() + "\ni can use " + this.weapon.getName() + " and a " + this.shield
				+ super.toString());
	}

	/**
	 * 
	 * @param weapon
	 */
	public void setPrimary(Stuff stuff) {
		this.weapon = (Weapon) stuff;
	}

	public Weapon getWeapon() {
		return this.weapon;
	}

	public void setAccessory(String shield) {
		this.shield = shield;
	}

	public String getShield() {
		return this.shield;
	}
}
