package Personnages;

/** Class whose purpose is to list every available spell and related specs for super methods/classes.
 * Specs so far are : name, damage.*/

public class Spell {
	private int dmg_bonus;
	private String name;

	private Spell(int dmg, String name) {
		this.dmg_bonus = dmg;
		this.name = name;
	}

/** Getter of dmg_bonus :
 * @return Integer of the bonus damage of the spell.*/
	
	public int getBonusDamage() {
		return this.dmg_bonus;
	}
	
/** Getter of the spell's name :
 * @return String of the name of the spell.*/

	public String getName() {
		return this.name;
	}
// Single instances of each and every available spell
	public static Spell sputum = new Spell(5, "Sputum, respect score -10");
	public static Spell bukkake = new Spell(7, "Bukkake, ewww it's sticky..");
}