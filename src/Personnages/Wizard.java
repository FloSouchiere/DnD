package Personnages;

/** As its equivalent Warrior Class, Wizard class is sub to Character to allow Characters to be stored in a list.
 * It polymorphes Character, adding its own witchcraft and accessories.*/

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


/** Intended to ease the console display of the characters' list elements and appear
* as nice and complete as possible.*/
	
	public String toString() {
		return ("I'm " + this.getName()+"\ni can cast " + spell.getName() + " and drink a " + this.philter
				+ "\nhere's my BIG attributes...\nLIFE : " + this.getLife() + "\nSTRENGTH : " + this.getStrength());
	}

}
