package Personnages;

<<<<<<< HEAD
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
=======
import java.util.Scanner;

public class Warrior {

	// Attributes

	private String name;
	// private Image image;
	private int life;
	private int strength;
	private String weapon;
	private String shield;

	// Constructor

	public Warrior(String name, int life, int strength, String weapon, String shield) {

		this.name = "test";
		this.life = 10;
		this.strength = 8;
		this.weapon = "sword";
		this.shield = "brooke";

	}
>>>>>>> 2871f9bbcc991ccaa658276d737535f3c2c5af3e

}