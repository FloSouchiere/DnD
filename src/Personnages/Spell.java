package Personnages;

/** Class whose purpose is to list every available spell and related specs for super methods/classes.
 * Specs so far are : name, damage.*/

public class Spell  extends Stuff {

	private Spell(int dmg, String name) {
		super(dmg, name);
	}

	public static Spell sputum = new Spell(5, "Sputum, respect score -10");
	public static Spell bukkake = new Spell(7, "Bukkake, ewww it's sticky..");
}
