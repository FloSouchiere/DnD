package Personnages;

public class Wizard extends Character {

	// Attributes

	private Spell spell;
	private String philter;

	// Constructor

	public Wizard(String name, String url, int life, int strength, Spell spell, String philter) {

		super(name, url, life, strength);
		this.spell = spell;
		this.philter = philter;
	}
	
	public String getName() {
		String str = super.getName()+" the Jizzhard";
		return str;
	}

	public String toString() {
		return ("I'm " + this.getName()+"\ni can cast " + spell.getName() + " and drink a " + this.philter
				+ super.toString());
	}

}
