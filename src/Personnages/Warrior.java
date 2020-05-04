package Personnages;

public class Warrior extends Character {

	// Attributes

	private Weapon weapon;
	private String shield;

	// Constructor

	public Warrior(String name, String url, int life, int strength, Weapon weapon, String shield) {
		super(name, url, life, strength);
		this.weapon = weapon;
		this.shield = shield;
	}

	public String getName() {
		String str = super.getSimpleName() + " the Social Justice Warrior";
		return str;
	}

	public String toString() {
		return ("I'm " + this.getName() + "\ni can use " + this.weapon.getName() + " and a " + this.shield
				+ super.toString());
	}

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}

	public String getWeapon() {
		return this.weapon.getName();
	}

	public void setShield(String shield) {
		this.shield = shield;
	}

	public String getShield() {
		return this.shield;
	}
}