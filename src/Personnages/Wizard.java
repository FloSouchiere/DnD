package Personnages;

public class Wizard extends Character {

	// Attributes

	private String name;
	private String img_url;
	private int life;
	private int strength;
	private String spell;
	private String philter;

	// Constructor

	public Wizard(String name, String url, int life, int strength, String spell, String philter) {

		this.name = name;
		this.img_url = url;
		this.life = life;
		this.strength = strength;
		this.spell = spell;
		this.philter = philter;
	}

}
