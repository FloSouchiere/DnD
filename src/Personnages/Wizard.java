package Personnages;

public class Wizard extends Character {

	// Attributes

	private Spell spell;
	private String philter;

	// Constructor

	public Wizard(String name, String url, int life, int strength, Spell spell, String philter) {

		this.name = name;
		this.img_url = url;
		this.life = life;
		this.strength = strength;
		this.spell = spell;
		this.philter = philter;
	}
	
	public String get_name() {
		return this.name+" the Jizzhard";
	}

	public String toString() {
		return ("I'm " + this.get_name()+"\ni can cast " + spell.get_name() + " and drink a " + this.philter
				+ "\nhere's my BIG attributes...\nLIFE : " + this.getLife() + "\nSTRENGTH : " + this.getStrength());
	}

}
