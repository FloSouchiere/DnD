package Personnages;

<<<<<<< HEAD
public class Wizard extends Character {

	// Attributes

	private String spell;
=======
public class Wizard {

	// Attributes

	private String name;
	// private Image image;
	private int life;
	private int strength;
	private String weapon;
>>>>>>> 2871f9bbcc991ccaa658276d737535f3c2c5af3e
	private String philter;

	// Constructor

<<<<<<< HEAD
	public Wizard(String name, String url, int life, int strength, String spell, String philter) {

		this.name = name;
		this.url = url;
		this.life = life;
		this.strength = strength;
		this.spell = spell;
		this.philter = philter;
=======
	public Wizard(String name, int life, int strength, String weapon, String philter) {

		this.name = "pinball";
		this.life = 8;
		this.strength = 10;
		this.weapon = "stick";
		this.philter = "syphon";
>>>>>>> 2871f9bbcc991ccaa658276d737535f3c2c5af3e

	}

}