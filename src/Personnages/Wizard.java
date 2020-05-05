package Personnages;

/** As its equivalent Warrior Class, Wizard class is sub to Character to allow Characters to be stored in a list.
 * It polymorphes Character, adding its own witchcraft and accessories.*/

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
	
	public Wizard(String name, String url, int life, int strength) {
		super(name, url, life, strength);
	}

	
	public String getName() {
		String str = super.getSimpleName()+" the Jizzhard";
		return str;
	}
	
/** Intended to ease the console display of the characters' list elements and appear
* as nice and complete as possible.*/

	public String toString() {
		return ("I'm " + this.getName()+"\ni can cast " + spell.getName() + " and drink a " + this.philter
				+ super.toString());
	}
	
	public void setPrimary(Stuff spell) {
		this.spell = (Spell) spell;
	}

	public Spell getSpell() {
		return this.spell;
	}

	public void setAccessory(String philter) {
		this.philter = philter;
	}

	public String getPhilter() {
		return this.philter;
	}

}
